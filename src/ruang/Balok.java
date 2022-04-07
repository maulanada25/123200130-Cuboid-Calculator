/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;

import bidang.Persegi;

/**
 *
 * @author MYWINDOWS
 */
public class Balok extends Persegi implements MenghitungRuang {
    private double height1;
    
    public Balok(double l, double w, double h){
        super(l, w);
        height1 = h;
    }

    public double getHeight1() {
        return height1;
    }

    public void setHeight1(double height1) {
        this.height1 = height1;
    }

    @Override
    public double volume() {
        return super.area()*height1;
    }

    @Override
    public double surface() {
        return 2*(super.area()+(super.getLength1()*height1)+(super.getWidth1()*height1));
    }
}
