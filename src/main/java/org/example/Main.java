package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Bienvenue dans la calculatrice !");
        System.out.print("Entrez le premier nombre : ");
        double a = scanner.nextDouble();
        System.out.print("Entrez le second nombre : ");
        double b = scanner.nextDouble();
        System.out.print("Entrez l'opérateur (+, -, *, /) : ");
        String op = scanner.next();
        double resultat;
        try {
            switch (op) {
                case "+":
                    resultat = calculator.add(a, b);
                    break;
                case "-":
                    resultat = calculator.subtract(a, b);
                    break;
                case "*":
                    resultat = calculator.multiply(a, b);
                    break;
                case "/":
                    resultat = calculator.divide(a, b);
                    break;
                default:
                    System.out.println("Opérateur invalide.");
                    return;
            }
            System.out.println("Résultat : " + resultat);
        } catch (ArithmeticException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}