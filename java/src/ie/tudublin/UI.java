package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    Speedometer sm;
    Arrows a;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = false;
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
        frameRate(24);
        sm = new Speedometer(this, 50, 520, 50, 100, "Speed:");
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 1, 700, 600, 40);
        a = new Arrows(this, 290, 615, 340, 640, 340, 590);
    }

    Radar radar;

    public void draw()
    {
        background(0);

        /*Using the functions "beginshape, endShape" and "vertex" to make a simple gray interface at the bottom of the 
        displayed screen which will contain the radar and buttons for the spaceship*/
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

        b.render();

        mc.update();
        mc.render();

        radar.render();
        radar.update();


        sm.render();
        sm.update();

        a.render();
        a.update();

    }
}

