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

public class frm02 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblNum1 , lblNum2 , lblProducto , lblPorMujeres;
	JTextField txtNum , txtNum2 , txtProducto;
	JButton btnCalcular;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm02 frame = new frm02();
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
	public frm02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 271, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNum1 = new JLabel("Número 1:");
		lblNum1.setBounds(23 , 16, 71, 14);
		contentPane.add(lblNum1);
		
		lblNum2 = new JLabel("Número 2:");
		lblNum2.setBounds(23 , 48, 60, 14);
		contentPane.add(lblNum2);
		
		lblProducto = new JLabel("Producto:");
		lblProducto.setBounds(23 , 85, 95, 14);
		contentPane.add(lblProducto);
		
		txtNum = new JTextField();
		txtNum.setBounds(128, 13, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(128, 45, 86, 20);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);
		
		txtProducto = new JTextField();
		txtProducto.setEditable(false);
		txtProducto.setBounds(128, 82, 86, 20);
		contentPane.add(txtProducto);
		txtProducto.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(81,133,86,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		
		
	}
	private void btnCalcular_Click() {
		int num1 = Integer.parseInt(txtNum.getText() );
		int num2 = Integer.parseInt(txtNum2.getText() );
		double total = 0;
		int i;
		
		for (i = 0; i < num2; i++) {
		    total = total + num1;
		}
		DecimalFormat df = new DecimalFormat("##");
		txtProducto.setText(df.format(total));
	}
}
