package factory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatform.ANDROID);

        //uiFactory -> AndroidFactory

        Button button = uiFactory.createButton();
        button.showButton();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();
    }
}
