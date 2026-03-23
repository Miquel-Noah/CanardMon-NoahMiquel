package Canard;

public class Arene {

    public static void combattre(Equipe e1, Equipe e2){
        int nbtours = 0;
        if(e1 != null && e2 != null){
            CanardDeCombat canardE1 = e1.getPremierValide();
            CanardDeCombat canardE2 = e2.getPremierValide();
            while( !e1.touteKO() && !e2.touteKO()){
                nbtours++;
                System.out.println("======================\n");
                System.out.println("Tour : "+nbtours);
                canardE1.attaquer(canardE2);
                if(canardE2.estKo()){
                    canardE2 = canardEstKo(canardE2,e2);
                    if(canardE2 == null){
                        break;
                    }
                }
                if (canardE1.estKo()) {
                    canardE1 = canardEstKo(canardE1, e1);
                    if(canardE1 == null){
                        break;
                    }
                } else {
                    canardE2.attaquer(canardE1);
                    if (canardE1.estKo()) {
                        canardE1 =  canardEstKo(canardE1, e1);
                        if(canardE1 == null){
                            break;
                        }
                    }
                }

                if(canardE1 instanceof CanardPlante){
                    ((CanardPlante) canardE1).regenerer();
                }

                if(canardE2 instanceof CanardPlante){
                    ((CanardPlante) canardE2).regenerer();
                }
                System.out.println("======================\n");
            }

            System.out.println("Vainqueur :"+ (e1.touteKO() ?e2.getNomDresseur():e1.getNomDresseur()));

            System.out.println("==== Etat équipe de "+e1.getNomDresseur());
            e1.afficher();
            System.out.println("\n==== Etat équipe de "+e2.getNomDresseur());
            e2.afficher();
            System.out.println("Nombre de tours du combat : "+nbtours);
        }

    }

    private static CanardDeCombat canardEstKo(CanardDeCombat c, Equipe e){
        System.out.println(c.getSurnom()+" est KO");
        c = e.getPremierValide();
        if (c != null){
            System.out.println(e.getNomDresseur()+ " envoie " + c.getSurnom());
        }
        return c;
    }

}
