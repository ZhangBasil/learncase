package com.zhangbin.learncase.autotest;

import org.junit.jupiter.api.Test;

import javax.swing.*;

/**
 * @author zhangbin
 * @Type SwingTest
 * @Desc
 * @date 2018-05-20
 * @Version V1.0
 */
public class SwingTest {

    @Test
    void test() {
        // 1. 创建一个顶层容器（窗口）
        JFrame jf = new JFrame("测试窗口"); // 创建窗口
        jf.setSize(1500, 800); // 设置窗口大小
        jf.setLocationRelativeTo(null); // 把窗口位置设置到屏幕中心
//        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 当点击窗口的关闭按钮时退出程序（没有这一句，程序不会退出）

        // 2. 创建中间容器（面板容器）
        JPanel panel = new JPanel(); // 创建面板容器，使用默认的布局管理器

        JTextPane textPane = new JTextPane();
        panel.add(textPane);

        // 3. 创建一个基本组件（按钮），并添加到 面板容器 中
        JButton btn = new JButton("测试按钮");
        panel.add(btn);

        // 4. 把 面板容器 作为窗口的内容面板 设置到 窗口
        jf.setContentPane(panel);

        // 5. 显示窗口，前面创建的信息都在内存中，通过 jf.setVisible(true) 把内存中的窗口显示在屏幕上。
        jf.setVisible(true);


    }
}
