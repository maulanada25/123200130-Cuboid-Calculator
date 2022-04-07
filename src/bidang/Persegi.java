/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang;

/**
 *
 * @author MYWINDOWS
 */
public class Persegi implements MenghitungBidang {
    private double length1, width1;
    
    public Persegi(double l, double w){
        this.length1 = l;
        this.width1 = w;
    }

    //encapsulation

    public double getLength1() {
        return length1;
    }

    public void setLength1(double length1) {
        this.length1 = length1;
    }

    public double getWidth1() {
        return width1;
    }

    public void setWidth1(double width1) {
        this.width1 = width1;
    }

    @Override
    public double area() {
        return length1*width1;
    }

    @Override
    public double circum() {
        return (2*length1)+(2*width1);
    }

}