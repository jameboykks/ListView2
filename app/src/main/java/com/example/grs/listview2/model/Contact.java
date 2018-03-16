package com.example.grs.listview2.model;

/**
 * Created by Gr's on 03/10/18.
 */

public class Contact {
    private int mImage;
    private String mName;

    public Contact(int mImage, String mName) {
        this.mImage = mImage;
        this.mName = mName;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
