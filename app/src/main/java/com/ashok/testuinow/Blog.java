package com.ashok.testuinow;

/**
 * Created by ashok on 8/30/16.
 */
public class Blog {
    private String image,desc,title,link;

    public Blog(){

    }

    public Blog(String image, String desc, String title,String link) {
        this.image = image;
        this.desc = desc;
        this.title = title;
        this.link = link;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}

