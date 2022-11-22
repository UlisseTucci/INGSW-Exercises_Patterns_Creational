package it.unical;

/*
 * La 'GUIFactory' corrisponde alla 'AbstractFactory' la quale fornisce un'interfaccia per la crezione di prodotti di diversi tipi.
 */

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();
}
