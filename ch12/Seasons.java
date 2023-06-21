public enum Seasons {
    SUMMER{
        public String getIndex() {return "a";}
    },
    WINTER{
        public String getIndex() {return "b";}
    }, 
    SPRING{
        public String getIndex() {return "c";}
    },
    AUTUMN{
        public String getIndex() {return "d";}
    },
    SNOW{
        public String getIndex() {return "e";}
    };
    Seasons(){
        System.out.println("Constructing");
    }

    public abstract String getIndex();
}