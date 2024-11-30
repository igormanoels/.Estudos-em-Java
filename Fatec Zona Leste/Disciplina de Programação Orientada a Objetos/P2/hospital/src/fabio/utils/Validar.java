package fabio.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Validar {
	
	public static void mensagemInformativa() {
		Alert alerta = new Alert(AlertType.INFORMATION);
		alerta.setTitle("Informacao");
		//alerta.setHeaderText(informacao);
		//alerta.setContentText(textoInformacao);
		alerta.show();
	}
	
	public static void mensagemAviso() {
		Alert alerta = new Alert(AlertType.WARNING);
		alerta.setTitle("Aviso");
		//alerta.setHeaderText(aviso);
		//alerta.setContentText(textoAviso + "\n" + e.getMessage());
		alerta.show();
	}
	
	

}
