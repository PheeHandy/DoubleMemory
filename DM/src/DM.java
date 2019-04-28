import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.HashSet;
import acm.gui.*;
import javax.swing.*;


public class DM extends GraphicsProgram {
    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;
    private static final int PAUSE = 5; 

    public void init() 
    {
    setSize(WIDTH, HEIGHT);
    this.resize(WIDTH,HEIGHT);
    setBackground(Color.GRAY);
    //draw();
    }
    /*public void draw()
    {
        GRect rect = new GRect (90,220,1100,500);
        rect.setFilled(true);
        rect.setColor(Color.GREEN);
        add(rect);
        
        
        
    }*/
    public void run() 
    {
        pause(PAUSE);
        GRect rect = new GRect (90,220,1100,500);
        rect.setFilled(true);
        rect.setColor(Color.GREEN);
        add(rect);
        int width = getWidth();
        int height = getHeight();
        rect.setSize(width, height);
        
    }
}


