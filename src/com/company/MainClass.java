package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Room> roomList= new ArrayList<Room>();
        roomList.add(new Room(8.8, 5.5,5));
        roomList.add(new Room(4.4,2.5,5));
        roomList.add(new Room(3.4,24,9));
        roomList.add(new Room(14,8.8,8));
        roomList.add(new Room(11,13.8,4));

        Arrays.sort(new List[]{roomList});
        roomList.forEach(x -> System.out.println(x));
    }

}
