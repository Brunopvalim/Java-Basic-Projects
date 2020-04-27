/************************************************************************
* Description: This code will print numbers from 1 to 100 so that for   *
*              multiples of three you print “Loopsy” instead of the     *
*              number and for the multiples of five you print “Woopsy”. *
*              For numbers which are multiples of both three and five   *
*              you print “LoopsyWoopsy”.                                *
*                                                                       *
* Created By : Bruno Pinheiro Valim                                     *
* Due Date   : March 31th, 2019                                         *
* Course     : COMP-1029                                                *
************************************************************************/

for (int x = 1; x<=100; x++)
{
  if((x % 3 == 0) && (x % 5 == 0))
  {
    println("LoopsyWoopsy");
  }
  else if(x % 3 == 0)
  {
    println("Loopsy");
  }
  else if(x % 5 == 0)
  {
    println("Woopsy");
  } 
  else
  {
    println(x);
  }
}  
