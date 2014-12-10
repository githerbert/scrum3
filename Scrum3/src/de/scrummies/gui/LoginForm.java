package de.scrummies.gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import de.scrummies.scrum3.ScreenSize;
import de.scrummies.scrum3.ScrumWebService;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class LoginForm {

	private JFrame frmScrumLoginPanel;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTabbedPane tabbedPane;
	
	private ScrumWebService sw;

	/**
	 * Launch the applications
	 */
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException e1) {
			try {
				e1.printStackTrace();
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedLookAndFeelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.frmScrumLoginPanel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		sw = new ScrumWebService();
		initialize();
	}

	/**
	 * This method logs in authomatically
	 * @TODO DELETE LATER!
	 */
	private void login(JTextField name, JTextField pass){
		name.setText("test123");
		pass.setText("test123");
	}
	
	private void register(String teamname, String pw, String magic){
		try {
			sw.teamCreate(teamname, pw, magic);
			textField_1.setText("");
			passwordField_1.setText("");
			textField_2.setText("");
			JOptionPane.showMessageDialog(frmScrumLoginPanel, "Team: " + teamname +"\n Erfolgreich registriert!", "Fehlermeldung", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(frmScrumLoginPanel, "Fehler beim Registrieren!", "Fehlermeldung", JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScrumLoginPanel = new JFrame();
		frmScrumLoginPanel.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/de/scrummies/images/icon.png")));
		frmScrumLoginPanel.setResizable(false);
		frmScrumLoginPanel.setTitle("Login");
		frmScrumLoginPanel.setBounds(100, 100, 420, 356);
		frmScrumLoginPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScrumLoginPanel.getContentPane().setLayout(null);
		ScreenSize sz = new ScreenSize(frmScrumLoginPanel);
		frmScrumLoginPanel.setLocation(sz.getX(), sz.getY());
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 11, 367, 141);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(Color.WHITE);
		frmScrumLoginPanel.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblScrumLogoHere = new JLabel("");
		lblScrumLogoHere.setHorizontalAlignment(SwingConstants.CENTER);
		lblScrumLogoHere.setIcon(new ImageIcon("src/de/scrummies/images/logo.jpg"));
		lblScrumLogoHere.setBounds(0, 0, 367, 141);
		panel.add(lblScrumLogoHere);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 163, 367, 148);
		frmScrumLoginPanel.getContentPane().add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Login", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel label = new JLabel("TeamName");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(10, 26, 113, 14);
		panel_3.add(label);
		
		JLabel label_1 = new JLabel("Passwort");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(10, 48, 113, 14);
		panel_3.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(133, 23, 130, 20);
		panel_3.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(133, 45, 130, 20);
		panel_3.add(passwordField);
		
		JButton btnAnmelden = new JButton("Anmelden");
		btnAnmelden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					sw.teamLogin(textField.getText(), passwordField.getText(), "0");
					Main neu = new Main(frmScrumLoginPanel);
					frmScrumLoginPanel.dispose();
				} catch (Exception e2) 
				{
					e2.printStackTrace();
					
					JOptionPane.showMessageDialog(frmScrumLoginPanel, "Fehler beim Login!", "Fehlermeldung", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnAnmelden.setBounds(133, 74, 130, 23);
		panel_3.add(btnAnmelden);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Register", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel label_2 = new JLabel("TeamName");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(10, 14, 113, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Passwort");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(10, 36, 113, 14);
		panel_1.add(label_3);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(133, 33, 130, 20);
		panel_1.add(passwordField_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(133, 11, 130, 20);
		panel_1.add(textField_1);
		
		JLabel lblMagicword = new JLabel("MagicWord");
		lblMagicword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMagicword.setBounds(10, 60, 113, 14);
		panel_1.add(lblMagicword);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(133, 57, 130, 20);
		panel_1.add(textField_2);
		
		JButton btnRegisterLogin = new JButton("Registrieren");
		btnRegisterLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				register(textField_1.getText(), passwordField_1.getText(), textField_2.getText());
			}
		});
		btnRegisterLogin.setBounds(133, 86, 130, 23);
		panel_1.add(btnRegisterLogin);
		
		login(textField, passwordField);  /* @TODO DELETE */
	}
}
