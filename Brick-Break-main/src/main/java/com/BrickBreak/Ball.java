//Nirupam Sai Vadigi
//This class creates a ball object that can be used in the brick break game

package com.BrickBreak;
import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int size;
	private int changeX;
	private int changeY;

	
	//constructor(s):
	public Ball (int x, int y, int size) {
		this.x = x;
		this.y = y;
		this. size = size;
	}
	//methods:
	//Pre-condition: ball has been initialized
	//Post-condition: ball is drawn on the screen
	public void draw(Graphics g){
		g.setColor(Color.BLUE);
		g.fillOval(x, y, size, size);
	}
	public int getYpos() {
		return y;
	}
	public int getXpos() {
		return x;
	}
	public int getSize() {
		return size;
	}
	//Pre-condition: ball has been initialized
	//Post-condition: ball reverses X direction
	public void reverseX() {
		changeX*=-1;
	}
	//Pre-condition: ball has been initialized
	//Post-condition: ball reverses Y direction
	public void reverseY() {
		changeY*=-1;
	}
	public void setXVelocity(int xVelocity) {
		this.changeX = xVelocity;
	}
	public void setYVelocity(int yVelocity){
		this.changeY = yVelocity;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	//Pre-condition: ball has been initialized
	//Post-condition: ball moves
	public void move() {
		x+=changeX;
		y+=changeY;
	}

}
