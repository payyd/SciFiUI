package ie.tudublin;

import processing.core.PApplet;

public class Interface
{
    UI ui;

    public Interface(UI ui){
        this.ui = ui;
    }
    public void render()
    {
        ui.line(0, 550, 250, 550);		// x1, y1, x2, y2
    }
}