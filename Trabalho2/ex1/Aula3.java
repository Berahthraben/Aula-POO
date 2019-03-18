/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Progmain;
    import java.io.*;
    import java.util.*;
/**
 *
 * @author udesc
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int a = 0, b = 0;
        System.out.println("Digite a quantidade de numeros desejados:\n");
        n = sc.nextInt();
        int[] arm = new int[n+1];
        arm = Fibo.RetornaVetor(n);
        for(int i=0;i<n+1;i++){
            System.out.printf("%d, ", arm[i]);
        }
        System.out.printf("\n");
        System.out.println("Digite a abertura de valores a serem somados:\n");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.printf("O resultado é %d", Fibo.RetornaSoma(a, b));
    }
    
}
