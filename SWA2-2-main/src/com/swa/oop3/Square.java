package com.swa.oop3;

public class Square  extends Shape
{
	 private double height;  
	   private double base;  

	   // ��˹�� height and width
	   public void setValues(double height, double base)
	   {
	      this.height = height;
	      this.base = base;
	   }

	   //�� height
	   public double getHeight() 
	   {
	       return height;
	   }
	     
	   //Get width
	   public double getBase() 
	   {
	       return base;
	   } 

	   //�ӹǹ��鹷��
    public double getArea()
    {
    	this.area =getHeight() * getBase();
        return this.area;
    }
}
