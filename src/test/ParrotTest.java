package test;

import org.junit.Test;
import parrot.*;

import static org.junit.Assert.assertEquals;

public class ParrotTest {

    private static Parrot getParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        Parrot prt;
           switch (type) {
            case EUROPEAN -> prt = new ParrotEUROPEAN();
            case AFRICAN -> prt  = new ParrotAFRICAN(numberOfCoconuts);
            case NORWEGIAN_BLUE -> prt = new ParrotNORWEGIAN(voltage,isNailed);
            default -> throw new RuntimeException("Should be unreachable");
        }
        return prt;

    }


    @Test
    public void getSpeedOfEuropeanParrot() {
        Parrot parrot = getParrot(ParrotTypeEnum.EUROPEAN, 0, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        Parrot parrot = getParrot(ParrotTypeEnum.AFRICAN, 1, 0, false);
        assertEquals(3.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        Parrot parrot = getParrot(ParrotTypeEnum.AFRICAN, 2, 0, false);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        Parrot parrot = getParrot(ParrotTypeEnum.AFRICAN, 0, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        Parrot parrot = getParrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, true);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
        Parrot parrot = getParrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, false);
        assertEquals(18.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        Parrot parrot = getParrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 4, false);
        assertEquals(24.0, parrot.getSpeed(), 0.0);
    }


    @Test
    public void getParrotHomeTestEuropean(){
      Parrot pEur= new ParrotEUROPEAN();

        assertEquals("Europeiska papegojor bor i ett bo byggt av pinnar.",pEur.getParrotHome());

    }

    @Test
    public void getParrotHomeTestAfrican(){
        Parrot pAfr= new ParrotAFRICAN(numberOfCoconuts);

        assertEquals("Afrikanska papegojor bor i hål i träd.",pAfr.getParrotHome());

    }

    @Test
    public void getParrotHomeTestNorwegian(){
        Parrot pNor= new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 0, false);

        assertEquals("Norwegian blue bor i en bur, om den är fastspikad.",pNor.getParrotHome());

    }
}
