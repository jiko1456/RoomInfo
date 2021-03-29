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
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RoomInfo_3 extends AppCompatActivity {

    TextView cancelBtn, naviBtn;
    ImageButton res, bus, lec, etc, favor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.lectureroom_3);

        Window win = getWindow();
        win.setContentView(R.layout.activity_main);

        LayoutInflater inflater = (LayoutInflater)getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

        LinearLayout linear = (LinearLayout) inflater.inflate(R.layout.lectureroom_3, null);
        linear.setBackgroundColor(Color.parseColor("#00ff0000"));
        linear.setGravity(Gravity.CENTER);
        linear.setPadding(5,100,5,40);

        LinearLayout.LayoutParams paramlinear = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        win.addContentView(linear, paramlinear);

        cancelBtn = (TextView) findViewById(R.id.cancelBtn);
        naviBtn = (TextView) findViewById(R.id.naviBtn);
        res = (ImageButton) findViewById(R.id.res);
        bus = (ImageButton) findViewById(R.id.bus);
        lec = (ImageButton) findViewById(R.id.lec);
        etc = (ImageButton) findViewById(R.id.etc);
        favor = (ImageButton) findViewById(R.id.favor);

        // 취소, 길 안내 버튼.
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LectureRoom.class);
                startActivity(intent);
                finish();

            }
        });
        naviBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Navigation.class);
                startActivity(intent);
            }
        });

        // 밑에 버튼 5개.
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Res.class);
                startActivity(intent);

            }
        });
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bus.class);
                startActivity(intent);

            }
        });
        lec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Room.class);
                startActivity(intent);
            }
        });
        etc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Etc.class);
                startActivity(intent);
            }
        });
        favor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Like.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(), LectureRoom.class);
        startActivity(intent);
    }
}