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
import javax.swing.JTextArea;

public class frm06 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblNum , lblIni , lblFin , lblPorMuj;
	JTextField txtNum , txtDivisor , txtCociente;
	JButton btnCalcular;
	JTextArea txtArea;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm06 frame = new frm06();
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
	public frm06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNum = new JLabel("Número:");
		lblNum.setBounds(23 , 16, 71, 14);
		contentPane.add(lblNum);
		
		lblIni = new JLabel("Inicio:");
		lblIni.setBounds(23 , 48, 60, 14);
		contentPane.add(lblIni);
		
		lblFin = new JLabel("Final:");
		lblFin.setBounds(23 , 85, 46, 14);
		contentPane.add(lblFin);
		
		txtNum = new JTextField();
		txtNum.setBounds(128, 13, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtDivisor = new JTextField();
		txtDivisor.setBounds(128, 45, 86, 20);
		contentPane.add(txtDivisor);
		txtDivisor.setColumns(10);
		
		txtCociente = new JTextField();
		txtCociente.setBounds(128, 82, 86, 20);
		contentPane.add(txtCociente);
		txtCociente.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(83,276,86,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		txtArea = new JTextArea();
		txtArea.setBounds(60, 121, 134, 138);
		contentPane.add(txtArea);
		
		
		
	}
	private void btnCalcular_Click() {
		int num = Integer.parseInt(txtNum.getText() );
		int ini = Integer.parseInt(txtDivisor.getText() );
		int fin = Integer.parseInt(txtCociente.getText() );;
		String a = "";
		for (int i = ini; i < fin+1;i++) {
			a = a+ num + " x  " + i + " = " + num*i +"\n";
		}
		txtArea.setText(a);

	}
}