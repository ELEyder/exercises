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

public class frm07 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblNum , lblFac , lblPorMuj;
	JTextField txtNum , txtDivisor;
	JButton btnCalcular;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm07 frame = new frm07();
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
	public frm07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 190);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNum = new JLabel("Número:");
		lblNum.setBounds(23 , 16, 71, 14);
		contentPane.add(lblNum);
		
		lblFac = new JLabel("Factorial:");
		lblFac.setBounds(23 , 48, 60, 14);
		contentPane.add(lblFac);
		
		txtNum = new JTextField();
		txtNum.setBounds(128, 13, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtDivisor = new JTextField();
		txtDivisor.setEditable(false);
		txtDivisor.setBounds(128, 45, 86, 20);
		contentPane.add(txtDivisor);
		txtDivisor.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(63,101,86,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		
		
	}
	private void btnCalcular_Click() {
		int num = Integer.parseInt(txtNum.getText() );
		int fac = 1;
		for (int i = 1; i < num + 1;i++) {
		    fac *= i;
		}
		DecimalFormat df = new DecimalFormat("##");
		txtDivisor.setText(df.format(fac));
	}
}