package decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream =
                new ChocoChips(
                        new StrawberryScoop(
                                new ChocoChips(
                                        new ChocolateCone()
                                )
                        )
                );

        //Orange Cone -> Chocolate Cone -> Choco Chips -> Strawberry Scoop -> ChocoChips.

        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.getCost());
    }
}
