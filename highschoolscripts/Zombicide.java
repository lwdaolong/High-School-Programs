import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Image;
import java.applet.*;

public class Zombicide extends JApplet implements Runnable, KeyListener {
    
    public static class Hero
{
    static int x;
    static int y;
    static int dir;
    static int hp;
    static char lastchar;
    
 public static void move( char a){
        if(a == 'w'){
            y = (y-= 5);
            //y=0;
        }
        else     if(a == 'a'){
            x =  (x-= 5);
            // y=0;
        }
        else      if(a == 's'){
            y =  (y+= 5);
            // x=0;
        }
        else     if(a == 'd'){
            x =  (x+= 5);
            // x=0;
        }
        else{

        }
    }
    
}
    
    Thread t;
    ArrayList <Bullet> bullets = new ArrayList();
    ArrayList <Zombie> zombies = new ArrayList();
    Image zom, her;
    public void init() {
        addKeyListener(this);
        resize(600, 600);
        setFocusable(true);
        t = new Thread(this);
        her = getImage(getDocumentBase(), "hero.gif");
        zom = getImage(getDocumentBase(), "zombie.gif");
        
        
        zombies.add(new Zombie(0,0));
        zombies.add(new Zombie(50,200));
        zombies.add(new Zombie(100,150));
        zombies.add(new Zombie(150,0));
        
        Hero.x = 200;
        Hero.y =200;
        Hero.hp = 100;
        Hero.lastchar = 'w';

        t.start();
    }

    public void paint(Graphics g) {
        if(Hero.hp>0){
        g.setColor(Color.white);
        g.fillRect(0,0,1000,1000);
        g.setColor(Color.black);
        for(Bullet b : bullets) {
            g.fillOval(b.getX() - 5, b.getY() - 5, 10, 10);
        }
        for(Zombie z : zombies) {
            g.drawImage(zom, z.getX() - 15, z.getY() - 20, 30, 40, this);
        }
        g.drawImage(her, Hero.x, Hero.y,30,30,this); 
        // draw the Hero
    }
    else{
          g.setColor(Color.red);
        g.fillRect(0,0,1000,1000);
    }
    
    }

    public void run(){
        try{
            while(Hero.hp >0) {
                for(Zombie z : zombies) {
                    z.move(Hero.x, Hero.y);   // must be changed to move toward Hero

                    if((Math.abs(z.getX() - Hero.x) <10) && (Math.abs(z.getY() - Hero.y) <10))
                        {
                            Hero.hp -= 10;
                            
                        }
                }
                for(int i = 0; i < bullets.size(); i++) {
                    if(bullets.get(i).move() == true) {
                        bullets.remove(i);
                    }
                }
                for(int t= 0; t<zombies.size() ; t++){
                    
                                        for(int i =0; i< bullets.size(); i++){
                        if((Math.abs(zombies.get(t).getX() - bullets.get(i).getX()) <10) && (Math.abs(zombies.get(t).getY() - bullets.get(i).getY()) <10))
                        {
                            zombies.remove(t);
                            bullets.remove(i);
                            
                        }
                    }
                }
                // check for bullets hitting zombies, removing each as needed
                // you should be careful to avoid out of bounds errors, use break if needed
                t.sleep(300);
                repaint();
            }
            
            repaint();

        }catch (InterruptedException e){}
    }

    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar()== ' '){   // recommend: 'u', 'h', 'k', 'm' to shoot
            
            bullets.add(new Bullet( Hero.x,Hero.y, Hero.lastchar));
            //bullets.add(new bullet(?, ?, 0));   // constructor requires position (from Hero) and direction 
        }

        // other code to move the Hero
        // recommend: 'w', 'a', 'd', 'x' to move
    }

    public void keyPressed(KeyEvent e) {
    
            if(e.getKeyChar()== 'w'){   // recommend: 'u', 'h', 'k', 'm' to shoot
                Hero.move('w');
                Hero.lastchar = 'w';
        }
                if(e.getKeyChar()== 'a'){   // recommend: 'u', 'h', 'k', 'm' to shoot
            Hero.move('a');
            Hero.lastchar = 'a';
        }
                if(e.getKeyChar()== 's'){   // recommend: 'u', 'h', 'k', 'm' to shoot
            Hero.move('s');
            Hero.lastchar = 's';
        }
                if(e.getKeyChar()== 'd'){   // recommend: 'u', 'h', 'k', 'm' to shoot
            Hero.move('d');
            Hero.lastchar = 'd';
        }
        
    
    }

    public void keyReleased(KeyEvent e) {}
}

class Bullet {
    private int x, y;
    private int vx, vy;
    Bullet(int x, int y, char dir) {
        this.x = x;
        this.y = y;
        if(dir == 'w') {  // north
            vy = -10;
        }
        if(dir == 'a') {  // east
            vx = 10;
        }
        if(dir == 's') {  // south
            vy = 10;
        }
        if(dir == 'd') {  // west
            vx = -10;
        }
    }

    public int getX() { return x; }

    public int getY() { return y; }

    public boolean move() {
        x = x + vx;
        y = y + vy;
        if(x < 0 || x > 600 || y < 0 || y > 600) {
            return true;    // offscreen
        }
        return false;
    }
}
class Zombie {
    private int x, y;
    Zombie(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int a, int b) {
        if(x < a) x+=5;
        if(x > a) x-=5;
        if(y < b) y+=5;
        if(y > b) y-=5;
    }

    public int getX() { return x; }

    public int getY() { return y; }
}

