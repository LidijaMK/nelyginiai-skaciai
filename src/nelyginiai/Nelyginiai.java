package nelyginiai;

import java.util.Scanner;

public class Nelyginiai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Ivesti 2 skaicius ir atspausdinti visus nelyginius skaicius, esancius tame intervale
        2 9 -> 3, 5, 7, 9
        9 2 -> 3, 5, 7, 9
         */
        System.out.println("Ivesk pirma skaiciu");
        int sk1 = sc.nextInt();

        System.out.println("Ivesk antra skaiciu");
        int sk2 = sc.nextInt();
        System.out.println("---------");


//        if (sk1 > sk2) {
//            int tmp = sk1;
//            sk1 = sk2;
//            sk2 = tmp;
//        }
//        while (sk1 <= sk2) {
//            if (sk1 % 2 != 0) {
//                System.out.println(sk1);
//            }
//            sk1++;
//        }
   
        if (sk1 > sk2) {
            int tmp = sk1;
            sk1 = sk2;
            sk2 = tmp;
        }
        for (int i = sk1; i <= sk2; i++) { 
            if (i % 2 == 0) {
                continue;   
            }
            if (i > 1000) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("pabaiga");
    }

}
