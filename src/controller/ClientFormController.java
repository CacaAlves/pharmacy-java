package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import view.PharmacyManager;
import view.ViewFactory;

public class ClientFormController extends BaseController implements Initializable {

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
    private TextField convenioCnpjTextField;


	
	public ClientFormController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}
	
	@FXML
	void salvarBtnOnAction(ActionEvent event) {
		System.out.println("Salvar");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
