package com.pdax.pojo;

import com.pdax.utils.DateUtil;

import java.util.Optional;

/**
 * @author Fly Tiger
 * @date 2021/5/19 14:34
 */
public class BaseEntity {

    private String author;

    private String dateTime;

    public String getDateTime() {

        return Optional.ofNullable(dateTime).orElse(DateUtil.getCurrentDateTime());
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getAuthor() {
        return Optional.ofNullable(author).orElse("FLY TIGER");
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
