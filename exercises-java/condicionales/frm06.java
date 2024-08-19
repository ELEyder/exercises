package condicionales;

import java.awt.BorderLayout;
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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class frm06 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
   
	    JTextField txtNum1, txtNum2, txtNum3, txtNum4, txtNum5;
	    JButton btnCalcular;
      
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm06 frame = new frm06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	    public frm06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNum1 = new JLabel("Edad1 :");
		lblNum1.setBounds(30, 30, 80, 30);
		contentPane.add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Edad2 :");
		lblNum2.setBounds(30, 70, 80, 30);
		contentPane.add(lblNum2);
		
		JLabel lblNum3 = new JLabel("Edad3 :");
		lblNum3.setBounds(30,110, 80, 30);
		contentPane.add(lblNum3);
		
		JLabel lblNum4 = new JLabel("Mayor :");
		lblNum4.setBounds(30, 150, 80, 30);
		contentPane.add(lblNum4);
		
		JLabel lblNum5 = new JLabel("Menor :");
		lblNum5.setBounds(30, 190, 80, 30);
		contentPane.add(lblNum5);

		Insets insets = new Insets(5,5,5,5);
		txtNum1 = new JTextField("");
		txtNum1.setBounds(120, 30, 60, 30);
		txtNum1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNum1.setMargin(insets);
		contentPane.add(txtNum1);
		
		txtNum2 = new JTextField("");
		txtNum2.setBounds(120, 70, 60, 30);
		txtNum2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNum2.setMargin(insets);
        contentPane.add(txtNum2);
        
		txtNum3 = new JTextField("");
		txtNum3.setBounds(120, 110, 60, 30);
		txtNum3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNum3.setMargin(insets);
		contentPane.add(txtNum3);
		
		txtNum4 = new JTextField("");
		txtNum4.setBounds(120, 150, 60, 30);
		txtNum4.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNum4.setMargin(insets);
		txtNum4.setFocusable(false);
        contentPane.add(txtNum4);
		
		txtNum5 = new JTextField("");
		txtNum5.setBounds(120, 190, 60, 30);
		txtNum5.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNum5.setMargin(insets);
		txtNum5.setFocusable(false);
        contentPane.add(txtNum5);
        
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60, 240, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
	    
	private void btnCalcular_Click() {
		int edad1 = Integer.parseInt(txtNum1.getText());
		int edad2 = Integer.parseInt(txtNum2.getText());
		int edad3 = Integer.parseInt(txtNum3.getText());
		
	    DecimalFormat df= new DecimalFormat("##.00");
	    
	    int mayor = edad1 > edad2 && edad1 > edad3 ? edad1 : edad2 > edad3 && edad2 > edad1 ? edad2 : edad3;
	    int menor = edad1 < edad2 && edad1 < edad3 ? edad1 : edad2 < edad3 && edad2 < edad1 ? edad2 : edad3;
	    
	 txtNum4.setText(df.format(mayor));
	 txtNum5.setText(df.format(menor));
  }
	
}