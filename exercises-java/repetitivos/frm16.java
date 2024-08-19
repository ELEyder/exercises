package repetitivos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class frm16 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblTex , lblInv , lblPorMuj;
	JTextField txtNum, txtResiduo;
	JButton btnCalcular;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm16 frame = new frm16();
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
	public frm16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTex = new JLabel("Texto:");
		lblTex.setBounds(23 , 34, 71, 14);
		contentPane.add(lblTex);
		
		lblInv = new JLabel("Texto Invertido:");
		lblInv.setBounds(23 , 59, 95, 14);
		contentPane.add(lblInv);
		
		txtNum = new JTextField();
		txtNum.setBounds(128, 31, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtResiduo = new JTextField();
		txtResiduo.setEditable(false);
		txtResiduo.setBounds(128, 56, 86, 20);
		contentPane.add(txtResiduo);
		txtResiduo.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(73,106,86,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		
		
	}
	private void btnCalcular_Click() {
		String text = txtNum.getText();
		String salida = "";
		
		for (int i = 0; i < text.length();i++) {
			char temp = text.charAt(i);
		    salida = temp + salida;
		}
		txtResiduo.setText(salida);
	}
}