package EIDIP_Stoff.Vererbung_Inheritance.Super_keyword;

public class Main {
    public static void main(String[] args) {
        
        //Aus übersichtlichkeitsgründen eine 2. Main Klasse erstellt.
        //super = keyword refers to the superclass (parent) of an object
        //        very similar to the "this" keyword.
        
        Hero opm = new Hero("Saitama", 28,"One Hit Kill");
        Hero mmr = new Hero("Mumen-Rider", 25, "Bicyclist of Justice");

        System.out.println(mmr.toString());
        System.out.println(opm.toString());
    }
}
