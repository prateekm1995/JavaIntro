import java.util.*;
public class Driver {
    public static void main(String ...args) {

        System.out.println(Seasons.SUMMER);
        System.out.println(Seasons.SUMMER.name() instanceof String);
        System.out.println(Seasons.SUMMER instanceof Seasons);
        System.out.println(Seasons.valueOf("WINTER"));
        //System.out.println(Seasons.valueOf("timter")); exception
        for(Seasons season : Seasons.values()) {
            System.out.println(season.name() + season.getIndex());
        }

        Outer outer = new Outer();
        outer.callInner();
        System.out.println("----------");
        Outer.Inner inner = new Outer().new Inner();
        inner.go();
        System.out.println("----------Static inner");

        Enclosing.Nested nested = new Enclosing.Nested();
        System.out.println(nested.getPrice());

        System.out.println("----------Local");
        NestedLocal  nestedLocal = new NestedLocal(Integer.parseInt(args[0]));
        nestedLocal.printxy();
    }
}