public class TamagotchiApp {

public static void main (String[] args) {
    Tamagotchi anneliese = new Tamagotchi();
    anneliese.x= 6;
    anneliese.y= 4;
    anneliese.futterstand= 5;

    anneliese.gehen("links", 5);
    anneliese.fuettern(5);
    anneliese.gehen("links", 1);
    anneliese.gehen("unten", 4);


}
}
