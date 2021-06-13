
package entities;

public class Triangle {
    
    //ATRIBUTOS
    public double a;
    public double b;
    public double c;
    
    //MÉTODOS:
    public double area(){
        double p = (a + b + c)/2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }
}
