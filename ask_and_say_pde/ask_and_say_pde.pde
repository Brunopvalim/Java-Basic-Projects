/***********************************************************
* Description: This sketch will ask questions to the user  *
*                    and print his answers                 * 
*                                                          *
* Created By : Bruno Pinheiro Valim                        *
* Due Date   : March 31th, 2019                            *
* Course     : COMP-1029                                   *
***********************************************************/

//Creating user Variables
String userName;
double userHeight;
int userWeight;
int userYearsOld;
String userCountry;

//Asking basic questions to the user like his name, height, weight, age and country.
userName = Ask.forString("What is your name?");
userHeight = Ask.forDouble("What is your height? (in meters");
userWeight = Ask.forInt("What is your weight? (in pounds)");
userYearsOld = Ask.forInt("How old are you?");
userCountry = Ask.forString("Where are you from?");


//Printing results
println( "Hello, " + userName );
println( "Lets confirm your data: you have " + userHeight + " meters and your weight is " + userWeight + " pounds. You are " + userYearsOld + " years old and lives in " + userCountry);
