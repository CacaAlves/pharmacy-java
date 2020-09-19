package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import view.PharmacyManager;
import view.ViewFactory;

public class ConveniosListarController extends BaseController implements Initializable {

	@FXML
    private TableView<?> conveniosMedicosTableView;

    @FXML
    private TableColumn<?, ?> cnpjTableColumn;

    @FXML
    private TableColumn<?, ?> nomeTableColumn;

    @FXML
    private TableColumn<?, ?> telefoneTableColumn;

    @FXML
    private TableColumn<?, ?> nomeDoContatoTableColumn;

    @FXML
    private TableColumn<?, ?> inscricaoEstadualTableColumn;

    @FXML
    private TableColumn<?, ?> percentualDeDescontoTableColumn;

    @FXML
    private TableColumn<?, ?> enderecoTableColumn;

    @FXML
    private TableColumn<?, ?> numeroTableColumn;

    @FXML
    private TableColumn<?, ?> logradouroTableColum;

    @FXML
    private TableColumn<?, ?> cepTableColum;
	
	public ConveniosListarController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
