import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Starter {

    private final boolean INTRO=true;

    private  int wortLänge=0;
    private int repetitionTime=0;
    List<Character> alphabet;
    List<Character> basicZeichen;
    List<Character> advancedZeichen;

    void newKeyBoardAdvancedSonderZeichenTraing(){
        basicZeichen.add('.');
        basicZeichen.add(' ');
        basicZeichen.add(',');
        basicZeichen.add('!');
        basicZeichen.add('?');
        basicZeichen.add('(');
        basicZeichen.add(')');
    }

    void newKeyBoardBasicSonderZeichenTraing(){
        basicZeichen.add('.');
        basicZeichen.add(' ');
        basicZeichen.add(',');
        basicZeichen.add('!');
        basicZeichen.add('?');
        basicZeichen.add('(');
        basicZeichen.add(')');
    }

    public Starter() throws IOException, InterruptedException {
        this.alphabet =new ArrayList<>();

        Scanner s=new Scanner(System.in);
        Random r=new Random();
        int rnumber = 0;
        if (INTRO)intro();

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Gib eine der folgenden Trainingsnummer ein");
        try{
            Thread.sleep(2000);
        }catch (Exception e){
        }
        System.out.println("oder schreib 'kombi' um mehrere Programme zu kombinieren");
        try{
            Thread.sleep(3000);
        }catch (Exception e){
        }
        System.out.println("1 standardHaltung jklö");
        System.out.println("2 oberenVierDerStandardHaltung uiop");
        System.out.println("3 standardHaltung asdf");
        System.out.println("4 oberenVierDerStandardHaltung qwer");
        System.out.println("5 unten links yxcv");
        System.out.println("6 unten rechts m,.-");
        System.out.println("7 linker Zeigefinger rtfgvb");
        System.out.println("8 rechter Zeigefinger zuhjnm");
        System.out.println("kombi");

        boolean validInput=false;
        boolean combination=false;
        boolean kombiDone=false;
        String auswahl="";
        String input;
        while((!validInput)||(!kombiDone&&combination)){
            if(combination){
                System.out.println("Ausgewählt: "+auswahl);
                input=s.next();
                if(input.equals("y")){
                    kombiDone = true;
                }
            }
            else input=s.next();
            switch(input) {
                case "1":{
                    standardHaltungjklö();
                    validInput=true;auswahl=auswahl+"1";
                   break;
                }
                case "2":{
                    oberenVierDerStandardHaltunguiop();
                    validInput=true;auswahl=auswahl+"2";
                    break;
                }
                case "3":{standardHaltungasdf();
                    validInput=true;auswahl=auswahl+"3";
                    break;
                }
                case "4":{
                    oberenVierDerStandardHaltungqwer();
                    validInput=true;auswahl=auswahl+"4";
                    break;
                }
                case "5":{
                    unterenLinkenVierDerStandardHaltung();
                    validInput=true;auswahl=auswahl+"5";
                    break;
                }
                case "6":{
                    unterenRechtenVierDerStandardHaltung();
                    validInput=true;auswahl=auswahl+"6";
                    break;
                }
                case "7":{
                    linkerZeigefinger();
                    validInput=true;auswahl=auswahl+"7";
                    break;
                }
                case "8":{
                    rechterZeigefinger();
                    validInput=true;auswahl=auswahl+"8";
                    break;
                }
                case"kombi":{
                    System.out.println("Mehrfachauswahl gestartet.");
                    System.out.println("Bestätigen mit der Eingabe 'y'");
                    combination=true;
                }

            }


        }

        System.out.println("Anzahl Siege für nächstes Wort");
        repetitionTime= s.nextInt();
        System.out.println("Gib ein wie lang ein wort sein soll.");
        wortLänge= s.nextInt();

        //main Loop
        for (int i=0; true; i++) {
            String a;
            rnumber = r.nextInt(alphabet.size());
            a=alphabet.get(rnumber).toString();

            //wort builder
            for (int k=1; wortLänge>k; k++) {
                rnumber = r.nextInt(alphabet.size());
               a=a+alphabet.get(rnumber);
            }

            //loops for set win streak
            for (int t=0;t<repetitionTime;) {
                System.out.println(t+" von "+repetitionTime);
                System.out.println(a);
                String st=s.next();
                if(a.equals(st))
                    t++;
                else{
                    System.out.println("Try again");
                    t=0;
                }

            }

        }

    }

    private void linkerZeigefinger() {
        alphabet.add('r');
        alphabet.add('f');
        alphabet.add('v');
        alphabet.add('t');
        alphabet.add('g');
        alphabet.add('b');
    }

    private void rechterZeigefinger(){
        alphabet.add('z');
        alphabet.add('h');
        alphabet.add('n');
        alphabet.add('u');
        alphabet.add('j');
        alphabet.add('m');
    }

    private void intro() {

        System.out.println("Das ist das 10 Finger typing training");
        try{
            Thread.sleep(2000);
        }catch (Exception e){
        }
        System.out.println("Nicht vergessen nicht auf die Finger zu schauen!");
        try{
            Thread.sleep(3000);
        }catch (Exception e){
        }
        System.out.println("Suche mit deinen Zeigefingern die Hügelchen auf den Tasten F und J");
        try{
            Thread.sleep(3000);
        }catch (Exception e){
        }
        System.out.println("nach jedem Tastendruck sollst du deine Finger blind in diese Position zurück führen");
        try{
            Thread.sleep(3000);
        }catch (Exception e){
        }}

    private void unterenLinkenVierDerStandardHaltung() {

        alphabet.add('y');
        alphabet.add('x');
        alphabet.add('c');
        alphabet.add('v');
    }
    private void unterenRechtenVierDerStandardHaltung() {

        alphabet.add('m');
        alphabet.add(',');
        alphabet.add('.');
        alphabet.add('-');
    }
    private void standardHaltung() {

        alphabet.add('a');
        alphabet.add('s');
        alphabet.add('d');
        alphabet.add('f');

        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('ö');
    }
    private void oberenAchtDerStandardHaltung() {

        alphabet.add('q');
        alphabet.add('w');
        alphabet.add('e');
        alphabet.add('r');

        alphabet.add('u');
        alphabet.add('i');
        alphabet.add('o');
        alphabet.add('p');
    }
    private void unterenAchtDerStandardHaltung() {

        alphabet.add('y');
        alphabet.add('x');
        alphabet.add('c');
        alphabet.add('v');

        alphabet.add('m');
        alphabet.add(',');
        alphabet.add('.');
        alphabet.add('-');
    }
    private void doppelZeigefingerTaining() {

        alphabet.add('r');
        alphabet.add('f');
        alphabet.add('v');
        alphabet.add('t');
        alphabet.add('g');
        alphabet.add('b');

        alphabet.add('z');
        alphabet.add('h');
        alphabet.add('n');
        alphabet.add('u');
        alphabet.add('j');
        alphabet.add('m');
    }
    private void standardHaltungasdf() {

        alphabet.add('a');
        alphabet.add('s');
        alphabet.add('d');
        alphabet.add('f'); }
    private void standardHaltungjklö() {

        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('ö');
    }

    private void oberenVierDerStandardHaltungqwer() {

        alphabet.add('q');
        alphabet.add('w');
        alphabet.add('e');
        alphabet.add('r');
    }
    private void oberenVierDerStandardHaltunguiop() {

        alphabet.add('u');
        alphabet.add('i');
        alphabet.add('o');
        alphabet.add('p');
    }











    private void unterenVierDerStandardHaltung() {


        alphabet.add('y');
        alphabet.add('x');
        alphabet.add('c');
        alphabet.add('v');
        alphabet.add('m');
        alphabet.add(',');
        alphabet.add('.');
        alphabet.add('=');
    }





    private void onlyZeigeFinger() {

        alphabet.add('r');
        alphabet.add('t');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('v');
        alphabet.add('b');

        alphabet.add('z');
        alphabet.add('u');
        alphabet.add('h');
        alphabet.add('j');
        alphabet.add('n');
        alphabet.add('m');
    }


    public static void main(String[] args) throws IOException, InterruptedException {

        Starter starter=new Starter();
    }

}
