/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;
    import java.io.*;
    import java.util.Scanner;
/**
 *
 * @author Soerakraven
 */
public class EX3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data dt = new Data();
        System.out.printf("Digite o dia, mes e ano\n");
        dt.SetDia(sc.nextInt());
        dt.SetMes(sc.nextInt());
        dt.SetAno(sc.nextInt());
        dt.printaData();
    }
    
}
