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
import view.PharmacyManager;
import view.ViewFactory;

public class FornecedoresListarController extends BaseController implements Initializable {

	@FXML
    private TableView<Fornecedor> fornecedoresTableView;

    @FXML
    private TableColumn<?, ?> cnpjTableColumn;

    @FXML
    private TableColumn<?, ?> razaoSocialTableColumn;

    @FXML
    private TableColumn<?, ?> inscricaoEstadualTableColumn;

    @FXML
    private TableColumn<?, ?> emailTableColumn;

    @FXML
    private TableColumn<?, ?> enderecoTableColumn;

    @FXML
    private TableColumn<?, ?> numeroTableColumn;

    @FXML
    private TableColumn<?, ?> logradouroTableColumn;

    @FXML
    private TableColumn<?, ?> cepTableColumn;

	private Fornecedor selectedFornecedor = null;
    
	private MenuItem showFornecedorContatosMenuItem = new MenuItem("mostrar contatos");

	private MenuItem editarMenuItem = new MenuItem("editar");

	public FornecedoresListarController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}

	private void setUpContextMenus() {

		showFornecedorContatosMenuItem.setOnAction(e -> {
			viewFactory.showFornecedorContatos(selectedFornecedor);
		});
		
		editarMenuItem.setOnAction(e -> {
			
		});
	}
	
	private void setUpFornecedorSelection() {
		fornecedoresTableView.setOnMouseClicked(e -> {
			 Fornecedor fornecedor = fornecedoresTableView.getSelectionModel().getSelectedItem();
			 if (fornecedor != null) { 
				 this.selectedFornecedor = fornecedor;
			 }
		});
	}
	private void setUpFornecedorTableView() {
//		senderCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("sender"));
//		subjectCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("subject"));
//		recipientCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("recipient"));
//		sizeCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, SizeInteger>("size"));
//		dateCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, Date>("date"));
		
		fornecedoresTableView.setContextMenu(new ContextMenu(showFornecedorContatosMenuItem, editarMenuItem));
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		setUpContextMenus();
		setUpFornecedorSelection();
		setUpFornecedorTableView();
	}

}
