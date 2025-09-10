
package travel.management.system;

import javax.swing.*;
import java.awt.*;
public  class Splash extends JFrame implements Runnable{
    Thread thread;
    Splash() {
       
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true);
        thread = new Thread(this);
        thread.start();
    }
public void run(){
    try{
        Thread.sleep(5000);
        setVisible(false);
        new Login().setVisible(true);
    }
    catch(Exception e){
        e.printStackTrace();
}
}
    public static void main(String[] args)  { 
      Splash frame =  new Splash();
      int x = 1;
      for(int i=1; i<=500;x+=7,i+=6){
      frame.setLocation(850-(x+i)/2,450-(i/2));
      frame.setSize(x+i,i);
      try{
      Thread.sleep(10);
      }
      catch(Exception e){
          e.printStackTrace();
      }
      }
    }
}
