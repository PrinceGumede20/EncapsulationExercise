package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted=0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel<-1 || tonerLevel>100){
            tonerLevel =-1;
            this.tonerLevel=tonerLevel;
        }else{
            this.tonerLevel = tonerLevel;
        }

        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount >0 && tonerAmount <=100){
            if(tonerAmount+tonerLevel >100){
                return -1;
            }else{
                int calculatedToner =tonerAmount +tonerLevel;
                return calculatedToner;
            }
        }else {
            return -1;
        }
    }

    public int printPages(int pages){
             int pagesToPrint = pages;
             if(duplex){
                 int duplexPages = pages/2 ;
                 pagesPrinted=+duplexPages;
                 return pagesPrinted;
             }else{
                 pagesPrinted=+pages;
                 return pagesPrinted;
             }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
