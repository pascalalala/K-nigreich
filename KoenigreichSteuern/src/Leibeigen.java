public class Leibeigen extends Bauer{


    public Leibeigen(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int steuer() {
        if(super.zuVersteuern() -12 == 0) return 1;
        return super.steuer();
    }
}
