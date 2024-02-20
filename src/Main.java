import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner sinifini tanimladik.
        Scanner input = new Scanner(System.in);

        // Degiskenleri tanimladik.
        int matematik = 0, fizik = 0, kimya = 0, turkce = 0, tarih = 0, muzik = 0;
        double ortalama = 0;

        // Kullanicidan inputlari aldik.
        System.out.print("Hosgeldiniz. Isminiz ve soyisminizi giriniz: ");
        String isimSoyisim = input.nextLine();

        System.out.print("Hosgeldiniz " + isimSoyisim + ".\nMatematik dersinin sinav puanini giriniz:");
        matematik = input.nextInt();

        System.out.print("Fizik dersinin sinav puanini giriniz:");
        fizik = input.nextInt();

        System.out.print("Kimya dersinin sinav puanini giriniz:");
        kimya = input.nextInt();

        System.out.print("Turkce dersinin sinav puanini giriniz:");
        turkce = input.nextInt();

        System.out.print("Tarih dersinin sinav puanini giriniz:");
        tarih = input.nextInt();

        System.out.print("Muzik dersinin sinav puanini giriniz:");
        muzik = input.nextInt();

        // Ortalamayi hesaplayip kullaniciya bildirdik.
        ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println(isimSoyisim + "\nOrtalamaniz : " + ortalama);

        // Kaldi/Gecti kontrolleri saglanip kullaniciya bilgi verildi.
        boolean control = false;

        control = ortalama >= 60;

        if (control == true){

            System.out.println("\n\nTebrikler " + isimSoyisim + " Basarili!!!");
        }
        else {
            System.out.println("\n\nUzgunum " + isimSoyisim + " Basarisiz...");
        }


    }
}