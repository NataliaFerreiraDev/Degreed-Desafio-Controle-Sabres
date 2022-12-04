package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

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
		System.out.println("Sobre");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}

}
