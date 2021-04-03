package com.example.roominfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class RoomInfoPop_8 extends AppCompatActivity {

    private Intent intent;
    private TextView floor;
    private ImageView floorInfo, x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_info_pop_8);

        String floorN;
        intent = getIntent();
        floorN = intent.getExtras().getString("floor");

        floor = (TextView) findViewById(R.id.floor);
        floorInfo = (ImageView) findViewById(R.id.floorInfo);
        x =(ImageView) findViewById(R.id.x);

        // 층 수 intent값 받아서 타이틀에 set 해놓기.
        floor.setText(floorN);

        // 층 수에 따라 이미지 불러오기.
        if(floorN.equals("B1F"))
            floorInfo.setImageResource(R.drawable.cafe);

        // X 버튼 누를시에만 뒤로가게.
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    // 바깥 레이어 클릭해도 안닫히게.
    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        if(event.getAction() == MotionEvent.ACTION_OUTSIDE) {
            return false;
        }
        return true;
    }

    // 뒤로가기 버튼 막기.
    @Override
    public void onBackPressed() {
        return;
    }
}