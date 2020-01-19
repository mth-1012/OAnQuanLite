package com.team.minhthanh.oanquanlite;

import android.view.View;
import android.widget.ImageView;

public class Square {

    private ImageView imageView;
    private int point;

    public Square() {
        imageView = null;
        point = 0;
    }

    public Square(ImageView imageView, int point) {
        this.imageView = imageView;
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public ImageView getImageView() {
        return imageView;
    }
}
