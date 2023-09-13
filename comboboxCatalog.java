package atividades;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class comboboxCatalog {
	public static void main(String[] args) {

		JFrame frame = new JFrame("ComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        String[] opcoes = {"Filmes", "Séries", "Jogos"};

        JComboBox<String> comboBox = new JComboBox<>(opcoes);

        frame.add(comboBox);

        JButton button = new JButton("Selecionar");
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selecao = "Você selecionou: " + comboBox.getSelectedItem();
                JOptionPane.showMessageDialog(frame, selecao);
            }
        });

        frame.setVisible(true);
    }
}