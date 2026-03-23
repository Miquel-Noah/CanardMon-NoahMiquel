package Canard;

public class Equipe {

    private static final int MAX_CANARDS = 6;
    private CanardDeCombat[] canardsDeCombat;
    private String nomDresseur;
    private static int nbEquipesCrees = 0;

    public Equipe(String nomDresseur) {
        this.nomDresseur = nomDresseur;
        this.canardsDeCombat = new CanardDeCombat[MAX_CANARDS];
        nbEquipesCrees++;
    }

    public boolean ajouter(CanardDeCombat c) {
        for (int i = 0; i < MAX_CANARDS; i++) {
            if (canardsDeCombat[i] == null) {
                canardsDeCombat[i] = c;
                return true;
            }
        }
        return false;
    }

    public boolean retirer(String surnom) {
        for (int i = 0; i < MAX_CANARDS; i++) {
            if (canardsDeCombat[i] != null && canardsDeCombat[i].getSurnom().equals(surnom)) {
                canardsDeCombat[i] = null;
                for (int j = i; j < MAX_CANARDS - 1; j++) {
                    canardsDeCombat[j] = canardsDeCombat[j + 1];
                    canardsDeCombat[j + 1] = null;
                }
                return true;
            }
        }
        return false;
    }

    public CanardDeCombat getPremierValide() {
        for (CanardDeCombat c : canardsDeCombat) {
            if (c != null && !c.estKo()) {
                return c;
            }
        }
        return null;
    }

    public void soignerTous() {
        for (CanardDeCombat c : canardsDeCombat) {
            if (c != null) {
                c.soigner();
            }
        }
    }

    public void afficher() {
        for (CanardDeCombat c : canardsDeCombat) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }

    public boolean touteKO() {
        for (CanardDeCombat c : canardsDeCombat) {
            if (c != null && !c.estKo()) {
                return false;
            }
        }
        return true;
    }

    public static int getNbEquipesCrees() {
        return nbEquipesCrees;
    }

    public String getNomDresseur() {
        return nomDresseur;
    }
}