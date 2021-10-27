import java.util.Scanner;

public class World{
    public static void run(String[] tab){
        //System.out.println("Zwierzak idzie do przodu");
        for(String elem:tab){
            switch(elem){
                case "f":
                    System.out.println("Zwierzak idzie do przodu");
                    break;
                case "b":
                    System.out.println("Zwierzak idzie do tyłu");
                    break;
                case "r":
                    System.out.println("Zwierzak skręca w prawo");
                    break;
                case "l":
                    System.out.println("Zwierzak skręca w lewo");
                    break;
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Program wystartował");
        //String[] testtab = {"f","f","r","l"};
        Scanner input = new Scanner(System.in);
        String inputSentence = input.next();
        String[] testtab = inputSentence.split(",");
        run(testtab);
        System.out.println("Program zakończył działanie");
    }
}