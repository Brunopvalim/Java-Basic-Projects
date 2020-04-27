/***************************************************************
* Description: This sketch will set variable "matched" to      *
*              true based on:                                  *
*              If outsideMode is false, then matched should be *
*              set to true if n is inside the range 1 to 10    *
*              inclusive of the end numbers.                   *
*              If outsideMode is true, then matched should be  *
*              set to true if n is any number outside the      *
*              range 2 to 9.                                   *                  
* Created By : Bruno Pinheiro Valim                            *
* Due Date   : April, 7 2019                                   *
* Course     : COMP-1029                                       *
***************************************************************/

//declaring variables
int n = 0;
boolean matched = false, outsideMode = true;

//analyse the 1st condition
if ((( n >= 1) && n <= 10) && outsideMode == false )
{
   matched = true;
}
//analyse the second condition if the 1st is not meet
else if (((n < 2) || n > 9) && outsideMode == true  )
{
  matched = true;
}
println(matched);
