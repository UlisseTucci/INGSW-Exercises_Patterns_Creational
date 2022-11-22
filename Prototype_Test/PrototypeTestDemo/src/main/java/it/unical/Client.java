package it.unical;

import java.util.ArrayList;
import java.util.List;

public class Client
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World Prototype Demo!" );

        Circle circle1 = new Circle();
        circle1.x = 10;
        circle1.y = 20;
        circle1.raggio = 15;
        circle1.color = "red";

        Circle circle2 = (Circle) circle1.clone();
    }
}
