package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import view.PharmacyManager;
import view.ViewFactory;

public class ClientesListarController extends BaseController implements Initializable {

	@FXML
    private TableView<?> clientesTableView;

    @FXML
    private TableColumn<?, ?> rgTableColumn;

    @FXML
    private TableColumn<?, ?> orgaoExpedidorTableColumn;

    @FXML
    private TableColumn<?, ?> ufTableColumn;

    @FXML
    private TableColumn<?, ?> nomeTableColumn;

    @FXML
    private TableColumn<?, ?> telefoneTableColumn;

    @FXML
    private TableColumn<?, ?> emailTableColumn;

    @FXML
    private TableColumn<?, ?> sexoTableColumn;

    @FXML
    private TableColumn<?, ?> dataDeNascimentoTableColumn;

    @FXML
    private TableColumn<?, ?> convenioTableColum;
	
	public ClientesListarController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
