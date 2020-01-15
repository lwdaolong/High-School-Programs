import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
public class connectd extends JApplet implements MouseListener
{
    int size = 100;
    char col;
    boolean clear, splash, start;
    boolean turnn = false;
    static int[][] board = {
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0}  };
            
    static int[][] game = new int[6][7];
    static int turn = 1;
static boolean drop(int col) {
        int highestZero = -1;
        for(int y = 0; y < board.length && board[y][col] == 0; y++)
        {
            highestZero = y;
            //System.out.println(highestZero);
        }

        if(highestZero == -1)
        {
            System.out.println("Error, column already full");
            return false;
        }
        board[highestZero][col] = turn;
        if(turn == 1)
        {
            turn = 2;
        }
        else if(turn == 2)
        {
            turn = 1;
        }
        return true;
    }
public void init() {
        addMouseListener(this);
        setFocusable(true);
    }
public void paint(Graphics g) {
  g.setColor(Color.gray);
        g.fillRect(0, 0, 700, 600);
        for (int row = 0; row < game.length; row++){
            for(int col = 0; col < game[0].length; col++){
                 if(board [row] [col] == 0) {
                     g.setColor(Color.white);
                     g.fillOval(col*size, row * size, 90, 90); 
                 }
                 if(board [row] [col] == 1) {
                     g.setColor(Color.black);
                     g.fillOval(col*size, row * size, 90, 90); 
                 }
                 if(board [row] [col] == 2) {
                     g.setColor(Color.red);
                     g.fillOval(col*size, row * size, 90, 90); 
                 }
        }
    }
     if(win()==true){
            g.setColor(Color.white);
            g.fillRect(0, 0, 1000, 1000);
            if(turn==1){
                g.setColor(Color.black);
                g.drawString("Red WINS", 200,200);
            }
            else if(turn==2){
                g.setColor(Color.black);
                g.drawString("Black WINS", 200,200);
            }

    }
}
public static boolean win() {

        for(int r=0; r<board.length;r++){
            for(int c=0; c<board[0].length; c++){
                if(c+3>=board[0].length){}
                else if(board[r][c] == board[r][c+1] && board[r][c] == board[r][c+2] && board[r][c] == board[r][c+3] && board[r][c]!= 0)
                    return true;
            }
        }

        for(int r=0; r<board.length;r++){
            for(int c=0; c<board[0].length; c++){
                if(r+3>=board.length){}
                else if(board[r][c] == board[r+1][c] && board[r][c] == board[r+2][c] && board[r][c] == board[r+3][c] && board[r][c] != 0)
                    return true;

            }
        }

        for(int r=0; r<board.length;r++){
            for(int c=0; c<board[0].length; c++){
                if(r-3<0 || c+3>=board[0].length){}
                else if(board[r][c] == board[r-1][c+1] && board[r][c] == board[r-2][c+2] && board[r][c] == board[r-3][c+3] && board[r][c] != 0)
                    return true;

            }
        }

        for(int r=0; r<board.length;r++){
            for(int c=0; c<board[0].length; c++){
                if(r+3>=board.length || c+3>=board[0].length){}
                else if(board[r][c] == board[r+1][c+1] && board[r][c] == board[r+2][c+2] && board[r][c] == board[r+3][c+3] && board[r][c] != 0)
                    return true;

            }
        }
        return false;
}



public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        drop(x/100);
        repaint();
    }

    public void mouseReleased(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
}


