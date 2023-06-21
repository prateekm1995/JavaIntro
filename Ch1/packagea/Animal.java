/**
1. javac Animal.java
    complies a bytcode file from it called Animal.class
    options:
    -d : directory to place the class file
    -cp, -classpath, --class-path: search for classes, jars needed

2. java Animal
    runs the program from Animal class
    needs psv main in the public class with same name as file

    -cp, -classpath, --class-path : locates the classes needed to run the program

3. jar 
   create a jar from the classes
   options:
    -c , --create : create a jar
    -v, --verbose : print logs
    -f, --file : anme of the jar file
    --release : give version to build
    -C <location> <...java files> : directory contained classes for jar

4. java.lang doesnt need to be imported
5. java, javax come in JDK
6. PIC
7. package ambiguity rules
    if same class name in 2 packages - specify 1 import ,and specify other class\\\specify both class
8. java Animal.class
    compile and run in memory
    only valid if import and from JDK
    and single file code
 */
package packagea;

import java.util.*;
import java.sql.Date;
import packageb.AnimalB;

public class Animal {
     public static void main(String args[]) {
        java.util.Date data = new java.util.Date();
        Date date ;
        System.out.println("packageA->Animal");
        AnimalB animalB = new AnimalB();
        animalB.print();
    }
}