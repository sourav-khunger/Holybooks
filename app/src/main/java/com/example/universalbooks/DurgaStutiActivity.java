package com.example.universalbooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.universalbooks.adapter.DurgaStutiAdapter;
import com.example.universalbooks.modelclass.DurgaStuti;

import java.util.ArrayList;
import java.util.List;

public class DurgaStutiActivity extends AppCompatActivity {
    ImageView iv_durga_back;
    TextView tv3_toolbar;
    RecyclerView rv_durga;
    DurgaStutiAdapter dsa;
    List<DurgaStuti> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_durga_stuti);
        tv3_toolbar = findViewById(R.id.tv3_toolbar);
        iv_durga_back = findViewById(R.id.iv_durga_back);
        rv_durga = findViewById(R.id.rv_durga);

        String bookid=getIntent().getStringExtra("bookId");
        String bookname=getIntent().getStringExtra("BOOKNAME");
        tv3_toolbar.setText(bookname);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "font/font.ttf");
        tv3_toolbar.setTypeface(custom_font);


       if(bookid.equals("100")){
            list.add(new DurgaStuti(R.drawable.durga, "041", "Durga Kawach"));
           // list.add(new DurgaStuti(R.drawable.durga, "042", "Mangla Stotra"));
            list.add(new DurgaStuti(R.drawable.durga, "043", "Keelk Stotra"));
            list.add(new DurgaStuti(R.drawable.durga, "044", "Argala Stotra"));
            list.add(new DurgaStuti(R.drawable.durga, "01", "Adhyay 1"));
            list.add(new DurgaStuti(R.drawable.durga, "02", "Adhyay 2"));
            list.add(new DurgaStuti(R.drawable.durga, "03", "Adhyay 3"));
            list.add(new DurgaStuti(R.drawable.durga, "04", "Adhyay 4"));
            list.add(new DurgaStuti(R.drawable.durga, "05", "Adhyay 5"));
            list.add(new DurgaStuti(R.drawable.durga, "06", "Adhyay 6"));
            list.add(new DurgaStuti(R.drawable.durga, "07", "Adhyay 7"));
            list.add(new DurgaStuti(R.drawable.durga, "08", "Adhyay 8"));
            list.add(new DurgaStuti(R.drawable.durga, "09", "Adhyay 9"));
            list.add(new DurgaStuti(R.drawable.durga, "010", "Adhyay 10"));
            list.add(new DurgaStuti(R.drawable.durga, "011", "Adhyay 11"));
            list.add(new DurgaStuti(R.drawable.durga, "012", "Adhyay 12"));
            list.add(new DurgaStuti(R.drawable.durga, "013", "Adhyay 13"));
        }
         if(bookid.equals("39")){
            list.add(new DurgaStuti(R.drawable.durga, "014", "Japji Sahib"));
            list.add(new DurgaStuti(R.drawable.durga, "015", "Jaap Sahib"));
            list.add(new DurgaStuti(R.drawable.durga, "016", "Tav Prasad Savaiye"));
            list.add(new DurgaStuti(R.drawable.durga, "017", "Anand Prasad"));
            list.add(new DurgaStuti(R.drawable.durga, "018", "Benti Choupee"));
            list.add(new DurgaStuti(R.drawable.durga, "019", "Shabad Hazare"));
            list.add(new DurgaStuti(R.drawable.durga, "020", "Baarh Maahaa"));
            list.add(new DurgaStuti(R.drawable.durga, "021", "Savaiye Deenan- Ki"));
            list.add(new DurgaStuti(R.drawable.durga, "022", "Shabad Hazarai Patshahi 10"));
            list.add(new DurgaStuti(R.drawable.durga, "023", "Ardas"));
            list.add(new DurgaStuti(R.drawable.durga, "024", "Rakhyia De Shabad"));
            list.add(new DurgaStuti(R.drawable.durga, "025", "Kirtan Sohila"));
            list.add(new DurgaStuti(R.drawable.durga, "026", "Asa Di Var"));
            list.add(new DurgaStuti(R.drawable.durga, "027", "Sukhmani Sahib"));
            list.add(new DurgaStuti(R.drawable.durga, "028", "Dakhni Onkar"));
            list.add(new DurgaStuti(R.drawable.durga, "029", "Sidh Gosht"));
            list.add(new DurgaStuti(R.drawable.durga, "030", "Bhavan Akhri"));
            list.add(new DurgaStuti(R.drawable.durga, "031", "Jaitsri Ki Var"));
            list.add(new DurgaStuti(R.drawable.durga, "032", "Ramkali Ki Var"));
            list.add(new DurgaStuti(R.drawable.durga, "033", "Basant Ki Var"));
            list.add(new DurgaStuti(R.drawable.durga, "034", "Bachitar Natak"));
            list.add(new DurgaStuti(R.drawable.durga, "035", "Lawa"));
            list.add(new DurgaStuti(R.drawable.durga, "036", "Slok Mahala 9"));
            list.add(new DurgaStuti(R.drawable.durga, "037", "Raag Mala"));
            list.add(new DurgaStuti(R.drawable.durga, "038", "Chandi Di Var"));
            list.add(new DurgaStuti(R.drawable.durga, "039", "Aartee"));
            list.add(new DurgaStuti(R.drawable.durga, "040", "Rehraas Sahib"));
        }

       /* if(bookid.equals("56")){
            list.add(new DurgaStuti(R.drawable.durga, "045", "NCERT 11th"));
            list.add(new DurgaStuti(R.drawable.durga, "046", "NCERT 12th - Part I"));
            list.add(new DurgaStuti(R.drawable.durga, "051", "NCERT 12th - Part II"));
        }
        if(bookid.equals("57")){
            list.add(new DurgaStuti(R.drawable.durga, "047", "NCERT 11th - Part I"));
            list.add(new DurgaStuti(R.drawable.durga, "052", "NCERT 11th - Part II"));
            list.add(new DurgaStuti(R.drawable.durga, "048", "NCERT 12th - Part I"));
            list.add(new DurgaStuti(R.drawable.durga, "053", "NCERT 12th - Part II"));
        }
        if(bookid.equals("58")){
            list.add(new DurgaStuti(R.drawable.durga, "049", "NCERT 11th - Part I"));
            list.add(new DurgaStuti(R.drawable.durga, "054", "NCERT 11th - Part II"));
            list.add(new DurgaStuti(R.drawable.durga, "050", "NCERT 12th - Part I"));
            list.add(new DurgaStuti(R.drawable.durga, "055", "NCERT 12th - Part II"));
        }*/

        rv_durga.setLayoutManager(new LinearLayoutManager(DurgaStutiActivity.this,  RecyclerView.VERTICAL, false));
        dsa = new DurgaStutiAdapter(DurgaStutiActivity.this, list);
        rv_durga.setAdapter(dsa);


        iv_durga_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }
}
