module Exemplo_Java_FX001 {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
