package condicionales;
import java.awt.EventQueue;
import java.awt.Insets;
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
	private JPanel contentPane;
   
	    JTextField txtuni, txtPrecio,txtCompra,txtDescuento, txtTotal;
	    JButton btnCalcular;
      
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
	    public frm01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		JLabel lbluni = new JLabel("Unidades:");
		lbluni.setBounds(30, 30, 80, 30);
		contentPane.add(lbluni);
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(30, 70, 80, 30);
		contentPane.add(lblPrecio);
		JLabel lblCompra = new JLabel("Compra:");
		lblCompra.setBounds(30,110, 80, 30);
		contentPane.add(lblCompra);
		JLabel lblDescuento = new JLabel("Descuento :");
		lblDescuento.setBounds(30, 150, 80, 30);
		contentPane.add(lblDescuento);
		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setBounds(30, 190, 80, 30);
		contentPane.add(lblTotal);
		Insets insets = new Insets(5,5,5,5);
		
		txtuni = new JTextField("");
		txtuni.setBounds(120, 30, 88, 30);
        txtuni.setMargin(insets);
		contentPane.add(txtuni);
		txtPrecio = new JTextField("");
		txtPrecio.setBounds(120, 70, 88, 30);
		txtPrecio.setMargin(insets);
		txtPrecio.setFocusable(false);
        contentPane.add(txtPrecio);
		txtCompra = new JTextField("");
		txtCompra.setBounds(120, 110, 88, 30);
		txtCompra.setMargin(insets);
		txtCompra.setFocusable(false);
		contentPane.add(txtCompra);
		txtDescuento = new JTextField("");
		txtDescuento.setBounds(120, 150, 88, 30);
		txtDescuento.setMargin(insets);
		txtDescuento.setFocusable(false);
        contentPane.add(txtDescuento);
		txtTotal = new JTextField("");
		txtTotal.setBounds(120, 190, 88, 30);
		txtTotal.setMargin(insets);
		txtTotal.setFocusable(false);
        contentPane.add(txtTotal);
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60, 240, 100, 23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
	    
	private void btnCalcular_Click() {
		int uni = Integer.parseInt(txtuni.getText());
	    DecimalFormat df= new DecimalFormat("##.00");
	    int precio = uni <= 25 ? 27 : uni >= 51 ? 23 : 25;
		int compra= uni * precio;
		double descuento = ( uni >= 50? 0.15 : 0.05 )* compra;
	 
	 txtPrecio.setText(df.format(precio));
	 txtCompra.setText(df.format(compra));
	 txtDescuento.setText(df.format(descuento));
	 txtTotal.setText(df.format(compra-descuento));
  }
	
}