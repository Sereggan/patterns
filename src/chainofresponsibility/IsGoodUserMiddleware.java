package chainofresponsibility;

public class IsGoodUserMiddleware extends Middleware {
    private final Boolean isGoodUser;

    public IsGoodUserMiddleware(Boolean isGoodUser) {
        this.isGoodUser = isGoodUser;
    }

    @Override
    public boolean doAction() {
        System.out.println("Start validation of User!");
        if (isGoodUser) {
            System.out.println("Good User!");
            return checkNext();
        } else {
            System.out.println("Bad User!");
            return false;
        }
    }
}
