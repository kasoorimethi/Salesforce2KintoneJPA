package application;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the "Contact" database table.
 * 
 */
@Entity
@Table(name="\"Contact\"")
@NamedQuery(name="Contact.findAll", query="SELECT c FROM Contact c")
public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;

	@JoinColumn(name="AccountId", referencedColumnName="Id")
	private Account account;
	
	public String getAccountName() {
		if (account == null) {
			return "";
		}
		return account.getName();
	}
	
	public String getAccountAddress() {
		if (account == null) {
			return "";
		}
		return account.getBillingState() + account.getBillingCity() + account.getBillingStreet();
	}
	
	public String getAccountBillingPostalCode() {
		if (account == null) {
			return "";
		}
		return account.getBillingPostalCode();
	}
	
	@Id
	@Column(name="\"Id\"")
	private String id;

	@Column(name="\"AccountAddress__c\"")
	private String accountAddress__c;

	@Column(name="\"AccountId\"")
	private String accountId;

	@Column(name="\"AccountName__c\"")
	private String accountName__c;

	@Column(name="\"AssistantName\"")
	private String assistantName;

	@Column(name="\"AssistantPhone\"")
	private String assistantPhone;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Birthdate\"")
	private Date birthdate;

	@Column(name="\"CleanStatus\"")
	private String cleanStatus;

	@Column(name="\"CreatedById\"")
	private String createdById;

	@Column(name="\"CreatedDate\"")
	private Timestamp createdDate;

	@Column(name="\"Department\"")
	private String department;

	@Column(name="\"Description\"")
	private String description;

	@Column(name="\"Email\"")
	private String email;

	@Column(name="\"EmailBouncedDate\"")
	private Timestamp emailBouncedDate;

	@Column(name="\"EmailBouncedReason\"")
	private String emailBouncedReason;

	@Column(name="\"Fax\"")
	private String fax;

	@Column(name="\"FirstName\"")
	private String firstName;

	@Column(name="\"HomePhone\"")
	private String homePhone;

	@Column(name="\"IsDeleted\"")
	private boolean isDeleted;

	@Column(name="\"IsEmailBounced\"")
	private boolean isEmailBounced;

	@Column(name="\"Jigsaw\"")
	private String jigsaw;

	@Column(name="\"JigsawContactId\"")
	private String jigsawContactId;

	@Column(name="\"Languages__c\"")
	private String languages__c;

	@Temporal(TemporalType.DATE)
	@Column(name="\"LastActivityDate\"")
	private Date lastActivityDate;

	@Column(name="\"LastCURequestDate\"")
	private Timestamp lastCURequestDate;

	@Column(name="\"LastCUUpdateDate\"")
	private Timestamp lastCUUpdateDate;

	@Column(name="\"LastModifiedById\"")
	private String lastModifiedById;

	@Column(name="\"LastModifiedDate\"")
	private Timestamp lastModifiedDate;

	@Column(name="\"LastName\"")
	private String lastName;

	@Column(name="\"LastReferencedDate\"")
	private Timestamp lastReferencedDate;

	@Column(name="\"LastViewedDate\"")
	private Timestamp lastViewedDate;

	@Column(name="\"LeadSource\"")
	private String leadSource;

	@Column(name="\"Level__c\"")
	private String level__c;

	@Column(name="\"MailingCity\"")
	private String mailingCity;

	@Column(name="\"MailingCountry\"")
	private String mailingCountry;

	@Column(name="\"MailingLatitude\"")
	private double mailingLatitude;

	@Column(name="\"MailingLongitude\"")
	private double mailingLongitude;

	@Column(name="\"MailingPostalCode\"")
	private String mailingPostalCode;

	@Column(name="\"MailingState\"")
	private String mailingState;

	@Column(name="\"MailingStreet\"")
	private String mailingStreet;

	@Column(name="\"MasterRecordId\"")
	private String masterRecordId;

	@Column(name="\"MobilePhone\"")
	private String mobilePhone;

	@Column(name="\"Name\"")
	private String name;

	@Column(name="\"OtherCity\"")
	private String otherCity;

	@Column(name="\"OtherCountry\"")
	private String otherCountry;

	@Column(name="\"OtherLatitude\"")
	private double otherLatitude;

	@Column(name="\"OtherLongitude\"")
	private double otherLongitude;

	@Column(name="\"OtherPhone\"")
	private String otherPhone;

	@Column(name="\"OtherPostalCode\"")
	private String otherPostalCode;

	@Column(name="\"OtherState\"")
	private String otherState;

	@Column(name="\"OtherStreet\"")
	private String otherStreet;

	@Column(name="\"OwnerId\"")
	private String ownerId;

	@Column(name="\"Phone\"")
	private String phone;

	@Column(name="\"PhotoUrl\"")
	private String photoUrl;

	@Column(name="\"ReportsToId\"")
	private String reportsToId;

	@Column(name="\"Salutation\"")
	private String salutation;

	@Column(name="\"SystemModstamp\"")
	private Timestamp systemModstamp;

	@Column(name="\"Title\"")
	private String title;

	public Contact() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountAddress__c() {
		return this.accountAddress__c;
	}

	public void setAccountAddress__c(String accountAddress__c) {
		this.accountAddress__c = accountAddress__c;
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName__c() {
		return this.accountName__c;
	}

	public void setAccountName__c(String accountName__c) {
		this.accountName__c = accountName__c;
	}

	public String getAssistantName() {
		return this.assistantName;
	}

	public void setAssistantName(String assistantName) {
		this.assistantName = assistantName;
	}

	public String getAssistantPhone() {
		return this.assistantPhone;
	}

	public void setAssistantPhone(String assistantPhone) {
		this.assistantPhone = assistantPhone;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getCleanStatus() {
		return this.cleanStatus;
	}

	public void setCleanStatus(String cleanStatus) {
		this.cleanStatus = cleanStatus;
	}

	public String getCreatedById() {
		return this.createdById;
	}

	public void setCreatedById(String createdById) {
		this.createdById = createdById;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getEmailBouncedDate() {
		return this.emailBouncedDate;
	}

	public void setEmailBouncedDate(Timestamp emailBouncedDate) {
		this.emailBouncedDate = emailBouncedDate;
	}

	public String getEmailBouncedReason() {
		return this.emailBouncedReason;
	}

	public void setEmailBouncedReason(String emailBouncedReason) {
		this.emailBouncedReason = emailBouncedReason;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getHomePhone() {
		return this.homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public boolean getIsEmailBounced() {
		return this.isEmailBounced;
	}

	public void setIsEmailBounced(boolean isEmailBounced) {
		this.isEmailBounced = isEmailBounced;
	}

	public String getJigsaw() {
		return this.jigsaw;
	}

	public void setJigsaw(String jigsaw) {
		this.jigsaw = jigsaw;
	}

	public String getJigsawContactId() {
		return this.jigsawContactId;
	}

	public void setJigsawContactId(String jigsawContactId) {
		this.jigsawContactId = jigsawContactId;
	}

	public String getLanguages__c() {
		return this.languages__c;
	}

	public void setLanguages__c(String languages__c) {
		this.languages__c = languages__c;
	}

	public Date getLastActivityDate() {
		return this.lastActivityDate;
	}

	public void setLastActivityDate(Date lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}

	public Timestamp getLastCURequestDate() {
		return this.lastCURequestDate;
	}

	public void setLastCURequestDate(Timestamp lastCURequestDate) {
		this.lastCURequestDate = lastCURequestDate;
	}

	public Timestamp getLastCUUpdateDate() {
		return this.lastCUUpdateDate;
	}

	public void setLastCUUpdateDate(Timestamp lastCUUpdateDate) {
		this.lastCUUpdateDate = lastCUUpdateDate;
	}

	public String getLastModifiedById() {
		return this.lastModifiedById;
	}

	public void setLastModifiedById(String lastModifiedById) {
		this.lastModifiedById = lastModifiedById;
	}

	public Timestamp getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(Timestamp lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Timestamp getLastReferencedDate() {
		return this.lastReferencedDate;
	}

	public void setLastReferencedDate(Timestamp lastReferencedDate) {
		this.lastReferencedDate = lastReferencedDate;
	}

	public Timestamp getLastViewedDate() {
		return this.lastViewedDate;
	}

	public void setLastViewedDate(Timestamp lastViewedDate) {
		this.lastViewedDate = lastViewedDate;
	}

	public String getLeadSource() {
		return this.leadSource;
	}

	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}

	public String getLevel__c() {
		return this.level__c;
	}

	public void setLevel__c(String level__c) {
		this.level__c = level__c;
	}

	public String getMailingCity() {
		return this.mailingCity;
	}

	public void setMailingCity(String mailingCity) {
		this.mailingCity = mailingCity;
	}

	public String getMailingCountry() {
		return this.mailingCountry;
	}

	public void setMailingCountry(String mailingCountry) {
		this.mailingCountry = mailingCountry;
	}

	public double getMailingLatitude() {
		return this.mailingLatitude;
	}

	public void setMailingLatitude(double mailingLatitude) {
		this.mailingLatitude = mailingLatitude;
	}

	public double getMailingLongitude() {
		return this.mailingLongitude;
	}

	public void setMailingLongitude(double mailingLongitude) {
		this.mailingLongitude = mailingLongitude;
	}

	public String getMailingPostalCode() {
		return this.mailingPostalCode;
	}

	public void setMailingPostalCode(String mailingPostalCode) {
		this.mailingPostalCode = mailingPostalCode;
	}

	public String getMailingState() {
		return this.mailingState;
	}

	public void setMailingState(String mailingState) {
		this.mailingState = mailingState;
	}

	public String getMailingStreet() {
		return this.mailingStreet;
	}

	public void setMailingStreet(String mailingStreet) {
		this.mailingStreet = mailingStreet;
	}

	public String getMasterRecordId() {
		return this.masterRecordId;
	}

	public void setMasterRecordId(String masterRecordId) {
		this.masterRecordId = masterRecordId;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOtherCity() {
		return this.otherCity;
	}

	public void setOtherCity(String otherCity) {
		this.otherCity = otherCity;
	}

	public String getOtherCountry() {
		return this.otherCountry;
	}

	public void setOtherCountry(String otherCountry) {
		this.otherCountry = otherCountry;
	}

	public double getOtherLatitude() {
		return this.otherLatitude;
	}

	public void setOtherLatitude(double otherLatitude) {
		this.otherLatitude = otherLatitude;
	}

	public double getOtherLongitude() {
		return this.otherLongitude;
	}

	public void setOtherLongitude(double otherLongitude) {
		this.otherLongitude = otherLongitude;
	}

	public String getOtherPhone() {
		return this.otherPhone;
	}

	public void setOtherPhone(String otherPhone) {
		this.otherPhone = otherPhone;
	}

	public String getOtherPostalCode() {
		return this.otherPostalCode;
	}

	public void setOtherPostalCode(String otherPostalCode) {
		this.otherPostalCode = otherPostalCode;
	}

	public String getOtherState() {
		return this.otherState;
	}

	public void setOtherState(String otherState) {
		this.otherState = otherState;
	}

	public String getOtherStreet() {
		return this.otherStreet;
	}

	public void setOtherStreet(String otherStreet) {
		this.otherStreet = otherStreet;
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhotoUrl() {
		return this.photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getReportsToId() {
		return this.reportsToId;
	}

	public void setReportsToId(String reportsToId) {
		this.reportsToId = reportsToId;
	}

	public String getSalutation() {
		return this.salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public Timestamp getSystemModstamp() {
		return this.systemModstamp;
	}

	public void setSystemModstamp(Timestamp systemModstamp) {
		this.systemModstamp = systemModstamp;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}