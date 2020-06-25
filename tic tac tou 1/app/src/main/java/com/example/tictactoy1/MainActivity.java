package com.example.tictactoy1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Boolean Xturn =true;

    TextView turn;

    int[] Xarray = new int[9];
    int[] Oarray = new int[9];

    //#feceab
    //#ff847c
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button zero = findViewById(R.id.bu0);
        final Button one = findViewById(R.id.bu1);
        final Button two = findViewById(R.id.bu2);
        final Button three = findViewById(R.id.bu3);
        final Button four = findViewById(R.id.bu4);
        final Button five = findViewById(R.id.bu5);
        final Button six = findViewById(R.id.bu6);
        final Button seven = findViewById(R.id.bu7);
        final Button eight = findViewById(R.id.bu8);
        turn = findViewById(R.id.textView);
        Button reset = findViewById(R.id.button10);



        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    Xarray[0] = 1;
                    checkXwin();

                    zero.setText("x");

                }
                else{
                    Oarray[0]=1;
                    checkOwin();
                    zero.setText("O");
                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    Xarray[1]=1;

                    checkXwin();

                    one.setText("X");
                }

                else{
                    Oarray[1]=1;

                    checkOwin();

                    one.setText("O");
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    two.setText("X");
                    checkXwin();
                    Xarray[2]=1;


                }

                else{
                    Oarray[2]=1;

                    checkOwin();

                    two.setText("O");
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    checkXwin();
                    Xarray[3]=1;

                    three.setText("x");

                }
                else{
                    Oarray[3]=1;

                    checkOwin();

                    three.setText("O");
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    checkXwin();
                    Xarray[4]=1;

                    four.setText("x");

                }
                else{
                    Oarray[4]=1;

                    checkOwin();

                    four.setText("O");
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    checkXwin();
                    Xarray[5]=1;

                    five.setText("x");

                }
                else{
                    Oarray[5]=1;

                    checkOwin();

                    five.setText("O");
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    checkXwin();

                    Xarray[6]=1;

                    six.setText("x");

                }
                else{
                    Oarray[6]=1;

                    checkOwin();

                    six.setText("O");
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    checkXwin();

                    Xarray[7]=1;

                    seven.setText("x");

                }
                else{
                    Oarray[7]=1;

                    checkOwin();

                    seven.setText("O");
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    checkXwin();
                    Xarray[8]=1;
                    eight.setText("x");

                }
                else{
                    Oarray[8]=1;

                    checkOwin();

                    eight.setText("O");
                }
            }
        });

    }

    public void checkXwin() {
        Xturn = false;
        turn.setText("O TURN");

        if (Xarray[0] == 1 && Xarray[1] == 1 && Xarray[2] == 1)
        {
            Toast.makeText(MainActivity.this,"X WON!!",Toast.LENGTH_SHORT).show();
        }

        if (Xarray[3] == 1 && Xarray[4] == 1 && Xarray[5] == 1)
        {
            Toast.makeText(MainActivity.this,"X WON!!",Toast.LENGTH_SHORT).show();
        }

        if (Xarray[6] == 1 && Xarray[7] == 1 && Xarray[8] == 1)
        {
            Toast.makeText(MainActivity.this,"X WON!!",Toast.LENGTH_SHORT).show();
        }

        if (Xarray[0] == 1 && Xarray[3] == 1 && Xarray[6] == 1)
        {
            Toast.makeText(MainActivity.this,"X WON!!",Toast.LENGTH_SHORT).show();
        }

        if (Xarray[1] == 1 && Xarray[4] == 1 && Xarray[7] == 1)
        {
            Toast.makeText(MainActivity.this,"X WON!!",Toast.LENGTH_SHORT).show();
        }

        if (Xarray[2] == 1 && Xarray[5] == 1 && Xarray[8] == 1)
        {
            Toast.makeText(MainActivity.this,"X WON!!",Toast.LENGTH_SHORT).show();
        }

        if (Xarray[0] == 1 && Xarray[4] == 1 && Xarray[8] == 1)
        {
            Toast.makeText(MainActivity.this,"X WON!!",Toast.LENGTH_SHORT).show();
        }

        if (Xarray[2] == 1 && Xarray[4] == 1 && Xarray[6] == 1)
        {
            Toast.makeText(MainActivity.this,"X WON!!",Toast.LENGTH_SHORT).show();
        }
    }





    public void checkOwin() {
        Xturn = true;
        turn.setText("X TURN");

        if (Oarray[0] == 1 && Oarray[1] == 1 && Oarray[2] == 1) {
            Toast.makeText(MainActivity.this, "X WON!!", Toast.LENGTH_SHORT).show();
        }

        if (Oarray[3] == 1 && Oarray[4] == 1 && Oarray[5] == 1) {
            Toast.makeText(MainActivity.this, "X WON!!", Toast.LENGTH_SHORT).show();
        }

        if (Oarray[6] == 1 && Oarray[7] == 1 && Oarray[8] == 1) {
            Toast.makeText(MainActivity.this, "X WON!!", Toast.LENGTH_SHORT).show();
        }

        if (Oarray[0] == 1 && Oarray[3] == 1 && Oarray[6] == 1) {
            Toast.makeText(MainActivity.this, "X WON!!", Toast.LENGTH_SHORT).show();
        }

        if (Oarray[1] == 1 && Oarray[4] == 1 && Oarray[7] == 1) {
            Toast.makeText(MainActivity.this, "X WON!!", Toast.LENGTH_SHORT).show();
        }

        if (Oarray[2] == 1 && Oarray[5] == 1 && Oarray[8] == 1) {
            Toast.makeText(MainActivity.this, "X WON!!", Toast.LENGTH_SHORT).show();
        }

        if (Oarray[0] == 1 && Oarray[4] == 1 && Oarray[8] == 1) {
            Toast.makeText(MainActivity.this, "X WON!!", Toast.LENGTH_SHORT).show();
        }

        if (Oarray[2] == 1 && Oarray[4] == 1 && Oarray[6] == 1) {
            Toast.makeText(MainActivity.this, "X WON!!", Toast.LENGTH_SHORT).show();


        }
    }
    }