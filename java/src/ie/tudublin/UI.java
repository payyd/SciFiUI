package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Star[] stars = new Star[200];
    Button b;
    MovingCircle mc;
    Speedometer sm;
    Arrows a;
    float red;
    float blue;

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

        sm = new Speedometer(this, 50, 520, 50, 100, "Speed:");
        //b = new Button(this, 50, 50, 100, 50, "I am a button");
        //mc = new MovingCircle(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 1, 700, 600, 40);
        a = new Arrows(this, 290, 615, 340, 640, 340, 590);
        for(int i =0; i< stars.length; i++)
        {
            stars[i]= new Star(this);
        }
    }

    Radar radar;

    public void draw()
    {   
        //changing background colour depending on where you look
        red=map(mouseX,0,width,0,255);
        blue=map(mouseX,0,width,255,0);


        background(red-150,0,blue-150);
        /*Making a crosshair that follows the mouse*/
        fill(200,0,0);
        stroke(200,0,0);
        rect(mouseX-20,mouseY,30,10);
        rect(mouseX,mouseY-20,10,30);
        rect(mouseX,mouseY,10,30);
        rect(mouseX,mouseY,30,10);

        /*Using the functions "beginshape, endShape" and "vertex" to make a simple gray interface at the bottom of the 
        displayed screen which will contain the radar and buttons for the spaceship*/
        noStroke();
        fill(0,255,0);
        

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

        //b.render();

        //mc.update();
        //mc.render();

        radar.render();
        radar.update();


        sm.render();
        sm.update();

        a.render();
        a.update();

        translate(width/2,height/2);
        for(int i =0; i< stars.length; i++)
        {
            stars[i].update();
            stars[i].render();
        }

    }
}

