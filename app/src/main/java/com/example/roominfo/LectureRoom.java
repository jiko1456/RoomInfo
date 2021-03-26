package com.example.roominfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LectureRoom extends AppCompatActivity {

    Button roomInfo_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lectureroom);

        roomInfo_btn = (Button) findViewById(R.id.roomInfo_btn);
        roomInfo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RoomInfo_1.class);
                startActivity(intent);
                finish();
            }
        });
    }
}