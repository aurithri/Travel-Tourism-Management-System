
package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class CheckHotels extends JFrame implements Runnable {
    Thread t1;
    JLabel[] label = new JLabel[10];
    JLabel caption;

    public void run() {
        String[] text = {
            "JW Marriott Hotel", "Madarin Hotel", "Four Season Hotel",
            "Raddisson Blue Hotel", "Classio Hotel", "The Bay Club Hotel",
            "Breeze Blow Hotel", "The Taj Hotel", "Paul Hotel", "Riverview Hotel"
        };
        try {
            for (int i = 0; i < 10; i++) {
                label[i].setVisible(true);
                caption.setText(text[i]);
                Thread.sleep(2500);
                label[i].setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    CheckHotels() {
        setBounds(500, 200, 800, 600);

        caption = new JLabel();
        caption.setBounds(50, 500, 1000, 70);
        caption.setFont(new Font("Tahoma", Font.PLAIN, 40));
        caption.setForeground(Color.WHITE);
        add(caption);

        for (int i = 0; i < 10; i++) {
            ImageIcon image = new ImageIcon(getClass().getResource("/icons/hotel" + (i + 1) + ".jpg"));
            Image jimage = image.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
            ImageIcon kimage = new ImageIcon(jimage);
            label[i] = new JLabel(kimage);
            label[i].setBounds(0, 0, 800, 600);
            label[i].setVisible(false);
            add(label[i]);
        }

        t1 = new Thread(this);
        t1.start();

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckHotels();
    }
}
