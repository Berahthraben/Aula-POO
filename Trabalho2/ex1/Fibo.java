/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Progmain;

/**
 *
 * @author udesc
 */
public class Fibo {
    public static int[] RetornaVetor(int n){
        int[] temp = new int[n+1];
        temp[0] = 0;
        int aux1=0, aux2=0, aux3=1;
        for(int i=2;i<n+1;i++){
            aux1 = aux2;
            aux2 = aux3;
            aux3=aux1+aux2;
            temp[i] = aux3;
        }
        return temp;
    }
    public static int RetornaSoma(int a, int b){
        int[] temp = RetornaVetor(b);
        int soma = 0;
        for(int i=a-1;i<b;i++){
            soma+=temp[i];
        }
        return soma;
    }
}
