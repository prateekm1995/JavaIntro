public class CastingDriver {
       public static void main(String[] args) {

        Mammal mammal = new Herbivore();
        System.out.println(mammal.type);
        System.out.println(((Herbivore)mammal).type);
        //System.out.println(((Rhino)mammal).type); class cast exception - possible but valid
        //System.out.println(((Carnivore)mammal).type); class cast exception
        Herbivore herbivore = new Herbivore();
        //System.out.println(((Carnivore)herbivore).type); error - impossible

        mammal = new Rhino();        
        System.out.println(mammal.type);
        System.out.println(((Herbivore)mammal).type);
        System.out.println(((Rhino)mammal).type);
        System.out.println(herbivore instanceof Mammal);

        

   }
}