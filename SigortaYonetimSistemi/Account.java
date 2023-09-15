package SigortaYonetimSistemi;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Account implements Comparable<Account> {

    private User user;
    private AuthenticationStatus status;
    public static ArrayList<Insurance> yapilanSigortalar;

    public final void showUserInfo() {
        System.out.println("Müşterinin adı : " + this.getUser().getIsim());
        System.out.println("Müşterinin soyadı : " + this.getUser().getSoyisim());
        System.out.println("Müşterinin emaili : " + this.getUser().getEmail());
        System.out.println("Müşterinin şifresi : " + this.getUser().getSifre());
        System.out.println("Müşterinin mesleği : " + this.getUser().getMeslek());
        System.out.println("Müşterinin yaşı : " + this.getUser().getYas());
        System.out.println("Müşterinin sisteme son giriş tarihi : " + this.getUser().getSon_giris_tarihi());

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AuthenticationStatus getStatus() {
        return status;
    }

    public void setStatus(AuthenticationStatus status) {
        this.status = status;
    }


    public boolean login(String email, String sifre) throws InvalidAuthenticationException {

        if (email.equals(this.getUser().getEmail()) && sifre.equals(this.getUser().getSifre())) {
            System.out.println("Giriş işlemi başarılı.....");
            this.setStatus(AuthenticationStatus.SUCCESS);
            return true;
        } else {
            this.setStatus(AuthenticationStatus.FAIL);
            throw new InvalidAuthenticationException("Kullanıcı bilgileriniz HATALI!!!!");
        }
    }

    public abstract void sigortaPolicesi();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (!Objects.equals(user, account.user)) return false;
        return status == account.status;
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
