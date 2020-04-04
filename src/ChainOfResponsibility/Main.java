package ChainOfResponsibility;

import ChainOfResponsibility.Implementations.Application;
import ChainOfResponsibility.Implementations.Button;
import ChainOfResponsibility.Implementations.DialogWindow;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        DialogWindow dialogWindow = new DialogWindow("qwerty");
        Application application = new Application();

        button.setNext(dialogWindow);
        dialogWindow.setNext(application);
        application.setNext(null);

        button.handle();

        System.out.println("hello, world");
    }
}
