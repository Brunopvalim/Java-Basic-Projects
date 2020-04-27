/***********************************************************
* Description: This sketch prints out the entire rhyme     *
*              line by line of the music What jack Built   * 
*              using basic string concatenation            *
* Created By : Bruno Pinheiro Valim                        *
* Due Date   : March 31th, 2019                            *
* Course     : COMP-1029                                   *
***********************************************************/

// This code will give the output of the WHAT JACK BUILT song

// The next Strings will be set with the value of each redundant part of the rhyme of the song 
String thisIs =  "This is the ";
String house =   "that lay in the house that Jack built.";
String malt =    "that ate the malt ";
String rat =     "that killed the rat, ";
String cat =     "that worried the cat, ";
String dog =     "that tossed the dog, ";
String cow =     "that milked the cow with the crumpled horn, ";
String maiden =  "that kissed the maiden all forlorn ";
String man =     "that married the man all tattered and torn ";
String priest =  "that waked the priest all shaven and shorn ";
String cock =    "that kept the cock that crowed in the morn ";


println(thisIs+"house that Jack built.");
println("");
println(thisIs+"malt " +house);
println("");
println(thisIs+"rat " +malt + house);
println("");
println(thisIs+"cat " +rat +malt + house);
println("");
println(thisIs+"dog " +cat +rat +malt + house);
println("");
println(thisIs+"cow with the crumpled horn " +dog +cat +rat +malt + house);
println("");
println(thisIs+"maiden all forlorn, " +cow +dog +cat +rat +malt + house);
println("");
println(thisIs+"man all tattered and torn, " +maiden +cow +dog +cat +rat +malt + house);
println("");
println(thisIs+"priest all shaven and shorn, " +man +maiden +cow +dog +cat +rat +malt + house);
println("");
println(thisIs+"cock that crowed in the morn, " +priest +man +maiden +cow +dog +cat +rat +malt + house);
println("");
println(thisIs+"farmer sowing his corn,  " +cock +man +maiden +cow +dog +cat +rat +malt + house);
