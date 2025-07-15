package com.luo.stringtest2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    private static String currentCaptcha; // 存储当前验证码
    private static JLabel captchaDisplay; // 验证码显示标签

    public static void main(String[] args) {
        // 创建主窗口
        JFrame frame = new JFrame("登录验证");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(380, 300);
        frame.setLocationRelativeTo(null); // 居中显示
        frame.setLayout(new BorderLayout(10, 10));
        frame.getContentPane().setBackground(new Color(240, 245, 249)); // 设置背景色

        // 创建主面板
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(15, 15));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        mainPanel.setBackground(new Color(240, 245, 249));
        frame.add(mainPanel);

        // 创建标题
        JLabel titleLabel = new JLabel("用户登录", JLabel.CENTER);
        titleLabel.setFont(new Font("微软雅黑", Font.BOLD, 22));
        titleLabel.setForeground(new Color(44, 62, 80));
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        // 创建表单面板
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 10, 15));
        formPanel.setBackground(new Color(240, 245, 249));
        formPanel.setBorder(BorderFactory.createEmptyBorder(15, 0, 15, 0));
        mainPanel.add(formPanel, BorderLayout.CENTER);

        // 用户名输入
        JPanel userPanel = createInputPanel("用户名:", new JTextField(15), "user.png");
        formPanel.add(userPanel);

        // 密码输入
        JPanel passPanel = createInputPanel("密码:", new JPasswordField(15), "lock.png");
        formPanel.add(passPanel);

        // 验证码输入
        JPanel captchaPanel = new JPanel(new BorderLayout(10, 0));
        captchaPanel.setBackground(new Color(240, 245, 249));
        JLabel captchaLabel = new JLabel("验证码:");
        captchaLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        captchaLabel.setForeground(new Color(44, 62, 80));
        JTextField captchaText = new JTextField(6);
        captchaText.setFont(new Font("Arial", Font.PLAIN, 14));

        // 验证码显示区域
        currentCaptcha = generateCaptcha(6);
        captchaDisplay = new JLabel(currentCaptcha, JLabel.CENTER);
        captchaDisplay.setOpaque(true);
        captchaDisplay.setBackground(new Color(255, 255, 255));
        captchaDisplay.setFont(new Font("Arial", Font.BOLD, 20));
        captchaDisplay.setForeground(new Color(231, 76, 60));
        captchaDisplay.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 2));
        captchaDisplay.setPreferredSize(new Dimension(100, 35));

        // 刷新按钮
        JButton refreshButton = new JButton("↻");
        refreshButton.setFont(new Font("Arial", Font.BOLD, 16));
        refreshButton.setBackground(new Color(52, 152, 219));
        refreshButton.setForeground(Color.WHITE);
        refreshButton.setFocusPainted(false);
        refreshButton.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        // 验证码右侧面板
        JPanel captchaRightPanel = new JPanel(new BorderLayout(5, 0));
        captchaRightPanel.setBackground(new Color(240, 245, 249));
        captchaRightPanel.add(captchaDisplay, BorderLayout.CENTER);
        captchaRightPanel.add(refreshButton, BorderLayout.EAST);

        captchaPanel.add(captchaLabel, BorderLayout.WEST);
        captchaPanel.add(captchaText, BorderLayout.CENTER);
        captchaPanel.add(captchaRightPanel, BorderLayout.EAST);
        formPanel.add(captchaPanel);

        // 登录按钮
        JButton loginButton = new JButton("登 录");
        loginButton.setFont(new Font("微软雅黑", Font.BOLD, 16));
        loginButton.setBackground(new Color(46, 204, 113));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(39, 174, 96), 2),
                BorderFactory.createEmptyBorder(8, 25, 8, 25)
        ));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(240, 245, 249));
        buttonPanel.add(loginButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // 添加按钮监听器
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取输入值
                JTextField userText = (JTextField) ((JPanel)userPanel.getComponent(1)).getComponent(0);
                JPasswordField passwordText = (JPasswordField) ((JPanel)passPanel.getComponent(1)).getComponent(0);

                String username = userText.getText();
                String password = new String(passwordText.getPassword());
                String inputCaptcha = captchaText.getText();

                // 验证逻辑
                if (username.isEmpty() || password.isEmpty() || inputCaptcha.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "所有字段都必须填写", "输入错误", JOptionPane.WARNING_MESSAGE);
                } else if (inputCaptcha.equalsIgnoreCase(currentCaptcha)) {
                    JOptionPane.showMessageDialog(frame, "登录成功！", "验证通过", JOptionPane.INFORMATION_MESSAGE);
                    currentCaptcha = generateCaptcha(6);
                    captchaDisplay.setText(currentCaptcha);
                } else {
                    JOptionPane.showMessageDialog(frame, "验证码错误，请重新输入", "验证失败", JOptionPane.ERROR_MESSAGE);
                    currentCaptcha = generateCaptcha(6);
                    captchaDisplay.setText(currentCaptcha);
                }
            }
        });

        // 刷新按钮事件
        refreshButton.addActionListener(e -> {
            currentCaptcha = generateCaptcha(6);
            captchaDisplay.setText(currentCaptcha);
        });

        frame.setVisible(true);
    }

    // 创建带图标的输入面板
    private static JPanel createInputPanel(String labelText, JComponent inputField, String iconName) {
        JPanel panel = new JPanel(new BorderLayout(10, 0));
        panel.setBackground(new Color(240, 245, 249));

        JLabel label = new JLabel(labelText);
        label.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        label.setForeground(new Color(44, 62, 80));
        label.setPreferredSize(new Dimension(60, 30));

        // 图标占位（实际项目可替换为真实图标）
        JLabel iconLabel = new JLabel();
        iconLabel.setPreferredSize(new Dimension(24, 24));
        iconLabel.setOpaque(true);
        iconLabel.setBackground(new Color(189, 195, 199));
        iconLabel.setBorder(BorderFactory.createLineBorder(new Color(149, 165, 166), 1));

        JPanel inputContainer = new JPanel(new BorderLayout(5, 0));
        inputContainer.add(iconLabel, BorderLayout.WEST);
        inputContainer.add(inputField, BorderLayout.CENTER);
        inputContainer.setBackground(Color.WHITE);
        inputContainer.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(189, 195, 199), 1),
                BorderFactory.createEmptyBorder(2, 5, 2, 5)
        ));

        panel.add(label, BorderLayout.WEST);
        panel.add(inputContainer, BorderLayout.CENTER);
        return panel;
    }

    // 生成验证码方法
    private static String generateCaptcha(int length) {
        String chars = "ABCDEFGHJKLMNPQRSTUVWXYZabcdefghjkmnopqrstuvwxyz23456789";
        StringBuilder captcha = new StringBuilder();
        Random rnd = new Random();

        for (int i = 0; i < length; i++) {
            int index = rnd.nextInt(chars.length());
            captcha.append(chars.charAt(index));
        }

        return captcha.toString();
    }
}