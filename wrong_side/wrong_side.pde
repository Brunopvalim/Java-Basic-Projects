/***************************************************************
* Description: This sketch will analyse the mouse position     *
*              and if it is on the left side, turns the area   *
*              to red, if it is on the right side, change the  *
*              color to green.                                 *          
* Created By : Bruno Pinheiro Valim                            *
* Due Date   : April, 7 2019                                   *
* Course     : COMP-1029                                       *
***************************************************************/

//setting the area size
void setup()
{
 size(300,300); 
}

void draw() 
{ 
  //analyse if the mouse position is more or equal to 150 and sets the area to grenn, otherwise, red.
  if(mouseX >= 150)
  {
      background(#00FF00); 
      line(150, 0, 150, 300);
      stroke(5);
  }
  else
  {
      background(#FF0000);
      line(150, 0, 150, 300);
      stroke(5);
  }
 } 
