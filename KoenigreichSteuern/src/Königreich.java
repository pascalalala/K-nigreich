import java.util.Scanner;

public class Königreich {


    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);
        while (true) {
            System.out.println("Geben sie die Bevölerungsgruppe an!");
            String bevölerungsgruppe = eingabe.next();
            System.out.println("Geben Sie den Namen ein!");
            String name = eingabe.next();
            System.out.println("Geben sie das Einkommen an!");
            int einkommen = eingabe.nextInt();

            if (bevölerungsgruppe.equals("Adel")) {
                Einwohner adel = new Adel(name, einkommen);
                ausgabe(adel, name);
            }
            if (bevölerungsgruppe.equals("König")) {
                Einwohner könig = new König(name, einkommen);
                ausgabe(könig, name);
            }
            if(bevölerungsgruppe.equals("Leibeigen")){
                Einwohner leibeigen = new Leibeigen(name, einkommen);
                ausgabe(leibeigen, name);
            }
            System.out.println("Wenn du aus diesem Taler-versessenen Königreich entkommen möchtest: Drücke x! Ansonsten alles andere.");
            String exit = eingabe.next();
            if(exit.equals("x")){
                break;
            }
        }


    }


        public static void ausgabe(Einwohner einwohner, String name) {
            System.out.println(einwohner.toString() + " "+ name + " hat " + einwohner.steuer() + " zu zahlen.");


        }
}