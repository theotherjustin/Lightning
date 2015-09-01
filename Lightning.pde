  int startX = mouseX;
  int startY = 0;
  int endX = 150;
  int endY = 0;
void setup()
{
 
  size(300,300);
  background(0, 0, 0);
  strokeWeight(2);
}


void draw()
{
stroke((int) (Math.random() * 256),(int) (Math.random() * 256), (int) (Math.random() * 256));

while (endY < 300)
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
void mousePressed()
{
if(endY>280)
{  startX = mouseX;
   startY = 0;
   endX = 150;
   endY = 0;}
}

