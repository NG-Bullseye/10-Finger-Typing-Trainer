import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Starter {

    List<Character> letters;
    List<Character> basicZeichen;
    List<Character> advancedZeichen;

    public Starter() {
        this.letters =new ArrayList<>();
        letters.add('q');
        letters.add('w');
        letters.add('e');
        letters.add('r');
        letters.add('t');
        letters.add('z');
        letters.add('u');
        letters.add('i');
        letters.add('o');
        letters.add('p');
        letters.add('a');
        letters.add('s');
        letters.add('d');
        letters.add('f');
        letters.add('g');
        letters.add('h');
        letters.add('j');
        letters.add('k');
        letters.add('l');
        letters.add('ö');
        letters.add('ä');
        letters.add('y');
        letters.add('x');
        letters.add('c');
        letters.add('v');
        letters.add('b');
        letters.add('n');
        letters.add('m');

        this.basicZeichen =new ArrayList<>();
        basicZeichen.add('.');
        basicZeichen.add(' ');
        basicZeichen.add(',');
        basicZeichen.add('!');
        basicZeichen.add('?');
        basicZeichen.add('(');
        basicZeichen.add(')');

        this.advancedZeichen= new ArrayList<>();
        advancedZeichen.add('=');
        advancedZeichen.add('+');
        advancedZeichen.add('*');
        advancedZeichen.add('#');
        advancedZeichen.add(';');

        Scanner s=new Scanner(System.in);
        Random r=new Random();
        int rnumber = 0;

        System.out.println("gib eine der folgenden Trainingsnummer ein:");
        System.out.println("1 standardHaltung jklö");
        System.out.println("2 standardHaltung asdf");
        System.out.println("3 standardHaltung asdf und jklö");
        System.out.println("4 oberenVierDerStandardHaltung uiop");
        System.out.println("5 oberenVierDerStandardHaltung qwer");
        System.out.println("6 oberenVierDerStandardHaltung qwer uiop");

        boolean validInput=false;

        while(!validInput){
            String input=s.next();
            switch(input) {
                case "1":{
                    standardHaltungjklö();
                    validInput=true;
                    break;
                }
                case "2":{standardHaltungasdf();
                    validInput=true;
                    break;
                }
                case "3":{
                    standardHaltung();
                    validInput=true;
                    break;
                }
                case "4":{
                    oberenVierDerStandardHaltunguiop();
                    validInput=true;
                    break;
                }
                case "5":{
                    oberenVierDerStandardHaltungqwer();
                    validInput=true;
                    break;
                }
                case "6":{

                    oberenVierDerStandardHaltung();
                    validInput=true;
                    break;
                }
            }

        }


        for (int i=0; true; i++) {
            String a="";
            for (int k=0; k<5; k++) {
                rnumber = r.nextInt(letters.size());
                a=a+ letters.get(rnumber);
            }

            System.out.println(a );
            s.next();

            System.out.println(a );
            s.next();

            System.out.println(a );
            s.next();

            System.out.println(a );
            s.next();

            System.out.println(a );
            s.next();
        }

    }

    private void standardHaltung() {
        this.letters= new ArrayList<>();
        letters.add('a');
        letters.add('s');
        letters.add('d');
        letters.add('f');

        letters.add('j');
        letters.add('k');
        letters.add('l');
        letters.add('ö');
    }

    private void oberenVierDerStandardHaltung() {
        this.letters= new ArrayList<>();
        letters.add('q');
        letters.add('w');
        letters.add('e');
        letters.add('r');

        letters.add('u');
        letters.add('i');
        letters.add('o');
        letters.add('p');
    }






    private void standardHaltungasdf() {
        this.letters= new ArrayList<>();
        letters.add('a');
        letters.add('s');
        letters.add('d');
        letters.add('f'); }
    private void standardHaltungjklö() {
        letters.add('j');
        letters.add('k');
        letters.add('l');
        letters.add('ö');
    }

    private void oberenVierDerStandardHaltungqwer() {
        this.letters= new ArrayList<>();
        letters.add('q');
        letters.add('w');
        letters.add('e');
        letters.add('r');
    }
    private void oberenVierDerStandardHaltunguiop() {
        letters.add('u');
        letters.add('i');
        letters.add('o');
        letters.add('p');
    }











    private void unterenVierDerStandardHaltung() {
        this.letters= new ArrayList<>();

        letters.add('y');
        letters.add('x');
        letters.add('c');
        letters.add('v');
        letters.add('m');
        letters.add(',');
        letters.add('.');
        letters.add('=');
    }





    private void onlyZeigeFinger() {
        this.letters= new ArrayList<>();
        letters.add('r');
        letters.add('t');
        letters.add('f');
        letters.add('g');
        letters.add('v');
        letters.add('b');

        letters.add('z');
        letters.add('u');
        letters.add('h');
        letters.add('j');
        letters.add('n');
        letters.add('m');
    }


    public static void main(String[] args) {
        Starter starter=new Starter();
    }

}
