package graphictask;

import java.awt.*;
import javax.swing.*;

public class GraphicTask extends JFrame {

    public GraphicTask() {
        setTitle("Graphic Exercise");
        setSize(500, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
        g.drawString("KLCC", 10, 60);

        g.setColor(Color.BLACK);
        g.drawLine(5, 70, 480, 70);


        g.setColor(Color.BLACK);
        g.fillArc(250, 120, 90, 150, 255, 30);
        g.fillArc(50, 120, 90, 150, 255, 30);
        g.fillRect(80,300,220,30);        

                
       
        
        g.setColor(Color.GRAY);
        g.fillRect(70,260,50,222);
        g.fillRect(270,260,50,222);
        
        g.setColor(new Color(183, 207, 99));
        g.fillRect(0,470,500,400);        


    }

    public static void main(String[] args) {
        new GraphicTask();
    }
}
