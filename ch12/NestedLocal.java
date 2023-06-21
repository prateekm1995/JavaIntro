public class NestedLocal {
    private int y ;
    public NestedLocal(){}
    public NestedLocal(int y) {this.y = y;}

    public void printxy() {
        int x = 3;
        class LocalClass {
            public void multiple() {
                System.out.println(x*y);
            }
        }
        LocalClass  local = new LocalClass();
        local.multiple();
    }

    public Object printxyz() {
        int x = 3;
        class LocalClass {
            public void multiple() {
                System.out.println(x*y);
            }
        }
        LocalClass  local = new LocalClass();
        local.multiple();
        return local;
    }
}