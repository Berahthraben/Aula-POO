/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author udesc
 */
public class Codif {
    public static int RetornaDecodificacao(String e1, String e2){
        for(int i=0;i<e1.length();i++){
            if(e1.charAt(i)=='I'){
                e1 = e1.replace(e1.charAt(i), '1');
            }
            if(e1.charAt(i)=='E'){
                e1 = e1.replace(e1.charAt(i), '3');
            }
            if(e1.charAt(i)=='S'){
                e1 = e1.replace(e1.charAt(i), '5');
            }
            if(e1.charAt(i)=='O'){
                e1 = e1.replace(e1.charAt(i), '0');
            }
        }
        for(int i=0;i<e2.length();i++){
            if(e2.charAt(i)=='I'){
                e2 = e2.replace(e2.charAt(i), '1');
            }
            if(e2.charAt(i)=='E'){
                e2 = e2.replace(e2.charAt(i), '3');
            }
            if(e2.charAt(i)=='S'){
                e2 = e2.replace(e2.charAt(i), '5');
            }
            if(e2.charAt(i)=='O'){
                e2 = e2.replace(e2.charAt(i), '0');
            }
        }
        int soma = Integer.parseInt(e1) + Integer.parseInt(e2);
        return soma;
    }
    public static String RetornaCodifica(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                s = s.replace(s.charAt(i), 'I');
            }
            if(s.charAt(i)=='3'){
                s = s.replace(s.charAt(i), 'E');
            }
            if(s.charAt(i)=='5'){
                s = s.replace(s.charAt(i), 'S');
            }
            if(s.charAt(i)=='0'){
                s = s.replace(s.charAt(i), 'O');
            }
        }
        return s;
    }
}
