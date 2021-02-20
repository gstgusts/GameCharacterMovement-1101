package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class CharactersForm extends JFrame {

    private JPanel mainPanel;
    private JButton goblin;
    private JButton troll;
    private JButton btnMoveRight;

    private Goblin goblinCharacter;
    private Troll trollCharacter;

    public CharactersForm() {
        super("Game character movement");
        setSize(500,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        goblinCharacter = new Goblin(10, 10);
        trollCharacter = new Troll(10, 250);
    }

    public void open() {
        initUi();
        setVisible(true);
    }

    private void initUi() {
        mainPanel = new JPanel();
        mainPanel.setLayout(null);

        goblin = new JButton();
        goblin.setBounds(goblinCharacter.getPosX(),goblinCharacter.getPosY(), 200,200);

        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource("goblin.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        goblin.setIcon(new ImageIcon(img));

        mainPanel.add(goblin);

        troll = new JButton();
        troll.setBounds(trollCharacter.getPosX(), trollCharacter.getPosY(), 200,200);

        Image img2 = null;
        try {
            img2 = ImageIO.read(getClass().getResource("troll.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        troll.setIcon(new ImageIcon(img2));

        mainPanel.add(troll);

        btnMoveRight = new JButton(">");
        btnMoveRight.setBounds(10, 470, 100, 30);

        btnMoveRight.addActionListener(a -> {
            goblinCharacter.move(Direction.RIGHT);
            trollCharacter.move(Direction.RIGHT);
            updateCharacterPositions();
        });

        mainPanel.add(btnMoveRight);

        setContentPane(mainPanel);
    }

    private void updateCharacterPositions() {
        goblin.setBounds(goblinCharacter.getPosX(), goblinCharacter.getPosY(), 200, 200);
        troll.setBounds(trollCharacter.getPosX(), trollCharacter.getPosY(), 200, 200);
    }
}
