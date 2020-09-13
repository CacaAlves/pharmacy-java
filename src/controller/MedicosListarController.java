package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import view.PharmacyManager;
import view.ViewFactory;

public class MedicosListarController extends BaseController implements Initializable {

	@FXML
    private TableView<?> medicosTableView;

    @FXML
    private TableColumn<?, ?> idTableColumn;

    @FXML
    private TableColumn<?, ?> nroDeRegistroTableColumn;

    @FXML
    private TableColumn<?, ?> emailTableColumn;

    @FXML
    private TableColumn<?, ?> enderecoTableColumn;

    @FXML
    private TableColumn<?, ?> logradouroTableColumn;

    @FXML
    private TableColumn<?, ?> numeroTableColumn;

    @FXML
    private TableColumn<?, ?> cepTableColumn;

    @FXML
    private TableColumn<?, ?> telefoneTableColumn;

	
	public MedicosListarController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
