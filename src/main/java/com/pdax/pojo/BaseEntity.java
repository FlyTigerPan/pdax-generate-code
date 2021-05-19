package com.pdax.pojo;

/**
 * @author Fly Tiger
 * @date 2021/5/19 14:34
 */
public class BaseEntity {

    private String author;

    private String dateTime;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
