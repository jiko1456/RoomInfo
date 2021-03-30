package com.example.roominfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class RoomInfoItemView extends LinearLayout {

    TextView floor;
    ImageButton floorInfo;

    public RoomInfoItemView(Context context) {
        super(context);
        init(context);
    }

    public RoomInfoItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.roominfo_item_list,this, true);

        floor = (TextView) findViewById(R.id.floor);
        floorInfo = (ImageButton) findViewById(R.id.floorInfo);
    }

    public void setFloor(String floorN) {
        floor.setText(floorN);
    }
}
