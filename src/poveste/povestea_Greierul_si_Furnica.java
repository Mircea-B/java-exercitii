package poveste;

import java.util.concurrent.TimeUnit;

public class povestea_Greierul_si_Furnica {
    public static void main(String[] args) throws InterruptedException {
        int anotimp = 0;
        System.out.println("Povestea noastra incepe intr-o primavara, cand totul este dezmortit si prinde viata :), sau cel putin asa credem noi");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Asadar, sa incepem frumos, .... din departare se aude un cvartet al greierului, parca e dua lipa pe amfetamine, cum da din corzi, sau cel putin asa se gandeste furnica, \nin timp ce munceste la caratul grauntelor.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Deodata greierele se opreste din cantat si se duce spre furnica si ii spune: ");
        TimeUnit.SECONDS.sleep(2);
        Greiere elvis = new Greiere();
        Furnica john = new Furnica();
        System.out.println("in timp ce ce se duce spre furnica,se gandeste, de ce oare cara niste graunte grele furnica de colo pana colo?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("odata ajunsa in dreptul furnicii, o intreaba: ");
        System.out.println("ATENIE!! Va rugam alegeti intrebarea greierului: " + "\n======================================" + elvis.vorbit1());
        System.out.println(elvis.decizie1());

        if (elvis.decz == 1) {
            john.decg = 1;
            System.out.println(john.decizie1());
        }
        if (elvis.decz == 2) {
            john.decg = 2;
            System.out.println(john.decizie1());
        }
        if (elvis.decz == 3) {
            john.decg = 3;
            System.out.println(john.decizie1());
        }
        System.out.println(elvis.intrebare());
        TimeUnit.SECONDS.sleep(3);
        anotimp++;
        anotimp = elvis.anotimp;
        anotimp = john.anotimp;

        System.out.println("===================================");
        System.out.println();
        /// de pus counter

        System.out.println("vine vara si din nou greierele vede furnica ca trage de graunte");
        System.out.println("si iar se duce sa o intrebe");
        System.out.println("ATENIE!! Va rugam alegeti intrebarea greierului: " + "\n======================================" + elvis.vorbit2());
        System.out.println(elvis.decizie2());
        if (elvis.decz == 1) {
            john.decg = 1;
            System.out.println(john.decizie2());
        }
        if (elvis.decz == 2) {
            john.decg = 2;
            System.out.println(john.decizie2());
        }
        if (elvis.decz == 3) {
            john.decg = 3;
            System.out.println(john.decizie2());
        }
        System.out.println(elvis.intrebare());
        TimeUnit.SECONDS.sleep(3);
        anotimp++;
        anotimp = elvis.anotimp;
        anotimp = john.anotimp;

        System.out.println("vine toamna si din nou greierele vede furnica ca trage de graunte");
        System.out.println("si iar se duce sa o intrebe");
        System.out.println("ATENIE!! Va rugam alegeti intrebarea greierului: " + "\n======================================" + elvis.vorbit3());
        System.out.println(elvis.decizie3());
        if (elvis.decz == 1) {
            john.decg = 1;
            System.out.println(john.decizie3());
        }
        if (elvis.decz == 2) {
            john.decg = 2;
            System.out.println(john.decizie3());
        }
        if (elvis.decz == 3) {
            john.decg = 3;
            System.out.println(john.decizie3());
        }
        System.out.println(elvis.intrebare());
        TimeUnit.SECONDS.sleep(3);
        anotimp++;
        anotimp = elvis.anotimp;
        anotimp = john.anotimp;

        if (anotimp > 2) {
            System.out.println("Iarna a venit, iar rezultatele pe stocuri sunt: ");

        }
        System.out.println("Greiere: " + elvis.stoc);
        System.out.println("Furnica: " + john.stoc);
        System.out.println("Iarna a venit si dureaza 3 luni, iar consumul /cap de animal este de 1 graunta pe luna, Good luck!");
        if(elvis.stoc>3){
            System.out.println("Ambele animale au supravietuit aceasta iarna, sa cante hadrian :D");
        }else {
            System.out.println("Doar furnica a rezistat aceasta iarna, R.I.P. elvis - pe fundal se aude - Burn it to the ground");
        }


    }


}
