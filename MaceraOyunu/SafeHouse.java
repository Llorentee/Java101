package MaceraOyunu;

public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println();
        System.out.println("Güvenli evdesiniz bu yüzden canınız fullendi !!");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        System.out.println("Sağlığınız : " + this.getPlayer().getHealth());
        return true;
    }
}
