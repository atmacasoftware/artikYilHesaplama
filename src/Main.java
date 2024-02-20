import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int date;
        Scanner input = new Scanner(System.in);

        int control = 0;

        //While döngüsü ile programı yeniden başlatmadan kullanıcıdan yeni değerler alınmaktadır.
        while (control == 0) {
            //Kullanıcıdan yıl bilgisi alma
            System.out.print("Yıl Giriniz : ");
            date = input.nextInt();

            //Negatif değer kontrolü
            if (date < 0) {
                System.out.println("Negatif değer girdiniz. Program sonlandırıldı.");
                control = 1;
            } else {
                if (date % 4 == 0 && (date % 100 != 0 || date % 400 == 0)) {
                    System.out.println(date + " " + "Artık Yıldır.");
                } else {
                    System.out.println(date + " " + "Artık Yıl Değildir.");
                }
            }
        }


    }
}