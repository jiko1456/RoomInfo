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
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RoomInfo_2 extends AppCompatActivity {

    TextView cancelBtn, naviBtn;
    ImageButton res, bus, lec, etc, favor;
    ListView roomInfo_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.lectureroom_2);

        Window win = getWindow();
        win.setContentView(R.layout.activity_main);

        LayoutInflater inflater = (LayoutInflater)getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

        LinearLayout linear = (LinearLayout) inflater.inflate(R.layout.lectureroom_2, null);
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

        roomInfo_content=(ListView)findViewById(R.id.roominfo_content);
        RoomInfoAdapter adapter= new RoomInfoAdapter();
        adapter.addItem(new RoomInfoItem("B1F", R.drawable.transparent, R.drawable.transparent, R.drawable.transparent, R.drawable.transparent, R.drawable.transparent));
        adapter.addItem(new RoomInfoItem("1F", R.drawable.cafe, R.drawable.printer, R.drawable.transparent, R.drawable.transparent, R.drawable.transparent));
        adapter.addItem(new RoomInfoItem("2F", R.drawable.transparent, R.drawable.transparent, R.drawable.transparent, R.drawable.transparent, R.drawable.transparent));
        adapter.addItem(new RoomInfoItem("3F", R.drawable.transparent, R.drawable.transparent, R.drawable.transparent, R.drawable.transparent, R.drawable.transparent));
        adapter.addItem(new RoomInfoItem("4F", R.drawable.transparent, R.drawable.transparent, R.drawable.transparent, R.drawable.transparent, R.drawable.transparent));
        adapter.addItem(new RoomInfoItem("5F", R.drawable.transparent, R.drawable.transparent, R.drawable.transparent, R.drawable.transparent, R.drawable.transparent));
        roomInfo_content.setAdapter(adapter);

        // 리스트뷰 클릭.
        roomInfo_content.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // 각 리스트에 대한 층 수 값 저장.
                String floor = ((RoomInfoItem)adapter.getItem(position)).getFloor();

                Intent intent = new Intent(getApplicationContext(), RoomInfoPop.class);
                intent.putExtra("floor", floor);
                intent.putExtra( "lect",2);
                startActivity(intent);
            }
        });


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
            if (convertView == null) {
                roomInfoItemView = new RoomInfoItemView(getApplicationContext());
            } else {
                roomInfoItemView = (RoomInfoItemView) convertView;
            }
            RoomInfoItem item = items.get(position);
            roomInfoItemView.setFloor(item.getFloor());
            roomInfoItemView.setFloorPic1(item.getFloorPic1());
            roomInfoItemView.setFloorPic2(item.getFloorPic2());
            roomInfoItemView.setFloorPic3(item.getFloorPic3());
            roomInfoItemView.setFloorPic4(item.getFloorPic4());
            roomInfoItemView.setFloorPic5(item.getFloorPic5());
            return roomInfoItemView;
        }
    }
}