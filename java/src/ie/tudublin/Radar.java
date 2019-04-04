package ie.tudublin;

import javafx.scene.shape.Ellipse;
import processing.core.PApplet;
import processing.core.PVector;
import java.util.concurrent.ThreadLocalRandom;

public class Radar extends PApplet
{
    private float radius;
    private PVector pos;
    private float frequency;
    private UI ui;
    private float theta = 0;

    public Radar(UI ui, float frequency, float x, float y, float radius)
    {
        this.ui = ui;
        this.frequency = frequency;
        pos = new PVector(x, y);
        this.radius = radius;
    }

    public void render()
    {
        ui.fill(0);
        ui.stroke(0,200,0);
        ui.ellipse(pos.x, pos.y, radius * 2, radius * 2);
        ui.ellipse(pos.x, pos.y, radius * 3/2, radius * 3/2);
        ui.ellipse(pos.x, pos.y, radius , radius );
        ui.ellipse(pos.x, pos.y, radius /2 , radius /2 );
        float x2 = pos.x + (float) Math.sin(theta) * radius;
        float y2 = pos.y - (float) Math.cos(theta) * radius;
        ui.stroke(255,0,0);
        ui.line(pos.x, pos.y, x2, y2);
        ui.fill(255,0,0);
        if((frameCount%24)==0)
        {
            float randomNum = random(0,40);
            float randomNum2 = random(0,40);
            ui.ellipse(670+randomNum, 570+randomNum2, 10,10 );
        }        
    }

    float timeDelta = 1.0f / 60.0f;

    public void update()
    {
        theta += PApplet.TWO_PI * timeDelta * frequency;
    }

    /**
     * @return the radius
     */
    public float getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }

    /**
     * @return the pos
     */
    public PVector getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(PVector pos) {
        this.pos = pos;
    }

    /**
     * @return the frequency
     */
    public float getFrequency() {
        return frequency;
    }

    /**
     * @param frequency the frequency to set
     */
    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    
}