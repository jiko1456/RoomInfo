package com.example.roominfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RoomInfoPop extends AppCompatActivity {

    private Intent intent;
    private TextView floor;
    private ImageView floorInfo, x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_info_pop_);

        String floorN;
        int lectN;
        intent = getIntent();
        floorN = intent.getExtras().getString("floor");
        lectN=intent.getExtras().getInt("lect");

        floor = (TextView) findViewById(R.id.floor);
        floorInfo = (ImageView) findViewById(R.id.floorInfo);
        x =(ImageView) findViewById(R.id.x);

        // 층 수 intent값 받아서 타이틀에 set 해놓기.
        floor.setText(floorN);

        //강의동 intent 값 받아서 강의동 별 함수 호출
        switch(lectN) {
            case 1: room_1(floorN); break;
            case 2: room_2(floorN); break;
            case 3: room_3(floorN); break;
            case 4: room_4(floorN); break;
            case 5: room_5(floorN); break;
            case 6: room_6(floorN); break;
            case 7: room_7(floorN); break;
            case 8: room_8(floorN); break;
            case 9: room_9(floorN); break;
            case 10: room_10(floorN); break;
        }

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
    //강의동 별로 이미지 불러오는 함수

    void room_1(String floorN){
        if(floorN.equals("3F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("4F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("5F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("6F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("7F"))
            floorInfo.setImageResource(R.drawable.room_pic);
    }
    void room_2(String floorN){
        if(floorN.equals("B1F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("1F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("2F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("3F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("4F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("5F"))
            floorInfo.setImageResource(R.drawable.room_pic);
    }
    void room_3(String floorN){
        if(floorN.equals("1F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("2F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("3F"))
            floorInfo.setImageResource(R.drawable.room_pic);
    }
    void room_4(String floorN){
        if(floorN.equals("1F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("2F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("3F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("4F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("5F"))
            floorInfo.setImageResource(R.drawable.room_pic);
    }
    void room_5(String floorN){
        if(floorN.equals("B1F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("1F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("2F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("3F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("4F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("5F"))
            floorInfo.setImageResource(R.drawable.room_pic);
    }
    void room_6(String floorN){
        if(floorN.equals("B1F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("1F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("2F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("3F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("4F"))
            floorInfo.setImageResource(R.drawable.room_pic);
    }
    void room_7(String floorN){
        if(floorN.equals("B1F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("1F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("2F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("3F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("4F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("5F"))
            floorInfo.setImageResource(R.drawable.room_pic);
    }
    void room_8(String floorN){
        System.out.println("안녕 ");
        if(floorN.equals("B1F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("1F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("2F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("3F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("4F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("5F"))
            floorInfo.setImageResource(R.drawable.room_pic);
    }
    void room_9(String floorN){
        if(floorN.equals("1F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("2F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("3F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("4F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("5F"))
            floorInfo.setImageResource(R.drawable.room_pic);
    }
    void room_10(String floorN){
        if(floorN.equals("1F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("2F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("3F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("4F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("5F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("6F"))
            floorInfo.setImageResource(R.drawable.room_pic);
        if(floorN.equals("7F"))
            floorInfo.setImageResource(R.drawable.room_pic);
    }

}