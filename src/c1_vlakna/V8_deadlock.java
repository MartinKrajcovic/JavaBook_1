package c1_vlakna;
/*
 * Specialnym typom chyby, ktory sa vztahuje len k multitaskingu a ktoremu
 * sa musime vyhnut je tzv. uviaznutie (deadlock), ku ktoremu dochadza vtedy,
 * ked dve vlakna maju cyklycku zavislost na pare synchronizovanych objektov.
 * 
 * Uviaznutie je chyba, ktora sa ladi len velmi obtiazne a to predovsetkym
 * z dvoch dovodov: 
 * 					1. Tato chyba sa vyskytuje zriedka a to len vtedy, ked sa
 * 					   dve vlakna delia o procesorovy cas spravnym sposobom.
 * 					2. Tento problem moze zahrnat viac ako len dve vlakna a dva
 * 					   synchronizovane objekty.
 * 
 * Pokial sa nejaka aplikacia s vyuzitim multithreadingu obcasne blokuje, prva
 * vec, ktora by mala byt presetrena je prave uviaznutie (deadlock).
 */