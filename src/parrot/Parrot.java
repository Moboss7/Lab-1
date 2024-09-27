package parrot;

import static parrot.ParrotTypeEnum.*;

public class Parrot {




   protected Parrot() {
   }

    public  double getSpeed()
        return switch (type) {
            case EUROPEAN -> getBaseSpeed();
            case AFRICAN -> Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
            case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
            default -> throw new RuntimeException("Should be unreachable");
        };
   */




    protected double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    protected double getLoadFactor() {
        return 9.0;
    }

    protected double getBaseSpeed() {
        return 12.0;
    }





    /*public abstract String getParrotHome(); /*{

        if (type == EUROPEAN){
            return "Europeiska papegojor bor i ett bo byggt av pinnar.";
        }

        if (type == AFRICAN){
            return "Afrikanska papegojor bor i hål i träd.";
        }

        if (type == NORWEGIAN_BLUE){
            return "Norwegian blue bor i en bur, om den är fastspikad.";
        }
        return "";
    }*/

}
