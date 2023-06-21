/**
Lambdas are nameless methods that can be passed around like a variable
work with Interfaces with a abstract method( functional Interface)
java derives meaing from context

Syntax 
 arg -> arg.toString
 (arg) -> { return arg.toString() ;}

    -you can skip paranthesis fi there is only one parameter and type is not specified.
    - var can be used as type of parameter, but if var is used for one, it has to be used ofr all.
    -you can skip return and semicolon only if its a single line and {} are not there.
    -if braces are there - follow proper syntax
    -braces are mandatory for multiline

Functional Interface : 
    - Interface with one and only one abstract method
    - @FunctionalInterface - lets compiler throws an error if used incorrectly
    - the three Object methods -String toString(), int hashCode(), boolean equals(Object o)

    - Predicate java.util.function
        public Interface Predicate<T> {
            boolean test(T t);
        }
    - Consumer
        public Interface Consumer<T> {
            void accept(T t) ;
        }
    - Supplier 
        T get();
    -Comparator java.util
        int compare(T o1, T o2);

        lambdas can use parameters, local variables and also outside variables only if they are effectively final variables.

    


 */

 public class Driver {

    public static void main(String args[]) {
            Animal animal = new Animal();
    animal.name = "Tiger";
    System.out.println(animal.name);

    }

 }