/***********************************************************
* Description: This sketch will analyse some conditions    *
*              to answer a call and return true or false   *
*                                                          *
* Created By : Bruno Pinheiro Valim                        *
* Due Date   : April, 7 2019                               *
* Course     : COMP-1029                                   *
***********************************************************/

//declaring boolean conditions variables
boolean isMorning = false, isMom = true, isAsleep = true, answer;


//statemant to analyse the conditions to answer the phone
if ((isMorning == false && isMom == false && isAsleep == false) || 
    (isMorning == false && isMom == true  && isAsleep == false) || 
    (isMorning == true  && isMom == true  && isAsleep == false))
{
  //setting answer to true if it meet the statements
  answer = true;
}
else 
{
  //setting answer to false if dont meet the statements
  answer = false;
}

println(answer);
