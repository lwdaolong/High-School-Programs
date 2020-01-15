import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class SnakeGame extends JApplet implements Runnable, KeyListener{
    Thread t;
    ArrayList <BodyPart> body = new ArrayList() ;
    ArrayList <Fruit> fruits = new ArrayList();
    boolean running = true;
    //int fx, fy;
    public void init() {
        addKeyListener(this);
        setFocusable(true);
        t = new Thread(this);
        // t.start();
        body.add(new BodyPart(10,10));
        body.add(new BodyPart(10,9));
        body.add(new BodyPart(10,8));
        body.add(new BodyPart(10,7));

        // int fx= 5;
        // int fy= 5;

        fruits.add( new Fruit (5,5));
        
        

        t.start();
    }

    public void run(){
        try{
            while (running){
                //body.get(0).move();

                for(int i =body.size()-1; i > 0; i--){
                    body.get(i).setX(body.get(i-1).getX());
                    body.get(i).setY(body.get(i-1).getY());
                    //body.get(i).move();
                }

                if(fruits.size() <= 0){

                }else{

                    if(body.get(0).getX() == fruits.get(0).getX() && body.get(0).getY() == fruits.get(0).getY()){
                        body.add(new BodyPart(body.get(body.size()-1).getX(),body.get(body.size()-1).getY()));
                        fruits.get(0).setX(((int)(Math.random()*20)));
                        fruits.get(0).setY(((int)(Math.random()*20)));
                        // fruits.add( new Fruit (((int)Math.random()*10),((int)Math.random()*10)));
                    }}

                for(int i = 2; i < body.size() ; i++){

                    if(body.get(0).getX() == body.get(i).getX() && body.get(0).getY() == body.get(i).getY()){
                        running = false;
                    }    
                }
                
                if(body.get(0).getX() < 0 || body.get(0).getY() <0 || body.get(0).getX() > 20 || body.get(0).getY() >20){
                    
                    running = false;
                }

                body.get(0).move();

                //body.get(0).move();

                repaint();
                t.sleep(250);
            } 
        }
        catch (InterruptedException e) {}
    }

    public void paint(Graphics g) {
       if(running){ g.setColor(Color.white);
        g.fillRect(0,0,1000,1000);
        g.setColor(Color.black);
        g.drawRect(0,0,400,400);

        for(int i =0; i< body.size(); i++){
            g.fillRect(body.get(i).getX() * 20,body.get(i).getY() *20,20,20);
        }

        if(fruits.size()  >0){

            g.fillOval(fruits.get(0).getX()* 20,fruits.get(0).getY()* 20,20,20);
        }}
        else{
            g.setColor(Color.red);
        g.fillRect(0,0,1000,1000);
        }
    }

    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar() == 'a'){
            body.get(0).setDir(0);
        }
        if(e.getKeyChar() == 's'){
            body.get(0).setDir(4);
        }
        if(e.getKeyChar() == 'd'){
            body.get(0).setDir(1);
        }
        if(e.getKeyChar() == 'w'){
            body.get(0).setDir(3);
        }

    }

    public void keyTyped(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}
}


class BodyPart
{
    private int x,y, dir;

    public BodyPart(int x, int y, int dir){
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public BodyPart(int x, int y){
        this.x = x;
        this.y = y;
        this.dir = 4;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getDir(){
        return dir;
    }

    public void setDir(int a){
        dir = a;
    }

    public void setX(int b){
        x =b;
    }

    public void setY(int c){
        y =c;
    }

    public void move(){
        if(dir == 0){
            x = (x-= 1);
            //y=0;
        }
        else     if(dir == 1){
            x =  (x+= 1);
            // y=0;
        }
        else      if(dir == 3){
            y =  (y-= 1);
            // x=0;
        }
        else     if(dir == 4){
            y =  (y+= 1);
            // x=0;
        }
        else{

        }
    }

}
class Fruit
{
    private int x,y;

    public Fruit( int x, int y){
        this.x =x;
        this.y =y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int b){
        x =b;
    }

    public void setY(int c){
        y =c;
    }

}