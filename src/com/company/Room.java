package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Room implements Comparable<Room> {
    private double width;
    private double length;
    private int floor;

    public Room(){
        width=10;
        length=12.5;
        floor=1;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width>0)
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length>0)
        this.length = length;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Room(double num1, double num2, int floor){
        setWidth(num1);
        setLength(num2);
        setFloor(floor);

    }


    @Override
    public String toString() {
        return "length :"+length +"x" +" width :"+ width +" on floor :"+ floor;
    }

    @Override
    public int compareTo(Room oRoom) {
        double comparison = getFloor() != oRoom.getFloor() ? getFloor() - oRoom.getFloor() :
                getLength() != oRoom.getLength() ? getLength() - oRoom.getLength() :
                        getWidth() != oRoom.getWidth() ? getWidth() - oRoom.getWidth() : 0;
        return comparison < 0 ? -1 : comparison > 0 ? 1 : 0;
    }


}



