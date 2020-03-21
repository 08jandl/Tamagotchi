public class Tamagotchi {
int x = 0;
int y = 0;
int futterstand = 3;

        public void gehen (String richtung,int schrittanzahl)
        {
            if (richtung.equals("rechts") && futterstand > 0 && futterstand >= schrittanzahl) {
                x = x + schrittanzahl;
            futterstand = futterstand - schrittanzahl;
            System.out.println("Meine Position ist x=" + x +" unf y=" +y + "und ich habe noch " + futterstand + " Futter.");}
            else if (richtung.equals("links") && futterstand > 0 && futterstand >= schrittanzahl) {
                x = x - schrittanzahl;
                futterstand = futterstand - schrittanzahl;
            System.out.println("Meine Position ist x=" + x +" unf y=" +y + "und ich habe noch " + futterstand + " Futter.");}
            else if (richtung.equals("oben") && futterstand > 0 && futterstand >= schrittanzahl) {
                y = y + schrittanzahl;
                futterstand = futterstand - schrittanzahl;
            System.out.println("Meine Position ist x=" + x +" unf y=" +y + "und ich habe noch " + futterstand + " Futter.");}
            else if (richtung.equals("unten") && futterstand > 0 && futterstand >= schrittanzahl) {
                y = y - schrittanzahl;
                futterstand = futterstand - schrittanzahl;
            System.out.println("Meine Position ist x=" + x +" unf y=" +y + "und ich habe noch " + futterstand + " Futter.");}
            else {
                System.out.println("Bitte Futterstand überprüfen!");
            }

        }
        public void fuettern (int futter){
            futterstand = futterstand + futter;
        }
}
