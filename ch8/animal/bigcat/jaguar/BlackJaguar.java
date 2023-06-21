package animal.bigcat.jaguar;

public class BlackJaguar extends Jaguar{ 
    private String color;
    public String name = "Black jaguar";
    public BlackJaguar() {
        this("red");
    }
    public BlackJaguar(String color) {
        this.color = color;
    }
    
    public void printColor() {
        System.out.println(color + size);
        //System.out.println(species); throws error becuase package private
        System.out.println(area); // works because package private
        //System.out.println(name); throws error becuase private
        System.out.println(name);
        System.out.println(super.name);        
    }
}