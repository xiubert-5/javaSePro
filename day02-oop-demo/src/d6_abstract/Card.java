package d6_abstract;

public abstract class Card {
    private String idName;
    private double money;

    public abstract void payFor(double money);

    public Card(String idName, double money) {
        this.idName = idName;
        this.money = money;
    }

    public Card() {
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
