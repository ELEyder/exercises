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

public class frm11 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblCap , lblPorMuj;
	JTextField txtDivisor;
	JButton btnCalcular;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm11 frame = new frm11();
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
	public frm11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 170);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCap = new JLabel("Capicúas :");
		lblCap.setBounds(25 , 26, 60, 14);
		contentPane.add(lblCap);
		
		txtDivisor = new JTextField();
		txtDivisor.setEditable(false);
		txtDivisor.setBounds(125, 26, 86, 20);
		contentPane.add(txtDivisor);
		txtDivisor.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(71,89,86,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		
		
	}
	private void btnCalcular_Click() {

		double contador = 0;
		char inicio = 0;
		char fin = 0;
		
		for (int i = 100;i < 1000; i++) {
			String i2 = i +"";
			inicio = i2.charAt(0);
			fin = i2.charAt(2);
			if (inicio == fin) {
				contador +=1;
			}
		}
		DecimalFormat df = new DecimalFormat("##");
		txtDivisor.setText(df.format(contador));
	}
}