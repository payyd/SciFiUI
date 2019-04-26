# SciFi UI Project

Name: Patrick Whelan

Student Number: C17478104

# Description of the assignment

This is a project based on a space ship UI from the future. This program simulates a ship flying forward through space from a first person perspective. This not based on any movie in particular but rather my own imagination! I forked a repository from Skooter500 as the basis for my program and built on the code from there.

Here is a video showing how the program works!

[![YouTube]](https://www.youtube.com/watch?v=k-fX-scn8RU&feature=youtu.be)



# Instructions

This program contains a few controls that the user can utilize. If the user presses the 'W' key the speedometer will increase and speed and the speed of the stars coming towards the screen will also increase. Alternatively if the user presses the 'S' key the speedometer will slow down and so will the speed of the stars.

A crosshair follows the cursor around the screen and can be used to look around. As you look to the left the screen appears blue and as you look to the right the screen appears red.

# How it works

When the 'W' key is pressed a variable called speed increments to a limit of 100. This speed controls the speedometer and the rate at which the stars appear. For every 25 units of speed the speedometer will draw a new box to indicate a speed increase and the stars will appear at a slightly increased rate. 

When the speed is above 75 all the boxes on the speedometer will be drawn and the stars will be appearing at a greatly increased rate.

- Speedometer

```Java

        else if(speed>=76)
        {
            //draw red orange yellow and green boxes
            green_block();
            yellow_block();
            orange_block();
            red_block();
        }

```

- Stars

```Java
        else if(speed>=76)
        {
            star_speed =1.5f;
		}
```

As the mouse moves from one side of the screen to another the background colours change. This is because the backroung is generated by a series of variables in the rgb parameters like so:

```Java
        //changing background colour depending on where you look
        red=map(mouseX,0,width,0,255);
        blue=map(mouseX,0,width,255,0);


        background(red-150,0,blue-150);
```
As you can see the colours are mapped to the mouseX co-ordinates and the variables change accordingly. I take away 150 from each variable so that the screen still appears dark like space.

# What I am most proud of in the assignment

I would say I am proud of most of the code I used on this assignment but I am particularly proud of my speedometer that i created. It took alot of research and work to get it to work properly. I am proud of the logic I used to keep the 'speed' variable parameters within 0 and 100. As the user presses on the 'W' key the speed variable increases or the user can press 'S' to decrease the speed. The speedometer visibly changes in parallel with this variable as more rectangles are drawn to show the speed increasing or decreasing. I am also happy with my own functions I made for each shape to be drawn which I called multiple times. This saved me alot of time and made for mroe efficient coding.

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

