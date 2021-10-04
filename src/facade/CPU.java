package facade;

class CPU {
    public void freeze() {
        System.out.println("freeze");
    }

    public void jump(long position) {
        System.out.println("jump to " + position);
    }

    public void execute() {
        System.out.println("execute");
    }
}




/* Façade */



/* Client */

