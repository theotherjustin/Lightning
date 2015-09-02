import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

 //Variables
  int startX = mouseX;
  int startY = 0;
  int endX = 150;
  int endY = 0;

public void setup()
{
 
  size(1200,500);
  background(0, 0, 0);
  strokeWeight(2);
}

//Eraser
public void keyPressed() {
	if (key == CODED){
		if (keyCode == UP){
			fill(0);
			rect(0,0, 1200, 500);
		}
	}
}
public void draw()
{
//Randomizes Color and Positions
stroke((int) (Math.random() * 256),(int) (Math.random() * 256), (int) (Math.random() * 256));

while (endY < 500)
	{
		
	int zapY = (int)(Math.random() * 9);
	int zapX = (int)(Math.random() * 18) - 9 ;
	endX = startX + zapX;
	endY = startY + zapY;
	line(startX, startY, endX, endY);
	startX = endX;
	startY = endY;
}


}
//Click to draw
public void mousePressed()
{
	
if(endY> 480)
{  startX = mouseX;
   startY = 0;
   endX = 150;
   endY = 0;
}


}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
