public class Adel extends Einwohner {

    public Adel(String name, int einkommen){
        super(name, einkommen);
    }


    public int steuer(){
        if(zuVersteuern() < 20 ) return 20;
        return super.steuer();
    }


}
