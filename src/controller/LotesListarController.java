package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Lote;
import view.PharmacyManager;
import view.ViewFactory;

public class LotesListarController extends BaseController implements Initializable {

	@FXML
    private TableView<Lote> lotesTableView;

    @FXML
    private TableColumn<?, ?> idTableColumn;

    @FXML
    private TableColumn<?, ?> qtdadeTableColumn;

    @FXML
    private TableColumn<?, ?> unidDeMedidaTableColumn;

    @FXML
    private TableColumn<?, ?> loteTableColumn;

    @FXML
    private TableColumn<?, ?> validadeTableColumn;

    @FXML
    private TableColumn<?, ?> custoTableColumn;

    @FXML
    private TableColumn<?, ?> insumoIdTableColumn;

    @FXML
    private TableColumn<?, ?> nroOrdemDeCompraTableColumn;
    
    private MenuItem editarMenuItem = new MenuItem("editar");
    
    private Lote selectedLote = null;
	
	public LotesListarController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}
	
	private void setUpContextMenus() {

		editarMenuItem.setOnAction(e -> {
		});
	}

	private void setUpLotesSelection() {
		lotesTableView.setOnMouseClicked(e -> {
			 Lote lote = lotesTableView.getSelectionModel().getSelectedItem();
			 if (lote != null) { 
				 this.selectedLote = lote;
			 }
		});
	}
	
	private void setUpLotesTableView() {
//		senderCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("sender"));
//		subjectCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("subject"));
//		recipientCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("recipient"));
//		sizeCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, SizeInteger>("size"));
//		dateCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, Date>("date"));

		lotesTableView.setContextMenu(new ContextMenu(editarMenuItem));
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		setUpContextMenus();
		setUpLotesSelection();
		setUpLotesTableView();
	}

}
