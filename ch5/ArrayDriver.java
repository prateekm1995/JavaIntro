import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayDriver {
    public static void main(String[] args) {

        /**
        Arrays
            sequence of type
         */

         int[] a = new int[3];
        //  int b[] = new int[]; - fails because dimension is missing
        int[] b = new int[] { 1,2 };
        int[] c = { 1,2 };
        int[] d,e; // both arrays
        int f[], g; // f array, g int
        System.out.println(Arrays.toString(b));

        String[] a1 = {"Car", "Bus"};
        String[] a2 = a1;
        System.out.println("a2 == a1 " + (a2== a1));
        System.out.println("a2[0] == a1 " + (a2[0]== a1[0]));
        System.out.println("a2[1] == a1 " + (a2[1] == a1[1]));
        System.out.println("a1.equals(a2) " + (a1.equals(a2)));
        a2[1] = "train";
        System.out.println("a2 == a1 " + (a2== a1));
        System.out.println("a2[0] == a1 " + (a2[0]== a1[0]));
        System.out.println("a2[1] == a1 " + (a2[1] == a1[1]));
        System.out.println("a1: "+Arrays.toString(a1));
        System.out.println("a2: "+Arrays.toString(a2));


    /**
    a1 is a variable that contains reference of type String[] which contains refernce to the array
    a[0] , a[1] etc are reference to String objects
    when a2 is assigned a1  , it gets the same reference String[] so both are operating on the same array*/

        System.out.println("a1.length " + a1.length);

        //Sorting arrays - Arrays.sort(Array), Arrays.sort(array, comparator)
        /* binarysearch retuens index of occurance
           returns (-idx -1) : where idx is where the serached onject should have been
           works only for sorted, for unsorted result is unpredictable; 

        //Arrays.cpmpare()
        /**
        to compare arrays/Strings traverse from start to end, and return the result of first difference
        - null is smallest
        -numbers order mathmatical comparison
        -for chars numers < uppercase < lowercase */
        System.out.println("Compare()");
        System.out.println(Arrays.compare(new int[]{1,2}, new int[]{1,2}));
        System.out.println(Arrays.compare(new int[]{1,2}, new int[]{1,2,3}));
        System.out.println(Arrays.compare(new int[]{1,2,3}, new int[]{1,2}));
        System.out.println(Arrays.compare(new int[]{1,1}, new int[]{1,2,3}));

        // mismatch() returns the fist index where there is a difference , -1 if same
        System.out.println("Mismatch()");
        System.out.println(Arrays.mismatch(new int[]{1,2}, new int[]{1,2}));
        System.out.println(Arrays.mismatch(new int[]{1,2}, new int[]{1,2,3}));
        System.out.println(Arrays.mismatch(new int[]{1,2,3}, new int[]{1,2}));
        
        String[][] r1;
        String [][] r2 = new String[3][2];       
        //String [][] r3 = new String[][]; illegal       
        String [][] r3 = new String[3][];   
        // legal - this tells how many string[] will be there - we still need to initaliase the 
        //string arrays . Right now it a 3 String[], all null

        //String [][] r4 = new String[][4];   ILLEGAL

        //ARRAYLIST - if you dont specify class int <> it is assumed to be Object - hetrogenous array

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(10);
        ArrayList list3 = new ArrayList<>();
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        // list.add(element) - returns boolean(always true, need for other collections)
        list1.add("asd");
        System.out.println(list1);
        
        //list.add(index, element);
        list2.add(0, Integer.valueOf("1"));
        list2.add(0, Integer.valueOf("2"));
        list2.add(0, Integer.valueOf("1"));
        //list2.add(2, Integer.valueOf("2")); IOBexpection if idx > size
        System.out.println(list2);

        // remove(Object) - true if removed, removes the fist occurance
        System.out.println(list2.remove(Integer.valueOf("1")));
        System.out.println(list2);

        //remove(int index) - removes if index is valid, returns removed object, IOBE if invalid index
        System.out.println(list2.remove(1));
        System.out.println(list2);

        //set(index, object) returns element that got replaced, only replaces doesnt add
        System.out.println(list1.set(0, "bcd"));
        System.out.println(list1);
        
        //isEmpty(), size()
        //clear() - removes all objects , size =0
		//EQUALS  = cehcks values and order and size

		/**Wrapper classes
            -are also immutable and do pooling/caching like String
            - there is a constructor , but for pooling , use valueOf() method
            - intValue() to get primitive
            - Wrapper.valueOf(String) to get Wrapper
            - Wrapper.parsePrimitive(String to get primitive)
        */
        System.out.println(Double.parseDouble("1f"));
        System.out.println(Double.valueOf("1f"));

        /**
        Also be careful when autoboxing into Integer. What do you think this code outputs?

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers);
         */


        /**Conversions
            ArrayList to Array
            Arraylist.toArray() generates Object[]
            ArrayList.toArray(new Type[0]) - generates Type[] of size exactly as arrayList. you can mention size larger than arraylist.size()
            - its a copy
        */

        System.out.println("List to Array");
        String[] str = list1.toArray(new String[0]);
        System.out.println(Arrays.toString(str));
        list1.set(0, "abc");
        System.out.println(list1);
        System.out.println(Arrays.toString(str));

        /**Array to List
            1.Array.asList()
                - creates a backed list - List created is fixed sized and linked to array, ie changes done in one are avaliable in another. 
                  cant reduce or increase size of either            
         */
        System.out.println("array to list");
        System.out.println(Arrays.toString(a1));
        List<String> newList = Arrays.asList(a1);
        a1[0] = "Donkey";
        System.out.println(newList);
        newList.set(1, "Monkey");
        System.out.println(Arrays.toString(a1));
        //newList.add("car"); exception
        // newList.remove(1); exception

        /**Array to List
            2.List.Of()
                - immutable list           
         */

         List<String> x = List.of(a1);
         x = new ArrayList<>(x);

         
        


        
		



    }

}