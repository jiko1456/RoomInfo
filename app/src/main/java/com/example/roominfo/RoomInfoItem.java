package com.example.roominfo;

public class RoomInfoItem {
    String floor;
    int resid;

    public RoomInfoItem(String floor) {
        this.floor = floor;
    }

    public String getFloor() {
        return floor;
    }
    public void setFloor() {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "RoomInfoItem{" +
                "floor='" + floor + "\"" + "}";
    }
}
