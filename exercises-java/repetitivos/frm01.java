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

public class frm01 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblNum , lblDivisor , lblCociente , lblResiduo , lblPorMujeres;
	JTextField txtNum , txtDivisor , txtCociente, txtResiduo;
	JButton btnCalcular;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm01 frame = new frm01();
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
	public frm01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNum = new JLabel("Número:");
		lblNum.setBounds(23 , 16, 71, 14);
		contentPane.add(lblNum);
		
		lblDivisor = new JLabel("Divisor:");
		lblDivisor.setBounds(23 , 48, 60, 14);
		contentPane.add(lblDivisor);
		
		lblCociente = new JLabel("Cociente:");
		lblCociente.setBounds(23 , 85, 95, 14);
		contentPane.add(lblCociente);
		
		lblResiduo = new JLabel("Residuo:");
		lblResiduo.setBounds(23 , 123, 95, 14);
		contentPane.add(lblResiduo);
		
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
		txtCociente.setBounds(128, 82, 86, 20);
		contentPane.add(txtCociente);
		txtCociente.setColumns(10);
		
		txtResiduo = new JTextField();
		txtResiduo.setEditable(false);
		txtResiduo.setBounds(128, 120, 86, 20);
		contentPane.add(txtResiduo);
		txtResiduo.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(74,165,86,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		
		
	}
	private void btnCalcular_Click() {
		int num = Integer.parseInt(txtNum.getText() );
		int divisor = Integer.parseInt(txtDivisor.getText() );
		double cociente = 0;
		
		while (num >=divisor) {
			num = num - divisor;
			cociente = cociente + 1;
		}

		DecimalFormat df = new DecimalFormat("##");
		txtCociente.setText(df.format(cociente));
		txtResiduo.setText(df.format(num));
	}
}
