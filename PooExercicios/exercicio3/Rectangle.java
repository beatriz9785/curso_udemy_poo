package curso_programacao;

public class Rectangle {
	
	public double width;
	public double height;
		
	public double area() {
		double area;
		area = width*height;
		return area;
	}
	 public double perimeter() {
		 double perimeter;
		 perimeter = (width*2)+(height*2);
		 return perimeter;
	 }
	 public double diagonal() {
		 double diagonal;
		 diagonal = Math.sqrt(height*height + width*width);
		 return diagonal;
	 }

}
