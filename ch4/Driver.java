/* switch
    - int, byte, short, char, Enum, String, var
    - case values : compile time constant, literals, enum
    - default can be anywhere, only executed if no case matches
    - once a condition is satisfied, all the cases are executed till a break; is found
    - numeric promotion is allowed

   Enhanced for-each
    - valid for java array
    - valid for object that extends iterable
    - objects that implement or extend Collection interface
    - not for String, Map StringBuilder

*/

public class Driver {
    public static void main(String[] args) {
        int [][] myArray = {{1,2,3,4}, {5,6,7,8} ,{4,3,2,1}, {8,7,6,5}};

        for(int[] subArray : myArray ) {
            for(int num : subArray) {
                System.out.println(num);
            }
        }
    }
}