package facade;

class Computer {
    private static final long BOOT_ADDRESS = 1;
    private static final long BOOT_SECTOR = 1;
    private static final int SECTOR_SIZE = 8;

    public void startComputer() {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();

        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}