package facade;

class App {
    public static void main(String[] args) {
        Computer facade = new Computer();
        facade.startComputer();
    }
}