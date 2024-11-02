package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Bem vindo ao programa!");

        System.out.println("Digite o nome do funcionario:  ");
        String nome = scan.nextLine();

        System.out.println("Digite o salario por hora do funcionario:  ");
        double salario = scan.nextDouble();

        System.out.println("Digite o horas do funcionario:  ");
        double horas = scan.nextDouble();

        double total = salario * horas;
        System.out.println("O salario total do funcionario: " + nome + " é de: " + total);


    }
}


