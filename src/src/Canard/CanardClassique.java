package Canard;

public class CanardClassique extends CanardDeCombat {

    public CanardClassique(String nom, int pvMax, int attaque){
        super(nom, pvMax, attaque);
    }

    private CanardClassique(String nom){
        this(nom,100,10);
    }

    @Override
    public String getType() {
        return "Normal";
    }

    @Override
    public void attaquer(CanardDeCombat cible){
        double multiplicateur = cible.etreAttaquerPar(this);
        effectuerAttaque(cible, multiplicateur);
        if(cible.estKo()){
            System.out.printf("%s adverse est ko\n", cible.getSurnom());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "[ Canard de base. ratata en gros ]";
    }
}