/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;
    import java.math.*;
    import java.lang.*;
/**
 *
 * @author udesc
 */
public class Triangulo {
    private float a;
    private float b;
    private float c;
    private float co;
    private float ca;
    private float hip;
    
    public void Triangulo(){
        
    }
    public void Triangulo(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.co = 
    }
    public void Triangulo(float co, float ca){
        this.ca = ca;
        this.co = co;
        this.hip = sqrt(pow(co, 2) + pow(ca, 2));
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getCo() {
        return co;
    }

    public void setCo(float co) {
        this.co = co;
    }

    public float getCa() {
        return ca;
    }

    public void setCa(float ca) {
        this.ca = ca;
    }
    public void setHip(float hip){
        this.hip = hip;
    }
    public float getHip(){
        return this.hip;
    }
    public int TestaTriangulo(){
        float ab = this.a + this.b; // a
        float bc = this.b + this.c; // b
        float ca = this.c + this.a; // c
        if(bc - ca < ab && ab < bc + ca && ab - ca < bc && bc < ab + ca && ab - bc < ca && ca < ab + bc){
            return 1;
        }
        return 0;
    }
}
