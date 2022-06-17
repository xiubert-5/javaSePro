package d6_abstract;

public class Card1 extends Card {

    @Override
    public void payFor(double money) {
        System.out.println("您此次消费" + money + "元");
        System.out.println("您当前余额为" + getMoney());

        double rs = money * 0.85;
        System.out.println("您实际消费" + rs + "元");

        setMoney(getMoney() - rs);


    }
}
