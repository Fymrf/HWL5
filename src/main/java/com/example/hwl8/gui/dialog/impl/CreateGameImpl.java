package com.example.hwl8.gui.dialog.impl;

import com.example.hwl8.enums.DotType;
import com.example.hwl8.gui.dialog.CreateGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class CreateGameImpl extends JDialog implements CreateGame {
    public DotType playerType = DotType.X;
    public int mapSize = 3;

    public CreateGameImpl(JFrame parentFrame) {
        super(parentFrame, "Создание игры", true);
        setBounds(300, 300, 500, 250);

        JTextField mapTextField = new JTextField(String.valueOf(mapSize));
        JPanel jPanel = makeCreateWindow(mapTextField);
        JButton jButton = startButton(mapTextField);

        setLayout(new BorderLayout());
        add(jPanel, BorderLayout.CENTER);
        add(jButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JPanel makeCreateWindow(JTextField mapTextField) {
        JPanel jPanel = new JPanel(new GridLayout(2, 2));
        jPanel.add(new JLabel("Выберите за кого играть?"));
        jPanel.add(makeRadioButtonPanel());
        jPanel.add(new JLabel("Введите размер игрового поля"));
        jPanel.add(mapTextField);

        return jPanel;
    }

    private JButton startButton(JTextField mapTextField) {
        JButton jButton = new JButton("Играть!");
        WindowEvent closeEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int size = Integer.parseInt(mapTextField.getText());
                if (size >= 2) {
                    mapSize = size;
                    dispatchEvent(closeEvent);
                } else {
                    JOptionPane.showMessageDialog(mapTextField, "Размер поля не может быть меньше чем 2", "Ошибочка!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        return jButton;
    }

    private JPanel makeRadioButtonPanel() {
        JRadioButton xButton = getRadioButton("X", DotType.X, true);
        JRadioButton oButton = getRadioButton("O", DotType.O, false);

        ButtonGroup group = new ButtonGroup();
        group.add(xButton);
        group.add(oButton);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(xButton);
        buttonPanel.add(oButton);

        return buttonPanel;
    }

    private JRadioButton getRadioButton(String buttonName, DotType buttonDotType, boolean select) {
        JRadioButton choiceButton = new JRadioButton(buttonName, select);
        choiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerType = buttonDotType;
            }
        });

        return choiceButton;
    }

    @Override
    public int getMapSize() {
        return mapSize;
    }

    @Override
    public DotType getPlayerType() {
        return playerType;
    }


}
