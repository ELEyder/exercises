package repetitivos;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class frm17 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblNum , lblDiv , lblCoc , lblPorMuj;
	JTextField txtNum , txtDivisor , txtCociente;
	JButton btnCalcular;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm17 frame = new frm17();
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
	public frm17() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNum = new JLabel("Texto:");
		lblNum.setBounds(23 , 16, 71, 14);
		contentPane.add(lblNum);
		
		lblDiv = new JLabel("Busca Letra:");
		lblDiv.setBounds(23 , 48, 71, 14);
		contentPane.add(lblDiv);
		
		lblCoc = new JLabel("Posición:");
		lblCoc.setBounds(23 , 85, 71, 14);
		contentPane.add(lblCoc);
		
		txtNum = new JTextField();
		txtNum.setBounds(128, 13, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtDivisor = new JTextField();
		txtDivisor.setBounds(128, 45, 86, 20);
		contentPane.add(txtDivisor);
		txtDivisor.setColumns(10);
		
		txtCociente = new JTextField();
		txtCociente.setEditable(false);
		txtCociente.setBounds(128, 82, 119, 20);
		contentPane.add(txtCociente);
		txtCociente.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(74,165,86,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		
		
	}
	private void btnCalcular_Click() {
		String text = txtNum.getText();
		String busca = txtDivisor.getText();
		int contador = 1;
		
		for (int i = 0; i < text.length();i++) {
			char tem = text.charAt(i);
			if (busca == String.valueOf(tem)){
				break;
			}
			else {
				contador += 1;
			}
		}
		if (contador == text.length() + 1) {
			txtCociente.setText("No se encontró");
		}
		else{
			DecimalFormat df = new DecimalFormat("##");
			txtCociente.setText(df.format(contador));
		}
		
		
	}
}