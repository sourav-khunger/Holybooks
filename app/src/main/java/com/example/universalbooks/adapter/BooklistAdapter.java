package com.example.universalbooks.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.universalbooks.DurgaStutiActivity;
import com.example.universalbooks.R;
import com.example.universalbooks.PdfViewActivity;
import com.example.universalbooks.modelclass.Booksname;

import java.util.ArrayList;
import java.util.List;

public class BooklistAdapter extends RecyclerView.Adapter<BooklistAdapter.ViewHolder> implements Filterable {
    Context context;
    List<Booksname> booklist;
    List<Booksname> booklistfilter;
    Intent i;

    public BooklistAdapter(Context context, List<Booksname> booklist) {
        this.context = context;
        this.booklist = booklist;
        this.booklistfilter = booklist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.custom_type, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.tv_bookname.setText(booklistfilter.get(position).getBookname());
        holder.iv_bookimage.setImageResource(booklistfilter.get(position).getBookimage());

        holder.tv_bookname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (booklistfilter.get(position).getBookid().equals("100")) {
                    i = new Intent(context, DurgaStutiActivity.class);
                    i.putExtra("bookId", booklistfilter.get(position).getBookid());
                    i.putExtra("BOOKNAME", booklistfilter.get(position).getBookname());
                    context.startActivity(i);
                }
                else if (booklistfilter.get(position).getBookid().equals("39")) {
                    i = new Intent(context, DurgaStutiActivity.class);
                    i.putExtra("bookId", booklistfilter.get(position).getBookid());
                    i.putExtra("BOOKNAME", booklistfilter.get(position).getBookname());
                    context.startActivity(i);
                }
                else if (booklistfilter.get(position).getBookid().equals("56")) {
                    i = new Intent(context, DurgaStutiActivity.class);
                    i.putExtra("bookId", booklistfilter.get(position).getBookid());
                    i.putExtra("BOOKNAME", booklistfilter.get(position).getBookname());
                    context.startActivity(i);
                }
                else if (booklistfilter.get(position).getBookid().equals("57")) {
                    i = new Intent(context, DurgaStutiActivity.class);
                    i.putExtra("bookId", booklistfilter.get(position).getBookid());
                    i.putExtra("BOOKNAME", booklistfilter.get(position).getBookname());
                    context.startActivity(i);
                }
                else if (booklistfilter.get(position).getBookid().equals("58")) {
                    i = new Intent(context, DurgaStutiActivity.class);
                    i.putExtra("bookId", booklistfilter.get(position).getBookid());
                    i.putExtra("BOOKNAME", booklistfilter.get(position).getBookname());
                    context.startActivity(i);
                }
                else {
                    i = new Intent(context, PdfViewActivity.class);
                    i.putExtra("bookId", booklistfilter.get(position).getBookid());
                    i.putExtra("BOOKNAME", booklistfilter.get(position).getBookname());
                    context.startActivity(i);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return booklistfilter.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    booklistfilter = booklist;
                } else {
                    List<Booksname> filteredList = new ArrayList<>();
                    for (Booksname row : booklist) {
                        if (row.getBookname().toLowerCase().contains(charString.toLowerCase()) ||
                                row.getBookname().toUpperCase().contains(charString.toLowerCase())) {
                            filteredList.add(row);
                        }
                    }

                    booklistfilter = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = booklistfilter;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                booklistfilter = (ArrayList<Booksname>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_bookname;
ImageView iv_bookimage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_bookname = itemView.findViewById(R.id.tv_bookname);
            iv_bookimage = itemView.findViewById(R.id.iv_bookimage);

            Typeface custom_font = Typeface.createFromAsset(context.getAssets(),  "font/font.ttf");
         tv_bookname.setTypeface(custom_font);
        }
    }
}
