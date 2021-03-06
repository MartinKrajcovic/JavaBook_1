package k1_prikaz_assert;
/*
 * Prikaz 'assert' sa pouziva v priebehu vyvoja programov k vytvoreniu asercie,
 * co je podmienka, ktora by v dobe behu programu mala byt splnena.
 * Pokial vsak tato podmienka splnena nebude, bude vyvolana vynimka 'AssertionError'.
 * Asercie su velmi casto pouzivane v dobe testovania k overeniu toho, ci su splnene
 * nejake ocakavane podmienky. V pripade uvolneneho kodu sa asercie vacsinou nepouzivaju.
 * 
 * Klucove slovo 'assert' ma dve podoby:
 * 1.	assert podmienka;
 * 2.	assert podmienka : vyraz;
 * 
 * V druhej verzii prikazu znamena 'vyraz' hodnotu predavanu konstruktoru vynimky
 * 'AssertionError', tato hodnota je prevedena do formatu retazca a v pripade
 * neuspesnej asercie zobrazena.
 * 
 * Ak chceme povolit kontrolu asercii v dobe behu programu, musime pri spusteni
 * programu zadat volbu '-ea' pre JVM.
 * --> Pozri si assert run.JPG <--
 */
