package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import application.Main;
import gui.util.Alerts;
import gui.util.Utils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.services.SabreService;

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
	public void onMenuItemSabreCadastrarAction(ActionEvent event) {
		Stage parentStage = (Stage)menuItemSabreCadastrar.getParentPopup().getOwnerWindow();
		createDialogForm("/gui/SabreFormulario.fxml", parentStage);
	}
	
	@FXML
	public void onMenuItemSabrePesquisarAction() {
		System.out.println("Pesquisar Sabre");
	}
	
	@FXML
	public void onMenuItemSabreListarAction() {
		loadView("/gui/SabreListagem.fxml", (SabreListaController controller) -> {
			controller.setSabreService(new SabreService());
			controller.updateTableViewSabres();
		});
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
		loadView("/gui/Sobre.fxml", x -> {});
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}
	
	private synchronized<T> void loadView(String absoluteName, Consumer<T> initializingAction) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());
			
			T controller = loader.getController();
			initializingAction.accept(controller);
			
			
		} catch (IOException ex) {
			Alerts.showAlert("IO Exception", "Erro ao carregar a tela", ex.getMessage(), AlertType.ERROR);
		}
	}
	
	private void createDialogForm(String absoluteName, Stage parentStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			Pane pane = loader.load();
			
			Stage dialogStage = new Stage();
			dialogStage.setTitle("Formulário Sabres");
			dialogStage.setScene(new Scene(pane));
			dialogStage.setResizable(false);
			dialogStage.initOwner(parentStage);
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.showAndWait();
			
		} catch (IOException ex) {
			Alerts.showAlert("IO Exception", "Erro ao carregar a tela", ex.getMessage(), AlertType.ERROR);
		}
	}

}
