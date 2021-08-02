package com.swa.oop3;

public class Triangle extends Square
{ 
    //คำนวนพื้นที่
    public double getArea() 
    {
    	this.area = (getHeight() * getBase()) / 2;
    	return this.area; 
    }
} 