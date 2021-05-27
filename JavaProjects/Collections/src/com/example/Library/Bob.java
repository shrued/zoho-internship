package com.example.Library;

public class Bob
{
    private int sno;
    private String title;
    private String author;

    public Bob(int sno, String title, String author )
    {
        this.sno = sno;
        this.title = title;
        this.author = author;
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

    public String toString()
    {
        return sno + ". " + title + " by " + author;
    }
}