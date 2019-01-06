package poveste;

public class Camara {
    int stoc=0; // cate graunte de caju se afla in ea
    int graunte=0; // unitatea de masura :DDDD
    int anotimp=0; // e mai mult ca un counter asta


    public Camara() {
        this.stoc = stoc;
        this.graunte = graunte;
    }

int rand=0;
    public int umple(){
        graunte=graunte+graunte*rand;
        return graunte;
    }

}
