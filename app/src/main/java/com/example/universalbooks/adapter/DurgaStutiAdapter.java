package com.example.universalbooks.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.universalbooks.R;
import com.example.universalbooks.PdfViewActivity;
import com.example.universalbooks.modelclass.DurgaStuti;

import java.util.List;

public class DurgaStutiAdapter extends RecyclerView.Adapter<DurgaStutiAdapter.ViewHolder> {

    Context context;
    List<DurgaStuti> list;
Intent intent;
    public DurgaStutiAdapter(Context context, List<DurgaStuti> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_durgastuti, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.tv_adhyaya.setText(list.get(position).getName());


        holder.ll_stuti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(context, PdfViewActivity.class);
                intent.putExtra("bookId", list.get(position).getId());
                intent.putExtra("bookAdhyaya", list.get(position).getName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_adhyaya;
LinearLayout ll_stuti;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_adhyaya=itemView.findViewById(R.id.tv_adhyaya);
            ll_stuti=itemView.findViewById(R.id.ll_stuti);

            Typeface custom_font = Typeface.createFromAsset(context.getAssets(),  "font/font.ttf");
            tv_adhyaya.setTypeface(custom_font);

        }
    }
}
