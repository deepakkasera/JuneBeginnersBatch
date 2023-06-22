package factory;

import java.awt.desktop.AppForegroundListener;

public class UIFactoryFactory {
    //SRP for creating UIFactory
    //Practical Factory.
    public static UIFactory createUIFactoryForPlatform(SupportedPlatform platform) {
        if (platform.equals(SupportedPlatform.ANDROID)) {
            return new AndroidUIFactory();
        } else if (platform.equals(SupportedPlatform.IOS)) {
            return new IosUIFactory();
        } //
        return null;
    }
}
