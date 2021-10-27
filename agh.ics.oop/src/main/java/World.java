import java.util.Scanner;

public class World{

    public static Direction[] convert(String[] Strtab){
        Direction[] Dirtab = new Direction[Strtab.length];

        for(int i=0;i<Strtab.length;i=i+1){
            if(Strtab[i].equals("f")){
                Dirtab[i] = Direction.FORWARD;
            }
            if(Strtab[i].equals("b")){
                Dirtab[i] = Direction.BACKWARD;
            }
            if(Strtab[i].equals("r")){
                Dirtab[i] = Direction.RIGHT;
            }
            if(Strtab[i].equals("l")){
                Dirtab[i] = Direction.LEFT;
            }
        }
        return Dirtab;
    }

    public static void run(Direction[] tab){
        //System.out.println("Zwierzak idzie do przodu");

        for(Direction elem:tab){
            /*switch(elem){
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
            }*/

            if(elem.equals(Direction.FORWARD)) {
                System.out.println("Zwierzak idzie do przodu");
            }
            if(elem.equals(Direction.BACKWARD)) {
                System.out.println("Zwierzak idzie do tyłu");
            }
            if(elem.equals(Direction.RIGHT)) {
                System.out.println("Zwierzak skręca w prawo");
            }
            if(elem.equals(Direction.LEFT)) {
                System.out.println("Zwierzak skręca w lewo");
            }

        }
    }


    public static void main(String[] args){
        System.out.println("Program wystartował");
        Scanner input = new Scanner(System.in);
        String inputSentence = input.next();
        String[] testtab = inputSentence.split(",");
        Direction[] newtab = convert(testtab);
        run(newtab);
        System.out.println("Program zakończył działanie");

        Vector2d position1 = new Vector2d(1,2);
        System.out.println(position1);
        Vector2d position2 = new Vector2d(-2,1);
        System.out.println(position2);
        System.out.println(position1.add(position2));

        MapDirection trytowork = MapDirection.EAST;
        System.out.println(trytowork.next());
        System.out.println(trytowork.previous());
        System.out.println(trytowork.toUnitVector());


    }
}
