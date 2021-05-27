package com.example.Library;

public class Mary
{
    private int sno;
    private String title;
    private String author;
    private String stock;

    public Mary(int sno, String title, String author, String stock )
    {
        this.sno = sno;
        this.title = title;
        this.author = author;
        this.stock = stock;
    }

    public int getSno()
    {
        return sno;
    }

    public void setSno( int sno )
    {
        this.sno = sno;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle( String title )
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor( String author )
    {
        this.author = author;
    }

    public String getStock()
    {
        return stock;
    }

    public void setStock( String stock )
    {
        this.stock = stock;
    }

    public String toString()
    {
        return sno + ". " + title + " by " + author;
    }

}