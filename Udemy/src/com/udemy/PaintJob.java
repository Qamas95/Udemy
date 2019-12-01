package com.udemy;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double pole = width * height;
            double wynikWDouble = (pole / areaPerBucket) - extraBuckets;
            int wynikWIntZaograglonyWGore = (int) Math.ceil(wynikWDouble);
            return wynikWIntZaograglonyWGore;

        }

    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double pole = width * height;
            double wynikWDouble = (pole / areaPerBucket);
            int wynikWIntZaokraglonyWGore = (int)Math.ceil(wynikWDouble);

            return wynikWIntZaokraglonyWGore;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0) {
         return -1;
        } else {
            double wynik = area/areaPerBucket;
            int WynikPoZaokragleniu = (int) Math.ceil(wynik);
            return WynikPoZaokragleniu;
        }
    }


}
