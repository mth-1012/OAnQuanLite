package com.team.minhthanh.oanquanlite;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Square {

    private ImageView imageView;
    public static int id_static = 0;
    public static boolean squareIsPressed = false;
    private int position;
    private int point;

    public Square() {
        imageView = null;
        point = 0;
        position = id_static;
        id_static++;
    }

    public Square(final ImageView imageView, int point) {
        this.imageView = imageView;
        this.point = point;
        position = id_static;
        this.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id_static = position;
                squareIsPressed = true;
            }
        });
        id_static++;
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
