//Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre
//a: o produto do dobro do primeiro com metade do segundo .
//b: a soma do triplo do primeiro com o terceiro.
//c: o terceiro elevado ao cubo.


import java.util.Scanner;

public class exercicio11 {
    public static void main (String[] args){

        //variavéis
        int n1, n2;
        double n3;
        double a,b,c;

        Scanner teclado = new Scanner(System.in);

        //entradas

        System.out.println("escreva o primeiro número inteiro ");
        n1 = teclado.nextInt();
        System.out.println("escreva o segundo número inteiro ");
        n2 = teclado.nextInt();
        System.out.println("escreva o número real");
        n3 = teclado.nextDouble();
        teclado.close();

        //resolução a:
        a = (n1 * 2) * (n2/2);

        //resolução b:
        b = 3*n1 + n3;

        //resolução c:
        c = n3*n3*n3; 

        //saída
        System.out.println("o produto do dobro do primeiro com metade do segundo ");
        System.out.println(a);

        System.out.println("a soma do triplo do primeiro com o terceiro. ");
        System.out.println(b);

        System.out.println("o terceiro elevado ao cubo. ");
        System.out.println(c);







    }
}
