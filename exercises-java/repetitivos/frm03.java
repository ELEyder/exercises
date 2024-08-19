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


public class frm03 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JButton btnCalcular;
	int count = 0;
	private JTextField txtDivisores;
	private JTextField txtCantidadDivisores;
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

	public frm03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 214, 211);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setLocationRelativeTo( null );
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblDivisores = new JLabel("Numero :");
		lblDivisores.setBounds(10, 30, 60, 30);
		contentPane.add(lblDivisores);
		
		JLabel lblCantidadDivisores = new JLabel("Divisores :");
		lblCantidadDivisores.setBounds(10, 71, 90, 20);
		contentPane.add(lblCantidadDivisores);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(48, 124, 90, 20);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		txtDivisores = new JTextField();
		txtDivisores.setBounds(102, 35, 86, 20);
		contentPane.add(txtDivisores);
		txtDivisores.setColumns(10);
		
		txtCantidadDivisores = new JTextField();
		txtCantidadDivisores.setEditable(false);
		txtCantidadDivisores.setBounds(102, 71, 86, 20);
		contentPane.add(txtCantidadDivisores);
		txtCantidadDivisores.setColumns(10);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click(); } });
	}

	private void btnCalcular_Click() {
		int num = Integer.parseInt( txtDivisores.getText() );
		for (int i = 1; i<num+1;i++){
			if (num % i == 0){
				count += 1;
			}
		}
		DecimalFormat df = new DecimalFormat("##");
		txtCantidadDivisores.setText(df.format(count));
	}
}