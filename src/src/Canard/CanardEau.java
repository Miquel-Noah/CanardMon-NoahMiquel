package Canard;

public class CanardEau extends CanardDeCombat {

    private int pressionJet;

    public CanardEau(String nom, int pvMax, int attaque,int pressionJet){
        super(nom, pvMax, attaque);
        this.pressionJet = pressionJet;
    }

    private CanardEau(int pressionJet){
        this("CanardEau",100,10,pressionJet);
    }

    public int getPressionJet() {
        return pressionJet;
    }

    @Override
    public String getType() {
        return "Eau";
    }


    @Override
    public void attaquer(CanardDeCombat cible){
        double multiplicateur = cible.etreAttaquerPar(this);
        System.out.printf(" Jet d'eau (Pression : %d) !", getPressionJet());
        effectuerAttaque(cible,multiplicateur);
        if(cible.estKo()){
            System.out.printf("%s adverse est ko\n", cible.getSurnom());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "[Pression du jet d'eau : " + getPressionJet() + " ]";
    }

    @Override
    public double etreAttaquerPar(CanardFeu attaquant){ return 0.5;}

    @Override
    public double etreAttaquerPar(CanardEau attaquant){ return 0.5;}

    @Override
    public double etreAttaquerPar(CanardPlante attaquant){ return 2.0;}
}