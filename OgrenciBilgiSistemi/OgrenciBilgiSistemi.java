package OgrenciBilgiSistemi;

public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut", "TRH", "05245235342");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "53243");
        Teacher t3 = new Teacher("Külyutmaz","BIO", "23542");

        Course tarih = new Course("Tarih", "101","TRH");
        //tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        //fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101", "BIO");
        //biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100,50,60);
        s1.sozluNot(70,50,60);
        s1.isPass();







    }
}
