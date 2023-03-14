public class PalindromSayi {

    static boolean isPalidrom(int number) {
        int temp = number, reverseNumber = 0, lastnumber;
        while (temp != 0) {
            lastnumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastnumber; // bir sayıya basamak eklemek için 10 ile çarpıyorum
            // 525
            // 5 * 10 = 50 + 2 = 52
            // 52 * 10 = 520 + 5 = 525
            temp /= 10;
        }
        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalidrom(101));
    }
}
