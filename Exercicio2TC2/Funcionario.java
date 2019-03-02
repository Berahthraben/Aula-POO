/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Soerakraven
 */
public class Funcionario {
    String nome;
    String sobrenome;
    double salario;
    
    public Funcionario(){
    }
    
    public Funcionario(String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }
    public void SetNome(String nome){
        this.nome = nome;
    }
    public void SetSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void SetSalario(double salario){
        if(salario <= 0){
            return;
        }
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
    public void AumentaSalario(){
        this.salario = this.salario * 1.1;
    }
}

