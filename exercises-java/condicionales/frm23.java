package condicionales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class frm23 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel contentPane;
	private JTextField txtMat;
	private JTextField txtFisica;
	private JTextField txtPropina;
	private JTextField txtObsequio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm23 frame = new frm23();
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
	public frm23() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Notas:");
		lblNewLabel.setBounds(30, 20, 80, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblMatematica = new JLabel("Matematica:");
		lblMatematica.setBounds(30, 50, 80, 30);
		contentPane.add(lblMatematica);
		
		JLabel lblFisica = new JLabel("Fisica:");
		lblFisica.setBounds(30, 85, 80, 30);
		contentPane.add(lblFisica);
		
		JLabel lblPropina = new JLabel("Propina:");
		lblPropina.setBounds(30, 130, 80, 30);
		contentPane.add(lblPropina);
		
		JLabel lblObsequio = new JLabel("Obsequio:");
		lblObsequio.setBounds(30, 170, 80, 30);
		contentPane.add(lblObsequio);
		
		txtMat = new JTextField();
		txtMat.setBounds(110, 50, 80, 30);
		contentPane.add(txtMat);
		txtMat.setColumns(10);
		
		txtFisica = new JTextField();
		txtFisica.setColumns(10);
		txtFisica.setBounds(110, 85, 80, 30);
		contentPane.add(txtFisica);
		
		txtPropina = new JTextField();
		txtPropina.setColumns(10);
		txtPropina.setBounds(110, 130, 80, 30);
		contentPane.add(txtPropina);
		
		txtObsequio = new JTextField();
		txtObsequio.setColumns(10);
		txtObsequio.setBounds(110, 170, 80, 30);
		contentPane.add(txtObsequio);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			double matematica = Integer.parseInt(txtMat.getText());
			double fisica = Integer.parseInt(txtFisica.getText());
			double promedio = (matematica+fisica)/2;
			int pmatematica = (int) (matematica>17 ? matematica*3 : matematica) ;
			int pfisica = (int) (matematica>15 ? fisica*2 : fisica/2) ;

				
			DecimalFormat df = new DecimalFormat("##.00");
			txtPropina.setText(df.format(pfisica+pmatematica));
			txtObsequio.setText(promedio>16 ? "Reloj" : "Sin Obsequio");

			}
		});
		btnNewButton.setBounds(200, 50, 90, 30);
		contentPane.add(btnNewButton);
		setLocationRelativeTo(null);
		
		
	}

}