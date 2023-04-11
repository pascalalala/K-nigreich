public abstract class Einwohner {


    private String name;

    private int einkommen;


    public Einwohner(String name,int einkommen){
        this.name = name;
        this.einkommen = einkommen;
    }

    public int zuVersteuern(){
        return this.einkommen;
    }

    public int steuer(){
        int steuer = (int) Math.round((zuVersteuern() * 0.1)*100) / 100;
        return steuer;
    }

    public String toString(){
        return name;
    }








}


