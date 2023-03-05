import java.util.Scanner;

public class notOrtalamasiHesaplama {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner puan = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = puan.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = puan.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = puan.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = puan.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = puan.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = puan.nextInt();


        int toplam = (mat + fizik + kimya + tarih + turkce + muzik);
        double ortalama = toplam / 6;
        System.out.println(ortalama);

        String sonuc = ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta kaldı";
        System.out.print(sonuc);







    }

}
