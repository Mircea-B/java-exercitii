package poveste;

import java.util.Scanner;

public class Furnica {
    String nume;
    int randament=2; // cat poate sa care intr-o zi
    boolean munceste=true;
    int anotimp=1;
    int stoc=0;
    int graunte=1;

    public Furnica() {
        this.randament = randament;
        this.munceste = munceste;
        this.nume = nume;
    }

    public String text1() {
        return
                "\n\033[1;32m 1. Uite car la graunte, ca o sa vina iarna si nu vreau sa fac foamea.\033[1;30m \n\033[1;33m 2. Bine Bobita, trag de fiare, pardon de haleala, sa nu mor de foame la iarna \033[1;30m \n3. F**** off, fake M&M \033[0m";
    }
    int decg=0;
    public String decizie1(){
        umple();
        int d=decg;
        if(d==1){
            decg=1;
            return "Furnica: 1. Uite car la graunte, ca o sa vina iarna si nu vreau sa fac foamea.";
        }
        if(d==2){
            decg=2;
            return "Furnica: 2. Bine Bobita, trag de fiare, pardon de haleala, sa nu mor de foame la iarna";
        }
        if(d==3){
            decg=3;
            return "Furnica: 2. Ce-ai facut bobita?, Te-ai prins?....Bobita :p,..graunte....well anyway";
        }else{
            return "F**** off, fake M&M";
        }
}
    public String decizie2(){
        umple();
        int d=decg;
        if(d==1){
            decg=1;
            return "Furnica: 1. Ce fac in fiecare zi, mersi, ar trebui sa te apuci si tu de treaba, daca nu vrei sa mori de foame.";
        }
        if(d==2){
            decg=2;
            return "Furnica: 2. Fac muschi la picioare, ca sa nu=-mi dardie la iarna, get it fraiere?";
        }
        if(d==3){
            decg=3;
            return "Furnica: 3. M-am prins fraiere, da tu te prinzi ca o sa mori de foame, hai party mai incolo...";
        }else{
            return "F**** off, fake M&M";
        }


    }
    public String decizie3(){
        umple();
        int d=decg;
        if(d==1){
            decg=1;
            return "Furnica: 1.Pune mana si cara-ti ceva in camara, ca o sa belesti ochii de foame cand o sa vina geru";
        }
        if(d==2){
            decg=2;
            return "Furnica: 2. Ia mai trage tu la altceva, ca n-am chef acum";
        }
        if(d==3){
            decg=3;
            return "Furnica: 3. Shake this, **facepalm**, as a rithm";
        }else{
            return "F**** off, fake M&M";
        }
    }

    public int umple(){
        stoc=stoc+graunte+graunte*randament;
        return stoc;

    }

    }

