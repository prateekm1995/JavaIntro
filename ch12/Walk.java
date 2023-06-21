public interface Walk{
    default int getSpeed() {return 5;}
    default CharSequence getName(){
        return "Walk";
    }
}