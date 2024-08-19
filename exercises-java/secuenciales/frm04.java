package secuenciales;

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

public class frm04 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblPies , lblPul , lblTotal , lblPorMujeres;
	JTextField txtPies , txtPul , txtTotal;
	JButton btnCalcular;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm04 frame = new frm04();
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
	public frm04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 202);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblPies = new JLabel("Altura (en Pies):");
		lblPies.setBounds(23 , 16, 101, 14);
		contentPane.add(lblPies);
		
		lblPul = new JLabel("Altura faltante (en pulgadas):");
		lblPul.setBounds(23 , 48, 168, 14);
		contentPane.add(lblPul);
		
		lblTotal = new JLabel("Total (en metros):");
		lblTotal.setBounds(23 , 85, 101, 14);
		contentPane.add(lblTotal);
		
		txtPies = new JTextField();
		txtPies.setBounds(252, 13, 86, 20);
		contentPane.add(txtPies);
		txtPies.setColumns(10);
		
		txtPul = new JTextField();
		txtPul.setBounds(252, 45, 86, 20);
		contentPane.add(txtPul);
		txtPul.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setBounds(252, 82, 86, 20);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(149,125,86,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		
		
	}
	private void btnCalcular_Click() {
		int pie2 = Integer.parseInt(txtPies.getText() );
		int pul2 = Integer.parseInt(txtPul.getText() );
		double pie = pie2 * 0.3048;
		double pul = pul2 * 0.0254;
		double total = pie + pul;
		
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtTotal.setText(df.format(total));
	}
}
