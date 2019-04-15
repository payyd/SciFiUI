package ie.tudublin;

import processing.core.PApplet;

public class Arrows extends PApplet
{   
    UI ui;
    private float x1;
    private float y1;
    private float x2;
    private float y2;
    private float x3;
    private float y3;


    public Arrows(UI ui, float x1, float y1,float x2, float y2,float x3, float y3)
    {
        this.ui = ui;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

    }
    public void render()
    {
        ui.fill(30,140,255);
        ui.stroke(30,140,255);
        //a = new Arrows(this, 290, 615, 340, 640, 340, 590);
        ui.triangle(x1,y1,x2,y2,x3,y3 );
        ui.triangle(510, 615, 460, 640, 460, 590);
        ui.triangle(400, 555, 365, 595, 435 ,595);
        ui.triangle(400, 655, 365, 615, 435 ,615);

        

    }
    
    public void update()
    {  
        if (ui.checkKey('a'))
        {   
            //draw triangle here
            ui.fill(25,25,112);
            ui.stroke(25,25,112);
            ui.triangle(300,615,335,635,335,595);

        }
        if (ui.checkKey('s'))
        {
            //draw triangle here
            ui.fill(25,25,112);
            ui.stroke(25,25,112);
            ui.triangle(400, 645, 375, 620, 425 ,620);

        }
        if (ui.checkKey('w'))
        {   
            //draw triangle here
            ui.fill(25,25,112);
            ui.stroke(25,25,112);
            ui.triangle(400, 565, 375, 590, 425 ,590);

        }
        if (ui.checkKey('d'))
        {
            //draw triangle here
            ui.fill(25,25,112);
            ui.stroke(25,25,112);
            ui.triangle(500, 615, 465, 635, 465, 595);
        }

    }



}