package factorymethod.dialog;

import factorymethod.button.Button;

public abstract class Dialog {

    private Button button;

    public void renderWindow() {
        if (button == null) {
            button = createButton();
        }

        button.render();
    }

    protected abstract Button createButton();
}
