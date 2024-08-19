package repetitivos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class frm15 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblTex , lblAltTex , lblPorMuj;
	JTextField txtNum, txtFin;
	JButton btnCalcular;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm15 frame = new frm15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frm15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTex = new JLabel("Texto:");
		lblTex.setBounds(23 , 16, 71, 14);
		contentPane.add(lblTex);
		
		lblAltTex = new JLabel("Texto May/Min:");
		lblAltTex.setBounds(23 , 60, 95, 14);
		contentPane.add(lblAltTex);
		
		txtNum = new JTextField();
		txtNum.setBounds(128, 13, 119, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtFin = new JTextField();
		txtFin.setEditable(false);
		txtFin.setBounds(128, 57, 119, 20);
		contentPane.add(txtFin);
		txtFin.setColumns(10);
		
		btnCalcular = new JButton("Mayúscula");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(79,101,124,23);
		contentPane.add(btnCalcular);
		
		JButton btnNewButton = new JButton("Minúscula");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click2();
			}
		});
		btnNewButton.setBounds(231, 101, 111, 23);
		contentPane.add(btnNewButton);
		
		
		
	}
	private void btnCalcular_Click() {
		String text = txtNum.getText();
		List<String> mayusculas =List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T","U", "V", "W", "X", "Y", "Z","Ñ","Á","É","Í","Ó","Ú");
		List<String> minusculas =List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t","u", "v", "w", "x", "y", "z","ñ","á","é","í","ó","ú");
		String nuevo = "";
		for (int i = 0; i < text.length();i++) {
			char a = text.charAt(i);
			String x = a+"";
			
			if (minusculas.contains(new String(x))) {
				int t = minusculas.indexOf(x);
				nuevo += mayusculas.get(t);
			}
			else {
				nuevo += x;
			}
		}
		txtFin.setText(nuevo);
	}
	private void btnCalcular_Click2() {
		String text = txtNum.getText();
		List<String> mayusculas =List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T","U", "V", "W", "X", "Y", "Z","Ñ","Á","É","Í","Ó","Ú");
		List<String> minusculas =List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t","u", "v", "w", "x", "y", "z","ñ","á","é","í","ó","ú");
		String nuevo = "";
		
		for (int i = 0; i < text.length();i++) {
			char a = text.charAt(i);
			String x = a+"";
			
			if (mayusculas.contains(new String(x))) {
				int t = mayusculas.indexOf(x);
				nuevo += minusculas.get(t);
			}
			else {
				nuevo += x;
			}
		}
		txtFin.setText(nuevo);
	}
}