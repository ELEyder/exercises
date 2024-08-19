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

public class frm03 extends JFrame {
	private static final long serialVersionUID = 1L;

	JPanel contentPane;
	JLabel lblTramo1, lblTramo2, lblTramo3, lblTotalM, lblTotalY;
	JTextField txtTramo1, txtTramo2, txtTramo3, txtTotalM, txtTotalY;
	JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm03 frame = new frm03();
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
	public frm03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblTramo1 = new JLabel("Tramo 1:");
		lblTramo1.setBounds(25, 30, 113, 14);
		contentPane.add(lblTramo1);

		lblTramo2 = new JLabel("Tramo 2:");
		lblTramo2.setBounds(25, 70, 86, 14);
		contentPane.add(lblTramo2);

		lblTramo3 = new JLabel("Tramo 3:");
		lblTramo3.setBounds(25, 110, 71, 14);
		contentPane.add(lblTramo3);

		lblTotalM = new JLabel("Recorrido en metros:");
		lblTotalM.setBounds(25, 150, 127, 14);
		contentPane.add(lblTotalM);

		lblTotalY = new JLabel("Recorrido en Yardas:");
		lblTotalY.setBounds(25, 190, 127, 14);
		contentPane.add(lblTotalY);
		
		txtTramo1 = new JTextField();
		txtTramo1.setBounds(162, 22, 86, 20);
		contentPane.add(txtTramo1);
		txtTramo1.setColumns(10);

		txtTramo2= new JTextField();
		txtTramo2.setBounds(162, 67, 86, 20);
		contentPane.add(txtTramo2);
		txtTramo2.setColumns(10);

		txtTramo3= new JTextField();
		txtTramo3.setBounds(162, 107, 86, 20);
		contentPane.add(txtTramo3);
		txtTramo3.setColumns(10);

		txtTotalM= new JTextField();
		txtTotalM.setEditable(false);
		txtTotalM.setBounds(162, 147, 86, 20);
		contentPane.add(txtTotalM);
		txtTotalM.setColumns(10);

		txtTotalY = new JTextField();
		txtTotalY.setEditable(false);
		txtTotalY.setBounds(162, 187, 86, 20);
		contentPane.add(txtTotalY);
		txtTotalY.setColumns(10);

		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click();
			}
		});
		btnCalcular.setBounds(177, 227, 94, 23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);

	}

	private void btnCalcular_Click() {
		int tramo1 = Integer.parseInt(txtTramo1.getText());
		int tramo2 = Integer.parseInt(txtTramo2.getText());
		int tramo3 = Integer.parseInt(txtTramo3.getText());
		double total1 = tramo1 + tramo2 + tramo3;
		double total2 = total1 * 1.0936;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtTotalM.setText(df.format(total1));
		txtTotalY.setText(df.format(total2));
	}
}