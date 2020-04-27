/***************************************************************
* Description: This sketch will draw a red line accross the    *
*              area in a loop                                  *        
* Created By : Bruno Pinheiro Valim                            *
* Due Date   : April, 7 2019                                   *
* Course     : COMP-1029                                       *
***************************************************************/
//declaring y as 0 to start the line at the top
int y = 0;
//setting area size
void setup()
{
  size(300,300);
}

//sets the background color, and when the line reaches the maximum height, sets "y" to 0 again
void draw()
{
  background(150);
  if(y <= 300)
  {
    stroke(#FF0000);
    line(0,y,300,y);
    
    y = y + 1;
  }
  else
  {
  y = 0;
  }
}
