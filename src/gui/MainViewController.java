package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemSabreCadastrar;
	
	@FXML
	private MenuItem menuItemSabrePesquisar;
	
	@FXML
	private MenuItem menuItemSabreListar;

	@FXML
	private MenuItem menuItemManutencaoCadastrar;
	
	@FXML
	private MenuItem menuItemManutencaoPesquisar;
	
	@FXML
	private MenuItem menuItemManutencaoListar;

	@FXML
	private MenuItem menuItemSobre;

	@FXML
	public void onMenuItemSabreCadastrarAction() {
		System.out.println("Cadastrar Sabre");
	}
	
	@FXML
	public void onMenuItemSabrePesquisarAction() {
		System.out.println("Pesquisar Sabre");
	}
	
	@FXML
	public void onMenuItemSabreListarAction() {
		System.out.println("Listar Sabre");
	}

	@FXML
	public void onMenuItemManutencaoCadastrarAction() {
		System.out.println("Cadastrar Manutencao");
	}
	
	@FXML
	public void onMenuItemManutencaoPesquisarAction() {
		System.out.println("Pesquisar Manutencao");
	}
	
	@FXML
	public void onMenuItemManutencaoListarAction() {
		System.out.println("Listar Manutencao");
	}

	@FXML
	public void onMenuItemSobreAction() {
		loadView("/gui/Sobre.fxml");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}
	
	private synchronized void loadView(String absoluteName) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());
			
			
		} catch (IOException ex) {
			Alerts.showAlert("IO Exception", "Erro ao carregar a tela", ex.getMessage(), AlertType.ERROR);
		}
	}

}
