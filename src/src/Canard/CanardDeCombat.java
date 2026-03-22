package Canard;

public abstract class CanardDeCombat implements Soignable,Combattant{

    private static final int ATK_MIN = 1;

    private static int nbCanardsCrees;

    private final String nom;

    private String surnom;

    private final int pvMax;

    private int pvActuel;

    private int attaque;

    public CanardDeCombat(String nom, int pvMax, int attaque){
        this.nom = nom;
        this.surnom = nom;
        this.attaque = Math.max(attaque, ATK_MIN);
        this.pvMax = pvMax > 0 ? pvMax : 100;
        this.pvActuel = pvMax;
    }

    public static int getNbCanardsCrees() {
        return nbCanardsCrees;
    }

    public String getNom() {
        return nom;
    }

    public String getSurnom() {
        return surnom;
    }

    public int getPvMax() {
        return pvMax;
    }

    public int getPvActuel() {
        return pvActuel;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }

    public void setPvActuel(int pvActuel){ this.pvActuel = pvActuel;}

    public boolean estKo(){
        return pvActuel<= 0;
    }

    public void subirDegat(int degats){
        pvActuel -= degats;
        System.out.println(surnom + " subit " + degats + " dégâts ! (PV:" + pvActuel + "/" + pvMax + ")");
    }

    public void soigner(){
        this.pvActuel = pvMax;
    }

    public abstract String getType();

    public void setAttaque(int atk){
        this.attaque = atk;
    }

    public String toString() {
        return "["+getType()+"]"+nom+"«"+surnom+"»"+"(PV:" + pvActuel + "/" + pvMax + "| ATK:"+ attaque +")";
    }

    public abstract void attaquer(CanardDeCombat cible);

    protected void effectuerAttaque(CanardDeCombat cible, double mutliplicateur){
        int degats = (int)(getAttaque() * mutliplicateur);
        System.out.printf("%s attaque %s ! ( %s --> %s : X %f ) --> %d dégats \n",
                getSurnom(),cible.getSurnom(), getType(),cible.getType(),mutliplicateur,degats);
    }

    public double etreAttaquerPar(CanardFeu attaquant){ return 1.0;}

    public double etreAttaquerPar(CanardEau attaquant){ return 1.0;}

    public double etreAttaquerPar(CanardPlante attaquant){ return 1.0;}

    public double etreAttaquerPar(CanardClassique attaquant){ return 1.0;}

}
