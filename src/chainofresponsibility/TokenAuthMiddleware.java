package chainofresponsibility;

public class TokenAuthService extends Middleware{

    private final String token;

    public TokenAuthService(String token) {
        this.token = token;
    }

    @Override
    public boolean doAction() {
        if (token=="token"){
            return 
        }
        return false;
    }
}
