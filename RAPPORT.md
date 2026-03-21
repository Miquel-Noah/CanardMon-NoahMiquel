### R1 :
Le problème ici est que vue qu'on dupplique notre code des que l'on veux créer un "canard Flamme", si on décide que l'espece canard Flamme a au final 200 pv, il faut changer toute les création de canard flamme.

### R2 :
Ce qu'il se passe, c'est qu'on a une exception car il n'existe pas de méthode getMultiplicateur qui prend en paramètre un objet de type CanardDeCombat. Et une classe fille peut être passée en paramètre dans une méthode qui attend la classe parente, mais pas l'inverse.
Pour résoudre ce problème il faut passez le type de canards attaqué plutot que la classe abstraite, donc il faut faire une méthode par type de canard dans CanardFeu, CanardEau, etc. Cette méthode donne le multiplicateur. 

Ou alors on fais comme vous nous dites de faire dans la consigne. 