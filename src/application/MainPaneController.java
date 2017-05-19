package application;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;


public class MainPaneController implements Initializable {

	@FXML
	private TableView<Contact> salesforceTable;
	
	@FXML
	private TableView<顧客リスト> kintoneTable;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		salesforceTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		kintoneTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		EntityManager em = Persistence.createEntityManagerFactory("kintone").createEntityManager();
		kintoneTable.getItems().addAll(em.createNamedQuery("顧客リスト.findAll", 顧客リスト.class).getResultList());

		em = Persistence.createEntityManagerFactory("salesforce").createEntityManager();
		salesforceTable.getItems().addAll(em.createNamedQuery("Contact.findAll", Contact.class).getResultList());
	}
	
	@FXML
	private void importOnClick(MouseEvent event) {
		
		EntityManager em = Persistence.createEntityManagerFactory("kintone").createEntityManager();
		
		em.getTransaction().begin();
		
		for (Contact contact : salesforceTable.getSelectionModel().getSelectedItems()) {
			
			顧客リスト kintoneItem = kintoneTable.getItems().stream()
				.filter(o -> o.getメールアドレス().equals(contact.getEmail()))
				.findFirst()
				.orElse(new 顧客リスト());
			
			kintoneItem.setメールアドレス(contact.getEmail());
			kintoneItem.set会社名(contact.getAccountName());
			kintoneItem.set住所(contact.getAccountAddress());
			kintoneItem.set担当者名(contact.getName());
			kintoneItem.set部署名(Optional.ofNullable(contact.getDepartment()).orElse(""));
			kintoneItem.set郵便番号_数字のみ_(Optional.ofNullable(contact.getAccountBillingPostalCode()).orElse("").replace("-", ""));
			kintoneItem.setTel_数字のみ_(contact.getPhone());
			kintoneItem.setFax_数字のみ_(contact.getFax());
			kintoneItem.set備考("");
			kintoneItem.set経度("");
			kintoneItem.set緯度("");
			
			if (kintoneItem.getRecordId() == 0) {
				em.persist(kintoneItem);
			}
		}
		
		em.getTransaction().commit();
		
		kintoneTable.getItems().clear();
		kintoneTable.getItems().addAll(em.createNamedQuery("顧客リスト.findAll", 顧客リスト.class).getResultList());
	}
	
}
