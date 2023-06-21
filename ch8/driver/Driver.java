package driver;
/**
Inheritance process by which subclass automatically includes public and protected memers of the class
- inhertiance is transitive
- direct inheritance is the imediate child

- public and protected are automatically inhertied
- package-private are only inherited if child class is in same package
- private are not inherited

- java has single inhertiance and multi level inheritance
- java doesnt allow multiple inheritance by extension of cother classes
- final class : cant be extended

- all casse inherit from java.lang.Object - comoiler automatically adds the code

CLASS DEFINITION
- <access modifier><abstract or final> class <name> <extention> < implementation> {}

# Access modifiers
    - top level calss can only be 
        * public - can be access anywhere
        * package-private - can only be accessed from within the package
    - inner classes can be protected and private also

THIS REFERENCE
this is the reference variable used to reference the current instance of the class from whic hthe member is being called
 - this cann access all members and inheritied members;
 - this can be access form all non static members of the class like methods, constructors , instance initializers
 - this can be access from static methods and static initializers.

 SUPER reference
  -used to reference inheritied members
  -cant access members of current class
  -used to differentiate members with same name in superclass nad subclass
  - if to superclasses have same member - it will call the closest scope

CONSTRUCTORS
    - called when new instance is created
    - same name as class and no return type
    - constructor overloading multiple constructors with different signature
    - when "new" is called, it allocates memory to object, and then looks for constructor with appropriate signature
    - Default Constructor - No argument , no body
        - Generated only if class has 0 constructors defined

this()/super()
    - uswed to call a constructor from another constructor
    - has to be first line of constructor
    - cant be rcursive
    - can only be 1 this() in a constructor
    - first line of constructor is always super() or this() - if not explicit- compiler inserts super()

final fields
    - have to be initalised inline, initializer block, or the constructor
    - cant be assigned a value more than once
    - by the time construot finishes valu should be assigned

Order of initialization of class (class loading)
    -if there is a superclass intialize that class
    - initalize all static variables in line in order
    - compile all instatic initialziers blocks in order

Instance initialization
    - if there is a superclass, intitalize instance of superclass
    - process all instance variable declarations in order if ther appearance
    - proce all instance initializers in order of appearance 
    -process the constructor including this()

Method overriding
    - overriding method should have the same signature as that of the inherited method - otherwise it is overloading
    - the overriding method should atleast be as accesible as the inhertied method
    - the overriding method cant have new or broader checked exceptions that the inheritied method
    - the return type of the overriding method should ne the subtype if the return type of the inheritied method
        in case of generic return type, the generic paramter type should match the parent exactly, 
        and the class/interface should subtype or same as parent
    - overloading with generic type argumetns is possible only if the signature is exactly the same
    -private methods cant be overriden. they are redeclared, so no rules apply.

    - static method hiding - overriding static methods.
    - final methods cant be overridden
    - in static method or variable hiding, the type of reference used will decide which variable/method is used

POLYMORPHSIM
- A java object may be access by using a reference 
    - same type as the object
    - superclass of the object
    - Interface that the object implements, either directly or through superclass
    - once the object is assigned to a reference type , only the methods and variables available
      to that type are callable from the object without explicit cast.

    - type of object defines the properties available in ememory 
    - type of reference decides whic hproperteis are accessible to the program

Casting in polymorphism
    - if the target refence is supertype of current reference , casting is implicit
    -if the target reference is subtype of current reference, explicit cast is needed
    - compiler dissalows unrelated casts.
    - at runtime, invalid castt of a reference to an unrelated type  results in a classCastexception
        - the refence cannot be a subtype of the type of object. reference can only be , same type, superclass, interface implemented directly or superclass.

instanceof 
    -true if object is same or subtype of class
    -false object is supertype of class

Polymorhpism and method overriding.
    - overriding means canceling and creating new
    - so , an overridden method is same for all levles of heirarchy.
    - how to differnetiate, this, super

Polymorphism and field hiding, 
    -depends on the level of heriarchty where it is called, if not directly referenced by an object
    - depends on the reference type if directly accessed by a reference.







    
 */

import animal.bigcat.jaguar.*;
 public class Driver {
    public static void main(String ...args) {
        Jaguar jaguar = new Jaguar() ;
        jaguar.printDetails();

        BlackJaguar BlackJaguar = new BlackJaguar();
        BlackJaguar.printColor();
    }
 }

