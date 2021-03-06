package b2_rozhrania;
/*
 * Vyuzivanie dedicnosti ma jednu zasadnu nevyhodu. V Jave je mozne, aby kazda trieda mala
 * iba jedneho priameho predka. Da sa vytvorit mnoho zdedenych tried, no vzdy je ale mozne
 * dedit vlastnosti priamo len od jednej triedy. Ako ciastocna kompenzacia tohto problemu
 * existuju v Jave rozhrania.
 * 
 * Rozhrania sa podobaju abstraktnym triedam, rovnako ako oni urcuju metody, ktore musi
 * trieda implementujuca dane rozhranie prekryt.
 * Rozhrania na rozdiel nemozu mat ziadne premenne, metody s definiciou. Mozu mat vsak konstanty.
 * 
 * Kazda trieda moze implementovat viac ako len jedno rozhranie.
 * Rozhrania totiz nezpadaju do hierarchie dedicnosti.
 * 
 * Po vytvoreni rozhrania, sa da pouzit v triedach. Triedy pouzivaju rozhrania pomocou klucoveho
 * slova 'implements' namiesto 'extends'. Po pridani rozhrania do triedy je nutne prekryt vsetky
 * jeho metody, ktore deklaruje. Trieda moze implementovat viacero rozhrani. Staci jednoducho
 * za klucovym slovom 'implements' uviest zoznam rozhrani oddeleny ciarkou.
 * 
 * 
 * Rodicovske triedy mozu tiez implementovat nejake rozhranie. Tieto rozhrania spolu s ostatnymi
 * vlastnostami zdedia ich potomkovia.
 */
