
package entities;


public class Product {
    
    public String name;
    public double price;
    public int quantity;
    
    public double totalValueInStock(){
        return price * quantity;
    }
    
    public void addProducts(int quantity){
        this.quantity += quantity; //o this.quantity ta se referindo ao quantity atributo da classe e ele vai somar com o quantity recebido como parâmetro
    }
    
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    @Override
    public String toString(){//Como eu quero que seja apresentado o objeto na forma String
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + "units. Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
