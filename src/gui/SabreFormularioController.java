package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class SabreFormularioController implements Initializable {
	
	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtJedi;
	
	@FXML
	private TextField txtFabricacao;
	
	@FXML
	private ComboBox<String> cbxSituacao;
	
	@FXML
	private ComboBox<String> cbxModelo;
	
	@FXML
	private TextField txtModeloBotao;
	
	@FXML
	private TextField txtGalaxias;
	
	@FXML
	private TextField txtModeloSensor;
	
	@FXML
	private TextField txtValidadeSensor;
	
	@FXML
	private Button btnSalvar;
	
	@FXML
	public void onBtnSalvarAction(ActionEvent event) {
		System.out.println("Salvo");
	}
	
	@FXML
	public void onBtnCancelarAction(ActionEvent event) {
		System.out.println("Cancelado");
	}
	
	@FXML
	private Button btnCancelar;
	
	private String[] situacao = {"PRONTO", "OBSOLETO", "EM MANUTENCAO"};
	
	private String[] modelo = {"MANUAL", "SEMIAUTOMATICO", "AUTOMATICO"};

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
		cbxSituacao.getItems().addAll(situacao);
		cbxModelo.getItems().addAll(modelo);
	}
	
	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtJedi, 50);
		Constraints.setTextFieldMaxLength(txtFabricacao, 10);
		Constraints.setTextFieldMaxLength(txtModeloBotao, 10);
		Constraints.setTextFieldMaxLength(txtGalaxias, 30);
		Constraints.setTextFieldMaxLength(txtModeloSensor, 10);
		Constraints.setTextFieldMaxLength(txtValidadeSensor, 10);
	}

}
