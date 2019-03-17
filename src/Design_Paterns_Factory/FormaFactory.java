package Design_Paterns_Factory;

public class FormaFactory {


    public enum FormaType {

        TRIUNGHI,
        CERC,
        PATRAT;

    }


    public Forma getForm(FormaType type) {

        switch (type) {
            case TRIUNGHI:
                return new Triunghi();
            case CERC:
                return new Cerc();
            case PATRAT:
                return new Patrat();
        }
        return null;
    }

}
