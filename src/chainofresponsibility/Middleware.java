package chainofresponsibility;

public abstract class Middleware {

    private Middleware next;


    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean doAction();

    protected boolean checkNext() {
        System.out.println("Middleware checkNext()");
        if (next == null) {
            System.out.println("Chain is over, success");
            return true;
        }
        return next.doAction();
    }
}
