package staticdemo3;

import java.util.ArrayList;

public class StaticTest3 {
    /*
     * 1. 定义一个静态的集合，这样这个集合只加载一个，因为当前房间只需要一副牌*/

    public static ArrayList<String> cards = new ArrayList<>();

    /*2.在程序真正运行main方法前，把54张牌放进去*/

    static {
        //3.正式开始做牌
        //a.定义一个数组存储全部点数：类型确定了，个数确定了
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //b.定义一个数组存储全部的花色：类型确定了，个数确定了
        String[] colors = {"♥", "♠", "♣", "♦"};
        //c.遍历数组分配花色和点数
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                String card = colors[j] + sizes[i];
                cards.add(card);
            }
        }

        cards.add("s.joker");
        cards.add("b.joker");
    }

    public static void main(String[] args) {
        System.out.println(cards);
        System.out.println(cards.size());
    }
}
