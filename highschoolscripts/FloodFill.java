import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
public class FloodFill extends JApplet implements KeyListener{
    int [][] arr = {    {1, 1, 1, 3, 3, 3, 1},
                        {1, 2, 1, 3, 2, 3, 2},
                        {1, 1, 1, 3, 3, 3, 1},
                        {1, 2, 2, 1, 1, 2, 1}
        };
    public void init() {
        setFocusable(true);
        addKeyListener(this);
    }

    public void paint(Graphics g) {
        for(int r =0; r< arr.length ; r++){
            for(int c =0; c< arr[0].length; c++){
                if(arr[r][c] == 1){
                    g.setColor(Color.blue);
                }
                                if(arr[r][c] == 2){
                    g.setColor(Color.red);
                }
                                if(arr[r][c] == 3){
                    g.setColor(Color.green);
                }
                g.fillRect(c*20,r*20,20,20);
            }
            
            
        }
    }

    void floodFill(int x, int y, int newcolor, int oldcolor) {
     
             if( x==0 && y==0){
        arr[y][x] = newcolor;
                if (arr[y][x+1] != oldcolor){
            return;
            
        }
                 if (arr[y+1][x] != oldcolor){
            return;
            
        }
                            if (arr[y][x+1] == oldcolor ){
          //  arr[y][x] = newcolor;
            floodFill(x+1, y, newcolor,oldcolor);
        }
                      if (arr[y+1][x] == oldcolor){
          // arr[y][x] = newcolor;
             floodFill(x, y+1, newcolor,oldcolor);
        }
        
    }
    
    else if(x==0 && y == arr.length-1){
                arr[y][x] = newcolor;
                        if (arr[y][x+1] != oldcolor ){
            return;
            
        }
                            if (arr[y][x+1] == oldcolor ){
            //arr[y][x] = newcolor;
            floodFill(x+1, y, newcolor,oldcolor);
        }
                      if (arr[y-1][x] != oldcolor){
            return;
            
        }
                      if (arr[y-1][x] == oldcolor){
            //arr[y][x] = newcolor;
             floodFill(x, y-1, newcolor,oldcolor);
        }
    }
    
       else  if(x==arr[0].length-1 && y == arr.length-1){
                arr[y][x] = newcolor;
                              if (arr[y][x-1] != oldcolor){
            return;
            
        }
                              if (arr[y][x-1] == oldcolor){
          //arr[y][x] = newcolor;
             floodFill(x-1, y, newcolor,oldcolor);
        }
                
              if (arr[y-1][x] != oldcolor){
            return;
            
        }

             if (arr[y-1][x] == oldcolor){
            //arr[y][x] = newcolor;
             floodFill(x, y-1, newcolor,oldcolor);
        }
        
    }
    
           else if(x==arr[0].length-1 && y ==0){
                arr[y][x] = newcolor;
                         if (arr[y][x-1] != oldcolor){
            return;
            
        }
                              if (arr[y][x-1] == oldcolor){
          //arr[y][x] = newcolor;
             floodFill(x-1, y, newcolor,oldcolor);
        }
                         if (arr[y+1][x] != oldcolor){
            return;
            
        }
                              if (arr[y+1][x] == oldcolor){
           //arr[y][x] = newcolor;
             floodFill(x, y+1, newcolor,oldcolor);
        }
        
    }
    else if( y ==0 && x>0 && x< arr[0].length){
       arr[y][x] = newcolor;
                                 if (arr[y+1][x] != oldcolor){
            return;
            
        }
                              if (arr[y+1][x] == oldcolor){
           //arr[y][x] = newcolor;
             floodFill(x, y+1, newcolor,oldcolor);
        }
                       if (arr[y][x-1] != oldcolor){
            return;
            
        }
                              if (arr[y][x-1] == oldcolor){
          //arr[y][x] = newcolor;
             floodFill(x-1, y, newcolor,oldcolor);
        }
            if (arr[y][x+1] != oldcolor ){
            return;
            
        }
                            if (arr[y][x+1] == oldcolor ){
            //arr[y][x] = newcolor;
            floodFill(x+1, y, newcolor,oldcolor);
        }
        
    }
    else if( y == arr.length-1 && x>0 && x< arr[0].length){
       arr[y][x] = newcolor;
                      if (arr[y][x-1] != oldcolor){
            return;
            
        }
                              if (arr[y][x-1] == oldcolor){
          //arr[y][x] = newcolor;
             floodFill(x-1, y, newcolor,oldcolor);
        }
            if (arr[y][x+1] != oldcolor ){
            return;
            
        }
                            if (arr[y][x+1] == oldcolor ){
            //arr[y][x] = newcolor;
            floodFill(x+1, y, newcolor,oldcolor);
        }
            if (arr[y-1][x] != oldcolor){
            return;
            
        }
                      if (arr[y-1][x] == oldcolor){
            //arr[y][x] = newcolor;
             floodFill(x, y-1, newcolor,oldcolor);
        }
    }
    else if(x==0 && y>0 && y< arr.length){
        arr[y][x] = newcolor;
         if (arr[y][x+1]!= oldcolor){
            return;
            
        }
                            if (arr[y][x+1] == oldcolor ){
            //arr[y][x] = newcolor;
            floodFill(x+1, y, newcolor,oldcolor);
        }
         if (arr[y+1][x] != oldcolor){
            return;
            
        }
                              if (arr[y+1][x] == oldcolor){
           //arr[y][x] = newcolor;
             floodFill(x, y+1, newcolor,oldcolor);
        }
            if (arr[y-1][x] != oldcolor){
            return;
            
        }

             if (arr[y-1][x] == oldcolor){
            //arr[y][x] = newcolor;
             floodFill(x, y-1, newcolor,oldcolor);
        }
        
    }else if(x== arr[0].length -1&& y>0 && y<arr.length){
        arr[y][x] = newcolor;      
        if (arr[y+1][x] != oldcolor){
            return;
            
        }
                              if (arr[y+1][x] == oldcolor){
           //arr[y][x] = newcolor;
             floodFill(x, y+1, newcolor,oldcolor);
        }
            if (arr[y-1][x] != oldcolor){
            return;
            
        }

             if (arr[y-1][x] == oldcolor){
            //arr[y][x] = newcolor;
             floodFill(x, y-1, newcolor,oldcolor);
        }
            if (arr[y][x-1] != oldcolor){
            return;
            
        }
                              if (arr[y][x-1] == oldcolor){
          //arr[y][x] = newcolor;
             floodFill(x-1, y, newcolor,oldcolor);
        }
        
    }else if(y>0 && y<arr.length &&x>0 && x< arr[0].length){
             arr[y][x] = newcolor;      
        if (arr[y+1][x] != oldcolor){
            return;
            
        }
                              if (arr[y+1][x] == oldcolor){
           //arr[y][x] = newcolor;
             floodFill(x, y+1, newcolor,oldcolor);
        }
            if (arr[y-1][x] != oldcolor){
            return;
            
        }

             if (arr[y-1][x] == oldcolor){
            //arr[y][x] = newcolor;
             floodFill(x, y-1, newcolor,oldcolor);
        }
            if (arr[y][x-1] != oldcolor){
            return;
            
        }
                              if (arr[y][x-1] == oldcolor){
          //arr[y][x] = newcolor;
             floodFill(x-1, y, newcolor,oldcolor);
        }
         if (arr[y][x+1] != oldcolor ){
            return;
            
        }
                            if (arr[y][x+1] == oldcolor ){
            //arr[y][x] = newcolor;
            floodFill(x+1, y, newcolor,oldcolor);
        }
        
        
    }
    else{
        return;
    }
    
      
}
    public void keyPressed(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {
        
        if(e.getKeyChar() == '1'){
            floodFill(0,0, 1, arr[0][0]);
        }
                if(e.getKeyChar() == '2'){
            floodFill(0,0, 2, arr[0][0]);
        }
        
               if(e.getKeyChar() == '3'){
            floodFill(0,0, 3, arr[0][0]);
        }
        // maybe call floodFill passing coordinates 0,0, old color, new color
        // you can probably use e.getKeyChar() for the new color to see results
        repaint();
    }
}