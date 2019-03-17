package Design_Paterns_Factory;

import static Design_Paterns_Factory.FormaFactory.FormaType.CERC;
import static Design_Paterns_Factory.FormaFactory.FormaType.PATRAT;

public class FormaRunner {
    public static void main(String[] args) {
        FormaFactory fabrica = new FormaFactory();

        Forma modelino = fabrica.getForm(CERC);
        modelino.explicaforma();
        modelino = fabrica.getForm(PATRAT);
        modelino.explicaforma();

    }
}
