package facade;

import java.util.Arrays;

class Memory {
    public void load(long position, byte[] data) {
        System.out.println("load " + position);
        System.out.println("data = " + Arrays.toString(data));
    }
}