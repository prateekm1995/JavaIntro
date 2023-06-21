public class Cat implements Run, Walk {
    public int getSpeed(){
        return Run.super.getSpeed();
    }

    public String getName() {
        return (String)Walk.super.getName();
    }

    public static void main(String args[]) {
        System.out.println(new Cat().getSpeed());
        System.out.println(new Cat().getName());
        System.out.println(Run.multiply(3));

    }
}