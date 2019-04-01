/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.awt.Color;
import util.Shape;
/**
 *
 * @author udesc
 */
public class Main {

    public static void main(String[] args) {
        Circle c = new Circle(7);
        c.setColor(Color.yellow);
        c.setFilled(true);
        Square sq = new Square(5);
        sq.setColor(null);
        sq.setFilled(false);
        Rectangle rt = new Rectangle(3, 6);
        rt.setColor(Color.black);
        rt.setFilled(true);
        Shape sh = new Shape(Color.green, true);
        rt.setColor(null);
        rt.setFilled(false);
        System.out.printf("%s", sh.toString());
    }
    
}
