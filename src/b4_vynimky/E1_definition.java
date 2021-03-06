package b4_vynimky;
/*
 * Medzi velmi prepracovane bezpecnostne mechanizmy tohto jazyka patri aj system vynimiek.
 * Za vynimky sa daju povazovat rozne chybove stavy programu, nepodarene operacie, nepredvidatelne
 * situacie, ci iba situacie, ktore nie su podla programatora pri behu programu ziaduce.
 * 
 * Pri pouziti konstrukcii, pri ktorych sa moze vyskytnut niektora z vynimiek povazovanych za
 * dolezite, prekladac ohlasi chybu, pokial nie su tieto vynimky patricne osetrene.
 * 
 * System vynimiek je zalozeny na prepracovanej hierarchii dedenia. Zakladom vsetkych chybovych
 * stavov je trieda 'Throwable'. Od tejto triedy su potom odvodene tri zakladne kategorie vynimiek.
 * 
 * Trieda 'Error' :
 * 
 * 					Vynimky odvodene od triedy Error predstavuju najzavaznejsi typ chyby, ktora
 * 					moze v programe nastat. Vo vacsine pripadov nie je mozne ani ziaduce tieto 
 * 					vynimky nejako osetrit.
 * 					Medzi tieto vynimky patri napriklad nedostatok pamati, nenajdenie potrebnych
 * 					tried pri nacitani programu a podobne.
 * 
 * 
 * Trieda 'RuntimeException' :
 * 
 * 					Aj ked je tato trieda potomkom triedy 'Exception' jej vynimky nie je nutne
 * 					v programe osetrovat. Vznikaju za behu programu a mozu vzniknut prakticky
 * 					kdekolvek a casto je vhodne ich aspon v pripadoch, kde pravdepodobne mozu
 * 					vzniknut, osetrovat.
 * 					Prikladom takejto vynimky je napriklad delenie nulou.
 * 
 * 
 * Trieda 'Exception' :
 * 
 * 					Tieto vynimky sa oznacuju aj ako kontrolovane. Pretoze ich prekladac pred
 * 					kompilaciou striktne kontroluje. Nevyskytuju sa kdekolvek, ale u vopred	
 * 					vytipovanych metod, pri ktorych je pravdepodobnost vyskytu chyby vyssia nez inde.
 * 					Vo vacsine pripadov uz nie je potom problem sa s takouto vynimkou vysporiadat.
 * 					Typickym miestom vyskytu tohto typu vynimiek su miesta vstupu a vystupu programu
 * 					alebo prace so subormi, databazou, vlaknami a roznymi dalsimi spojeniami.									
 */