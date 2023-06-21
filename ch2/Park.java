

public class Park {
    String name = "Goodison"; // this is legal
    String address;

    {System.out.println("Inside instance initializer");} // instance initializer

    public Park() {
        this.address = "Liverpool";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setaddress(String address) {
        this.address = address;

    }
}