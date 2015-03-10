package quiz;

import java.lang.Math;

public class Triangle extends GeometricObject {
	double side1=1;
	double side2=1;
	double side3=1;
	double height;
	public Triangle(){
		
	}
	public Triangle(double side1, double side2, double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		
	}
	public double getside1(){
		return side1;
	}
	public double getside2(){
		return side2;
	}
	public double getside3(){
		return side3;
	}
	public double getArea(){
		height= Math.sqrt(side3*side3-((1/2)*side1));
		return (1/2)*height*side1;
				
	}
	public double getPerimeter(){
		return side1+side2+side3;
	}
	
	
	
	
	
	

}
