package ru.geekbrains.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    private JPanel JavaCalculator;
    private JTextField textDisp;
    private JButton delButton;
    private JButton oneButton;
    private JButton fourButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton fiveButton;
    private JButton twoButton;
    private JButton zeroButton;
    private JButton nineButton;
    private JButton sixButton;
    private JButton threeButton;
    private JButton equalButton;
    private JButton divButton;
    private JButton multiButton;
    private JButton difButton;
    private JButton sumButton;

    //метод полулчения оператора в вычислении
    private void getOperator(String btnText) {
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textDisp.getText());
        textDisp.setText("");
    }

    public JavaCalculator() {
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisp.getText() + oneButton.getText();
                textDisp.setText(btnOneText);
            }
        });
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisp.getText() + twoButton.getText();
                textDisp.setText(btnOneText);

            }
        });
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisp.getText() + threeButton.getText();
                textDisp.setText(btnOneText);
            }
        });
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisp.getText() + fourButton.getText();
                textDisp.setText(btnOneText);
            }
        });
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisp.getText() + fiveButton.getText();
                textDisp.setText(btnOneText);
            }
        });
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisp.getText() + sixButton.getText();
                textDisp.setText(btnOneText);
            }
        });
        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisp.getText() + sevenButton.getText();
                textDisp.setText(btnOneText);
            }
        });
        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisp.getText() + eightButton.getText();
                textDisp.setText(btnOneText);
            }
        });
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisp.getText() + nineButton.getText();
                textDisp.setText(btnOneText);
            }
        });
        // слушатель кнопки деления
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = divButton.getText();
                getOperator(button_text);
            }
        });
        //слушатель кнопки сложения
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = sumButton.getText();
                getOperator(button_text);
            }
        });
        //слушатель кнопки равно
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator) {
                    case '+':
                        total2 = total1 + Double.parseDouble(textDisp.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textDisp.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(textDisp.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textDisp.getText());
                        break;
                }
                textDisp.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        //слушатель кнопки удаления
        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = 0;
                textDisp.setText("");
            }
        });
        //слушатель кнопки вычитания
        difButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = difButton.getText();
                getOperator(button_text);
            }
        });
        //слушатель кнопки умножения
        multiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = multiButton.getText();
                getOperator(button_text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
