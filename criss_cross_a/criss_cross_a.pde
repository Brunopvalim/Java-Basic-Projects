/*************************************************************
* Description: This sketch will set the colour red to the    *
*              big square if the mouse position is on the    *
*              bottom right quadrant                         *                    
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

void draw() 
{ 
  /*if the mouse is on the bottom right quadrant, set the colour to red,
    otherwise, it will be green */
  if(mouseX >= 150 && mouseY >= 150)
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
