import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello Etiya Academy");
        // int toplamSayi = topla(6,5);
        //System.out.println(toplamSayi);
        //int toplam = topla2(2,3,4);
        //System.out.println(toplam);


        /*
         int A = 15;
         int B = 5;

         System.out.println("Result:" + A + B);
         System.out.println("Result:" + (A - B));
         System.out.println("Result:" + A * B);
         System.out.println("Result:" + A / B);
         System.out.println("Result:" + A % B);
         */

        /*
         int not;
         Scanner input = new Scanner(System.in);
         System.out.println("Lütfen Sınav Notunuzu Giriniz: ");
         not = input.nextInt();

         if(not>=50){
         System.out.println("Geçtniz");
         } else if (not>=40 && Not<50) {
         System.out.println("Dolaylı Geçtiniz");
         }else{
         System.out.println("Kaldınız");
         }
         */

        /*

        char grade = 'C';

        switch (grade) {
            case 'A':

            case 'B':

            case 'C':
                System.out.println("Geçti");
                break;

            case 'D':
                System.out.println("Dolaylı Geçti");
                break;
            case 'F':
                System.out.println("Kaldı");
                break;
            default:
                System.out.println("Geçersiz");
                break;
        }
         */

        /*
        for (int i= 5; i>0; i--){
           System.out.println(i);
        }
         */

        /*
        int i = 10;
        while(i>0){
            System.out.println(i);
            i--;
        }
         */

        /*

        String[] cars = new String[5];
        cars[0] = "BMW";
        cars[1] = "AUDI";
        cars[2] = "FIAT";
        cars[3] = "HYUNDAI";
        cars[4] = "MAZDA";

        for(int a = 0; a< cars.length; a++){
            System.out.println(cars[a]);
        }

        System.out.println("---------------------------------");

        for(String car:cars){
            System.out.println(car);
        }
         */

        /*
        String [][] person = new String[2][2];
        person[0][0] = "Erkek - Yazılımcı";
        person[0][1] = "Erkek - Analist";
        person[1][0] = "Kadın - Yazılımcı";
        person[1][1] = "Kadın - Analist";

        for(int i = 0;i<2;i++){
            for (int j = 0;j<2;j++){
                System.out.println(person[i][j]);
            }
        }
        */

        /*

        String rapor = "Bu proje için %40 daha fazla katılım sağlanmalıdır.";
        System.out.println(rapor.length());
        System.out.println(rapor.charAt(11));
        System.out.println(rapor.concat(" Olumlu."));
        System.out.println(rapor.startsWith("B"));
        System.out.println(rapor.indexOf("iç"));
        System.out.println(rapor.lastIndexOf("ğ"));
        System.out.println(rapor.replace('ğ', 'g'));
        System.out.println(rapor.substring(6,11));
        System.out.println(rapor.toLowerCase());
        System.out.println(rapor.toUpperCase());

         */

    }

   /* public static int topla( int sayi1, int sayi2){
        return sayi1+sayi2;
    }
    public static int topla2(int... sayilar){
        int toplam =0;
        for(int sayi: sayilar){
            toplam+=sayi;
        }
        return toplam;
    }*/

}