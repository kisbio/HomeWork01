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


        //Negyedik feladat:
        //Celsius:
        int celsius = 10;
        //Fahrenheit:
        int fahrenheit = 70;
        // számolás
        double fahrenheitben = celsius*9/5+32;
        double celsiusban = (fahrenheit-32)*5/9;
        //   kiírás
        System.out.println("10 celsius = " + fahrenheitben + " fahrenheit");
        System.out.println("70 fahrenheit = " + celsiusban + " celsius");



        // ötödik feladat
        // A sorok közé be kell írni a \n-t hogy más sorba kerüljön
        System.out.println("************\n* Hello \t*\n* World \t*\n* in    \t*\n* a     \t*\n* frame \t*\n************");

    }
}