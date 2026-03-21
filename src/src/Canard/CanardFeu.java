package Canard;

public class CanardFeu extends CanardDeCombat {

    private double intensiteFlamme;

    public CanardFeu(String nom, int pvMax, int attaque,double intensiteFlamme){
        super(nom, pvMax, attaque);
        this.intensiteFlamme = intensiteFlamme >= 0.8 && intensiteFlamme <=1.5? intensiteFlamme: 0.8;
    }

    private CanardFeu(double intensiteFlamme){
        this('CanardFeu',100,10,intensiteFlamme);
    }

    public double getIntensiteFlamme() {
        return intensiteFlamme;
    }

    @Override
    public String getType() {
        return "Feu";
    }


    @Override
    public String toString() {
        return super.toString + "[Intensité des flammes : " + getIntensiteFlamme() + " ]";
    }
}