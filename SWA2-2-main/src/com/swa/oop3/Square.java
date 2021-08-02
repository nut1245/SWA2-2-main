package com.swa.oop3;

public class Square  extends Shape
{
	 private double height;  
	   private double base;  

	   // กำหนดค height and width
	   public void setValues(double height, double base)
	   {
	      this.height = height;
	      this.base = base;
	   }

	   //เก็บ height
	   public double getHeight() 
	   {
	       return height;
	   }
	     
	   //Get width
	   public double getBase() 
	   {
	       return base;
	   } 

	   //คำนวนพื้นที่
    public double getArea()
    {
    	this.area =getHeight() * getBase();
        return this.area;
    }
}
