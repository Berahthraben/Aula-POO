/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;
/**
 *
 * @author udesc
 */
public class Circle extends util.Shape{
    private double radius;
    
    public Circle(double rad){
        super();
        this.radius = rad;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }
    public double getPerimeter(){
        return (Math.PI*this.radius)*2;
    }
    public String toString(){
        String temp = "Radius: " + this.radius;
        return temp;
    }
}
