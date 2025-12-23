package com.BrickBreak;

import java.awt.*;

public class Paddle {


	//your code here!

	//don't forget you need instance variables:
	private int x;
	private int y;
	private int height;
	private int width;
	private int velocity;

	
	//constructor(s):
	public Paddle (int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	//methods:
	//Pre-condition: Paddle has been initialized
	//Post-condition: Paddle is drawn on the screen
	public void draw (Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
	}
	public int getX() {
		return x;
	}

	public void setX(int x){
		this.x = x;
	}

	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getVelocity() {
		return velocity;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	//Pre-condition: Paddle has been initialized
	//Post-condition: Paddle moves
	public void move() {
		x+=velocity;
	}
	//Pre-condition: Paddle has been initialized
	//Post-condition: Paddle's velocity is increased
	public void addVelocity(int velocity){
		x+=velocity;
	}
	
}
