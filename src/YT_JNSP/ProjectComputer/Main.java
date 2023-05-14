package YT_JNSP.ProjectComputer;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------- Computer -----------------");
        Display display1 = new Display();
        System.out.println(display1.getRes());
        display1.setMinRes();
        System.out.println(display1.getRes());
        display1.setMaxRes();
        System.out.println(display1.getRes());
    }
}
