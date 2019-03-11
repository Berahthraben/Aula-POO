package joguinhoaula2.ps.javasucks;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    import java.io.*;
    import java.awt.*;
/**
 *
 * @author udesc
 */
public class Personagem {
    private String nome;
    private int forca;
    private int destreza;
    private int constituicao;
    private int agilidade;
    private static int qtd=0;
    
    public Personagem(){
        qtd++;
    }
    public Personagem(String nome, int forca, int destreza, int constituicao, int agilidade){
        this.nome = nome;
        this.forca = forca;
        this.destreza = destreza;
        this.constituicao = constituicao;
        this.agilidade = agilidade;
        qtd++;
    }

    public String getNome() {
        return nome;
    }

    public int getForca() {
        return forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public int getAgilidade() {
        return agilidade;
    }
    public
}
