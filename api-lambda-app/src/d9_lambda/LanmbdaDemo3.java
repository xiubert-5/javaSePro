package d9_lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LanmbdaDemo3 {
    public static void main(String[] args) {
        JFrame win = new JFrame("登录界面");

        //JButton btn = new JButton("我是一个很大的按钮");
        //btn.addActionListener(new ActionListener() {
        //    @Override
        //    public void actionPerformed(ActionEvent e) {
        //        System.out.println("有人点我");
        //    }
        //});

        JButton btn = new JButton("我是一个很大的按钮");
        btn.addActionListener( e ->
                System.out.println("有人点我")

        );

        win.add(btn);


        win.setSize(400,300);
        win.setVisible(true);
    }

}
