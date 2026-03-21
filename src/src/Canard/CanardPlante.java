package Canard;

public class CanardPlante extends CanardDeCombat {

    public CanardPlante(String nom, int pvMax, int attaque){
        super(nom, pvMax, attaque);
    }

    private CanardPlante(String nom){
        this(nom,100,10);
    }

    public void setPvActuel(int pvActuel){
        super.pvActuel = pvActuel;
    }


    public void regenerer() {
        int pvActuel = super.getPvActuel();
        double soin = super.getPvMax * 0.10;
        pvActuel = Math.min((int) pvActuel + soin , super.getPvMax());
        setPvActuel(pvActuel);
    }

    @Override
    public String getType() {
        return "Plante";
    }

    @Override
    public String toString() {
        return super.toString + "[ Se régénère de 10% a chaque tours ]";
    }
}