package parrot;

public class ParrotNORWEGIAN extends Parrot{
    protected double voltage;
    protected boolean isNailed;

    public ParrotNORWEGIAN(double voltage, boolean isNailed) {
        super();

        this.voltage=voltage;
        this.isNailed=isNailed;
    }


    public double getSpeed(){
        return   (isNailed) ? 0 : getBaseSpeed(voltage);
    }



    public String getParrotHome(){
        return  (isNailed) ? "Norwegian blue bor i en bur, om den är fastspikad." : "ingenstans";
    }

}
