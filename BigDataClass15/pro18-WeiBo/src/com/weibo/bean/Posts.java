package com.weibo.bean;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Posts {
    private int id;
    private int u_id;
    private String title;
    private String body;
    private int like;
    private String date;

    public Posts() {
    }

    public Posts(int id, int u_id, String title, String body, int like, String date) {
        this.id = id;
        this.u_id = u_id;
        this.title = title;
        this.body = body;
        this.like = like;
        this.date = date;
    }

    public Posts(int u_id, String title, String body) {
        this.u_id = u_id;
        this.title = title;
        this.body = body;
        this.date = new SimpleDateFormat("YYYY-mm-DD HH:MM:SS").format(new Date());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", u_id=" + u_id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", like=" + like +
                ", date=" + date +
                '}';
    }
}
