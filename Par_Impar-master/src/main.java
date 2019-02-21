import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) {
		
		ParImpar parImpar = new ParImpar();
		par_imparGUI parImparGUI = new par_imparGUI(parImpar);
		parImparGUI.setVisible(true);
	}

}
