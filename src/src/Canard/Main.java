package Canard;

public class Main {

    public static void main(String[] args){
        Equipe sacha = new Equipe("Sacha");
        Equipe ondine = new Equipe("Ondine");

        CanardFeu canardFeu = new CanardFeu("CanardFeu",113,17,0.9);
        CanardPlante canardPlante = new CanardPlante("canardPlante",139,15);
        CanardClassique canardClassique = new CanardClassique("CanardClassique",100,10);
        CanardEau canardEau = new CanardEau("CanardEau",107,16,3);
        CanardEau etoileI = new CanardEau("CanardEau",107,16,3);
        CanardConfus confus = new CanardConfus("CanardConfus",107,16,3);
        CanardConfus cuicui = new CanardConfus("CanardConfus",107,16,3);

        canardFeu.setSurnom("Sala-méche");
        canardPlante.setSurnom("Bulbe bizzare");
        canardEau.setSurnom("Reine poisson");
        canardClassique.setSurnom("Ralala");
        etoileI.setSurnom("etoil-I");
        confus.setSurnom("kwak psyco");
        cuicui.setSurnom("Ce frappe dans la confusion");

        sacha.ajouter(canardFeu);
        sacha.ajouter(canardPlante);
        sacha.ajouter(cuicui);
        sacha.ajouter(canardClassique);

        ondine.ajouter(canardEau);
        ondine.ajouter(etoileI);
        ondine.ajouter(confus);
        System.out.println("========== Equipe de Sacha ==============");
        sacha.afficher();
        System.out.println("========= Equipe de Ondine ==============");
        ondine.afficher();

        Arene.combattre(sacha,ondine);
    }
}
