package view;

import controller_somatoria.Somatoria;

// 1. Criar uma aplicação em Java que tenha uma função recursiva que calcule o somatório do N primeiros
//número NATURAIS (a função deve retornar zero para números negativos)
//O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
//O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;

public class Principal {

    public static void main(String[] args) {
        // Testando com: 5 / 0 e -3
        int resultado1 = Somatoria.calcularSomatorio(5);
        int resultado2 = Somatoria.calcularSomatorio(0);
        int resultado3 = Somatoria.calcularSomatorio(-3);

        System.out.println("Somatório de 5: " + resultado1);
        System.out.println("Somatório de 0: " + resultado2);
        System.out.println("Somatório de -3: " + resultado3);
    }
}

