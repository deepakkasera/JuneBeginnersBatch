package factory;

public class Flutter {
    //declare the methods there

    public void setTheme() { //non factory method
        System.out.println("Setting Theme");
    }

    public void setRefreshRate() { // non factory method
        System.out.println("Setting refresh rate");
    }

    public UIFactory createUIFactory(SupportedPlatform platform) {
        //OCP is violating -> if-else conditions.
        //Creating UIFactory -> violating OCP.
//        if (platform.equals(SupportedPlatform.ANDROID)) {
//            return new AndroidUIFactory();
//        } else if (platform.equals(SupportedPlatform.IOS)) {
//            return new IosUIFactory();
//        }

        return UIFactoryFactory.createUIFactoryForPlatform(platform);

//        return null;
    }
}
