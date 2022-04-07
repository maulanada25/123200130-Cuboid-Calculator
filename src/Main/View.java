/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.*;

/**
 *
 * @author MYWINDOWS
 */
public class View extends JFrame{
    JLabel header = new JLabel("Cuboid Calculator");
   
    JLabel length = new JLabel("Length");
    JLabel width = new JLabel("Width");
    JLabel height = new JLabel("Height");
    
    JTextField leng = new JTextField();
    JTextField wid = new JTextField();
    JTextField hei = new JTextField();
    
    
    JLabel result = new JLabel("Result : ");
    
    JLabel sqrarea = new JLabel("");
    JLabel sqrcirc = new JLabel("");
    JLabel cbdvol = new JLabel("");
    JLabel cbdsurf = new JLabel("");
    
    JLabel rsa = new JLabel ("");
    JLabel rsc = new JLabel ("");
    JLabel rcv = new JLabel ("");
    JLabel rcs = new JLabel ("");
    
    JButton go = new JButton ("Count");
    JButton reset = new JButton ("Reset");
    
    public View(){
        setTitle("Cuboid Calculatod"); //memberikan judul pada GUI
        setSize(500,460); // memberikan ukuran x dan y pada GUI
        setVisible(true); //dapat menampilkan GUI
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE); //ketika GUI kita tutup maka akan exit
        setLocationRelativeTo(null);
        
        add(header);
        
        add(length);
        add(width);
        add(height);
        
        add(leng);
        add(wid);
        add(hei);
        
        add(result);
        
        add(sqrarea);
        add(sqrcirc);
        add(cbdvol);
        add(cbdsurf);
        
        add(rsa);
        add(rsc);
        add(rcv);
        add(rcs);
        
        add(go);
        add(reset);
        
        header.setBounds(190, 15, 150, 30);
        
        length.setBounds(150, 60, 100, 30);
        width.setBounds(150, 105, 100, 30);
        height.setBounds(150, 150, 100, 30);
        
        leng.setBounds(200, 60 , 150, 30);
        wid.setBounds(200, 105, 150, 30);
        hei.setBounds(200, 150, 150, 30);
        
        result.setBounds(220, 200, 100, 30);
        
        sqrarea.setBounds(65, 245, 150, 30);
        sqrcirc.setBounds(65, 290, 200, 30);
        cbdvol.setBounds(280, 245, 150, 30);
        cbdsurf.setBounds(280, 290, 150, 30);
        
        rsa.setBounds(200, 245, 150, 30);
        rsc.setBounds(200, 290, 150, 30);
        rcv.setBounds(380, 245, 150, 30);
        rcs.setBounds(380, 290, 150, 30);
        
        go.setBounds(125, 350, 100, 30);
        reset.setBounds(275, 350, 100, 30);
    }
    
    public String getLeng(){
        return leng.getText();
    }
    
    public String getWid(){
        return wid.getText();
    }
    
    public String getHei(){
        return hei.getText();
    }
}
