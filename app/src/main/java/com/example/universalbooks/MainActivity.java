package com.example.universalbooks;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//RecyclerView rv_items;
    Intent intent;
LinearLayout ll_fantasy,ll_religious,ll_patriotic,ll_novels,ll_thriller,ll_biography,ll_education,ll_technology,ll_history;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll_fantasy=findViewById(R.id.ll_fantasy);
        ll_religious=findViewById(R.id.ll_religious);
        ll_patriotic=findViewById(R.id.ll_patriotic);
        ll_novels=findViewById(R.id.ll_novels);
        ll_thriller=findViewById(R.id.ll_thriller);
        ll_biography=findViewById(R.id.ll_biography);
        ll_education=findViewById(R.id.ll_education);
        ll_technology=findViewById(R.id.ll_technology);
        ll_history=findViewById(R.id.ll_history);


        //rv_items.setLayoutManager(new GridLayoutManager(MainActivity.this,3,RecyclerView.VERTICAL,false));

        ll_religious.setOnClickListener(this);
        ll_patriotic.setOnClickListener(this);
        ll_novels.setOnClickListener(this);
        ll_technology.setOnClickListener(this);
        ll_history.setOnClickListener(this);
        ll_biography.setOnClickListener(this);
        ll_education.setOnClickListener(this);
        ll_thriller.setOnClickListener(this);
        ll_fantasy.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ll_religious:
                intent=new Intent(MainActivity.this, BookListActivity.class);
                intent.putExtra("type","religious");
                startActivity(intent);
                break;

            case R.id.ll_patriotic:
                intent=new Intent(MainActivity.this, BookListActivity.class);
                intent.putExtra("type","patriotic");
                startActivity(intent);
                break;

            case R.id.ll_novels:
                intent=new Intent(MainActivity.this, BookListActivity.class);
                intent.putExtra("type","novel");
                startActivity(intent);
                break;

            case R.id.ll_technology:
                intent=new Intent(MainActivity.this, BookListActivity.class);
                intent.putExtra("type","technology");
                startActivity(intent);
                break;

            case R.id.ll_history:
                intent=new Intent(MainActivity.this, BookListActivity.class);
                intent.putExtra("type","history");
                startActivity(intent);
                break;

            case R.id.ll_biography:
                intent=new Intent(MainActivity.this, BookListActivity.class);
                intent.putExtra("type","biography");
                startActivity(intent);
                break;

            case R.id.ll_education:
                intent=new Intent(MainActivity.this, BookListActivity.class);
                intent.putExtra("type","education");
                startActivity(intent);
                break;

            case R.id.ll_thriller:
                intent=new Intent(MainActivity.this, BookListActivity.class);
                intent.putExtra("type","thriller");
                startActivity(intent);
                break;

            case R.id.ll_fantasy:
                intent=new Intent(MainActivity.this, BookListActivity.class);
                intent.putExtra("type","fantasy");
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();

    }
}
