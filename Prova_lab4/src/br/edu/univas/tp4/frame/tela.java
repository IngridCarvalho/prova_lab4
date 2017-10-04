package br.edu.univas.tp4.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class tela extends JFrame{
	
	private JPanel contentPane = null;
	
	public tela(){
		this.setSize(500, 450);
		this.setTitle("Prova");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		addComponents();
	}
	private void addComponents(){
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		this.setContentPane(contentPane);
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.gray);
		westPanel.setPreferredSize(new Dimension(150, 0));
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton bt1 = new JButton();
		bt1.setText("Botão 1");
		bt1.addActionListener(new AddTextButton());
		westPanel.add(bt1);
		
		JButton bt2 = new JButton();
		bt2.setText("Botão 2");
		bt2.addActionListener(new AddTextButton());
		westPanel.add(bt2);
		
		JButton bt3 = new JButton();
		bt3.setText("Botão 3");
		bt3.addActionListener(new AddTextButton());
		westPanel.add(bt3);
		
		JButton bt4 = new JButton();
		bt4.setText("Botão 4");
		bt4.addActionListener(new AddTextButton());
		westPanel.add(bt4);
		
		JButton bt5 = new JButton();
		bt5.setText("Botão 5");
		bt5.addActionListener(new AddTextButton());
		westPanel.add(bt5);
		
		JButton bt6 = new JButton();
		bt6.setText("Botão 6");
		bt6.addActionListener(new AddTextButton());
		westPanel.add(bt6);
		
		JButton bt7 = new JButton();
		bt7.setText("Botão 7");
		bt7.addActionListener(new AddTextButton());
		westPanel.add(bt7);
		
		JButton bt8 = new JButton();
		bt8.setText("Botão 8");
		bt8.addActionListener(new AddTextButton());
		westPanel.add(bt8);
		
		JButton bt9 = new JButton();
		bt9.setText("Botão 9");
		bt9.addActionListener(new AddTextButton());
		westPanel.add(bt9);
		
		JButton bt10 = new JButton();
		bt10.setText("Botão 10");
		bt10.addActionListener(new AddTextButton());
		westPanel.add(bt10);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(200,0));
		centerPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		contentPane.add(centerPanel, BorderLayout.CENTER);
		
		JLabel nome = new JLabel();
		nome.setText("Nome: ");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 15, 15);
		
		centerPanel.add(nome, gbc);
		
		JTextField nameTextField = new JTextField();
		gbc.gridx = 1; //coluna 1
		gbc.gridy = 0;
		gbc.weightx = 1.0; //ocupa 100% da área disponível na tela
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		centerPanel.add(nameTextField, gbc);
		
		JLabel email = new JLabel();
		email.setText("Email: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 15, 15);
		centerPanel.add(email, gbc);
		
		JTextField emailTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		centerPanel.add(emailTextField, gbc);
		
		JButton salvar = new JButton();
		salvar.setText("Salvar");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(15, 15, 15, 15);
		gbc.weightx = 0.0;
		centerPanel.add(salvar, gbc);
		
		Object[] columnNames = {"Nome", "CPF", "E-mail"};
		
		Object[][] data = {
				{"João", "111.111.111-11", "joao@gmai.com"},
				{"Maria", "222.222.222-22", "maria@gmai.com"},
				{"José", "333.333.333-33", "jose@gmai.com"},
		};
		
		JTable tabela = new JTable(data, columnNames);
		
		JScrollPane scroll = new JScrollPane(tabela);
		
		scroll.setPreferredSize(new Dimension(300,100));
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		gbc.gridwidth = 2;
		gbc.weightx = 1.0;
		centerPanel.add(scroll, gbc);
		
		
	}
	
	public class AddTextButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Eu sou o responsável pelo meu futuro!");
			
		}
		
	}
}
