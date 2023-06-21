/* method declaration
<access modifier><optional specifier><return type><name>(<arguments>)<exception> {
    <message body>
}

** Access modifiers and optinal specifiers can exchange places

- Access MOdifiers - not mandatory, but all methods have one. 
    If nothing is mentioned default access is assigned.
    - Private - only class members can access
    - Default( package-private) - can only be access from classes in the same package
    - protected - can be accessed from classes in the same package and subclasses
    - public - can be access from anywhere,

- Optional Specifer 
    can be 0 or more, can be in any order
    - static - make method static
    - abstract - doesnt have abody, needs to be omplemented by subclasses
    -final - cant be orverridden by subclasses
    - synchronised - multithreaded code
    - native - not needed
    - scriptfp - not needed

- Return type - every method has to have a return type ( except constructors)
    * the value returned by the method should match the return type.
    - void if the method returns nothing, or empty return;
    - datatype of output
    - can be a primitive, class, custom class, interface etc.

- Method name follows sam erules as variable name

- arguments zero or more, 
    - can be varargs.
    - if a method has varargs arguments, they must be the last argument in the list
    - you cna pass an array as actual real argument to the method
    - you can explicitly pass null
    - if nothing is given, its an empty array - 
    inside the method, using varargs is just like using an array
- exection - needed to specify what kind of exceptions can a method throw , if any.
- body - needed except in ase of abstract methods.

-- STATIC
    - static members are shared among all instances of a class
    - hence they dont need an instance 
    - static methods can access other static members
    - static members cant access other instance members without an instance
    - instance memebers can access all members , static or otherwise with or without reference variable
    - Koala k = null; k.staticMember will not throw NPE
    
- Constant variables in java
    - static final varialbes are constants - they never change duringa program
    - they must be initialised, and are never allowed to change

- static initializer block 
    static {
        used to initialise static variables
    }

- static imports 
    -used to import static members
    - wildcards are alowed same as normal imports
    - if two static members of different classes have same name , it will cause ambiguity
    - complier prioritises static members of current class over static imports
        * use ClassName.staticmember to resolve ambiguity
    

- PASS-BY-VALUE
    - java is pass by value , i.e. a copy of the vatiable is made and the method recievs the copy
    - assigment made in the method do not affect the caller.
    - in case of references of non primitive type, methods call on the argument can affect the caller variable

    - returning a value, - a copy of reference or primitive is returned.


-Overloading
    - java will try to be as speicific as possible
    - will look for same type
    - then primitive upsizing
    - then autoboxing
    - then varargs
    - java will only od one conversion
    - array of diff type work
    - same class with different generics dont work becasueof type erasure
    -

