package com.udemy;

public class Printer {

    private int tonerLvl;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLvl, boolean duplex) {
        if(tonerLvl > -1 && tonerLvl <= 100){
            this.tonerLvl = tonerLvl;
        } else this.tonerLvl = -1;

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if(this.tonerLvl + tonerAmount > 100) {
                return -1;
            }
            this.tonerLvl += tonerAmount;
            return this.tonerLvl;
        } else return -1;
    }


    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
