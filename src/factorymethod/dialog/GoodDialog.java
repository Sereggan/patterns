package factorymethod.dialog;

import factorymethod.button.BlueButton;
import factorymethod.button.Button;

public class GoodDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new BlueButton();
    }
}
