package bootcampExercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmentro: ");
        int parametroDois = terminal.nextInt();

        try {
            Contador contador = new Contador(parametroUm, parametroDois);
            contador.contar();
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

}