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
	private TableView<�ڋq���X�g> kintoneTable;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		salesforceTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		kintoneTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		EntityManager em = Persistence.createEntityManagerFactory("kintone").createEntityManager();
		kintoneTable.getItems().addAll(em.createNamedQuery("�ڋq���X�g.findAll", �ڋq���X�g.class).getResultList());

		em = Persistence.createEntityManagerFactory("salesforce").createEntityManager();
		salesforceTable.getItems().addAll(em.createNamedQuery("Contact.findAll", Contact.class).getResultList());
	}
	
	@FXML
	private void importOnClick(MouseEvent event) {
		
		EntityManager em = Persistence.createEntityManagerFactory("kintone").createEntityManager();
		
		em.getTransaction().begin();
		
		for (Contact contact : salesforceTable.getSelectionModel().getSelectedItems()) {
			
			�ڋq���X�g kintoneItem = kintoneTable.getItems().stream()
				.filter(o -> o.get���[���A�h���X().equals(contact.getEmail()))
				.findFirst()
				.orElse(new �ڋq���X�g());
			
			kintoneItem.set���[���A�h���X(contact.getEmail());
			kintoneItem.set��Ж�(contact.getAccountName());
			kintoneItem.set�Z��(contact.getAccountAddress());
			kintoneItem.set�S���Җ�(contact.getName());
			kintoneItem.set������(Optional.ofNullable(contact.getDepartment()).orElse(""));
			kintoneItem.set�X�֔ԍ�_�����̂�_(Optional.ofNullable(contact.getAccountBillingPostalCode()).orElse("").replace("-", ""));
			kintoneItem.setTel_�����̂�_(contact.getPhone());
			kintoneItem.setFax_�����̂�_(contact.getFax());
			kintoneItem.set���l("");
			kintoneItem.set�o�x("");
			kintoneItem.set�ܓx("");
			
			if (kintoneItem.getRecordId() == 0) {
				em.persist(kintoneItem);
			}
		}
		
		em.getTransaction().commit();
		
		kintoneTable.getItems().clear();
		kintoneTable.getItems().addAll(em.createNamedQuery("�ڋq���X�g.findAll", �ڋq���X�g.class).getResultList());
	}
	
}
