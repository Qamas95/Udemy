package com.company;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber name){
        this.real+=name.real;
        this.imaginary+=name.imaginary;
    }

    public void subtract(double real, double imaginary){
        this.real-=real;
        this.imaginary-=imaginary;
    }

    public void subtract(ComplexNumber name){
       this.real-=name.real;
       this.imaginary-=name.imaginary;
    }


}
