/***********************************************************
* Description: This sketch will draw a cat                 *
*                                                          * 
*                                                          *
* Created By : Bruno Pinheiro Valim                        *
* Due Date   : March 31th, 2019                            *
* Course     : COMP-1029                                   *
***********************************************************/

// resize the display, overall image quality and background color
size(200,200);
smooth();
background(0);

//Coloring Different Parts Of The Cat
color bodyCat = color(226);
color earNoseCat = color(50);
color black = color(0);
color faceCat = color(162);
color teethCat = color(87);

//Defining Variables Of the Left Eye 
int eyeX = 80;

//Defining Variables Of the cat muzzle
int muzzleX = 85;

//Defining Variables Of the Left Eyeball
int eyeBallsX = 75;

//Drawing ears
fill(bodyCat);
triangle(50, 50, 50, 90, 90, 60);
triangle(150, 50, 150, 90, 110, 60);
fill(earNoseCat);
triangle(55, 55, 55, 95, 95, 65);
triangle(145, 55, 145, 95, 105, 65);


//Drawing head/face
fill(bodyCat);
noStroke();
ellipse(100, 100, 100, 100);

//Drawing 2 teeths
fill(teethCat);
triangle(85, 130, 95, 130, 90, 146);
triangle(105, 130, 115, 130, 110, 146);

//Drawing cat muzzle
fill(faceCat);
ellipse(85, 120, 30, 30);
ellipse(muzzleX + 30, 120, 30, 30);

//Drawing nose
fill(earNoseCat);
stroke(1);
triangle(100, 120, 90, 105 ,110, 105);


//Drawing eyes
fill(faceCat);
ellipse(eyeX, 90, 20, 20);
ellipse(eyeX + 40, 90, 20, 20);

//Drawing eyeballs
fill(black);
rect(75, 90, 7, 7, 7);
rect(eyeBallsX + 40, 90, 7, 7, 7);

//Drawing eyebrows
strokeWeight(6);
line(90, 87, 70, 65);
line(110, 87, 130, 65);

//Drawing whiskers
strokeWeight(1);
line(115, 115, 185, 105);
line(117, 119, 185, 120);
line(115, 123, 185, 130);
line(85, 115, 25, 105);
line(83, 119, 25, 120);
line(85, 123, 25, 130);
