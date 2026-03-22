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
        super.attaquer(cible);
        System.out.printf(" Jet d'eau (Pression : %d) !", getPressionJet());
    }

    @Override
    public String toString() {
        return super.toString() + "[Pression du jet d'eau : " + getPressionJet() + " ]";
    }
}