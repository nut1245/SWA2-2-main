package com.swa.oop3;

public class Triangle extends Square
{ 
    //�ӹǹ��鹷��
    public double getArea() 
    {
    	this.area = (getHeight() * getBase()) / 2;
    	return this.area; 
    }
} 