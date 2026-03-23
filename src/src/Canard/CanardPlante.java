package Canard;

public class CanardPlante extends CanardDeCombat {

    public CanardPlante(String nom, int pvMax, int attaque){
        super(nom, pvMax, attaque);
    }

    private CanardPlante(String nom){
        this(nom,100,10);
    }

    public void regenerer() {
        int pvActuel = super.getPvActuel();
        double soin = super.getPvMax() * 0.10;
        pvActuel = (int) Math.min(pvActuel + soin , super.getPvMax());
        super.setPvActuel(pvActuel);
    }

    @Override
    public String getType() {
        return "Plante";
    }

    @Override
    public void attaquer(CanardDeCombat cible){
        double multiplicateur = cible.etreAttaquerPar(this);
        effectuerAttaque(cible, multiplicateur);
    }

    @Override
    public String toString() {
        return super.toString() + "[ Se régénère de 10% a chaque tours ]";
    }

    @Override
    public double etreAttaquerPar(CanardFeu attaquant){ return 2.0;}

    @Override
    public double etreAttaquerPar(CanardEau attaquant){ return 0.5;}

    @Override
    public double etreAttaquerPar(CanardPlante attaquant){ return 0.5;}
}