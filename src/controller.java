import javax.swing.*;
import viewpackage.view;
import modelpackage.model;

import java.awt.*;

public class controller implements Runnable{
    private view swing;
    private model encryption;
    private JFrame frame;
    private String title = "Encryption";

    public controller() {
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        frame.requestFocus();
        frame.getContentPane().add(BorderLayout.NORTH, panel1);

    }
    public synchronized void start(){

    }
    public static void main(String[] args){
        controller c = new controller();
        c.start();


        //Skapar en actionlistener på knappen och tar values som strings.

    }

    @Override
    public void run() {

    }
}