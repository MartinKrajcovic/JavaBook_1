package b1_abstraktne_triedy;
/*
 * Niekedy potrebujeme definovat vseobecnu triedu, ktora bude reprezentovat
 * vlastnosti jej potomkov, ale nedokazeme ich urcit pre kazdeho tak, aby mu vyhovovali.
 * 
 * Preto tu existuju tzv. abstraktne triedy. Tie dovoluju definovat vseobecne vlastnosti, ale aj
 * iba deklarovat vlastnosti (medoty) bez ich definovania a nechat tak svoje podtriedy, aby si ich
 * definovali podla seba pomocou prekrytia metod.
 * 
 * Metoda bez definicie sa nazyva abstraktna metoda. Takato metoda musi mat za modifikatorom pristupu
 * uvedene klucove slovo 'abstract' a nesmie mat svoje telo.
 * Abstraktna trieda je taka, ktora ma aspon jednu abstraktnu metodu.
 * Plati vsak jedno pravidlo: Abstraktna trieda nemusi mat abstraktnu metodu, ale ak je 
 * trieda, ktora ma deklarovanu abstraktnu metodu, tak aj dana trieda musi byt abstraktnou.
 * 
 * Abstraktna trieda sa definuje rovnako ako abstraktna metoda, ze za modifikator pristupu uvedieme
 * klucove slovo 'abstract'.
 * 
 * Abstraktnu triedu je mozne dedit, no nie je mozne vytvarat instancie (objekty) z tejto triedy.
 * Samozrejme, vlastnosti ako su atributy, metody je mozne v tele takejto triedy definovat.
 * 
 */
