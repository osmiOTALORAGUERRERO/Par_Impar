import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) {
		ParImpar parImpar = new ParImpar("Numero");
		GUI piGui = new GUI(parImpar);
		piGui.setVisible(true);
	}
	
}
