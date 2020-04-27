/***********************************************************
* Description: This code will print draw rectangles while  *
*              X is greater than 0 and until it reachs 100 *
*                                                          *
* Created By : Bruno Pinheiro Valim                        *
* Due Date   : March 31th, 2019                            *
* Course     : COMP-1029                                   *
***********************************************************/
int x = 100;

while (x > 0)
{
  rect(0, 0, x, x);
  x-=20;
}
