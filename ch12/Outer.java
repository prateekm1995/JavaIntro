public class Outer {
    private String greeting = "Hi";
    
     class Inner {
       public int repeat = 3;
       private String greeting = "yo" ;
       public void go() {
          for (int i = 0; i < repeat; i++)
             System.out.println(greeting + this.greeting + Outer.this.greeting);
       }
    }
    
    public void callInner() {
       Inner inner = new Inner();
       inner.go();
    }

    public static void main(String ...args) {
        Outer outer = new Outer();
        outer.callInner();
    }
 }