import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class w5_01_basicOOP extends PApplet {

/*
 * Creative Coding
 * Week 5, 01 - Basic Object-Oriented Programming, Classes and Objects
 * by Indae Hwang and Jon McCormack
 * Updated 2016
 * Copyright (c) 2014-2016 Monash University
 *
 * This sketch shows the basics of classes and objects in Processing
 * It defines a class called "Ball" with one member function: "display()"
 *
 */

// declare two objects of class Ball 
Ball bigBall;
Ball smallBall;

public void setup(){
  
  
  // allocate space for each ball and call the class constructor
  // to initialise the object using the values supplied
  bigBall = new Ball(75, 75, 50);
  smallBall = new Ball(225, 225, 20);
}

public void draw(){
  background(0);
  
  // call each ball's display() method 
  // this tells the ball: "display yourself"
  bigBall.display();
  smallBall.display();
}  
//
// declaration of the class "Ball"
// Which represents the concept of a ball with a position and size
//
class Ball {

  // instance variables: x,y (position) and size
  float x;
  float y;
  float size;

  // constructor: called when a new Ball is created
  // Note that the constructor is a special function that
  // does have a return type (not even a void) and can't
  // return any value
  Ball(float x_, float y_, float size_) {
    // store supplied values in the instance variables
    x = x_;
    y = y_;
    size = size_;
  }

  // display method
  // 
  public void display() {
    ellipse(x, y, size, size);
  }
}

  public void settings() {  size(300, 300); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "w5_01_basicOOP" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
