package calculadoraJava;

import java.util.Scanner;

public class pix  {

    public static void main(String[] args) {
        Scanner media = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, resp = 0;
        float med;

        float nota[];
        nota = new float[4];

        int b;
        for(b = 0; b < 4; b++) {
            System.out.println("Digite a " + (b+1) + "ª nota:");
            nota[b] = media.nextFloat();
        }

       
        med = (nota[0] + nota[1] + nota[2] + nota[3]) / 4;

        float menor = nota[0];
        if (nota[1] < menor) {
            menor = nota[1];
        }
        if (nota[2] < menor) {
            menor = nota[2];
        }
        if (nota[3] < menor) {
            menor = nota[3];
        }

        float maior = nota[0];
        if (nota[1] > maior) {
            maior = nota[1];
        }
        if (nota[2] > maior) {
            maior = nota[2];
        }
        if (nota[3] > maior) {
            maior = nota[3];
        }

        System.out.println("A média é: " + med);
        System.out.println("O menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);
    }
}