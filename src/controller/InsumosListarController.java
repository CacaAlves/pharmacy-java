package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Formula;
import model.Insumo;
import view.PharmacyManager;
import view.ViewFactory;

public class InsumosListarController extends BaseController implements Initializable {

	@FXML
    private TableView<Insumo> insumosTableView;

    @FXML
    private TableColumn<?, ?> idTableColumn;

    @FXML
    private TableColumn<?, ?> nomeTableColumn;

    @FXML
    private TableColumn<?, ?> tipoTableColumn;

    @FXML
    private TableColumn<?, ?> fatorDeEqTableColumn;

    @FXML
    private TableColumn<?, ?> fatorDeCorTableColumn;

    @FXML
    private TableColumn<?, ?> dcbTableColumn;

    @FXML
    private TableColumn<?, ?> margemDeLucroTableColumn;

    @FXML
    private TableColumn<?, ?> dosMinTableColumn;

    @FXML
    private TableColumn<?, ?> dosMaxTableColumn;

    @FXML
    private TableColumn<?, ?> qtdEstoqueTableColumn;

    @FXML
    private TableColumn<?, ?> pontoDeCompraTableColumn;

    private MenuItem showBulaMenuItem = new MenuItem("ler a bula");
    
    private Formula formula = null;
	
	public InsumosListarController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}

	private void setUpContextMenus() {
		
		showBulaMenuItem.setOnAction(e -> {
			viewFactory.showLerBula(pharmacyManager.selectedInsumo);
		});
	}
	
	private void setUpInsumoSelection() {
		insumosTableView.setOnMouseClicked(e -> {
			 Insumo insumo = insumosTableView.getSelectionModel().getSelectedItem();
			 if (insumo != null) { 
				 pharmacyManager.setSelectedInsumo(insumo);
			 }
		});
	}

	private void setUpInsumoTableView() {
//		senderCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("sender"));
//		subjectCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("subject"));
//		recipientCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("recipient"));
//		sizeCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, SizeInteger>("size"));
//		dateCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, Date>("date"));
		
		insumosTableView.setContextMenu(new ContextMenu(showBulaMenuItem));
	}
	
	public void setFormula(Formula formula) {
		this.formula = formula;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		setUpContextMenus();
		setUpInsumoSelection();
		setUpInsumoTableView();
	}


}
