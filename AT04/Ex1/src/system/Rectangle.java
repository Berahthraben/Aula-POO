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
public class Rectangle extends util.Shape{
    private double width;
    private double height;
    public Rectangle(double w, double h){
        this.width = w;
        this.height = h;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width*2)+(this.height*2);
    }
    public String toString(){
       String temp = "Height: " + this.getHeight() + "Width: " + this.getWidth();
       return temp;
    }
}
