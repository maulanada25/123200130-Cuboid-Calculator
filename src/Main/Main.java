/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import bidang.Persegi;
import java.awt.event.*;
import javax.swing.*;
import ruang.Balok;
/**
 *
 * @author MYWINDOWS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        View gui = new View();
        gui.go.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    String len = gui.getLeng();
                    String wi = gui.getWid();
                    String he = gui.getHei();
                    
                    double l = Integer.parseInt(len);
                    double w = Integer.parseInt(wi);
                    double h = Integer.parseInt(he);
                    
                    Persegi sqr = new Persegi(l, w);
                    Balok cbd = new Balok(l, w, h);
                    
                    String resa = String.valueOf(sqr.area());
                    String resc = String.valueOf(sqr.circum());
                    String recv = String.valueOf(cbd.volume());
                    String recs = String.valueOf(cbd.surface());
                    
                    gui.sqrarea.setText("Square Area");
                    gui.sqrcirc.setText("Square Circumference");
                    gui.cbdvol.setText("Cuboid Volume");
                    gui.cbdsurf.setText("Cuboid Surface");
                    
                    gui.rsa.setText(" :   "+resa);
                    gui.rsc.setText(" :   "+resc);
                    gui.rcv.setText(" :   "+recv);
                    gui.rcs.setText(" :   "+recs);
                    
                }catch(Exception exc){
                    JOptionPane.showMessageDialog(null, exc.getMessage() + "Input Value Error!!");
                }
                //try and catch untuk input berbeda yang mana apabila di try salah
                //maka akan menampilkan didalam catch(error)
            }
        });
        
        gui.reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                gui.leng.setText("");
                gui.wid.setText("");
                gui.hei.setText("");
                
                gui.sqrarea.setText("");
                gui.sqrcirc.setText("");
                gui.cbdvol.setText("");
                gui.cbdsurf.setText("");
    
                gui.rsa.setText("");
                gui.rsc.setText("");
                gui.rcv.setText("");
                gui.rcs.setText("");

            }
        });
    }
    
}
