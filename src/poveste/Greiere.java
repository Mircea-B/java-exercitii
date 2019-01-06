package poveste;

import java.util.Scanner;

public class Greiere {
    String nume;
    int randament=1; // cat poate sa care intr-o zi
    boolean munceste=false;
    int anotimp=1;
    int stoc=0;

    public Greiere() {
        this.randament = randament;
        this.nume = nume;
    }

    public String text1() {
        return
                "\n\033[1;32m 1. Buna ziua doamna furnica, ce faceti atat de grabita?\033[1;30m \n\033[1;33m 2. Ce-ai facut bobita?, Te-ai prins?....Bobita :p,..graunte....well anyway \033[1;30m \n3. whatssssssuuuuuppppp, my nigggaaa, cu cajuuuuuu-ul ala in spate? \033[0m";
    }

    public String text2() {
        return
                "\n\033[1;32m 1. Buna ziua doamna furnica, ce faceti atat de grabita, nu vedeti ce frumos este afara, stati un pic sa vorbim?\033[1;30m \n\033[1;33m 2. hohohoh, inca n-a venit iarna ce tragi asa de tare?\033[1;30m \n3. Gata, work time is over, party time is here, get it?";
    }

    public String text3() {
        return
                "\n\033[1;32m 1. Se apropie iarna, dar tot e frumos afara, nu mai bine faceti o pauza ?\033[1;30m \n\033[1;33m 2. Yahooooo, nu vezi cum cad frunzele, ia mai trage si tu pe dreapta?\033[1;30m \n3. Get the autumn feelings, shake your body baby.....feel the rithm of my music";
    }

    int decz = 0;
    public String decizie1() {
        Scanner dec1 = new Scanner(System.in);
        int d = dec1.nextInt();
        if (d == 1) {
            decz = 1;
            return "Greiere: 1. Buna ziua doamna furnica, ce faceti atat de grabita?";
        }
        if (d == 2) {
            decz = 2;
            return "Greiere: 2. Ce-ai facut bobita?, Te-ai prins?....Bobita :p,..graunte....well anyway";
        }
        if (d == 3) {
            decz = 3;
            return "Greiere: 2. whatssssssuuuuuppppp, my nigggaaa, cu cajuuuuuu-ul ala in spate?";
        } else {
            return "Va rugam totusi sa alegeti o optiune din cele de mai sus";
        }

    }

    public String decizie2() {
        Scanner dec1 = new Scanner(System.in);
        int d = dec1.nextInt();
        if (d == 1) {
            decz = 1;
            return "Greiere: 1. Buna ziua doamna furnica, ce faceti atat de grabita?";
        }
        if (d == 2) {
            decz = 2;
            return "Greiere:  2. hohohoh, inca n-a venit iarna ce tragi asa de tare?";
        }
        if (d == 3) {
            decz = 3;
            return "Greiere:  3. Gata, work time is over, party time is here, get it";
        } else {
            return "Va rugam totusi sa alegeti o optiune din cele de mai sus";
        }

    }
    public String decizie3() {
        Scanner dec1 = new Scanner(System.in);
        int d = dec1.nextInt();
        if (d == 1) {
            decz = 1;
            return "Greiere: 1. Se apropie iarna, dar tot e frumos afara, nu mai bine faceti o pauza?";
        }
        if (d == 2) {
            decz = 2;
            return "Greiere: 2. Yahooooo, nu vezi cum cad frunzele, ia mai trage si tu pe dreapta";
        }
        if (d == 3) {
            decz = 3;
            return "Greiere: 3. Get the autumn feelings, shake your body baby.....feel the rithm of my music";
        } else {
            return "Va rugam totusi sa alegeti o optiune din cele de mai sus";
        }

    }

    public String vorbit1() {

        return text1();

    }

    public String vorbit2() {

        return text2();
    }

    public String vorbit3() {

        return text3();
    }
    int graunte=1;
    public int umple(){
        stoc=stoc+graunte+graunte*randament;
        return stoc;

    }
    public int intrebare(){
        System.out.println("Se va apuca greierele sa care un graunte macar?  y/n");
        Scanner buffer=new Scanner(System.in);
        String raspuns=buffer.nextLine();
        if(raspuns.equals("y")){
            umple();
            umple();

            munceste=true;
            randament++;
            randament=randament*anotimp;
        }else{
            randament=0;

        }return randament;
    }
}
