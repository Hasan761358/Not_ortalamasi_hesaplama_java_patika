import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****** Hoşgeldiniz *****");
        int matematik, fizik, kimya, turkce,tarih,muzik ;

        System.out.print("Matematik Notunuz : ");
        matematik=scanner.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik=scanner.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya=scanner.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce=scanner.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih=scanner.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik=scanner.nextInt();

        double ortalama = matematik+fizik+kimya+tarih+turkce+muzik;

        System.out.println("Not ortalamanız : "+ ortalama/6);
        String sonuc = (ortalama/6>=60) ? "Sınıfı Geçti  :-)" : "  Sınıfta Kaldı :-(";
        System.out.println(sonuc);



    }
}