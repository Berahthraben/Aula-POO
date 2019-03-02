/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;
    import java.io.*;
    import java.util.Scanner;
/**
 *
 * @author Soerakraven
 */
public class EX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario fun1 = new Funcionario();
        Funcionario fun2 = new Funcionario();
        String EntradaString = "a";
        double EntradaDouble = 1;
        System.out.printf("Digite o nome do 1o Funcionario\n");
        EntradaString = sc.nextLine();
        fun1.SetNome(EntradaString);
        System.out.printf("Digite o sobrenome do 1o Funcionario\n");
        EntradaString = sc.nextLine();
        fun1.SetSobrenome(EntradaString);
        System.out.printf("Digite o salario do 1o Funcionario\n");
        EntradaDouble = sc.nextDouble();
        fun1.SetSalario(EntradaDouble);
        sc.nextLine();
        System.out.printf("Digite o nome do 2o Funcionario\n");
        EntradaString = sc.nextLine();
        fun2.SetNome(EntradaString);
        System.out.printf("Digite o sobrenome do 2o Funcionario\n");
        EntradaString = sc.nextLine();
        fun2.SetSobrenome(EntradaString);
        System.out.printf("Digite o salario do 2o Funcionario\n");
        EntradaDouble = sc.nextDouble();
        fun2.SetSalario(EntradaDouble);
        System.out.printf("Printando os valores recebidos...\n");
        System.out.printf("Nome do primeiro funcionario: %s\n", fun1.GetNome());
        System.out.printf("Sobrenome do primeiro funcionario: %s\n", fun1.GetSobrenome());
        System.out.printf("Salario do primeiro funcionario: %.3f\n", fun1.GetSalario());
        System.out.printf("Nome do segundo funcionario: %s\n", fun2.GetNome());
        System.out.printf("Sobrenome do segundo funcionario: %s\n", fun2.GetSobrenome());
        System.out.printf("Salario do segundo funcionario: %.3f\n", fun2.GetSalario());
        System.out.printf("Aumentando salario em 10 por cento...\n");
        fun1.AumentaSalario();
        fun2.AumentaSalario();
        System.out.printf("Novo salario funcionario 1: %.3f\n", fun1.GetSalario());
        System.out.printf("Novo salario funcionario 2: %.3f\n", fun2.GetSalario());
    }
    
}
