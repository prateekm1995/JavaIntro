public interface Run {
    default int getSpeed(){return multiply(5*2);}
    default String getName() {
        return "RUN";
    }

    static int multiply(int speed) {
        return speed*2;
    }
}