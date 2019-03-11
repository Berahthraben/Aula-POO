/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;
    import java.awt.*;
    import java.io.*;
    import javax.swing.*;

public class Carro {
    private String cor;
    private int ano;
    private int quilometragem;
    private int valor;
    private String proprietario;
    
    public Carro(){
        //construtor
    }
    public Carro(String cor, int ano, int quilometragem, int valor, String proprietario){
        this.cor = cor;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.valor = valor;
        this.proprietario = proprietario;
    }
    public void pintar(String novaCor){
        this.cor = novaCor;
    }
    public void lavar(){
        JOptionPane.showMessageDialog(new JFrame(), "Carro lavado!");
    }
    public void AlterarValor(int novoValor){
        this.valor = novoValor;
    }
    public String GetCor(){
        return this.cor;
    }
    public String GetProprietario(){
        return this.proprietario;
    }
    public int GetAno(){
        return this.ano;
    }
    public int GetQuilometragem(){
        return this.quilometragem;
    }
    public int GetValor(){
        return this.valor;
    }
    public void SetCor(String cor) {
        if(proprietario.length()<3){
            JOptionPane.showMessageDialog(new JFrame(), "Cor Possui menos de 3 letras!");
        }else{
            this.cor = cor;
        }

    }

    public void SetAno(int ano){
        if(ano<0){
            JOptionPane.showMessageDialog(new JFrame(), "Ano é negativo!");
        }else{
            this.ano = ano;
        }
    }

    public void SetQuilometragem(int quilometragem) {
        if(quilometragem<0){
            JOptionPane.showMessageDialog(new JFrame(), "Quilometragem é negativo!");
        }else{
            this.quilometragem = quilometragem;
        }
    }

    public void SetValor(int valor) {
        if(valor<0){
            JOptionPane.showMessageDialog(new JFrame(), "Valor é negativo!");
        }else{
            this.valor = valor;
        }
    }
    public void SetProprietario(String proprietario) {
        if(proprietario.length()<3){
            JOptionPane.showMessageDialog(new JFrame(), "Proprietario Possui menos de 3 letras!");
        }else{
            this.proprietario = proprietario;
        }
    }
    public void show(int nro){
       JOptionPane.showMessageDialog(new JFrame(),"Ano do carro nro " + Integer.toString(nro) + ": " + Integer.toString(GetAno()) + "\n" +
       "Quilometragem do carro nro " + Integer.toString(nro) + ": " + Integer.toString(GetQuilometragem()) + "\n" +
       "Valor do carro nro " + Integer.toString(nro) + ": " + Integer.toString(GetValor()) + "\n" +
       "Proprietario do carro nro " + Integer.toString(nro) + ": " + GetProprietario() + "\n" +
       "Cor do carro nro " + Integer.toString(nro) + ": " + GetCor() + "\n");
    }
    
}
