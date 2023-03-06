import java.util.Scanner;

public class Kullanici_girisi {
    public static void main(String[] args) {
        String User_name, password, karar, yenisifre;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        User_name = input.nextLine();
        System.out.print("Paralonuzu giriniz: ");
        password = input.nextLine();

        // if (User_name == "Patika") //Böyle bir eşitleme yok stringlerde


        if (User_name.equals("Emir") && password.equals("Zeynep123")) {
            System.out.print("Giriş yaptınız.");
        } else {
            if (User_name.equals("Emir") && !(password.equals("Zeynep123"))) {
                System.out.print("Şifrenizi yanlış girdiniz!!");
                System.out.print("Şifreni sıfırlamak istiyormusun?(Evet: E,Hayır: H) : ");
                karar = input.nextLine();
                if (karar.equals("E")) {
                    System.out.print("Yeni şifrenizi giriniz: ");
                    yenisifre = input.nextLine();
                    if (yenisifre.equals("Zeynep123")) {
                        System.out.println("Şifre oluşturulamadı çünkü aynı şifreyi girdiniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                        System.out.println("Kulanıcı adınız: " + User_name);
                        System.out.println("Şifreniz : " + yenisifre);
                    }
                } else {
                    System.out.println("Sisteme giriş yapamadınız!!");
                }
            }
        }


    }
}
