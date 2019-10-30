package com.sishin.phone.searchtoolbartest;

import java.io.Serializable;

class NoticeItem implements Serializable {
    private String title;
    private String name;
    public NoticeItem(String title){
        this.title = title;
        this.name = "TTT";
    }
    public NoticeItem(String title,String name){
        this.title = title;
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
