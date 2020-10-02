package com.example.verticalviewpager;

public class Model  {
    private int image;

    public Model(int image, String information) {
        this.image = image;
        this.information = information;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    private String information;
}
