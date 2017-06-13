package bringbracer;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
    
    public int map[][];
    public int bricWidth;
    public int brightHeight;
    public MapGenerator(int row,int col){
        map=new int[row][col];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j <map[0].length; j++) {
                map[i][j]=1;
            }
        }
         bricWidth=540/col;
         brightHeight=150/row;
    }
    public void draw(Graphics2D g){
        
           for (int i = 0; i < map.length; i++) {
            for (int j = 0; j <map[0].length; j++) {
                if (map[i][j]>0) {
                    g.setColor(Color.WHITE);
                    g.fillRect(j*bricWidth+80, i*brightHeight+50,bricWidth,brightHeight);
                    
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.BLACK);
                    g.drawRect(j*bricWidth+80, i*brightHeight+50,bricWidth,brightHeight);
                    
                }
            }
        }
           
    }
    public void setBringValue(int value,int row,int col){
        map[row][col]=value;
        
    }
    
    
}
