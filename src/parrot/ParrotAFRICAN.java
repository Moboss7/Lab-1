package parrot;

public class ParrotAFRICAN extends Parrot{

    protected int numberOfCoconuts;



    public ParrotAFRICAN(int numberOfCoconuts) {
        super();
        this.numberOfCoconuts=numberOfCoconuts;
    }




    public double getSpeed(){
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }



    public String getParrotHome(){
        return "Afrikanska papegojor bor i hål i träd.";
    }


}
