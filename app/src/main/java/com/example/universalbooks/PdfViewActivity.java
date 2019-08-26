package com.example.universalbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;

public class PdfViewActivity extends AppCompatActivity {
    PDFView pdfView;
    TextView tv1_toolbar, no_pages;
    ImageView iv_pdf_back, iv_next, iv_previous,iv_pdficon;
    int currentpage, totalpages;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);
        pdfView = findViewById(R.id.pdfView);
        iv_pdf_back = findViewById(R.id.iv_pdf_back);
        tv1_toolbar = findViewById(R.id.tv1_toolbar);
        no_pages = findViewById(R.id.no_pages);
        iv_next = findViewById(R.id.iv_next);
        iv_previous = findViewById(R.id.iv_previous);
        iv_pdficon = findViewById(R.id.iv_pdficon);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "font/font.ttf");
        tv1_toolbar.setTypeface(custom_font);

        String bookid = getIntent().getStringExtra("bookId");
        String bookname = getIntent().getStringExtra("BOOKNAME");
        String bookadhyaya = getIntent().getStringExtra("bookAdhyaya");

        iv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_previous.setVisibility(View.VISIBLE);
                pdfView.jumpTo(currentpage + 1);

            }
        });

        iv_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_next.setVisibility(View.VISIBLE);
                pdfView.jumpTo(currentpage - 1);

            }

        });


        if (bookid.equals("1")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("hindi_bhagwadgita.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();


        }

        if (bookid.equals("2")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("quran.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();


        }
        if (bookid.equals("3")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("hanuman_chalisa.pdf").defaultPage(0)
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);

                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();

            pdfView.zoomTo(5);

        }
        if (bookid.equals("4")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("durga_chalisa.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();


        }

        if (bookid.equals("8")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("ganesh_chalisa.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();


        }
        if (bookid.equals("5")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("durga_saptshati.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();


        }

        if (bookid.equals("17")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("mahatmagandhi.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("18")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("alberteinstein.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("11")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("freedom_midnight.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("12")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("india_after_ind.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("26")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("soul_machine.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("27")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("second_machine.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("13")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("vande.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("16")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("rainbow.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("33")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("narnia.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("31")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("zen.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("32")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("prince_thorns.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("60")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("silence_lambs.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("61")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("sharp_objects.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("14")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("freedom_known.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("55")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("mockingbird.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("28")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("algorithm.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("19")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("nelsonmandela.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("20")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("abraham_lincoln.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("23")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("wrightbrothers.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("22")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("benjamin_franklin.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("21")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("subhash_chandra.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("24")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("laxmibai.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("50")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("chandrashekhar.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("51")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("kalpana_chawla.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("52")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("neil_armstrong.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("53")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("vikramsarabhai.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("54")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("apj.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }


        if (bookid.equals("34")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("kali_chalisa.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();


        }

        if (bookid.equals("35")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("shanichalisa.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();


        }
        if (bookid.equals("36")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("sundarkand.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();


        }

        if (bookid.equals("37")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("bajrangbaan.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();


        }

        if (bookid.equals("43")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("naam_mala.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();


        }
        if (bookid.equals("44")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("ganesh_aarti.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();


        }
        if (bookid.equals("45")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("durga_aarti.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();


        }

        if (bookid.equals("46")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("vishnu_aarti.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();


        }

        if (bookid.equals("47")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("hanuman_aarti.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();


        }

        if (bookid.equals("48")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("shiv_aarti.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();


        }

        if (bookid.equals("49")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("laxmi_aarti.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();


        }

        if (bookid.equals("38")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("sukhmani_sahib.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();


        }
        if (bookid.equals("41")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("chintpurni_chalisa.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("40")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("bible.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }


        if (bookid.equals("42")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("durga_kawach.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }

                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();

        }

        if (bookid.equals("6")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("shiv_chalisa.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();

        }

        if (bookid.equals("9")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookname);
            pdfView.fromAsset("sai_chalisa.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("01")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText("Durga Stuti " + bookadhyaya);
            pdfView.fromAsset("adhyaya1.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();

        }

        if (bookid.equals("02")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText("Durga Stuti " + bookadhyaya);
            pdfView.fromAsset("adhyay2.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("03")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText("Durga Stuti " + bookadhyaya);
            pdfView.fromAsset("adhyay3.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("04")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText("Durga Stuti " + bookadhyaya);
            pdfView.fromAsset("adhyay4.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("05")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText("Durga Stuti " + bookadhyaya);
            pdfView.fromAsset("adhyay5.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("06")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText("Durga Stuti " + bookadhyaya);
            pdfView.fromAsset("adhyay6.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("07")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText("Durga Stuti " + bookadhyaya);
            pdfView.fromAsset("adhyay7.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("08")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText("Durga Stuti " + bookadhyaya);
            pdfView.fromAsset("adhyay8.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("09")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText("Durga Stuti " + bookadhyaya);
            pdfView.fromAsset("adhyay9.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("010")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText("Durga Stuti " + bookadhyaya);
            pdfView.fromAsset("adhyay10.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("011")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText("Durga Stuti " + bookadhyaya);
            pdfView.fromAsset("adhyay11.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("012")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText("Durga Stuti " + bookadhyaya);
            pdfView.fromAsset("adhyay12.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("013")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText("Durga Stuti " + bookadhyaya);
            pdfView.fromAsset("adhyay13.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("014")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("gutka_one.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("015")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("gutka_two.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("016")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("gutka_three.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("017")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("gutka_five.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("019")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("shabad_hazare.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("018")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("benti_choupee.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("020")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("barah_maha.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("021")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("deenan.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("022")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("shabad_ten.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("023")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("ardas.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("024")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("rakhiya.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("025")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("sohila.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("026")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("asadivar.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("027")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("sukhmani_sahib.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("028")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("dakhni.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("029")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("sidh_gosht.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("030")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("bhavan.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("031")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("jaitsri.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("032")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("ramkali.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("033")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("basant.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("034")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("bachitar.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("035")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("lawa.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("036")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("slok.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("037")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("raag_mala.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("038")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("chandivar.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("040")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("rehiraas.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("039")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("aartee.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("041")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("durga_kawach.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("043")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("keelkstotra.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("044")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("argala_stotra.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("045")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("maths_one.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("046")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("mathstwo_one.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("051")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("maths_two_two.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("047")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("phy_el_one.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("052")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("phy_el_two.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("048")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("phy_tw_one.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("053")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("phy_tw_two.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("049")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("chem_one.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }
        if (bookid.equals("054")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("chem_two.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("050")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("chem_tw_one.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }

        if (bookid.equals("055")) {
            iv_pdficon.setVisibility(View.VISIBLE);
            tv1_toolbar.setText(bookadhyaya);
            pdfView.fromAsset("chem_tw_two.pdf").defaultPage(0).
                    onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            currentpage = page;
                            totalpages = pageCount;
                            no_pages.setText(page + "/" + pageCount);
                            if (currentpage == totalpages) {
                                iv_next.setVisibility(View.GONE);
                            }
                            if (currentpage == 1) {
                                iv_next.setVisibility(View.VISIBLE);
                                iv_previous.setVisibility(View.GONE);
                            }
                        }
                    }).onLoad(new OnLoadCompleteListener() {
                @Override
                public void loadComplete(int nbPages) {
                    iv_pdficon.setVisibility(View.GONE);
                }
            }).load();
        }


        iv_pdf_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
