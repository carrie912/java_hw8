package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        int a=0,b=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("�п�J���N�Ʀr");

        b = scanner.nextInt();

        for(int i=1;i<=b;i++){

            int c=0;

            for (int j=1;j<=i;j++){

                if((i%j)==0)

                    c++;

                if (c>2)

                    break;

            }

            if(c==2){

                System.out.print(" "+i+" ");

                a++;

                if(a==5){

                    a=0;

                    System.out.println("");

                }
            }
        }

        System.out.println("���O���");

    }
}
