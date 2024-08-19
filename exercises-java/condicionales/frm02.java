package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class frm02 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JTextField txtUni;
	JTextArea txaRes;
	JButton btnCalcular;

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

	public frm02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 229, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblUnidades = new JLabel("Unidades : ");
		lblUnidades.setBounds(30, 30, 60, 30);
		contentPane.add(lblUnidades);
		txtUni = new JTextField();
		txtUni.setBounds(100, 30, 60, 30);
		txtUni.setMargin( new Insets(5,5,5,5) );
		contentPane.add(txtUni);
		txaRes = new JTextArea();
		txaRes.setFocusable(true);
		
		JScrollPane jsPane = new JScrollPane(txaRes);
		jsPane.setBounds(40, 70, 150, 150);
		contentPane.add(jsPane);
				
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60, 240, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click(); } });
	}
	
	private void btnCalcular_Click() {
		int uni = Integer.parseInt( txtUni.getText() );
		
		int precio = 20;
		int compra = uni * precio;
		int caramelos = uni <= 50 ? 5 : uni > 100 ? 15 : 10;
		double descuento = ( compra <= 500 ? 0.12 : compra > 700 ? 0.16 : 0.14 ) * compra;
		
		txaRes.setText("");
		DecimalFormat df = new DecimalFormat("##.00");
		txaRes.append( " Precio    : " + df.format(precio) + "\n" );
		txaRes.append( " Compra    : " + df.format(compra) + "\n" );
		txaRes.append( " Descuento : " + df.format(descuento) + "\n" );
		txaRes.append( " Total     : " + df.format(compra - descuento) + "\n" );
		txaRes.append( " Caramelos : " + df.format(caramelos) + "\n" );
	}

}
