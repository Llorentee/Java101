import java.util.Scanner;

public class ATMprojesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int hak = 3;
        double bakiye = 1500;
        int secim;

        while (hak > 0) {
            System.out.print("Kullanıcı adınınz: ");
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba Kodluyoruz Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("1- Para yatırma\n" + "2- Para çekme\n" + "3- Bakiye sorgulama\n" + "4- Çıkış yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    secim = input.nextInt();

                    switch (secim) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            int para = input.nextInt();
                            bakiye += para;
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            int para1 = input.nextInt();
                            if (para1 > bakiye) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                bakiye -= para1;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + bakiye);
                            break;
                    }
                } while (secim != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                hak--;
                System.out.println("Hatalı kullanıcı adı veya şifre, Tekrar deneyiniz.");
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur banka ile iletişime geçin");
                } else {
                    System.out.println("Kalan Hakkınız: " + hak);
                }

            }
        }
        


    }
}
