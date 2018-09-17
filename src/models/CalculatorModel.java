
package models;

public class CalculatorModel {
    
    float numero1= 0;
    float numero2 = 0;
    
    public float getFirstValue(){
        return numero1;
    }
    
    public double getSecondValue(){
        return numero2;
    }
    
    public void setValues(double numero1, double numero2){
        this.numero1 = (float) numero1;
        this.numero2 = (float) numero2;
    }
    
    public double add(){
       return this.numero1 + this.numero2;
    }
    
    public double subtract(){
        return this.numero1 - this.numero2;
    }
    
    public double multiplicate(){
        return this.numero1* this.numero2;
    }
    
    public double divide(){
        return this.numero1 / this.numero2;
    }
    
    public double getAdd(){
        return this.add();   
    }
    
    public double getSubtract(){
        return this.subtract();
    }
    
    public double getMultiplicate(){
        return this.multiplicate();
    }
    
    public double getDivide(){
        return this.divide();
    }
}
