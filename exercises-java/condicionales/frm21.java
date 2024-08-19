package condicionales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm21 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEstado;
	private JTextField txtEdad;
	private JTextField txtGenero;
	private JTextField txtCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm21 frame = new frm21();
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
	public frm21() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Genero:");
		lblNewLabel.setBounds(30, 30, 80, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(30, 70, 80, 30);
		contentPane.add(lblEdad);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(30, 110, 80, 30);
		contentPane.add(lblEstadoCivil);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(30, 160, 80, 30);
		contentPane.add(lblCodigo);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(110, 110, 80, 30);
		contentPane.add(txtEstado);
		txtEstado.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(110, 70, 80, 30);
		contentPane.add(txtEdad);
		
		txtGenero = new JTextField();
		txtGenero.setColumns(10);
		txtGenero.setBounds(110, 30, 80, 30);
		contentPane.add(txtGenero);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(110, 160, 80, 30);
		contentPane.add(txtCodigo);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int edad = Integer.parseInt(txtEdad.getText());
				
		
				int estado = 0;
				if (txtEstado.getText().equals("soltero")) estado=1;
				if (txtEstado.getText().equals("casado")) estado=2;
				if (txtEstado.getText().equals("divorciado")) estado=3;
				if (txtEstado.getText().equals("viudo")) estado=4;
				
				int genero = 0;
				if (txtGenero.getText().toLowerCase().equals("masculino")) genero=1;
				if (txtGenero.getText().equals("femenino")) genero=2;
				
				txtCodigo.setText(genero + "" + edad + "" + estado);
				    


				
			}
		});
		btnNewButton.setBounds(210, 30, 90, 30);
		contentPane.add(btnNewButton);
		setLocationRelativeTo(null);
	}

}