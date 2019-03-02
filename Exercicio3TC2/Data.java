/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author Soerakraven
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(){
    }
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public void SetDia(int dia){
        this.dia = dia;
    }
    public void SetMes(int mes){
        this.mes = mes;
    }
    public void SetAno(int ano){
        this.ano = ano;
    }
    public int GetDia(){
        return this.dia;
    }
    public int GetMes(){
        return this.mes;
    }
    public int GetAno(){
        return this.ano;
    }
    public void printaData(){
        System.out.printf("%d/%d/%d\n", this.dia, this.mes, this.ano);
    }
}

