package dad.buscarreemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarReemplazar extends Application {
	
	Label buscarLabel, reemplazarLabel;
	TextField buscarText, reemplazarText;
	Button buscarButton, reemplazarButton, reemplazartodoButton, cerrarButton, ayudaButton;
	CheckBox mayusminusCheck, expresionRegularCheck, buscarHaciaCheck, resaltarResultadoCheck;
	BorderPane root;
	GridPane parteIzquierda, parteCheckBox;
	VBox parteDerecha;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		buscarLabel = new Label();
		buscarLabel.setText("Buscar: ");
		
		reemplazarLabel = new Label();
		reemplazarLabel.setText("Reemplazar: ");
		
		buscarText = new TextField();
		//buscarText.setPrefWidth(Double.MAX_VALUE);
		//buscarText.setMaxWidth(Double.MAX_VALUE);
		
		reemplazarText = new TextField();
		//reemplazarText.setPrefWidth(Double.MAX_VALUE);
		//reemplazarText.setMaxWidth(Double.MAX_VALUE);
		
		//CREAMOS LOS BOTONES
		buscarButton = new Button();
		reemplazarButton = new Button();
		reemplazartodoButton = new Button();
		cerrarButton = new Button();
		ayudaButton = new Button();
		
		//LES PONEMOS UN TITULO
		buscarButton.setText("Buscar");
		reemplazarButton.setText("Reemplazar");
		reemplazartodoButton.setText("Reemplazar todo");
		cerrarButton.setText("Cerrar");
		ayudaButton.setText("Ayuda");
		
		//PONEMOS EL ANCHO DE LOS BOTONES AL MAXIMO PARA QUE TENGAN TODOS EL MISMO TAMANO
		buscarButton.setMaxWidth(Double.MAX_VALUE);
		reemplazarButton.setMaxWidth(Double.MAX_VALUE);
		reemplazartodoButton.setMaxWidth(Double.MAX_VALUE);
		cerrarButton.setMaxWidth(Double.MAX_VALUE);
		ayudaButton.setMaxWidth(Double.MAX_VALUE);
		
		
		
		
		//PARTE DE LOS CHECKBOX'S
		parteCheckBox = new GridPane();
		parteCheckBox.setPadding(new Insets(5));
		parteCheckBox.setVgap(5);
		parteCheckBox.setHgap(5);
		
		
		mayusminusCheck = new CheckBox();
		mayusminusCheck.setText("Mayúsculas y minúsculas");
		
		expresionRegularCheck = new CheckBox();
		expresionRegularCheck.setText("Expresión regular");
		
		buscarHaciaCheck = new CheckBox();
		buscarHaciaCheck.setText("Buscar hacia atrás");
		
		resaltarResultadoCheck = new CheckBox();
		resaltarResultadoCheck.setText("Resaltar resultados");
		
		parteCheckBox.add(mayusminusCheck, 0, 0);
		parteCheckBox.add(buscarHaciaCheck, 1, 0);
		parteCheckBox.add(expresionRegularCheck, 0, 1);
		parteCheckBox.add(resaltarResultadoCheck, 1, 1);
		
		root = new BorderPane();
		parteIzquierda = new GridPane();
		parteDerecha = new VBox();
		
		//COLOCAMOS LOS ELEMENTOS
		
		//VBOX DE LA PARTE DERECHA
		parteDerecha.getChildren().addAll(buscarButton, reemplazarButton, reemplazartodoButton, cerrarButton, ayudaButton);
		parteDerecha.setSpacing(5);
		parteDerecha.setPadding(new Insets(5));
		
		//GRIDPANE DE LA PARTE IZQUIERDA
		parteIzquierda.setPadding(new Insets(5));
		parteIzquierda.setHgap(5);
		parteIzquierda.setVgap(5);
		parteIzquierda.add(buscarLabel, 0, 0);
		parteIzquierda.add(buscarText, 1, 0);
		parteIzquierda.add(reemplazarLabel, 0, 1);
		parteIzquierda.add(reemplazarText, 1, 1);
		parteIzquierda.add(parteCheckBox, 1, 2);
		
		/*
		ColumnConstraints columna2 = new ColumnConstraints(100, 100, Double.MAX_VALUE);
		columna2.setHgrow(Priority.ALWAYS);
		parteIzquierda.getColumnConstraints().add(columna2);
		*/
		
		//AÑADIENDO LOS ELEMENTOS AL PADRE
		root.setLeft(parteIzquierda);
		root.setRight(parteDerecha);
		
		Scene scene = new Scene(root, 550, 200);
		
		primaryStage.setTitle("Buscar y Reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
