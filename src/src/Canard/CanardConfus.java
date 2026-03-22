package Canard;

import java.util.Random;

public class CanardConfus extends CanardEau{

    private boolean enrage = false;

    public CanardConfus(String nom, int pvMax, int attaque, int pressionJet){
        super(nom, pvMax, attaque,pressionJet);
    }

    private CanardConfus(int pressionJet){
        this("CanardEau",100,10,pressionJet);
    }

    private void migraine(){
        System.out.println("Gérard se tient la tête... COIN. COIN.");
        enrage = true;
    }

    @Override
    public void attaquer(CanardDeCombat cible){
        Random random = new Random();
        int atkTemp = getAttaque();
        if (random.nextInt(4) == 0) {
            super.attaquer(this);
            System.out.println(this.getSurnom()+" est confus ! Il se cogne la tête... Coin coin ?");
        }else {
            migraine();
            if(enrage){
                setAttaque(atkTemp*2);
                enrage = false;
            }
            super.attaquer(cible);
            setAttaque(atkTemp);
        }
    }

    @Override
    public String toString() {
        return super.toString()+" **";
    }

}