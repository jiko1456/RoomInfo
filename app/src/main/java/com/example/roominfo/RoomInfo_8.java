package com.example.roominfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RoomInfo_8 extends AppCompatActivity {

    TextView cancelBtn, naviBtn;
    ImageButton res, bus, lec, etc, favor;
    ListView roomInfo_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.lectureroom_8);

        // 메인화면 뒷배경 넣기.
        Window win = getWindow();
        win.setContentView(R.layout.activity_main);

        LayoutInflater inflater = (LayoutInflater)getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

        LinearLayout linear = (LinearLayout) inflater.inflate(R.layout.lectureroom_8, null);
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

        // 리스트뷰 구현.
        roomInfo_content = (ListView) findViewById(R.id.roominfo_content);
        RoomInfoAdapter adapter = new RoomInfoAdapter();
        adapter.addItem(new RoomInfoItem("B1 층"));
        adapter.addItem(new RoomInfoItem("1 층"));
        adapter.addItem(new RoomInfoItem("2 층"));
        adapter.addItem(new RoomInfoItem("3 층"));
        adapter.addItem(new RoomInfoItem("4 층"));
        adapter.addItem(new RoomInfoItem("5 층"));
        roomInfo_content.setAdapter(adapter);



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

    //리스트뷰 어댑터 구현.
    class RoomInfoAdapter extends BaseAdapter {
        ArrayList<RoomInfoItem> items = new ArrayList<RoomInfoItem>();

        @Override
        public int getCount() {
            return items.size();
        }
        public void addItem(RoomInfoItem item) {
            items.add(item);
        }
        @Override
        public Object getItem(int position) {
            return items.get(position);
        }
        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            RoomInfoItemView roomInfoItemView = null;
            if(convertView == null) {
                roomInfoItemView = new RoomInfoItemView(getApplicationContext());
            }
            else {
                roomInfoItemView = (RoomInfoItemView) convertView;
            }
            RoomInfoItem item = items.get(position);
            roomInfoItemView.setFloor(item.getFloor());
            return roomInfoItemView;
        }
    }
}