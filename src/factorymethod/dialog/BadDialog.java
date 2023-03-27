package factorymethod.dialog;

import factorymethod.button.Button;
import factorymethod.button.GreenButton;

public class BadDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new GreenButton();
    }
}
