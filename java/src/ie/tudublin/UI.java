package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(P3D); 
    }

    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 1, 700, 600, 40);
    }

    Radar radar;

    public void draw()
    {
        background(0);

        noStroke();
        fill(128,128,128);

        beginShape();
            vertex(0, 500);
            vertex(250, 500);
            vertex(250, 800);
            vertex(0, 800);
        endShape();

        beginShape();
            vertex(250, 550);
            vertex(250, 800);
            vertex(550, 800);
            vertex(550, 550);
        endShape();

        beginShape();
            vertex(550, 500);
            vertex(800, 500);
            vertex(800, 800);
            vertex(550, 800);
        endShape();

        stroke(128,128,128);
        /*line(0, 500, 250, 500);
        line(250, 500, 250, 550);
        line(250, 550, 550, 550);
        line(550, 550, 550, 500);
        line(550, 500, 800, 500);*/
    
        b.render();

        mc.update();
        mc.render();

        radar.update();
        radar.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

