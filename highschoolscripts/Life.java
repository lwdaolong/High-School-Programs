import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Life extends JApplet implements MouseListener, KeyListener {

    boolean [][] board;
    public void init() {
        setFocusable(true);     
        addMouseListener(this);
        addKeyListener(this);
        board = new boolean[40][40];
        for(int  r =0; r< board.length; r++){
            for(int col =0; col< board[0].length; col++){
                if(Math.random() >.5){
                    board[r][col] = false;

                }else{
                    board[r][col] = true;
                }
            }

        }
    }

    public void paint(Graphics g) {
        g.clearRect(0,0,1000,1000);
        for(int  r =0; r< board.length; r++){
            for(int col =0; col< board[0].length; col++){
                if(board[r][col]){
                    g.setColor(Color.green);
                }
                if(!board[r][col]){
                    g.setColor(Color.red); 
                }
                g.fillRect(col*15,r*15,15,15);
            }
            g.setColor(Color.black);
            g.drawLine(0,r*15,board[0].length,r*15);

        }
        for(int  r =0; r< board.length; r++){
            for(int col =0; col< board[0].length; col++){
                g.setColor(Color.black);
                g.drawRect(col*15,r*15,15,board.length*15);
            }
            g.setColor(Color.black);
            g.drawRect(0,r*15,board[0].length*15,15);

        }
       // for(int  r =0; r< board.length; r++){
          //  for(int col =0; col< board[0].length; col++){

         //       g.drawString(" " +countNeighbor(r,col),col*15,r*15+15);
         //   }

       // }
    }

    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        // board[r][col] = !board[r][col];
        board[y/15][x/15] = !board[y/15][x/15];

        repaint();
    }
    
    public void step(){
        boolean [][] temp = new boolean [board.length][board[0].length];
                for(int  r =0; r< board.length; r++){
            for(int col =0; col< board[0].length; col++){
                if(board[r][col] == false){
                    if(countNeighbor(r, col) ==3){
                        temp[r][col] = true;
                        
                    }else{
                         temp[r][col] = false; 
                    }
                    
                }else{
                    if(countNeighbor(r, col) == 2 || countNeighbor(r, col) ==3){
                        temp[r][col] = true;
                    }else{
                        temp[r][col] = false; 
                    }
                    
                    
                }
                
  
            }

        }
        
        board = temp;
    }

    public int countNeighbor(int row, int col){
        int living =0;
        if (row >= board.length || row < 0 || col >= board[0].length || col < 0) {} 
        else if (row == 0) {
            if (col == 0) {
                if(board[row+1][col]){
                    living++;
                }
                if(board[row+1][col+1]){
                    living++;
                }
                if(board[row][col+1]){
                    living++;
                }

            }
            else if (col == board[0].length - 1) {
                if(board[row+1][col]){
                    living++;
                }
                if(board[row+1][col-1]){
                    living++;
                }
                if(board[row][col-1]){
                    living++;
                } 
            } else {
                if(board[row+1][col]){
                    living++;
                }
                if(board[row+1][col-1]){
                    living++;
                }
                if(board[row][col-1]){
                    living++;
                } 

                if(board[row+1][col+1]){
                    living++;
                }
                if(board[row][col+1]){
                    living++;
                }
            }
        }
        else if (row == board.length - 1) {
            if (col == 0) {
                if(board[row-1][col]){
                    living++;
                } 

                if(board[row-1][col+1]){
                    living++;
                }
                if(board[row][col+1]){
                    living++;
                }
            }
            else if (col == board[0].length - 1) {
                if(board[row-1][col]){
                    living++;
                } 

                if(board[row-1][col-1]){
                    living++;
                }
                if(board[row][col-1]){
                    living++;
                }
            } else {
                if(board[row][col-1]){
                    living++;
                }
                if(board[row][col+1]){
                    living++;
                }
                if(board[row-1][col]){
                    living++;
                } 

                if(board[row-1][col+1]){
                    living++;
                }
                if(board[row-1][col-1]){
                    living++;
                }
            }
        } else {
            if (col == 0) {
                if(board[row+1][col]){
                    living++;
                }
                if(board[row-1][col]){
                    living++;
                }
                if(board[row-1][col+1]){
                    living++;
                } 

                if(board[row+1][col+1]){
                    living++;
                }
                if(board[row][col+1]){
                    living++;
                }
            }
            else if (col == board[0].length - 1) {

                if(board[row+1][col]){
                    living++;
                }
                if(board[row-1][col]){
                    living++;
                }
                if(board[row-1][col-1]){
                    living++;
                } 

                if(board[row+1][col-1]){
                    living++;
                }
                if(board[row][col-1]){
                    living++;
                }}
            else {

                if(board[row+1][col]){
                    living++;
                }
                if(board[row-1][col]){
                    living++;
                }
                if(board[row-1][col-1]){
                    living++;
                } 

                if(board[row+1][col-1]){
                    living++;
                }
                if(board[row][col-1]){
                    living++;
                }
                if(board[row][col+1]){
                    living++;
                }
                if(board[row-1][col+1]){
                    living++;
                } if(board[row+1][col+1]){
                    living++;
                }
            }

        }
        return living;}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
    
       public void keyPressed(KeyEvent e) {
        if(e.getKeyChar() == ' ') {
            step();
            repaint();
        }

    }
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {

    }
}

