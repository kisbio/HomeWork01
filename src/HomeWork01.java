public class HomeWork01 {


    public static void main(String[] args) {
    //A téglalap oldalai:
            int x = 5;
            int y = 4;
    //A kerülete és a területe
            System.out.println("A kerület = " + 2 * (x + y));
            System.out.println("A terület = " + x * y);


            //Második feladat
        //Megadom a váéltozókat:
    int dl = 52;
    int ml = dl*100;
    int cl = dl * 10;
    double l = dl / 10;
    double hl = l / 100;
    //MEgadom, miket írjon ki.
    System.out.println(dl + " deciliter = " + ml + " mililiter");
    System.out.println(dl + " deciliter = " + cl + " centiliter");
    System.out.println(dl + " deciliter = " + l + " liter");
    System.out.println(dl + " deciliter = " + hl + " hektoliter");


    //Harmadik feladat
        //A sugár és a pi
        int r = 42;
        double pi = 3.14;
        //Az eredmány
        double volume = 4*r*r*r*pi/3;

        System.out.println("A gömb térfogata: " + volume);
    }
}