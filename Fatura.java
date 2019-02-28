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
    
    public Fatura(){
    }
       
    public Fatura(String nome, String desc, int qtd, int pre){
        this.nome = nome;
        this.desc = desc;
        this.qtd = qtd;
        this.pre = pre;
    }
    
    public String GetNome(){
        return this.nome;
    }
    public String GetDesc(){
        return this.desc;
    }
    public int GetQtd(){
        return this.qtd;
    }
    public double GetPre(){
        return this.pre;
    }
    public void SetNome(String nome){
        this.nome = nome;
    }
    public void SetDesc(String desc){
        this.desc = desc;
    }
    public void SetQtd(int qtd){
        this.qtd = qtd;
    }
    public void SetPre(double pre){
        this.pre = pre;
    }
    public double GetFaturaTotal(){
        return this.pre * (double)this.qtd;   
    }
    /*
    Fatura fatura = new Fatura(1,2,3,4);
    fatura.valor
    fatura.SetValor(4);
    fatura.valor
    */
}
