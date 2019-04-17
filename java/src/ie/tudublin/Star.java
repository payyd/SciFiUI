package ie.tudublin;

import processing.core.PApplet;

public class Star extends PApplet
{  
    private UI ui;
    float x;
    float y;
    float z;
    float star_speed=0.5f;
    private int speed =0;
    
    public Star(UI ui)
    {
        this.ui =ui;
        x=random(-width,width);
        y=random(-height,height);
        z = random(height);

    }


    public void update()
    {
        z=z-star_speed;
        if(z<1)
        {
            z=width;
            x=random(-width,width);
            y=random(-height,height);
        }
        if (ui.checkKey('w'))
        {
            speed++;
        }
        if (ui.checkKey('s'))
        {
            speed--;
        }
        if(speed>=1 && speed<=24)
        {
            star_speed = 0.5f;
        }
        else if(speed>=25 && speed<=49)
        {
            star_speed = 0.75f;
        }
        else if(speed>=50 && speed<=75)
        {   
            star_speed=1;

        }
        else if(speed>=76)
        {
            star_speed =1.5f;
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
    
    public void render(){

        ui.fill(255);
        ui.noStroke();

        float sx = map(x/z,0,1,0,width);
        float sy = map(y/z,0,1,0,height);
        
        ui.ellipse(sx,sy,8,8);


    }
}