package Adapter;

public class Turista {
    public boolean receiveDirections(String dir) {
        if (dir == "Continue for two blocks and turn right.") {
            return true;
        } else {
            return false;
        }
    }
}