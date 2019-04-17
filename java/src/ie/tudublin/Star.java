package ie.tudublin;

import processing.core.PApplet;

public class Star extends PApplet
{  
    private UI ui;
    float x;
    float y;
    float z;

    public Star(UI ui)
    {
        this.ui =ui;
        x=random(-width,width);
        y=random(-height,height);
        z = random(height);

    }


    public void update()
    {
        z=z-1;
        if(z<1)
        {
            z=width;
            x=random(-width,width);
            y=random(-height,height);
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