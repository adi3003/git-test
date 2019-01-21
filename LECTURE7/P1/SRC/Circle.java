pubic class Circle{
	private double radius;
	private String color;
	Circle(){
		radius 1.0;
		color red;
	}
	Circle( double radius){
		this.radius =radius ;
		this.color ="red";

	}
	Circle ( String color){
		this.radius =1;
		this.color =color;

	}
	void setvalueradius( double radius){
		this.radius =radius ;
		this.color ="red";

	}
	void setvalueradius( String radius){
		this.radius =1;
		this.color =color;
	}
	double getvalueradius(){
		return radius;

	}
     String getvaluecolor(){
     	return color
     }
     double calculateArea(){
     	double area =(double) radius*radius*3.14;
     	return area
     }
}



