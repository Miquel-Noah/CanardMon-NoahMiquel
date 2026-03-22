package Canard;

public interface Combattant {

    void attaquer(CanardDeCombat cible);

    boolean estKo();

    String getNom();
}
