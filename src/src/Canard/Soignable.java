package Canard;

public interface Soignable {

    void soigner();

    int getPvMax();

    int getPvActuel();

    default double pourcentagePv(){
        return (double) getPvActuel()/getPvMax() * 100;
    }
}
