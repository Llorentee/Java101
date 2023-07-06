package PatikaStore;

import java.util.TreeSet;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner string_input = new Scanner(System.in);

        TreeSet<Markalar> markalar = new TreeSet<>(new MarkaComparator());
        List<CepTelefonu> cepTelefonu = new ArrayList<>();
        List<Notebook> notebooks = new ArrayList<>();

        markalar.add(new Markalar(0, "Samsung"));
        markalar.add(new Markalar(1, "Lenovo"));
        markalar.add(new Markalar(2, "Apple"));
        markalar.add(new Markalar(3, "HP"));
        markalar.add(new Markalar(4, "Casper"));
        markalar.add(new Markalar(5, "Asus"));
        markalar.add(new Markalar(6, "Huawei"));
        markalar.add(new Markalar(7, "Xiaomi"));
        markalar.add(new Markalar(8, "Monster"));

        notebooks.add(new Notebook(Notebook.getId_increment(), "Huawei", 7000.0, 0, 1000, "Huawei Matebook 14", 16, 512, 14.0));
        notebooks.add(new Notebook(Notebook.getId_increment(), "Lenovo", 3699.0, 0, 1000, "Lenovo V14 IGL", 8, 1024, 14.0));
        notebooks.add(new Notebook(Notebook.getId_increment(), "Asus", 8199.0, 0, 1000, "ASUS Tuf Gaming", 32, 2048, 15.6));

        cepTelefonu.add(new CepTelefonu(CepTelefonu.getId_increment(), "Samsung", 3199.0, 0, 1000, "SAMSUNG GALAXY A51", 6, 128, 6.5, 4000, "Siyah", 32));
        cepTelefonu.add(new CepTelefonu(CepTelefonu.getId_increment(), "Apple", 7379.0, 0, 1000, "iPhone 11 64 GB", 6, 64, 6.1, 3046, "Mavi", 5));
        cepTelefonu.add(new CepTelefonu(CepTelefonu.getId_increment(), "Xiaomi", 4012.0, 0, 1000, "Redmi Note 10 Pro 8GB", 12, 128, 6.5, 4000, "Beyaz", 35));


        boolean isExit = true;
        while (isExit) {

            System.out.println("PatikaStore Ürün Yönetim Paneli ! ");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış yap");

            System.out.print("Tercihiniz : ");
            int sayi = input.nextInt();
            System.out.println();

            switch (sayi) {
                case 1:
                    System.out.println("Notebook İşlemleri");
                    System.out.println("1 - Ürünleri Listeleme\n2 - Ürün Silme\n3 - Ürün Ekleme\n");
                    System.out.print("Lütfen birini seçiniz : ");
                    int number = input.nextInt();
                    switch (number) {
                        case 1:
                            System.out.println("1- Ürünleri Normal Listeleme\n2- Ürünleri ID sine göre Listeleme\n3- Ürünleri Markalarına göre Listeleme");
                            System.out.println();
                            System.out.print("Lütfen bir sayı giriniz: ");
                            int select_number = input.nextInt();

                            if (select_number == 1) {
                                System.out.println("--------------Notebook Listesi-------------------");
                                System.out.println();
                                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                                System.out.println("|" + " ID \t\t" + "|" + " Ürün Adı \t\t\t\t" + "|" + " Fiyat \t\t" + "|" + " Marka \t\t\t" + "|" + " Depolama \t\t" + "|" + " Ekran \t\t" + "|" + " RAM \t\t" + "|");
                                System.out.println("----------------------------------------------------------------------------------------------------------------------");
                                for (Notebook n : notebooks) {
                                    System.out.println("| " + n.getId() + "|\t\t " +
                                            n.getUrunAdi() + "|\t\t\t\t " +
                                            n.getBirimFiyat() + " Tl " + "|\t\t " +
                                            n.getName() + "|\t\t\t " +
                                            n.getDepolama() + "|\t\t " +
                                            n.getEkranBoyutu() + "|\t\t " +
                                            n.getRam() + "|\t\t ");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                            } else if (select_number == 2) {
                                System.out.print("Listelemek istediğiniz ürünün id sini girin : ");
                                int urun_id = input.nextInt();

                                if (urun_id < Notebook.getId_increment()) {
                                    System.out.println();
                                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("|" + " ID \t\t" + "|" + " Ürün Adı \t\t\t\t" + "|" + " Fiyat \t\t" + "|" + " Marka \t\t\t" + "|" + " Depolama \t\t" + "|" + " Ekran \t\t" + "|" + " RAM \t\t" + "|");
                                    System.out.println("----------------------------------------------------------------------------------------------------------------------");

                                    for (Notebook n : notebooks) {
                                        if (urun_id == n.getId()) {
                                            System.out.println("| " + n.getId() + "|\t\t " +
                                                    n.getUrunAdi() + "|\t\t\t\t " +
                                                    n.getBirimFiyat() + " Tl " + "|\t\t " +
                                                    n.getName() + "|\t\t\t " +
                                                    n.getDepolama() + "|\t\t " +
                                                    n.getEkranBoyutu() + "|\t\t " +
                                                    n.getRam() + "|\t\t ");
                                            break;
                                        }
                                    }
                                } else {
                                    System.out.println("Geçersiz id girdiniz!!!");
                                }
                            } else if (select_number == 3) {
                                System.out.print("Listelemek istediğiniz ürünün markasını girin : ");
                                String not_marka = string_input.nextLine();
                                System.out.println();
                                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                                System.out.println("|" + " ID \t\t" + "|" + " Ürün Adı \t\t\t\t" + "|" + " Fiyat \t\t" + "|" + " Marka \t\t\t" + "|" + " Depolama \t\t" + "|" + " Ekran \t\t" + "|" + " RAM \t\t" + "|");
                                System.out.println("----------------------------------------------------------------------------------------------------------------------");

                                for (Notebook n : notebooks) {
                                    if (not_marka.equals(n.getName())) {
                                        System.out.println("| " + n.getId() + "|\t\t " +
                                                n.getUrunAdi() + "|\t\t\t\t " +
                                                n.getBirimFiyat() + " Tl " + "|\t\t " +
                                                n.getName() + "|\t\t\t " +
                                                n.getDepolama() + "|\t\t " +
                                                n.getEkranBoyutu() + "|\t\t " +
                                                n.getRam() + "|\t\t ");
                                    }
                                }
                            } else {
                                System.out.println("YANLIŞ SAYI GRİDİNİZ!! TEKRAR DENEYİNİZ");
                            }
                            System.out.println();
                            break;
                        case 2:
                            System.out.print("Silmek istediğiniz ürünün id sini girin : ");
                            int id = input.nextInt();

                            if (id > 0 && id <= notebooks.size()) {
                                for (Notebook n : notebooks) {
                                    if (id == n.getId()) {
                                        for (int not_id = id; not_id < notebooks.size(); not_id++) {
                                            notebooks.get(not_id).setId(id++);
                                        }
                                        notebooks.remove(n);
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("Geçersiz id girdiniz !!!");
                            }
                            System.out.println();
                            break;
                        case 3:
                            int notebook_id = Notebook.getId_increment();

                            System.out.print("Ekleyeceğiniz ürünün adı: ");
                            String urun_adi = string_input.nextLine();

                            System.out.print("Ekleyeceğiniz ürünün fiyatı: ");
                            int urun_fiyat = input.nextInt();

                            System.out.print("Ekleyeceğiniz ürünün markası: ");
                            String urun_marka = string_input.nextLine();

                            System.out.print("Ekleyeceğiniz ürünün depolama kapasitesi: ");
                            int urun_depolama = input.nextInt();

                            System.out.print("Ekleyeceğiniz ürünün ekran boyutu: ");
                            double urun_boyut = input.nextDouble();

                            System.out.print("Ekleyeceğiniz ürünün ram boyutu: ");
                            int urun_ram = input.nextInt();

                            notebooks.add(new Notebook(notebook_id, urun_marka, urun_fiyat, 0, 1000, urun_adi, urun_ram, urun_depolama, urun_boyut));
                            System.out.println();
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Cep Telefonu İşlemleri");
                    System.out.println("1 - Ürünleri Listeleme\n2 - Ürün Silme\n3 - Ürün Ekleme\n");
                    System.out.print("Lütfen birini seçiniz : ");
                    int number1 = input.nextInt();
                    switch (number1) {
                        case 1:
                            System.out.println("1- Ürünleri Normal Listeleme\n2- Ürünleri ID sine göre Listeleme\n3- Ürünleri Markalarına göre Listeleme");
                            System.out.println();
                            System.out.print("Lütfen bir sayı giriniz: ");
                            int select_number1 = input.nextInt();

                            if (select_number1 == 1) {
                                System.out.println("--------------Cep Telefonu Listesi-------------------");
                                System.out.println();
                                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                                System.out.println("|" + " ID " + "\t\t|" + " Ürün Adı " + "\t\t\t\t|" + " Fiyat " + "\t\t|" + " Marka " + "\t\t\t|" + " Depolama " + "\t\t|" + " Ekran " + "\t\t|" + " Kamera " + "\t\t|" + " Pil " + "\t\t|" + " RAM " + "\t\t|" + " Renk " + "\t\t|");
                                System.out.println("----------------------------------------------------------------------------------------------------------------------");
                                for (CepTelefonu c : cepTelefonu) {
                                    System.out.println("| " + c.getId() + "\t\t\t| " +
                                            c.getUrunAdi() + "\t| " +
                                            c.getBirimFiyat() + " Tl " + "\t\t| " +
                                            c.getName() + "\t\t| " +
                                            c.getDepolama() + "\t\t| " +
                                            c.getEkranBoyutu() + "\t| " +
                                            c.getKamera() + "\t| " +
                                            c.getPilGucu() + "\t| " +
                                            c.getRam() + "\t| " +
                                            c.getRenk() + "\t\t| ");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                            } else if (select_number1 == 2) {
                                System.out.print("Listelemek istediğiniz ürünün id sini girin : ");
                                int urun_id = input.nextInt();

                                if (urun_id < CepTelefonu.getId_increment()) {
                                    System.out.println();
                                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("|" + " ID " + "\t\t|" + " Ürün Adı " + "\t\t\t\t|" + " Fiyat " + "\t\t|" + " Marka " + "\t\t\t|" + " Depolama " + "\t\t|" + " Ekran " + "\t\t|" + " Kamera " + "\t\t|" + " Pil " + "\t\t|" + " RAM " + "\t\t|" + " Renk " + "\t\t|");
                                    System.out.println("----------------------------------------------------------------------------------------------------------------------");

                                    for (CepTelefonu c : cepTelefonu) {
                                        if (urun_id == c.getId()) {
                                            System.out.println("| " + c.getId() + "|\t\t " +
                                                    c.getUrunAdi() + "|\t\t\t\t " +
                                                    c.getBirimFiyat() + " Tl " + "|\t\t " +
                                                    c.getName() + "|\t\t\t " +
                                                    c.getDepolama() + "|\t\t " +
                                                    c.getEkranBoyutu() + "|\t\t " +
                                                    c.getKamera() + "\t| " +
                                                    c.getPilGucu() + "\t| " +
                                                    c.getRam() + "\t| " +
                                                    c.getRenk() + "\t\t| ");
                                            break;
                                        }
                                    }
                                } else {
                                    System.out.println("Geçersiz id girdiniz!!!");
                                }
                            } else if (select_number1 == 3) {
                                System.out.print("Listelemek istediğiniz ürünün markasını girin : ");
                                String cep_marka = string_input.nextLine();
                                System.out.println();
                                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                                System.out.println("|" + " ID " + "\t\t|" + " Ürün Adı " + "\t\t\t\t|" + " Fiyat " + "\t\t|" + " Marka " + "\t\t\t|" + " Depolama " + "\t\t|" + " Ekran " + "\t\t|" + " Kamera " + "\t\t|" + " Pil " + "\t\t|" + " RAM " + "\t\t|" + " Renk " + "\t\t|");
                                System.out.println("----------------------------------------------------------------------------------------------------------------------");

                                for (CepTelefonu c : cepTelefonu) {
                                    if (cep_marka.equals(c.getName())) {
                                        System.out.println("| " + c.getId() + "|\t\t " +
                                                c.getUrunAdi() + "|\t\t\t\t " +
                                                c.getBirimFiyat() + " Tl " + "|\t\t " +
                                                c.getName() + "|\t\t\t " +
                                                c.getDepolama() + "|\t\t " +
                                                c.getEkranBoyutu() + "|\t\t " +
                                                c.getKamera() + "\t| " +
                                                c.getPilGucu() + "\t| " +
                                                c.getRam() + "\t| " +
                                                c.getRenk() + "\t\t| ");
                                    }
                                }
                            } else {
                                System.out.println("YANLIŞ SAYI GRİDİNİZ!! TEKRAR DENEYİNİZ");
                            }
                            System.out.println();
                            break;
                        case 2:
                            System.out.print("Silmek istediğiniz ürünün id sini girin : ");
                            int id = input.nextInt();

                            if (id > 0 && id <= cepTelefonu.size()) {
                                for (CepTelefonu c : cepTelefonu) {
                                    if (id == c.getId()) {
                                        for (int cep_id = id; cep_id < cepTelefonu.size(); cep_id++) {
                                            cepTelefonu.get(cep_id).setId(id++);
                                        }
                                        cepTelefonu.remove(c);
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("Geçersiz id girdiniz !!");
                            }
                            System.out.println();
                            break;
                        case 3:
                            int ceptelefonu_id = CepTelefonu.getId_increment();

                            System.out.print("Ekleyeceğiniz ürünün adı: ");
                            String urun_adi = string_input.nextLine();

                            System.out.print("Ekleyeceğiniz ürünün fiyatı: ");
                            int urun_fiyat = input.nextInt();

                            System.out.print("Ekleyeceğiniz ürünün markası: ");
                            String urun_marka = string_input.nextLine();

                            System.out.print("Ekleyeceğiniz ürünün depolama kapasitesi: ");
                            int urun_depolama = input.nextInt();

                            System.out.print("Ekleyeceğiniz ürünün ekran boyutu: ");
                            double urun_boyut = input.nextDouble();

                            System.out.print("Ekleyeceğiniz ürünün ram boyutu: ");
                            int urun_ram = input.nextInt();

                            System.out.print("Ekleyeceğiniz ürünün pil gücü: ");
                            int urun_pilgucu = input.nextInt();

                            System.out.print("Ekleyeceğiniz ürünün rengi: ");
                            String urun_renk = string_input.nextLine();

                            System.out.print("Ekleyeceğiniz ürünün kamerası: ");
                            int urun_kamera = input.nextInt();

                            cepTelefonu.add(new CepTelefonu(ceptelefonu_id, urun_marka, urun_fiyat, 0, 1000, urun_adi, urun_ram, urun_depolama, urun_boyut, urun_pilgucu, urun_renk, urun_kamera));
                            System.out.println();

                            break;
                        default:
                            break;

                    }
                    break;
                case 3:
                    System.out.println("Markalarımız");
                    System.out.println("----------------");

                    Iterator<Markalar> itr = markalar.iterator();
                    while (itr.hasNext()) {
                        System.out.print("- ");
                        System.out.println(itr.next().getName());
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Sistemden çıkış yaptınız !!");
                    isExit = false;
                    break;
            }

        }
    }
}
