package MaasHesaplayici;

public class Main {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Emir", 3000, 55,1998);
        worker1.tax();
        worker1.bonus();
        worker1.raiseSalary();
        worker1.to_string();

    }
}
