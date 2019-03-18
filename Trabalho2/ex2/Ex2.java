/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;
    import java.io.*;
    import java.util.*;
/**
 *
 * @author udesc
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada1, entrada2;
        int result;
        System.out.printf("Digite as entradas\n");
        entrada1 = sc.nextLine();
        entrada2 = sc.nextLine();
        result = Codif.RetornaDecodificacao(entrada1, entrada2);
        System.out.printf("%s\n", Codif.RetornaCodifica(Integer.toString(result)));
    }
    
}
