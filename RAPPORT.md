### R1 :
Le problème ici est que vue qu'on dupplique notre code des que l'on veux créer un "canard Flamme", si on décide que l'espece canard Flamme a au final 200 pv, il faut changer toute les création de canard flamme.

### R2 :
Ce qu'il se passe, c'est qu'on a une exception car il n'existe pas de méthode getMultiplicateur qui prend en paramètre un objet de type CanardDeCombat. Et une classe fille peut être passée en paramètre dans une méthode qui attend la classe parente, mais pas l'inverse.
Pour résoudre ce problème il faut passez le type de canards attaqué plutot que la classe abstraite, donc il faut faire une méthode par type de canard dans CanardFeu, CanardEau, etc. Cette méthode donne le multiplicateur. 

Ou alors on fais comme vous nous dites de faire dans la consigne. 

### R3 :
J'ai dû ecrire 13 méthode etreAttaquePar() pour seulement 4 type différents.

### R4 :
Une interface définis une liste de chose qu'un objet est capable de faire, en gros une liste de capacités, 
Donc si on crée d'autres classes qui ont les capacités de se battre et de se soigner il suffiras d'implementer
les deux interface dans les classe crées. Alors que si on les laisse dans canards ça en fais des cpacités propre au canards.
Car une classe abstraite definis ce qu'est l'objet. 