package factoryMethod;

public class GoodDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new BlueButton();
    }
}
