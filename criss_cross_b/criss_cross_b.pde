/*************************************************************
* Description: This sketch will set the colour red to the    *
*              big square if the mouse position is on the top*
*              left or the bottom right quadrant             *                    
* Created By : Bruno Pinheiro Valim                          *
* Due Date   : April, 7 2019                                 *
* Course     : COMP-1029                                     *
*************************************************************/

//setting the background color and size of the area
void setup()
{
 size(300,300); 
 background(#FF0000);
}

/*analyse where the mouse pointer is and depending on the position, 
set the square to red or green. If its the bottom right or the top
left quadrant, the color will be red. Otherwise, it will be green */
void draw() 
{ 
  if((mouseX >= 150 && mouseY >= 150) || (mouseX <= 150 && mouseY <= 150))
  {
      background(#FF0000); 
      line(150, 0, 150, 300);
      line(0, 150, 300, 150);
      stroke(5);
  }
  else
  {
      background(#00FF00);
      line(150, 0, 150, 300);
      line(0, 150, 300, 150);
      stroke(5);
  }
} 
