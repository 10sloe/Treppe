import javakarol.*;

class Aufgabe
{
    // Attribute
    Welt welt;
    Roboter robo;

    // Konstruktor
    Aufgabe()
    {
        welt = new Welt("treppe.kdw");
        robo = new Roboter(welt);
    }

    void los()
    {
        robo.Schritt();
        robo.Schritt();
    }
}
