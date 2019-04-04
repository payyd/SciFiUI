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

    boolean[] keys = new boolean[1024];

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }

    public Speedometer(UI ui, float x, float y, float width, float height, String text)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text + speed;
    }

    public void keys()
	{
        if (checkKey(UP))
        {
            speed++;
        }
        if (checkKey(DOWN))
        {
            speed--;
        } 
        
	}
    public void render()
    {
        ui.noFill();
        ui.stroke(255);
        ui.rect(x, y, width, height);
        ui.textAlign(PApplet.CENTER, PApplet.BOTTOM);
        ui.text(text, x + width * 0.5f, y + height * 0.5f);
    }

}