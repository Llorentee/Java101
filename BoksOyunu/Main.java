package BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 10, 120 , 100, 40, 50);
        Fighter f2 = new Fighter("B", 20, 85 , 85, 60 , 50);

        Match match = new Match(f1, f2, 85, 100);
        match.fighter_start(f1, f2);
        match.run();


    }
}