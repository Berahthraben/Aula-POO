/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaelixo;

/**
 *
 * @author udesc
 */
public class Fatura {
    String nome;
    String desc;
    int qtd;
    double pre;
    
    public Fatura(String nome, String desc, int qtd, int pre){
        this.nome = nome;
        this.desc = desc;
        this.qtd = qtd;
        this.pre = pre;
    }
    
    protected String GetNome(){
        return this.nome;
    }
    protected String GetDesc(){
        return this.desc;
    }
    protected int GetQtd(){
        return this.qtd;
    }
    protected double GetPre(){
        return this.pre;
    }
    protected void SetNome(String nome){
        this.nome = nome;
    }
    protected void SetDesc(String desc){
        this.desc = desc;
    }
    protected void SetQtd(int qtd){
        this.qtd = qtd;
    }
    protected void SetPre(double pre){
        this.pre = pre;
    }
    /*
    Fatura fatura = new Fatura(1,2,3,4);
    fatura.valor
    fatura.SetValor(4);
    fatura.valor
    */
}
