package n1_genericke_typy;
/*
 * V sucasnej dobe su genericke typy integrovanou sucastou programovania v Jave a preto
 * je dobra znalost tejto dolezitej funkcie nevyhnutna.
 * Vdaka pouzivaniu generickych typov je mozne vytvarat triedy, rozhrania a metody,
 * ktore budu fungovat typovo bezpecnym sposobom, pricom ale budu schopne pracovat
 * s roznymi druhmi dat.
 * Logika mnohych algoritmov je totiz rovnaka bez ohladu na to, aky typ dat je s nimi
 * spracovavany.
 * Vdaka generickym typom mozeme algoritmus definovat len raz, nezavisle na akomkolvek
 * typu dat, a potom tento algoritmus pouzit pre spracovanie sirokej skaly datovych
 * typov bez vynalozenia akehokolvek dodatocneho usilia.
 * 
 * Pojmom kolekcia sa oznacuje skupina objektov. Collections Framework potom definuje
 * niekolko tried (napr. zoznamy, mapy..) umoznujucich pracu s kolekciami.
 * Triedy pre pracu s kolekciami boli vzdy schopne pracovat s objektmi lubovolneho typu.
 * 
 * 
 * 
 * V zasade sa da povedat, ze pojem genericke typy znamena parametrizovane typy.
 * Parametrizovane typy su dolezite preto, ze nam umoznuju vytvarat triedy, rozhrania
 * a metody pri ktorych je typ dat, s ktorymi maju pracovat predavany formou parametru.
 * Vdaka generickym typom je mozne vyvorit napriklad jendu triedu, ktora bude automaticky
 * pracovat s roznymi typmi dat. Trieda, rozhranie, ci metoda pracujuca s parametrizovanym
 * typom sa nazyvaju generickymi.
 * 
 * Prave genericke typy priniesli so sebou chybajucu typovu bezpecnost. V pripade pouzitia
 * generickych typov su vsetky prevody typov automaticke a implicitne.
 * To znamena, ze genericke typy taktiez rozsirili nase moznosti pre opakovane vyuzivanie
 * kodu.
 */

