package com.udemy;

public class Point {

    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double wynik = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return wynik;
    }

    public double distance(int x, int y) {

        double wynik = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
        //double wynik = (((x*getY())-(x*getX()))*((x*getY())-(x*getX()))) + (((y*getY())-(y*getX()))*((y*getY())-(y*getX())));
        return wynik;
    }


    public double distance(Point nazwa) {
        double wynik = Math.sqrt(Math.pow((this.x - nazwa.getX()), 2) + Math.pow((this.y - nazwa.getY()), 2));
        return wynik;
    }

}
