package view;

import javax.swing.JDialog;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import model.DAO;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.ImageIcon;

public class Login extends JDialog {
	private JTextField inputLogin;
	private JPasswordField inputSenha;
	
	public Login() {
		addWindowListener(new WindowAdapter(){
			public void windowActivated(WindowEvent e) {
				statusConexaoBanco();
				
			}
		});
		
		setTitle("Login");
		setBounds(550,250,477,340);
		setResizable(false);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/img/logo.png")));
		getContentPane().setLayout(null);
		
		JLabel txtLogin = new JLabel("Login");
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtLogin.setBounds(201, 51, 46, 27);
		getContentPane().add(txtLogin);
		
		JLabel txtSenha = new JLabel("Senha");
		txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSenha.setHorizontalAlignment(SwingConstants.CENTER);
		txtSenha.setBounds(201, 151, 46, 27);
		getContentPane().add(txtSenha);
		
		inputLogin = new JTextField();
		inputLogin.setBounds(151, 86, 146, 20);
		getContentPane().add(inputLogin);
		inputLogin.setColumns(10);
		
		inputSenha = new JPasswordField();
		inputSenha.setBounds(151, 189, 146, 20);
		getContentPane().add(inputSenha);
		
		JButton btnLogin = new JButton("Entrar");
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setBounds(184, 231, 89, 23);
		getContentPane().add(btnLogin);
		
		JLabel tituloLogin = new JLabel("Acessar conta");
		tituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		tituloLogin.setBounds(168, 11, 113, 29);
		getContentPane().add(tituloLogin);
		
		imgDatabase = new JLabel("");
		imgDatabase.setIcon(new ImageIcon(Login.class.getResource("/img/databaseOff.png")));
		imgDatabase.setBounds(10, 222, 48, 48);
		getContentPane().add(imgDatabase);
	}
	
	DAO dao = new DAO();
	private JLabel imgDatabase;
	
	private void statusConexaoBanco() {
		try {
			
			Connection conexaoBanco = dao.conectar();
		
		if (conexaoBanco == null) {
			//Escolher a imagem
			imgDatabase.setIcon(new ImageIcon (Login.class.getResource("/img/databaseOff.png")));
			
		}
		
		else {
			//Trocar a imagem se não houver conexão
			imgDatabase.setIcon(new ImageIcon (Login.class.getResource("/img/databaseOn.png")));
			
		}
		
		conexaoBanco.close();
		
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private void logar() {
		String read = "select * from funcionario where login=? and senha senha=md5(?)";
		
		
		try {
			
		} 
		
		catch (Exception e) {
			System.out.println(e);
			
		}
	}
	

	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login dialog = new Login();
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
