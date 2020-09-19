package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import view.PharmacyManager;
import view.ViewFactory;

public class VendedorFormController extends BaseController implements Initializable {

	  @FXML
	    private TextField numeroRgTextField;

	    @FXML
	    private TextField orgaoExpedidorTextField;

	    @FXML
	    private TextField ufTextField;

	    @FXML
	    private TextField nomeTextField;

	    @FXML
	    private TextField telefoneTextField;

	    @FXML
	    private TextField sexoTextField;

	    @FXML
	    private DatePicker dataDeNascimentoDatePicker;

	    @FXML
	    private DatePicker dataDeIngressoDatePicker;

	    @FXML
	    private DatePicker dataDeSaidaDatePicker;

	    @FXML
	    private TextField enderecoTextField;

	    @FXML
	    private TextField logradouroTextField;

	    @FXML
	    private TextField numeroTextField;

	    @FXML
	    private TextField cepTextField;

	
	public VendedorFormController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}

	@FXML
	void salvarBtnOnAction(ActionEvent event) {
		Stage stage = (Stage) cepTextField.getScene().getWindow();
		viewFactory.closeStage(stage);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
