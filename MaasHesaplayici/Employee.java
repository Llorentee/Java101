package MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {
        double tax = 0.0;
        if (this.salary >= 1000) {
            tax = this.salary * 0.03;
            return tax;
        }
        return tax;
    }

    double bonus() {
        double bonus = 0.0;
        if (this.workHours >= 40) {
            bonus = (this.workHours - 40) * 30;
            return bonus;
        }
        return bonus;
    }

    double raiseSalary() {
        double raise_salary = 0.0;
        int calisma_suresi_yil;
        calisma_suresi_yil = 2021 - this.hireYear;
        if (calisma_suresi_yil < 10) {
            raise_salary = this.salary * 0.5;
            return raise_salary;
        } else if (calisma_suresi_yil > 9 && calisma_suresi_yil < 20) {
            raise_salary = this.salary * 0.10;
            return raise_salary;
        } else if (calisma_suresi_yil > 19) {
            raise_salary = this.salary * 0.15;
            return raise_salary;
        }
        return raise_salary;
    }


    void to_string() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maaş artışı : " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + (this.bonus() - this.tax())));
        System.out.println("Toplam Maaş : " + (this.salary + (this.bonus() + this.raiseSalary() - this.tax())));
    }


}
