import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javatext {
    public static void main(String[] args) {
        //1.构建顶层容器
        JFrame JF = new JFrame("test");

        //设置顶层容器的长和宽
        JF.setBounds(500,500,400,500);

        //2.构建中间容器
        JPanel JP = new JPanel();
        JF.add(JP);

        //3.组件
        JLabel JL = new JLabel("这个组件");
        JP.add(JL);

        //添加按钮
        JButton jb = new JButton("这是一个按钮");
        JP.add(jb);

        //设置窗口关闭时程序也自动关闭
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置容器可见
        JF.setVisible(true);


        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JL.setText("你点击了按钮");

            }
        });
    }
}
