import java.util.Scanner;

public class burc_bulma {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz: ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();
        /*

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Burcunuz Oğlak");
                    } else {
                        System.out.println("Burcunuz Kova");
                    }
                } else {
                    System.out.println("Geçersiz gün girdiniz!!");
                }
                break;
            case 2:
                if (day >= 1 && day <= 31) {
                    if (day < 20) {
                        System.out.println("Burcunuz Kova");
                    } else {
                        System.out.println("Burcunuz Balık");
                    }
                } else {
                    System.out.println("Geçersiz gün girdiniz!!");
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 20) {
                        System.out.println("Burcunuz Balık");
                    } else {
                        System.out.println("Burcunuz Koç");
                    }
                }
                else{
                        System.out.println("Geçersiz gün girdiniz!!");
                    }
                    break;

            case 4:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        System.out.println("Burcunuz Koç");
                    } else {
                        System.out.println("Burcunuz Kova");
                    }
                }
                else{
                        System.out.println("Geçersiz gün girdiniz!!");
                    }
                    break;

            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Burcunuz Boğa");
                    } else {
                        System.out.println("Burcunuz İkizler");
                    }
                }
                else{
                        System.out.println("Geçersiz gün girdiniz!!");
                    }
                    break;

            case 6:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Burcunuz İkizler");
                    } else {
                        System.out.println("Burcunuz Yengeç");
                    }
                }
                else{
                        System.out.println("Geçersiz gün girdiniz!!");
                    }
                    break;

            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Burcunuz Yengeç");
                    } else {
                        System.out.println("Burcunuz Aslan");
                    }
                }
                else{
                        System.out.println("Geçersiz gün girdiniz!!");
                    }
                    break;

            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Burcunuz Aslan");
                    } else {
                        System.out.println("Burcunuz Başak");
                    }
                }
                else{
                        System.out.println("Geçersiz gün girdiniz!!");
                    }
                    break;

            case 9:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Burcunuz Başak");
                    } else {
                        System.out.println("Burcunuz Terazi");
                    }
                }
                else{
                        System.out.println("Geçersiz gün girdiniz!!");
                    }
                    break;

            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Burcunuz Terazi");
                    } else {
                        System.out.println("Burcunuz Akrep");
                    }
                }
                else{
                        System.out.println("Geçersiz gün girdiniz!!");
                    }
                    break;

            case 11:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Burcunuz Akrep");
                    } else {
                        System.out.println("Burcunuz Yay");
                    }
                }
                else{
                        System.out.println("Geçersiz gün girdiniz!!");
                    }
                    break;

            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Burcunuz Yay");
                    } else {
                        System.out.println("Burcunuz Oğlak");
                    }
                }
                else{
                        System.out.println("Geçersiz gün girdiniz!!");
                    }
                    break;

        }
        */

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Burcunuz Oğlak");
                } else {
                    System.out.println("Burcunuz Kova");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz!!");
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 31) {
                if (day < 20) {
                    System.out.println("Burcunuz Kova");
                } else {
                    System.out.println("Burcunuz Balık");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz!!");
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 20) {
                    System.out.println("Burcunuz Balık");
                } else {
                    System.out.println("Burcunuz Koç");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz!!");
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    System.out.println("Burcunuz Koç");
                } else {
                    System.out.println("Burcunuz Kova");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz!!");
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Burcunuz Boğa");
                } else {
                    System.out.println("Burcunuz İkizler");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz!!");
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("Burcunuz İkizler");
                } else {
                    System.out.println("Burcunuz Yengeç");
                }
            }
            else{
                System.out.println("Geçersiz gün girdiniz!!");
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("Burcunuz Yengeç");
                } else {
                    System.out.println("Burcunuz Aslan");
                }
            }
            else{
                System.out.println("Geçersiz gün girdiniz!!");
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("Burcunuz Aslan");
                } else {
                    System.out.println("Burcunuz Başak");
                }
            }
            else{
                System.out.println("Geçersiz gün girdiniz!!");
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("Burcunuz Başak");
                } else {
                    System.out.println("Burcunuz Terazi");
                }
            }
            else{
                System.out.println("Geçersiz gün girdiniz!!");
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("Burcunuz Terazi");
                } else {
                    System.out.println("Burcunuz Akrep");
                }
            }
            else{
                System.out.println("Geçersiz gün girdiniz!!");
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Burcunuz Akrep");
                } else {
                    System.out.println("Burcunuz Yay");
                }
            }
            else{
                System.out.println("Geçersiz gün girdiniz!!");
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Burcunuz Yay");
                } else {
                    System.out.println("Burcunuz Oğlak");
                }
            }
            else{
                System.out.println("Geçersiz gün girdiniz!!");
            }
        } else {
            System.out.println("Lütfen geçerli bir ay giriniz!!!");
        }
    }
}


