package facade;

class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("read " + lba);
        System.out.println("size " + size);

        return new byte[size];
    }
}