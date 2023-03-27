package factoryMethod;

public class BadDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new GreenButton();
    }
}
