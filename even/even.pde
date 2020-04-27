/*************************************************************
* Description: This sketch will calculate the difference     *
*              between 3 numbers. If it is equal, returns    *
*              true, otherwise, false.                       *                    
* Created By : Bruno Pinheiro Valim                          *
* Due Date   : April, 7 2019                                 *
* Course     : COMP-1029                                     *
*************************************************************/

//declaring function and variables a, b, c
boolean evenlySpaced(int a, int b, int c) 
{
  //analyse if the difference between the numbers are even
  if(a==b && b==c) return true;
  if(a==b || a==c || b==c) return false;
  return ((Math.abs(a-b)== Math.abs(b-c)) || (Math.abs(a-c)==Math.abs(a-b)) || ( Math.abs(c-a)==Math.abs(b-c)));
}

void setup()
{
//printing the function with the variables
println(evenlySpaced(4,6,2));
}
