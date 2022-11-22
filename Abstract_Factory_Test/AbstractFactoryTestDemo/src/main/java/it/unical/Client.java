package it.unical;

public class Client
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World AbstractFactory Demo!" );

        // Creiamo una fabbrica di oggetti Windows e gli facciamo creare un bottone e una checkbox.
        System.out.println("*********************************** Windows ***********************************");
        GUIFactory factoryWindows = new WindowsFactory();
        Button button1 = factoryWindows.createButton();
        button1.paint();
        Checkbox checkbox1 = factoryWindows.createCheckbox();
        checkbox1.paint();

        // Creiamo una fabbrica di oggetti MacOS e gli facciamo creare un bottone e una checkbox.
        System.out.println("*********************************** MacOS ***********************************");
        GUIFactory factoryMacOS = new MacOSFactory();
        Button button2 = factoryMacOS.createButton();
        button2.paint();
        Checkbox checkbox2 = factoryMacOS.createCheckbox();
        checkbox2.paint();

        System.out.println( "Fine!" );
    }
}
