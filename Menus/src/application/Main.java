package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("Archivo");
        Menu editMenu = new Menu("Editar");
        Menu helpMenu = new Menu("Ayuda");

        MenuItem newItem = new MenuItem("Nuevo");
        MenuItem openItem = new MenuItem("Abrir");
        MenuItem saveItem = new MenuItem("Guardar");
        MenuItem exitItem = new MenuItem("Salir");

        newItem.setOnAction(e -> System.out.println("Nuevo archivo creado"));
        openItem.setOnAction(e -> System.out.println("Abrir archivo"));
        saveItem.setOnAction(e -> System.out.println("Guardar archivo"));
        exitItem.setOnAction(e -> System.out.println("Salir del programa"));

        fileMenu.getItems().addAll(newItem, openItem, saveItem, new SeparatorMenuItem(), exitItem);

        MenuItem cutItem = new MenuItem("Cortar");
        MenuItem copyItem = new MenuItem("Copiar");
        MenuItem pasteItem = new MenuItem("Pegar");

        cutItem.setOnAction(e -> System.out.println("Cortar texto"));
        copyItem.setOnAction(e -> System.out.println("Copiar texto"));
        pasteItem.setOnAction(e -> System.out.println("Pegar texto"));

        editMenu.getItems().addAll(cutItem, copyItem, pasteItem);

        MenuItem aboutItem = new MenuItem("Acerca de");

        aboutItem.setOnAction(e -> System.out.println("Mostrar información sobre el programa"));

        helpMenu.getItems().addAll(aboutItem);

        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Aplicación con Barra de Menú");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }

    public static void main(String[] args) {
        launch(args);
    }
}


