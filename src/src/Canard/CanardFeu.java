package Canard;

public class CanardFeu extends CanardDeCombat {

    private double intensiteFlamme;

    public CanardFeu(String nom, int pvMax, int attaque,double intensiteFlamme){
        super(nom, pvMax, attaque);
        this.intensiteFlamme = intensiteFlamme >= 0.8 && intensiteFlamme <=1.5? intensiteFlamme: 0.8;
    }

    private CanardFeu(double intensiteFlamme){
        this("CanardFeu",100,10,intensiteFlamme);
    }

    public double getIntensiteFlamme() {
        return intensiteFlamme;
    }

    @Override
    public String getType() {
        return "Feu";
    }

    @Override
    public void attaquer(CanardDeCombat cible){
        double multiplicateur = cible.etreAttaquerPar(this) + intensiteFlamme;
        effectuerAttaque(cible, multiplicateur);
    }

    @Override
    public String toString() {
        return super.toString() + "[Intensité des flammes : " + getIntensiteFlamme() + " ]";
    }

    @Override
    public double etreAttaquerPar(CanardFeu attaquant){ return 0.5;}

    @Override
    public double etreAttaquerPar(CanardEau attaquant){ return 2.0;}

    @Override
    public double etreAttaquerPar(CanardPlante attaquant){ return 0.5;}
}