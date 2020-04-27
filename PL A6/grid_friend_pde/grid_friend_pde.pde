/***********************************************************
* Description: This code will print a dot every 10 units   *
*              while X and Y are less than 100, generating *
*              a cube of dots                              * 
*                                                          *
* Created By : Bruno Pinheiro Valim                        *
* Due Date   : March 31th, 2019                            *
* Course     : COMP-1029                                   *
***********************************************************/

int x = 10;
int y = 10;
 
while (x < 100) 
{
     while (y < 100) 
     {
       point(x,y);
       y += 10;
     }
  x += 10;
  y = 10;
}
