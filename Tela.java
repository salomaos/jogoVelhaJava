package jogoVelha;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela extends JFrame{
	public Tela(){
		setSize(500, 500);
		setTitle("Jogo da Velha");
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		for (int i = 5; i < 315; i += 105) {
			for (int j = 5; j < 315; j += 105) {
				criarBotoes(i, j);
			}
		}		
		setVisible(true);
	}
	
	private ArrayList<JButton> botoes = new ArrayList();
	boolean player1=true;
	
	private JButton criarBotoes(int x, int y){
		JButton botao = new JButton();
		botao.setSize(100, 100);
		botao.setLocation(x, y);
		botao.setText("");
		add(botao);
		
		botao.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(botao.getText().equals("")){
					if(player1){
						botao.setText("X");
					}else{
						botao.setText("O");
					}
					player1 = !player1;
				}
				
			}
		});
		
		return botao;
	}
	
	
	private void init(){
		botao = new JButton();
		
		botao.setSize(250, 40);
		botao.setLocation(20, 20);
		botao.setText("");
		add(botao);
		
		botao.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				Random random = new Random();
				botao.setBackground(new Color(
					random.nextInt(256),
					random.nextInt(256),
					random.nextInt(256)
				));
				botao.setLocation(random.nextInt(300), random.nextInt(460));
				
			}
		});
	}
}
