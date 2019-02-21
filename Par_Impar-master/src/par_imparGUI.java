import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class par_imparGUI extends JFrame implements ActionListener{

	JLabel jlNumero;
	JTextField jtfNumero;
	JButton jbComprobar;
	ParImpar parImpar;
	
	public par_imparGUI(ParImpar parImpar){
		
		
		setSize(300,200);
		setLayout(null);
		Container ctn = this.getContentPane();
        ctn.setBackground(new Color(206,206,206));
        this.parImpar = parImpar;
		
		jlNumero = new JLabel("Numero");
		jlNumero.setBounds(10,35,90,30);
		
		jtfNumero = new JTextField();
		jtfNumero.setBounds(90,35,100,30);
		
		jbComprobar = new JButton("Comprobar");
		jbComprobar.setBounds(190,35,100,30);
		
		add(jlNumero);
		add(jtfNumero);
		add(jbComprobar);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
