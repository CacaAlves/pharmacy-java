package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import view.PharmacyManager;
import view.ViewFactory;

public class EscolherInsumosController extends BaseController implements Initializable {

	@FXML
    private TableView<?> escolherInsumosTableView;

    @FXML
    private TableColumn<?, ?> idTableColumn;

    @FXML
    private TableColumn<?, ?> nomeTableColumn;

    @FXML
    private TableColumn<?, ?> quantidadeTableColumn;

    @FXML
    private TableColumn<?, ?> unidadeDeMedidaTableColumn;

    @FXML
    private TableColumn<?, ?> nroDeNotificacaoTableColumn;

    @FXML
    private TableColumn<?, ?> selecionarTableColumn;
	
	public EscolherInsumosController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
