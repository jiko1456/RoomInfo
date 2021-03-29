package com.example.roominfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import android.widget.ImageButton;
import android.widget.LinearLayout;


public class LectureRoom extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_lectureroom);

        Window win = getWindow();
        win.setContentView(R.layout.activity_main);

        LayoutInflater inflater = (LayoutInflater)getSystemService(

                Context.LAYOUT_INFLATER_SERVICE);

        LinearLayout linear = (LinearLayout)inflater.inflate(R.layout.activity_lectureroom, null);

        linear.setBackgroundColor(Color.parseColor("#00ff0000"));
        linear.setGravity(Gravity.CENTER);
        linear.setPadding(5, 100,5,40);

        //파라미터를 세팅해줌

        LinearLayout.LayoutParams paramlinear = new LinearLayout.LayoutParams(

                LinearLayout.LayoutParams.MATCH_PARENT,

                LinearLayout.LayoutParams.MATCH_PARENT

        );



        //윈도우에 추가시킴
        win.addContentView(linear, paramlinear);

        //강의동 버튼 intent
        Button button01= findViewById(R.id.button01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RoomInfo_1.class);
                startActivity(intent);
                finish();

            }
        });
        Button button02 = findViewById(R.id.button02);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RoomInfo_2.class);
                startActivity(intent);
                finish();

            }
        });
        Button button03 = findViewById(R.id.button03);
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RoomInfo_3.class);
                startActivity(intent);
                finish();

            }
        });
        Button button04 = findViewById(R.id.button04);
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RoomInfo_4.class);
                startActivity(intent);
                finish();

            }
        });
        Button button05 = findViewById(R.id.button05);
        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RoomInfo_5.class);
                startActivity(intent);
                finish();

            }
        });
        Button button06 = findViewById(R.id.button06);
        button06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RoomInfo_6.class);
                startActivity(intent);
                finish();

            }
        });
        Button button07 = findViewById(R.id.button07);
        button07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RoomInfo_7.class);
                startActivity(intent);
                finish();
            }
        });
        Button button08 = findViewById(R.id.button08);
        button08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RoomInfo_8.class);
                startActivity(intent);
                finish();

            }
        });
        Button button09 = findViewById(R.id.button09);
        button09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RoomInfo_9.class);
                startActivity(intent);
                finish();
            }
        });
        Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RoomInfo_10.class);
                startActivity(intent);
                finish();

            }
        });
        ImageButton res = findViewById(R.id.res);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Res.class);
                startActivity(intent);
                finish();

            }
        });
        ImageButton bus = findViewById(R.id.bus);
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bus.class);
                startActivity(intent);
                finish();

            }
        });
        ImageButton lec = findViewById(R.id.lec);
        lec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Room.class);
                startActivity(intent);
                finish();
            }
        });
        ImageButton etc = findViewById(R.id.etc);
        etc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Etc.class);
                startActivity(intent);
                finish();
            }
        });
        ImageButton favor = findViewById(R.id.favor);
        favor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Like.class);
                startActivity(intent);
                finish();
            }
        });


    }
}