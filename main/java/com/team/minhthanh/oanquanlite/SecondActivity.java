package com.team.minhthanh.oanquanlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    TextView textPrompt;
    Button buttonLeft, buttonRight;
    ArrayList<Square> squareArrayList;
    int[] gameBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initiation();
        startGame();
    }

    private void startGame() {
        byte turn = 1;
        do {
            setClickables(turn);


        }
        while (!checkWinner());
    }

    private void setClickables(byte turn) {
        for (int s = 1; s <= 12; s++) {
            if (s < 6)
                squareArrayList.get(s).getImageView().setClickable(turn == 1);
            else if (s > 6 && s < 12)
                squareArrayList.get(s).getImageView().setClickable(turn == 2);
        }
    }

    private boolean checkWinner() {
        return true;
    }

    protected void initiation() {
        textPrompt = findViewById(R.id.textPrompt);
        squareArrayList = new ArrayList<>();
        squareArrayList.add(new Square());
        squareArrayList.add(new Square((ImageView) findViewById(R.id.position1), 5));
        squareArrayList.add(new Square((ImageView) findViewById(R.id.position2), 5));
        squareArrayList.add(new Square((ImageView) findViewById(R.id.position3), 5));
        squareArrayList.add(new Square((ImageView) findViewById(R.id.position4), 5));
        squareArrayList.add(new Square((ImageView) findViewById(R.id.position5), 5));
        squareArrayList.add(new Square((ImageView) findViewById(R.id.position6), 10));
        squareArrayList.add(new Square((ImageView) findViewById(R.id.position7), 5));
        squareArrayList.add(new Square((ImageView) findViewById(R.id.position8), 5));
        squareArrayList.add(new Square((ImageView) findViewById(R.id.position9), 5));
        squareArrayList.add(new Square((ImageView) findViewById(R.id.position10), 5));
        squareArrayList.add(new Square((ImageView) findViewById(R.id.position11), 5));
        squareArrayList.add(new Square((ImageView) findViewById(R.id.position12), 10));
        buttonLeft = findViewById(R.id.goLeft);
        buttonRight = findViewById(R.id.goRight);
    }
}
