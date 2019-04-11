package ie.tudublin;

import processing.core.PApplet;

public class Speedometer extends PApplet
{

    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;
    private int speed = 0;

    public Speedometer(UI ui, float x, float y, float width, float height, String text)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text + speed;
    }

    public void update()
	{
        if(speed>=1 && speed<=24)
        {
            //draw green box
            ui.fill(0,255,0);
            ui.beginShape();
                ui.vertex(50, 620);
                ui.vertex(50, 595);
                ui.vertex(100, 595);
                ui.vertex(100, 620);
            ui.endShape();
        }
        else if(speed>=25 && speed<=49)
        {
            //draw yellow and green box here
            ui.fill(0,255,0);
            ui.beginShape();
                ui.vertex(50, 620);
                ui.vertex(50, 595);
                ui.vertex(100, 595);
                ui.vertex(100, 620);
            ui.endShape();

            ui.fill(255,255,0);
            ui.beginShape();
                ui.vertex(50, 595);
                ui.vertex(50, 570);
                ui.vertex(100, 570);
                ui.vertex(100, 595);
            ui.endShape();
        }
        else if(speed>=50 && speed<=75)
        {
            //draw yellow and green and orange box here
            ui.fill(0,255,0);
            ui.beginShape();
                ui.vertex(50, 620);
                ui.vertex(50, 595);
                ui.vertex(100, 595);
                ui.vertex(100, 620);
            ui.endShape();

            ui.fill(255,255,0);
            ui.beginShape();
                ui.vertex(50, 595);
                ui.vertex(50, 570);
                ui.vertex(100, 570);
                ui.vertex(100, 595);
            ui.endShape();

            ui.fill(255,165,0);
            ui.beginShape();
                ui.vertex(50, 570);
                ui.vertex(50, 545);
                ui.vertex(100, 545);
                ui.vertex(100, 570);
            ui.endShape();

            
        }
        else if(speed>=76)
        {
            //draw red orange yellow and green boxes
            ui.fill(0,255,0);
            ui.beginShape();
                ui.vertex(50, 620);
                ui.vertex(50, 595);
                ui.vertex(100, 595);
                ui.vertex(100, 620);
            ui.endShape();

            ui.fill(255,255,0);
            ui.beginShape();
                ui.vertex(50, 595);
                ui.vertex(50, 570);
                ui.vertex(100, 570);
                ui.vertex(100, 595);
            ui.endShape();

            ui.fill(255,165,0);
            ui.beginShape();
                ui.vertex(50, 570);
                ui.vertex(50, 545);
                ui.vertex(100, 545);
                ui.vertex(100, 570);
            ui.endShape();

            ui.fill(255,0,0);
            ui.beginShape();
                ui.vertex(50, 545);
                ui.vertex(50, 520);
                ui.vertex(100, 520);
                ui.vertex(100, 545);
            ui.endShape();
        }
        if (ui.checkKey('w'))
        {
            speed++;
             text = "Speed:"+speed;
        }
        if (ui.checkKey('s'))
        {
            speed--;
            text = "Speed:"+speed;
        } 
        if(speed>=100)
        {
            speed--;
        }
        else if(speed<=0)
        {
            speed ++;
        }
	}
    public void render()
    {
        ui.noFill();
        ui.stroke(255);
        ui.rect(x, y, width, height);
        ui.textAlign(PApplet.CENTER, PApplet.BOTTOM);
        ui.text(text,75,520);
    }

}