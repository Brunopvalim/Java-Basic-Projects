/***********************************************************
* Description: This code will print a image every 78 units *
*              while X and Y are less than 520(depending of*
*              the type of the image. It will print the    *
*              screen similar to the game space invaders   *
* Created By : Bruno Pinheiro Valim                        *
* Due Date   : March 31th, 2019                            *
* Course     : COMP-1029                                   *
***********************************************************/
  background(#FFFFFF);
  size(520,520);
  PImage alien, building;
  alien = loadImage("alien.png");
  building = loadImage("building.png");

for (int x = 1; x < 520; x +=78)
{
  for (int y = 1; y < 468; y +=78)
  {
    image(alien, x, y, width/10, height/10);    
  }
}
for (int x = 1; x <= 520; x += 78)
      {
        image(building, x, 469, width/10, height/10);
      }
