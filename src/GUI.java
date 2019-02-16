import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener{
	
	public JLabel jlNumero;
	public JTextField jtfNumero; 
	public JButton jbCalculo;
	private ParImpar parImpar;
	
	public GUI(ParImpar parImpar)
	{
		setSize(400, 120);
		setTitle("Calcualdora");
		setLocationRelativeTo(null);
		setLayout(null);
		Container ctn = this.getContentPane();
        ctn.setBackground(new Color(206,206,206));
        this.parImpar = parImpar;
        
        jlNumero = new JLabel(" Numero  ");
        jlNumero.setBounds(20, 30, 80, 30);
        
        jtfNumero = new JTextField();
        jtfNumero.setBounds(90, 30, 150, 30);
        
        jbCalculo = new JButton("Calcular");
        jbCalculo.setBounds(250, 30, 140, 30);
        jbCalculo.addActionListener(this);
                
        add(jlNumero);
        add(jtfNumero);
        add(jbCalculo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == jbCalculo) {
			this.parImpar.setStrNumber(jtfNumero.getText());
			respuesta(this.parImpar.comprobarNumero());
		}
	}
	
	private void respuesta(String respuesta) {
		JOptionPane.showMessageDialog(null, respuesta, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
	}
}
