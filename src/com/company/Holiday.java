package com.company;

 class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String n, int d, String m) {
        name = n;
        day = d;
        month = m;
    }

    public boolean inSameMonth(Holiday holiday1) {
        if (this.month.equals(holiday1.month))
        return true;
        else
            return false;
    }

    public static double avgDate(Holiday[] hol) {
        int sum = 0;
        for (int i = 0; i < hol.length; i++) {
            sum = sum + hol[i].day;
        }
        return ((double) sum) / hol.length;
    }

    public static void main(String[] args) {
        Holiday holiday1 = new Holiday("Independence Day", 4, "July");

    }

}
