public class StringDriver {


    public static void main(String ...args) {

    /*
    String is the only class that can be initialised without a new keyword
    both are subtly different
    */
    String s1 = new String("Prateek"); // creates object in heap
    String s2 = "Delhi"; // creates literal in string pool and returns refernce


    /**Concatination :
        - s1 + s2 :
        if both are numbers then do addition else, concatination
        s1.concatinate(s2) = s1 + s2
        s2.concatinate(s1) = s2 + s1 */

    System.out.println(s1 + s2);
    System.out.println(s1 + s2 + 3 + 4);
    

    /**
    Immutability:
        Cannot change after after creation
        you can operate on string variables
        all the methods create a new string in string pool and return the refernce to that new string
        Immutable classes deifned in ajva are also final  
    */ 

    System.out.println(s1.concat(s2));
    System.out.println(s1);


    // S.length() - returns numbers of character in an array
    System.out.println("length " + s1.length());  
    
    //S.charAt() returns character at index
    System.out.println("s1 charAt 3" + s1.charAt(3)); 
    // System.out.println("s1 charAt 3" + s1.charAt(-1)); index out of bounds 
    //System.out.println("s1 charAt 3" + s1.charAt(7)); index out of bounds

    /*int indexOf(int ch) returns first appearance of char ch
    int indexOf(String s) returns starting index of first appearance of string S
    also a second argument of staring index*/
    System.out.println("indexOf e " + s1.indexOf('e')); 
    System.out.println("indexOf tee " + s1.indexOf("tee")); 

    //substring(startIndex)
    //substring(startindex, endIndex) = [startindex, endIndex) , exception if( endIndex > length)
     System.out.println("substirng: " + s1.substring (3,7));

     //toUpperCase, toLowerCase
     //equals() and equalsIgnoreCase()
     //boolean startWith(String)
     //boolean endsWith(String)

     //replace(char, char)
     //replace(charSequence, charSequence)
     System.out.println("replace " + s1.replace("z", "x"));

     //contains(char)

     /**
     s.trim() removes both start and end
     s.strip() same as string but supports unicode
     s.stripleading() strips only begining
     s.striptrailing string only end
     char that are removed: whitspace characters - "space", \n, \t, \r */

    /**---------
    Stringbuilder
        - new StringBuilder() - creates empty charsequence
        - new StringBuilder(String) - intialies the sequence to value of string
        - new StringBuilder(int) - specifies to start with a char sequence of this size
    */
    StringBuilder a = new StringBuilder(5);
    a.append("12345-");
    a.append("123-");
    a.append(1);
    a.append("-");
    a.append(1.01f);
    a.append("-");
    a.append('c');
    a.append("-");
    a.append(true);
    a.append("-");
    a.substring(1,2);

    System.out.println("a.subs: " + a.substring(1,2));
    System.out.println(a);

    //insert(index,string)
    a.insert(3,'-');
    System.out.println(a);
    a.delete(4,6);
    System.out.println(a);
    a.deleteCharAt(4);
    System.out.println(a);

    a.replace(4,7, "ab"); 
    System.out.println(a);
    a.reverse();
    System.out.println(a);
    a.reverse();
    String s = a.toString();
    s.concat("123");
    System.out.println(s);
    

    /**
    Equality
        == checks reference equality
        .equals() checks refernce equality by default
        But String overrides the method to check if the 2 string contains same chars in same order
     */

     String x = "ab".concat("c");
     String y = "de";
     String z = "ab".concat("c");

    System.out.println("x == y : " + ( x == y));
    System.out.println("x == z : " + ( x == z));
    System.out.println("x.equals(z) : " + (x.equals(z)));
    System.out.println("x.equals(y) : " + (x.equals(y)));

    /**
    String pool : 
    Java stores all string literal and compile time constants in the Atring pool to avoid repetition 
    Thats why if 21 string objects are initalised to the same literal/constant, == returns true
    but all Strings created by a method call are not stored in string pool.
     */

     String a1 = "abc";
     String a2 = "abc";
     String a3 = "ab".concat("c");
     String a4 = "ab".concat("c").intern();
    System.out.println("a1 == a2 : " + ( a1 == a2));
    System.out.println("a1 == a3 : " + ( a1 == a3));
    System.out.println("a1 == a4 : " + ( a1 == a4));

    /**
    String s = "asd" creates a literal in string pool and s points to that memory
    String s = new String("asd") creates a object in heap */

    String b1 = "asd";
    String b2 = new String("asd");
    String b3 = new String("asd").intern();
    System.out.println("b1 == b2 : " + ( b1 == b2));
    System.out.println("b1 == b3 : " + ( b1 == b3));

    /**intern() methods returns the Stringpool memory reference for the object
        - it looks for the literal equivalent of the string oject in the pool and returns the reference if present
        - if not present, it creates a literal in the pool and returns the reference
    */
    String c1 = new String("asd").intern();
    String c2 = new String("asd").intern();
    System.out.println("c1 == c2 : " + ( c1 == c2));
    
    }
}