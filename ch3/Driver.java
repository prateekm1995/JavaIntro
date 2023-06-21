
public class Driver {
    /*
    1. unary oprator !, -
    2. pre and post inc/dec operator
       pre, first value applied then return
       post, first return then value apply
    */
    public static void main(String args[]) {
    int lion = 3;
    int tiger = ++lion / lion--;
    System.out.println(tiger);
    tiger = --lion / lion++;
    System.out.println(tiger);

    /*
        arithematic / * % -> + -
        if same precedence thge left to right
    */
    int price = 2 * ((5 + 3) * 4 - 8);
    System.out.println(price);

    /* type promotion
        1. if 2 operand have diff type, both are promoted to bigger type, result is bigger type
        2. integer type is promoted to floating decimal type
        3. char, byt, short are promoted to int first, (except for unary operator)
        4. result is the highest level
    */

    System.out.println( 3L + 2.0f);

    /*
    Casting
        needed when assigning large type to smaller type
        for intergral value - over/underflow is handled by wrapping around
        for float to int - remove after decimal
    
    Equality
        numerical promotion
        boolean
        references
    
    instanceof
        Returns true if the reference that a points to is an instance of a class, subclass, or class that implements a particular interface, as named in b
        return false for null always
    logical, short circuit and ternary
    */

    }
    
}