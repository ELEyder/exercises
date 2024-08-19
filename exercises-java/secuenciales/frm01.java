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

public class frm01 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblVarones , lblMujeres , lblTotal , lblPorVarones , lblPorMujeres;
	JTextField txtVarones , txtMujeres , txtTotal, txtPorVarones , txtPorMujeres;
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblVarones = new JLabel("Varones:");
		lblVarones.setBounds(23 , 16, 71, 14);
		contentPane.add(lblVarones);
		
		lblMujeres = new JLabel("Mujeres:");
		lblMujeres.setBounds(23 , 48, 60, 14);
		contentPane.add(lblMujeres);
		
		lblTotal = new JLabel("Total:");
		lblTotal.setBounds(23 , 85, 46, 14);
		contentPane.add(lblTotal);
		
		lblPorVarones = new JLabel("Varones %:");
		lblPorVarones.setBounds(23 , 123, 95, 14);
		contentPane.add(lblPorVarones);
		
		JLabel lblNewLabel = new JLabel("Mujeres %:");
		lblNewLabel.setBounds(23, 162, 71, 14);
		contentPane.add(lblNewLabel);
		
		txtVarones = new JTextField();
		txtVarones.setBounds(128, 13, 86, 20);
		contentPane.add(txtVarones);
		txtVarones.setColumns(10);
		
		txtMujeres = new JTextField();
		txtMujeres.setBounds(128, 45, 86, 20);
		contentPane.add(txtMujeres);
		txtMujeres.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setBounds(128, 82, 86, 20);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		txtPorVarones = new JTextField();
		txtPorVarones.setEditable(false);
		txtPorVarones.setBounds(128, 120, 86, 20);
		contentPane.add(txtPorVarones);
		txtPorVarones.setColumns(10);
		
		txtPorMujeres = new JTextField();
		txtPorMujeres.setEditable(false);
		txtPorMujeres.setBounds(128, 159, 86, 20);
		contentPane.add(txtPorMujeres);
		txtPorMujeres.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(177,227,86,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		
		
	}
	private void btnCalcular_Click() {
		int varones = Integer.parseInt(txtVarones.getText() );
		int mujeres = Integer.parseInt(txtMujeres.getText() );
		double total = varones + mujeres;
		double porVarones = varones * 100 / total;
		double porMujeres = mujeres * 100 / total;
		
		DecimalFormat df = new DecimalFormat("##.00");
		DecimalFormat df2 = new DecimalFormat("##");
		txtTotal.setText(df2.format(total));
		txtPorVarones.setText(df.format(porVarones));
		txtPorMujeres.setText(df.format(porMujeres));
	}
}
