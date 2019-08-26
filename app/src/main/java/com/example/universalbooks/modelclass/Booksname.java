package com.example.universalbooks.modelclass;

public class Booksname {
    String bookname,bookid;
int bookimage;
    public Booksname(String bookname, String bookid,int bookimage) {
       this.setBookname(bookname);
       this.setBookid(bookid);
       this.setBookimage(bookimage);
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public int getBookimage() {
        return bookimage;
    }

    public void setBookimage(int bookimage) {
        this.bookimage = bookimage;
    }
}
