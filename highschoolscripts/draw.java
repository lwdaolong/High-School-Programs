import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class draw extends JApplet implements KeyListener, MouseListener, MouseMotionListener
{
    int m, n, click;
    public int col;
    public boolean clearscreen;
    public boolean splash;
    public int radius;

    public void init()
    {
        setFocusable(true);
        resize(800, 600);
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        m = 100; 
        n = 100;
        clearscreen = true;
        radius = 10;
        splash = true;
    }
    public void paint (Graphics g) // 1 for red, 2 for green, 3 for blue, 0 for black, c for clear, [ to reduce brush, ] to increase brush
    {
        if (click == 2)
            {
                splash = false;
            } 
        
        if(splash == true){
             g.setFont(new Font("ComicSans", Font.PLAIN, 50));
             g.drawString("Microsoft Paint", 200,200);
             g.setColor(Color.red);
             g.drawLine(450,170,550,200);
             g.drawLine(450,200,560,175);
             g.setColor(Color.blue);
             g.drawString("              Jank", 200,250);
             g.setFont(new Font("ComicSans", Font.PLAIN, 20));
             g.drawString("By Logan Wang (Period 4)", 250,300);
             g.setFont(new Font("ComicSans", Font.PLAIN, 30));
             g.drawString("Double-Click to Continue", 220,350);
              g.drawLine(220,355,590,355);
             
            } else
        
        {   if (col == 1){
            g.setColor(Color.red);
            
        }else if (col == 2){
            g.setColor(Color.green);
            
        }
         else if (col == 3){
            g.setColor(Color.blue);
            
        }else if (col==4){
            g.setColor(new Color( (int)(500 * Math.random()), (int)(500 * Math.random()), (int)(500 * Math.random())));
        }
        
          else if (col == 0){
            g.setColor(Color.black);
            
        }
            else if (col == 5){
            g.setColor(Color.white);
            
        }
          if (clearscreen == true){
            g.setColor(Color.white);
            g.fillRect(0,0,1000,1000);
            g.setFont(new Font("ComicSans", Font.PLAIN, 24));
            g.setColor(Color.red);
            g.drawString("1=red", 600,200);
            g.setColor(Color.green);
            g.drawString("2=green", 600,225);
            g.setColor(Color.blue);
            g.drawString("3=blue", 600,250);
            g.setColor(Color.black);
            g.drawString("0=black", 600,275);
            g.drawString("5=eraser", 600,300);
            g.drawString("c=clear", 600,325);
            g.drawString("'[' decrease brush size", 600,350);
            g.drawString("']' increase brush size", 600,375);
            g.drawString("4 = random color", 600,400);
            clearscreen = false;  
        }
      
        if(m <600 - radius){
        g.fillOval(m-radius,n-radius,2* radius,2*radius);// fill an oval centered at (m, n)
    }
}
}

    public void keyPressed(KeyEvent e) 
    {
    if(e.getKeyChar() == '1')
    {
        col = 1;
    }else if (e.getKeyChar() == '2')
    {
        col = 2;
    }
     else if (e.getKeyChar() == '3')
    {
        col = 3;
    }else if (e.getKeyChar() == '4'){
        
     col = 4;   
    }
     else if (e.getKeyChar() == '0')
    {
        col = 0;
    }   
    else if (e.getKeyChar() == '5')
    {
        col = 5;
    }  
    else if (e.getKeyChar() == 'c') // also resets brush size to default
    {
        clearscreen = true;
        radius = 10;
        repaint();
    }
    else if (e.getKeyChar() == ']')
    {
        radius += 20;
    }  
    else if (e.getKeyChar() == '[')
    {
        if(radius <= 20){
        }
        else{
            radius -= 20;
        }
    }  
    else
    {
        return;
    }
    
    repaint();
}
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public void mouseClicked(MouseEvent e) {
    
    }
    public void mousePressed(MouseEvent e) {
    
     click = e.getClickCount();
     repaint();
      }
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    
    public void mouseDragged(MouseEvent e) {
        m = e.getX();
        n = e.getY();
        repaint();
    }
    public void mouseMoved(MouseEvent e) {}
}