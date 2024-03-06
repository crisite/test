
import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        //
        Shop shop = new Shop();
        System.out.println(shop.firstPurchase(10, 10));
        System.out.println(shop.secondPurchase(10, 10, 10));
        System.out.println(shop.thirdPurchase(10, 10, 10));
        System.out.println(shop.fourthPurchase(10, 10, 10));
    }
}

class Shop {
    public double applePrice = 8;
    public double strawberryPrice = 13;
    public double mangoPrice = 20;

    public double firstPurchase(int appleCount, int strawberryCount) {
        return applePrice * appleCount + strawberryPrice * strawberryCount;
    }

    public double secondPurchase(int appleCount, int strawberryCount, int mangoCount) {
        return applePrice * appleCount + strawberryPrice * strawberryCount + mangoPrice * mangoCount;
    }

    // 草莓八折
    public double thirdPurchase(int appleCount, int strawberryCount, int mangoCount) {
        return applePrice * appleCount + 0.8 * strawberryPrice * strawberryCount + mangoPrice * mangoCount;
    }

    // 100 - 10
    public double fourthPurchase(int appleCount, int strawberryCount, int mangoCount) {
        double total = applePrice * appleCount + strawberryPrice * strawberryCount + mangoPrice * mangoCount;
        double discount = ((int) total / 100) * 10;
        return total - discount;
    }
}