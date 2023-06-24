import java.util.ArrayList;

/**
1. COnstructor : special method used to create a new object
    - No return type
    - same name as class 

2. Instance initializer: braces that occur outside method defitnition
   first fields and instance initializer are executed in order of occurance 
   then the constructor is called     
 

 3. Primitives : 8
    boolean(1), byte(8 singed), short(16 signed), int(32 signed), 
    long(64 signed), float(32 signed), double(64 signed), char(16, 16 bit unicode - unsigned)
    char and short are related 
    short range [-2^15, 2^15 - 1]
    char range [0, 2^16-1]

4. literals
    123345 - int , base 10
    123456L - long
    0123 - octal
    0Xff - hexa
    0b - binary
    123345.5f  float
    123345.5 double

    can add undersocre anywhere for readability except ends, and next to decimals

5. Primitives hold value at the allocated memory
    Refeerences hold value of adress at which Object is stored in memory
    references :
      - have methods
      - can store null
      - begin wit Caps class name

6. Variables
    can star with char, $, _
    can have number expect start
    cant use reserve word
    cant be single underscore(_)

7. local variable need to be initalized beofre use
    instance variable( unique for all instances - non static feild of class) 
    and class variable( common for all instances - static fields) 
    are always given default value at declaration

8. var
    A var is used as a local variable in a constructor, method, or initializer block.
    A var cannot be used in constructor parameters, method parameters, instance variables, or class variables.
    A var is always initialized on the same line (or statement) where it is declared.
    The value of a var can change, but the type cannot.
    A var cannot be initialized with a null value without a type.
    A var is not permitted in a multiple-variable declaration.
    A var is a reserved type name but not a reserved word, meaning it can be used as an identifier except as a class, interface, or enum name.
 */

public class Driver {
    public static void main(String args[]) {
        Park p = new Park();

        System.out.println("\nInteger");
        int a = 123345;
        System.out.println(a);
        //a = 12345L; - error: incompatible types: possible lossy conversion from long to int
        a = 010;
        System.out.println(a);
        a = 0Xf;
        System.out.println(a);
        a = 0b111;
        System.out.println(a);
        a = 123;
        System.out.println(a);
        a = 'A';
        System.out.println(a);

        

        System.out.println("\nLong");
        long b = 123L;      
        System.out.println(b);      
        b = 123;        
        System.out.println(b);      
        b=010L;     
        System.out.println(b);      
        b = 0XFL;
        System.out.println(b);
        b = 0b111L;
        System.out.println(b);
        b=010;
        System.out.println(b);
        b = 0XF;
        System.out.println(b);
        b = 0b111;
        System.out.println(b);
        b = 0b111;
        System.out.println(b);
        b = 'B';
        System.out.println(b);

        System.out.println("\nFloat");
        Float c = 123f;
        System.out.println(c);
        //c= 234; error
        System.out.println(c);
        //c = 345L; error
        System.out.println(c);
         //c = 0b111;
        System.out.println(c);
        System.out.println(c);
        System.out.println(c);
        
        char e = 'a';
        System.out.println(e);

    }
}

