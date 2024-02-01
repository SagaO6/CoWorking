package view;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;


public class Sobre extends JDialog {
	public Sobre() {
		setTitle("Sobre");
		setBounds(550,250,495,365);
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/logo.png")));
		getContentPane().setBackground(new Color(128, 128, 128));
		getContentPane().setForeground(Color.BLACK);
		getContentPane().setLayout(null);
		
		JLabel titulo = new JLabel("Sobre o software");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(0, 11, 479, 14);
		getContentPane().add(titulo);
		
		JLabel descricao1 = new JLabel("O software CoWorking trata-se de um protótipo cujo objetivo.");
		descricao1.setHorizontalAlignment(SwingConstants.CENTER);
		descricao1.setBounds(0, 78, 479, 14);
		getContentPane().add(descricao1);
		
		JLabel descricao2 = new JLabel("É possibilitar o gerenciamento de reserva de salas em um espaço colaborativo.");
		descricao2.setHorizontalAlignment(SwingConstants.CENTER);
		descricao2.setBounds(0, 103, 479, 29);
		getContentPane().add(descricao2);
		
		JLabel versao = new JLabel("Versão 1.0.0");
		versao.setHorizontalAlignment(SwingConstants.CENTER);
		versao.setBounds(0, 198, 479, 14);
		getContentPane().add(versao);
		
		JLabel atualizacao = new JLabel("Última atualização: 31/01/2024");
		atualizacao.setHorizontalAlignment(SwingConstants.CENTER);
		atualizacao.setBounds(0, 223, 479, 14);
		getContentPane().add(atualizacao);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Sobre.class.getResource("/img/mitLicense.png")));
		lblNewLabel.setBounds(406, 248, 97, 83);
		getContentPane().add(lblNewLabel);
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
					
				}
			}
			
		});


	}
}
