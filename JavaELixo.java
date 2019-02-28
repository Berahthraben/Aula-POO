/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaelixo;
    import java.io.*;
    import java.util.Scanner;
/**
 *
 * @author udesc
 */
public class JavaELixo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fatura fat = new Fatura();
        String entrada = "a";
        int entrada2 = 1;
        double entrada3 = 1;
        System.out.printf("Digite o nome do produto\n");
        entrada = sc.nextLine();
        fat.SetNome(entrada);
        System.out.printf("Digite a desc do produto\n");
        entrada = sc.nextLine();
        fat.SetDesc(entrada);
        System.out.printf("Digite a qtd. do produto\n");
        entrada2 = sc.nextInt();
        fat.SetQtd(entrada2);
        System.out.printf("Digite o preço do produto\n");
        entrada3 = sc.nextDouble();
        fat.SetPre(entrada3);
        System.out.printf("Printando valores...\n");
        System.out.printf("Nome do produto: %s\n", fat.GetNome());
        System.out.printf("Desc do produto: %s\n", fat.GetDesc());
        System.out.printf("Quantidade do produto: %d\n", fat.GetQtd());
        System.out.printf("Preço do produto: %.2f\n", fat.GetPre());
        System.out.printf("Fatura total: %.2f\n", fat.GetFaturaTotal());
    }
    
} 
