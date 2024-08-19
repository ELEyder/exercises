package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class frm03 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
   
	    JTextField txtGrado, txtAngulo;
	    JButton btnCalcular;
      
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
		setBounds(0, 0, 242, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		JLabel lblGrado = new JLabel("Grado :");
		lblGrado.setBounds(30, 30, 80, 30);
		contentPane.add(lblGrado);
		JLabel lblAngulo = new JLabel("Angulo :");
		lblAngulo.setBounds(30, 70, 80, 30);
		contentPane.add(lblAngulo);

		Insets insets = new Insets(5,5,5,5);
		txtGrado = new JTextField("");
		txtGrado.setBounds(120, 30, 60, 30);
		txtGrado.setHorizontalAlignment(SwingConstants.RIGHT);
        txtGrado.setMargin(insets);
		contentPane.add(txtGrado);
		txtAngulo = new JTextField("");
		txtAngulo.setBounds(120, 70, 60, 30);
		txtAngulo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAngulo.setMargin(insets);
        contentPane.add(txtAngulo);
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(55, 125, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
	    
	private void btnCalcular_Click() {
		int g = Integer.parseInt(txtGrado.getText());
		
		String a ="";

		 if (g == 0) a = "Nulo";
		 else if ((0 < g) && (g < 90)) a = "Agudo";
		 else if (g == 90) a = "Recto";
		 else if ((90 < g) && (g < 180))a = "Obtuso";
		 else if (g == 180) a = "Llano";
		 else if ((180 < g) && (g < 360)) a = "Concavo";
		 else a = "Completo";
		
	    
	 txtAngulo.setText((a));
  }
	
}