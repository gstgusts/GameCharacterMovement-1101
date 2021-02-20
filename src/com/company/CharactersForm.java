package com.company;

import javax.swing.*;

public class CharactersForm extends JFrame {

    private JPanel mainPanel;
    private JButton goblin;

    public CharactersForm() {
        super("Game character movement");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void open() {
        initUi();
        setVisible(true);
    }

    private void initUi() {
        mainPanel = new JPanel();
        mainPanel.setLayout(null);

        goblin = new JButton();
        goblin.setBounds(10,10, 20,20);

        mainPanel.add(goblin);

        setContentPane(mainPanel);
    }
}
