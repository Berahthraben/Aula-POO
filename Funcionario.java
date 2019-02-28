/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
/**
 *
 * @author udesc
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salario;
    
    public Funcionario(){
    }
    public Funcionario(String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }
    public String GetNome(){
        return this.nome;
    }
    public String GetSobrenome(){
        return this.sobrenome;
    }
    public double GetSalario(){
        return this.salario;
    }
    public SetNome(){
        return this.nome;
    }
}
