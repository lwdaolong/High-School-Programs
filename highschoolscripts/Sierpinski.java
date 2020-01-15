
import java.awt.*;
import javax.swing.*;

/**
 * Class Sierpinski - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class Sierpinski extends JApplet
{




    public void paint(Graphics g)
    {
        // simple text displayed on applet
       
        g.setColor(Color.black);
        sier(g,200,0,0,200,400,200);
        
        
        
        
        
        
    }
    
    public void sier(Graphics g, int x1,int y1, int x2, int y2, int x3, int y3){
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2,y2, x3,y3);
        g.drawLine(x3,y3,x1,y1);
        
        if(x3-x2 <4){
            return;
        }
        
        
        g.setColor(Color.black);
        sier(g, x1,y1, (x1 +x2)/2, (y1+y2)/2,(x1+x3)/2, (y1+y3)/2);
        g.setColor(Color.blue);
        sier(g, (x1 +x2)/2,(y1+y2)/2, x2, y2,(x2+x3)/2, (y2+y3)/2);
        g.setColor(Color.green);
        sier(g, (x1+x3)/2,(y1+y3)/2, (x2+x3)/2, (y2+y3)/2,x3, y3);
        
    }



 

   
}
