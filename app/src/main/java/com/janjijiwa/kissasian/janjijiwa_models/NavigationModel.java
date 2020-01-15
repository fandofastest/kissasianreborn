package com.janjijiwa.kissasian.janjijiwa_models;

public class NavigationModel {

    String img;
    String title;


    public NavigationModel(String title , String img) {
        this.img = img;
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
