package chainofresponsibility;

import java.util.Objects;

public class TokenAuthMiddleware extends Middleware {

    private final String token;

    public TokenAuthMiddleware(String token) {
        this.token = token;
    }

    @Override
    public boolean doAction() {
        System.out.println("Start validation of Token");

        if (Objects.equals(token, "token")) {
            System.out.println("Token is correct");
            return checkNext();
        }
        System.out.println("Token is wrong");
        return false;
    }
}
