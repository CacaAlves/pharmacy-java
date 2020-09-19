package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Fornecedor;
import model.FornecedorContatos;
import view.PharmacyManager;
import view.ViewFactory;

public class FornecedorContatosController extends BaseController implements Initializable {

	@FXML
	private TableView<FornecedorContatos> fornecedorContatosTableView;

	@FXML
	private TableColumn<?, ?> nomeDoContatoTableColumn;

	@FXML
	private TableColumn<?, ?> telefoneTableColumn;

	private MenuItem editarMenuItem = new MenuItem("editar");

	private Fornecedor fornecedor = null;

	private FornecedorContatos selectedFornecedorContatos = null;
	
	public FornecedorContatosController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}

	private void setUpContextMenus() {

		editarMenuItem.setOnAction(e -> {
		});
	}

	private void setUpFornecedorContatosSelection() {
		fornecedorContatosTableView.setOnMouseClicked(e -> {
			 FornecedorContatos fc = fornecedorContatosTableView.getSelectionModel().getSelectedItem();
			 if (fc != null) { 
				 this.selectedFornecedorContatos = fc;
			 }
		});
	}

	private void setUpFornecedorContatosTableView() {
//		senderCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("sender"));
//		subjectCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("subject"));
//		recipientCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("recipient"));
//		sizeCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, SizeInteger>("size"));
//		dateCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, Date>("date"));

		fornecedorContatosTableView.setContextMenu(new ContextMenu(editarMenuItem));
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		setUpContextMenus();
		setUpFornecedorContatosSelection();
		setUpFornecedorContatosTableView();
	}

}
