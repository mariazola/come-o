package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int i, maisRepeticoes = 0, numLancameneto;
        byte lado;
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantas vezes vai lançar o dados?");
        numLancameneto = leia.nextInt();
        int[] dado = new int[numLancameneto];

        for(i=0; i<numLancameneto; i++){

            System.out.println("Digite o lado do dado");
            lado = leia.nextByte();

            switch (lado) {

                case 1:
                    dado[0] += 1;
                    break;
                case 2:
                    dado[1] += 1;
                    break;
                case 3:
                    dado[2] += 1;
                    break;
                case 4:
                    dado[3] += 1;
                    break;
                case 5:
                    dado[4] += 1;
                    break;
                case 6:
                    dado[5] += 1;
                    break;
                default:
                    i--;
                    System.out.println("valor inválido");

            }
        }

        for(i=0; i<6; i++){

            if(maisRepeticoes < dado[i]) {
                maisRepeticoes = dado[i];
            }
        }
        for(i=0; i<6; i++){

            if(maisRepeticoes == dado[i]) {
                System.out.println("O lado " + (i+1) + " é lado viciado com "
                        + dado[i] + " repetições de total de " + numLancameneto);
            }
        }

    }
}