
import java.awt.*;
import javax.swing.*;


public class Drawinglol extends JApplet
{
   
   
  
    public void paint(Graphics g)
    {
        // simple text displayed on applet
      for(int i=0; i<100; i++)
      {
          drawCheckerBoard(g, (int)(500 * Math.random()), (int)(500 * Math.random()));
      
      
       
       
    }}
    
    public void drawCheckerBoard(Graphics g, int x, int y)
    {
        g.setColor(Color.black);
        g.drawRect(x,y,90,90);
        
        g.fillRect(x,y,10,10);
       g.fillRect(x+20,y,10,10);
       g.fillRect(x+40,y,10,10);
       g.fillRect(x+60,y,10,10);
       g.fillRect(x+80,y,10,10);
       
       
       g.fillRect(x+10,y+10,10,10);
       g.fillRect(x+30,y+10,10,10);
       g.fillRect(x+50,y+10,10,10);
       g.fillRect(x+70,y+10,10,10);
       
        g.fillRect(x,y+20,10,10);
       g.fillRect(x+20,y+20,10,10);
       g.fillRect(x+40,y+20,10,10);
       g.fillRect(x+60,y+20,10,10);
       g.fillRect(x+80,y+20,10,10);
       
       g.fillRect(x+10,y+30,10,10);
       g.fillRect(x+30,y+30,10,10);
       g.fillRect(x+50,y+30,10,10);
       g.fillRect(x+70,y+30,10,10);
       
         g.fillRect(x,y+40,10,10);
       g.fillRect(x+20,y+40,10,10);
       g.fillRect(x+40,y+40,10,10);
       g.fillRect(x+60,y+40,10,10);
       g.fillRect(x+80,y+40,10,10);
       
       g.fillRect(x+10,y+50,10,10);
       g.fillRect(x+30,y+50,10,10);
       g.fillRect(x+50,y+50,10,10);
       g.fillRect(x+70,y+50,10,10);
       
         g.fillRect(x,y+60,10,10);
       g.fillRect(x+20,y+60,10,10);
       g.fillRect(x+40,y+60,10,10);
       g.fillRect(x+60,y+60,10,10);
       g.fillRect(x+80,y+60,10,10);
       
       g.fillRect(x+10,y+70,10,10);
       g.fillRect(x+30,y+70,10,10);
       g.fillRect(x+50,y+70,10,10);
       g.fillRect(x+70,y+70,10,10);
       
       g.fillRect(x,y+80,10,10);
       g.fillRect(x+20,y+80,10,10);
       g.fillRect(x+40,y+80,10,10);
       g.fillRect(x+60,y+80,10,10);
       g.fillRect(x+80,y+80,10,10);
    }

    


   
}
