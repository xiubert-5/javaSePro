package d12_interface_extends;

public class BasketBallMan implements SportMan {

    private String name;
    private String raceId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaceId() {
        return raceId;
    }

    public void setRaceId(String raceId) {
        this.raceId = raceId;
    }

    public BasketBallMan(String name, String raceId) {
        this.name = name;
        this.raceId = raceId;
    }

    @Override
    public void law() {
        System.out.println(name + "遵纪守法，不偷税不漏税");
    }

    @Override
    public void eat() {
        System.out.println(name + "在吃美味的食物");

    }

    @Override
    public void drink() {
        System.out.println(name + "在喝饮料");
    }

    @Override
    public void run() {
        System.out.println(name + "在球场上奔跑");

    }

    @Override
    public void competition() {
        System.out.println(name + "出席了这场比赛");

    }
}
