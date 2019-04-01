/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
    import java.awt.*;
/**
 *
 * @author udesc
 */
public class Shape {
    protected Color color;
    protected boolean filled;
    
    public Shape(){
        //nada;
    }
    public Shape(Color color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getPerimeter(){
        return 0;
    }
    public double getArea(){
        return 0;
    }
    public String toString(){
        String temp = "Filled: " + this.filled +" Color: " + this.color;
        return temp;
    }
}
