package com.example.universalbooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.universalbooks.adapter.BooklistAdapter;
import com.example.universalbooks.modelclass.Booksname;

import java.util.ArrayList;
import java.util.List;

public class BookListActivity extends AppCompatActivity {
    TextView tv_toolbar;
    ImageView iv_type_back;
    RecyclerView rv_booklist;
    BooklistAdapter tra;
    List<Booksname> booklist = new ArrayList<>();
    EditText ed_search;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);
        tv_toolbar = findViewById(R.id.tv_toolbar);
        iv_type_back = findViewById(R.id.iv_type_back);
        rv_booklist = findViewById(R.id.rv_booklist);
        ed_search = findViewById(R.id.ed_search);


       /* Intent i = getIntent();
        String type = i.getStringExtra("type");*/

        tv_toolbar.setText("Religious");
        booklist.add(new Booksname("Ganesha Chalisa", "8", R.drawable.ganesha));
        booklist.add(new Booksname("Ganesha Aarti", "44", R.drawable.ganesha));

        booklist.add(new Booksname("Bhagavad-Gita", "1", R.drawable.bhagwadgita));
        booklist.add(new Booksname("Quran", "2", R.drawable.quran));
        booklist.add(new Booksname("Bible", "40", R.drawable.bible));
        booklist.add(new Booksname("Sukhmani Sahib", "38", R.drawable.sukhmani));
        booklist.add(new Booksname("Gutka Sahib", "39", R.drawable.gutkasahib));

        booklist.add(new Booksname("Vishnu Aarti", "46", R.drawable.vishnu));

        booklist.add(new Booksname("Hanuman Chalisa", "3", R.drawable.hanuman));
        booklist.add(new Booksname("Hanuman Aarti", "47", R.drawable.hanuman));
        booklist.add(new Booksname("SundarKand", "36", R.drawable.hanuman));
        booklist.add(new Booksname("Bajrang Baan", "37", R.drawable.hanuman));

        booklist.add(new Booksname("Durga Chalisa", "4", R.drawable.durga));
        booklist.add(new Booksname("Durga Maa Aarti", "45", R.drawable.durga));
        booklist.add(new Booksname("Durga Stuti", "100", R.drawable.durga));
        booklist.add(new Booksname("Durga Sapatshati", "5", R.drawable.durga));
        booklist.add(new Booksname("Durga Kawach", "42", R.drawable.durga));
        booklist.add(new Booksname("32 Durga Naam Mala", "43", R.drawable.durga));

        booklist.add(new Booksname("Shiva Chalisa", "6", R.drawable.shiv));
        booklist.add(new Booksname("Shiva Aarti", "48", R.drawable.shiv));

        booklist.add(new Booksname("Sai Chalisa", "9", R.drawable.saibaba));

        booklist.add(new Booksname("Mahakali Chalisa", "34", R.drawable.mahakali));
        booklist.add(new Booksname("Laxmi Maa Aarti", "49", R.drawable.laxmi));
        booklist.add(new Booksname("Shani Chalisa", "35", R.drawable.shanidev));
        booklist.add(new Booksname("Chintpurni Mata Chalisa", "41", R.drawable.chintpurni));









        /*if (type.equals("patriotic")) {
            tv_toolbar.setText("Patriotic");
            booklist.add(new Booksname("Vande-Mataram","13",R.drawable.vande));
            booklist.add(new Booksname("Freedom From Known","14",R.drawable.freedom_known));
           // booklist.add(new Booksname("India after Gandhi","15",R.drawable.durga));
        }
        if (type.equals("novel")) {
            tv_toolbar.setText("Novels");
            booklist.add(new Booksname("The Rainbow","16",R.drawable.rainbow));
            booklist.add(new Booksname("To Kill a Mockingbird","55",R.drawable.mockingbird));

        }
        if (type.equals("technology")) {
            tv_toolbar.setText("Technology");
           // booklist.add(new Booksname("Innovation \u0026 its Enemies","25",R.drawable.durga));
            booklist.add(new Booksname("The Soul of a New Machine","26",R.drawable.soul_machine));
            booklist.add(new Booksname("The Second Machine Age","27",R.drawable.second_machine));
            booklist.add(new Booksname("HELLO WORLD: Being Human in the Age of Algorithms","28",R.drawable.algorithm));
           // booklist.add(new Booksname("Smarter Than You Think: How Technology Is Changing Our Minds for the Better","29",R.drawable.durga));

        }
        if (type.equals("history")) {
            tv_toolbar.setText("History");
            //booklist.add(new Booksname("Discovery of India","10",R.drawable.durga));
            booklist.add(new Booksname("Freedom at Midnight","11",R.drawable.freedom));
            booklist.add(new Booksname("India Since Independence","12",R.drawable.india_since));
        }
        if (type.equals("biography")) {
            tv_toolbar.setText("Biography");
            booklist.add(new Booksname("Mahatma Gandhi","17",R.drawable.mahatmagandhi));
            booklist.add(new Booksname("Albert Einstein","18",R.drawable.biography));
            booklist.add(new Booksname("Nelson Mandela","19",R.drawable.nelson));
            booklist.add(new Booksname("Abraham Lincoln","20",R.drawable.abraham));
            booklist.add(new Booksname("Kalpana Chawla","51",R.drawable.kalpana));
            booklist.add(new Booksname("Neil Armstrong","52",R.drawable.neil));
            booklist.add(new Booksname("Vikram Sarabhai","53",R.drawable.vikram));
            booklist.add(new Booksname("Dr. APJ Abdul Kalam","54",R.drawable.apj));
            booklist.add(new Booksname("Benjamin Franklin","22",R.drawable.benjamin));
            booklist.add(new Booksname("The Wright Brothers","23",R.drawable.wright));
            booklist.add(new Booksname("Subhash Chandra Bose","21",R.drawable.subhash));
            booklist.add(new Booksname("Rani of Jhansi-Lakshmi Bai","24",R.drawable.laxmibai));
            booklist.add(new Booksname("Chandra Shekhar Azad","50",R.drawable.shekhar));


        }
        if (type.equals("education")) {
            tv_toolbar.setText("Education");
            booklist.add(new Booksname("Mathematics","56",R.drawable.maths));
            booklist.add(new Booksname("Physics","57",R.drawable.physics));
            booklist.add(new Booksname("Chemistry","58",R.drawable.chemistry));
            //booklist.add(new Booksname("Mahatma Gandhi","59",R.drawable.mahatmagandhi));
        }
        if (type.equals("thriller")) {
            tv_toolbar.setText("Thriller");
            booklist.add(new Booksname("The Silence of Lambs","60",R.drawable.silence_lambs));
            booklist.add(new Booksname("Sharp Objects","61",R.drawable.sharp_objects));
        }
        if (type.equals("fantasy")) {
            tv_toolbar.setText("Fantasy");
            //booklist.add(new Booksname("Harry Potter","30",R.drawable.biography));
            booklist.add(new Booksname("The Three Pillars Of Zen","31",R.drawable.zen));
            booklist.add(new Booksname("Prince of Thorns","32",R.drawable.prince_thorns));
            booklist.add(new Booksname("The Chronicles of Narnia","33",R.drawable.narnia));
        }*/


        rv_booklist.setLayoutManager(new LinearLayoutManager(BookListActivity.this, RecyclerView.VERTICAL, false));
        tra = new BooklistAdapter(BookListActivity.this, booklist);
        rv_booklist.setAdapter(tra);

        iv_type_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        ed_search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                tra.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
