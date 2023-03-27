package abstractfactory.factory;

import abstractfactory.button.Button;
import abstractfactory.window.Window;

public interface UIFactory {

    Button createButton();

    Window createWindow();
}
