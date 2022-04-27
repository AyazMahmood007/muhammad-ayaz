package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassRoom extends Room {

    private int numStudents;

    ClassRoom(double num1,double num2, int floor, int numStudents){
        super(num1,num2,floor);
        this.numStudents=numStudents;
    }

    @Override
    public String toString() {
        return super.toString()+ "capacity ="+ numStudents + "Students";
    }

}
