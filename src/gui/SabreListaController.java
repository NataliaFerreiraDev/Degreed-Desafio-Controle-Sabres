package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Sabre;

public class SabreListaController implements Initializable {

	@FXML
	private TableView<Sabre> tableViewSabres;
	
	@FXML
	private TableColumn<Sabre, Integer> tableColumnId;
	
	@FXML
	private TableColumn<Sabre, String> tableColumnJedi;
	
	@FXML
	private TableColumn<Sabre, String> tableColumnFabricacao;
	
	@FXML
	private TableColumn<Sabre, String> tableColumnSituacao;
	
	@FXML
	private TableColumn<Sabre, String> tableColumnModelo;
	
	@FXML
	private TableColumn<Sabre, String> tableColumnBotao;
	
	@FXML
	private TableColumn<Sabre, String> tableColumnGalaxia;
	
	@FXML
	private TableColumn<Sabre, String> tableColumnSensor;
	
	@FXML
	private TableColumn<Sabre, String> tableColumnValidade;
 	
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		initializeNodes();
	}
	
	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("idSabre"));
		tableColumnJedi.setCellValueFactory(new PropertyValueFactory<>("jedi"));
		tableColumnFabricacao.setCellValueFactory(new PropertyValueFactory<>("dataFabricacao"));
		tableColumnSituacao.setCellValueFactory(new PropertyValueFactory<>("situacao"));
		tableColumnModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
		tableColumnBotao.setCellValueFactory(new PropertyValueFactory<>("modeloBotaoDestrava"));
		tableColumnGalaxia.setCellValueFactory(new PropertyValueFactory<>("galaxias"));
		tableColumnSensor.setCellValueFactory(new PropertyValueFactory<>("modeloSensorDestrava"));
		tableColumnValidade.setCellValueFactory(new PropertyValueFactory<>("validadeSensorDestrava"));
		
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewSabres.prefHeightProperty().bind(stage.heightProperty());
	
	}

}
