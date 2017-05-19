package application;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the "Account" database table.
 * 
 */
@Entity
@Table(name="\"Account\"")
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"Id\"")
	private String id;

	@Column(name="\"AccountNumber\"")
	private String accountNumber;

	@Column(name="\"AccountSource\"")
	private String accountSource;

	@Column(name="\"Active__c\"")
	private String active__c;

	@Column(name="\"AnnualRevenue\"")
	private double annualRevenue;

	@Column(name="\"BillingCity\"")
	private String billingCity;

	@Column(name="\"BillingCountry\"")
	private String billingCountry;

	@Column(name="\"BillingLatitude\"")
	private double billingLatitude;

	@Column(name="\"BillingLongitude\"")
	private double billingLongitude;

	@Column(name="\"BillingPostalCode\"")
	private String billingPostalCode;

	@Column(name="\"BillingState\"")
	private String billingState;

	@Column(name="\"BillingStreet\"")
	private String billingStreet;

	@Column(name="\"CleanStatus\"")
	private String cleanStatus;

	@Column(name="\"CreatedById\"")
	private String createdById;

	@Column(name="\"CreatedDate\"")
	private Timestamp createdDate;

	@Column(name="\"CustomerPriority__c\"")
	private String customerPriority__c;

	@Column(name="\"DandbCompanyId\"")
	private String dandbCompanyId;

	@Column(name="\"Description\"")
	private String description;

	@Column(name="\"DunsNumber\"")
	private String dunsNumber;

	@Column(name="\"Fax\"")
	private String fax;

	@Column(name="\"Industry\"")
	private String industry;

	@Column(name="\"IsCustomerPortal\"")
	private boolean isCustomerPortal;

	@Column(name="\"IsDeleted\"")
	private boolean isDeleted;

	@Column(name="\"IsPartner\"")
	private boolean isPartner;

	@Column(name="\"Jigsaw\"")
	private String jigsaw;

	@Column(name="\"JigsawCompanyId\"")
	private String jigsawCompanyId;

	@Temporal(TemporalType.DATE)
	@Column(name="\"LastActivityDate\"")
	private Date lastActivityDate;

	@Column(name="\"LastModifiedById\"")
	private String lastModifiedById;

	@Column(name="\"LastModifiedDate\"")
	private Timestamp lastModifiedDate;

	@Column(name="\"LastReferencedDate\"")
	private Timestamp lastReferencedDate;

	@Column(name="\"LastViewedDate\"")
	private Timestamp lastViewedDate;

	@Column(name="\"MasterRecordId\"")
	private String masterRecordId;

	@Column(name="\"NaicsCode\"")
	private String naicsCode;

	@Column(name="\"NaicsDesc\"")
	private String naicsDesc;

	@Column(name="\"Name\"")
	private String name;

	@Column(name="\"NumberOfEmployees\"")
	private int numberOfEmployees;

	@Column(name="\"NumberofLocations__c\"")
	private double numberofLocations__c;

	@Column(name="\"OwnerId\"")
	private String ownerId;

	@Column(name="\"Ownership\"")
	private String ownership;

	@Column(name="\"ParentId\"")
	private String parentId;

	@Column(name="\"Phone\"")
	private String phone;

	@Column(name="\"PhotoUrl\"")
	private String photoUrl;

	@Column(name="\"Rating\"")
	private String rating;

	@Column(name="\"ShippingCity\"")
	private String shippingCity;

	@Column(name="\"ShippingCountry\"")
	private String shippingCountry;

	@Column(name="\"ShippingLatitude\"")
	private double shippingLatitude;

	@Column(name="\"ShippingLongitude\"")
	private double shippingLongitude;

	@Column(name="\"ShippingPostalCode\"")
	private String shippingPostalCode;

	@Column(name="\"ShippingState\"")
	private String shippingState;

	@Column(name="\"ShippingStreet\"")
	private String shippingStreet;

	@Column(name="\"Sic\"")
	private String sic;

	@Column(name="\"SicDesc\"")
	private String sicDesc;

	@Column(name="\"Site\"")
	private String site;

	@Column(name="\"SLA__c\"")
	private String SLA__c;

	@Temporal(TemporalType.DATE)
	@Column(name="\"SLAExpirationDate__c\"")
	private Date SLAExpirationDate__c;

	@Column(name="\"SLASerialNumber__c\"")
	private String SLASerialNumber__c;

	@Column(name="\"SystemModstamp\"")
	private Timestamp systemModstamp;

	@Column(name="\"TickerSymbol\"")
	private String tickerSymbol;

	@Column(name="\"Tradestyle\"")
	private String tradestyle;

	@Column(name="\"Type\"")
	private String type;

	@Column(name="\"UpsellOpportunity__c\"")
	private String upsellOpportunity__c;

	@Column(name="\"VNPABillingDept__c\"")
	private String VNPABillingDept__c;

	@Column(name="\"VNPABillingDeptCode__c\"")
	private String VNPABillingDeptCode__c;

	@Column(name="\"VNPABillingEmail__c\"")
	private String VNPABillingEmail__c;

	@Column(name="\"VNPABillingId__c\"")
	private String VNPABillingId__c;

	@Column(name="\"VNPABillingMemo__c\"")
	private String VNPABillingMemo__c;

	@Column(name="\"VNPAEmailCC__c\"")
	private String VNPAEmailCC__c;

	@Column(name="\"VNPAMailingAddress1__c\"")
	private String VNPAMailingAddress1__c;

	@Column(name="\"VNPAMailingAddress2__c\"")
	private String VNPAMailingAddress2__c;

	@Column(name="\"VNPAMailingPref__c\"")
	private String VNPAMailingPref__c;

	@Column(name="\"VNPAMailingZipCode__c\"")
	private String VNPAMailingZipCode__c;

	@Column(name="\"VNPAUseMailingAddress__c\"")
	private boolean VNPAUseMailingAddress__c;

	@Column(name="\"Website\"")
	private String website;

	@Column(name="\"YearStarted\"")
	private String yearStarted;

	public Account() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountSource() {
		return this.accountSource;
	}

	public void setAccountSource(String accountSource) {
		this.accountSource = accountSource;
	}

	public String getActive__c() {
		return this.active__c;
	}

	public void setActive__c(String active__c) {
		this.active__c = active__c;
	}

	public double getAnnualRevenue() {
		return this.annualRevenue;
	}

	public void setAnnualRevenue(double annualRevenue) {
		this.annualRevenue = annualRevenue;
	}

	public String getBillingCity() {
		return this.billingCity;
	}

	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	public String getBillingCountry() {
		return this.billingCountry;
	}

	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}

	public double getBillingLatitude() {
		return this.billingLatitude;
	}

	public void setBillingLatitude(double billingLatitude) {
		this.billingLatitude = billingLatitude;
	}

	public double getBillingLongitude() {
		return this.billingLongitude;
	}

	public void setBillingLongitude(double billingLongitude) {
		this.billingLongitude = billingLongitude;
	}

	public String getBillingPostalCode() {
		return this.billingPostalCode;
	}

	public void setBillingPostalCode(String billingPostalCode) {
		this.billingPostalCode = billingPostalCode;
	}

	public String getBillingState() {
		return this.billingState;
	}

	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}

	public String getBillingStreet() {
		return this.billingStreet;
	}

	public void setBillingStreet(String billingStreet) {
		this.billingStreet = billingStreet;
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

	public String getCustomerPriority__c() {
		return this.customerPriority__c;
	}

	public void setCustomerPriority__c(String customerPriority__c) {
		this.customerPriority__c = customerPriority__c;
	}

	public String getDandbCompanyId() {
		return this.dandbCompanyId;
	}

	public void setDandbCompanyId(String dandbCompanyId) {
		this.dandbCompanyId = dandbCompanyId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDunsNumber() {
		return this.dunsNumber;
	}

	public void setDunsNumber(String dunsNumber) {
		this.dunsNumber = dunsNumber;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getIndustry() {
		return this.industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public boolean getIsCustomerPortal() {
		return this.isCustomerPortal;
	}

	public void setIsCustomerPortal(boolean isCustomerPortal) {
		this.isCustomerPortal = isCustomerPortal;
	}

	public boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public boolean getIsPartner() {
		return this.isPartner;
	}

	public void setIsPartner(boolean isPartner) {
		this.isPartner = isPartner;
	}

	public String getJigsaw() {
		return this.jigsaw;
	}

	public void setJigsaw(String jigsaw) {
		this.jigsaw = jigsaw;
	}

	public String getJigsawCompanyId() {
		return this.jigsawCompanyId;
	}

	public void setJigsawCompanyId(String jigsawCompanyId) {
		this.jigsawCompanyId = jigsawCompanyId;
	}

	public Date getLastActivityDate() {
		return this.lastActivityDate;
	}

	public void setLastActivityDate(Date lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
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

	public String getMasterRecordId() {
		return this.masterRecordId;
	}

	public void setMasterRecordId(String masterRecordId) {
		this.masterRecordId = masterRecordId;
	}

	public String getNaicsCode() {
		return this.naicsCode;
	}

	public void setNaicsCode(String naicsCode) {
		this.naicsCode = naicsCode;
	}

	public String getNaicsDesc() {
		return this.naicsDesc;
	}

	public void setNaicsDesc(String naicsDesc) {
		this.naicsDesc = naicsDesc;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfEmployees() {
		return this.numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public double getNumberofLocations__c() {
		return this.numberofLocations__c;
	}

	public void setNumberofLocations__c(double numberofLocations__c) {
		this.numberofLocations__c = numberofLocations__c;
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnership() {
		return this.ownership;
	}

	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
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

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getShippingCity() {
		return this.shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	public String getShippingCountry() {
		return this.shippingCountry;
	}

	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}

	public double getShippingLatitude() {
		return this.shippingLatitude;
	}

	public void setShippingLatitude(double shippingLatitude) {
		this.shippingLatitude = shippingLatitude;
	}

	public double getShippingLongitude() {
		return this.shippingLongitude;
	}

	public void setShippingLongitude(double shippingLongitude) {
		this.shippingLongitude = shippingLongitude;
	}

	public String getShippingPostalCode() {
		return this.shippingPostalCode;
	}

	public void setShippingPostalCode(String shippingPostalCode) {
		this.shippingPostalCode = shippingPostalCode;
	}

	public String getShippingState() {
		return this.shippingState;
	}

	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}

	public String getShippingStreet() {
		return this.shippingStreet;
	}

	public void setShippingStreet(String shippingStreet) {
		this.shippingStreet = shippingStreet;
	}

	public String getSic() {
		return this.sic;
	}

	public void setSic(String sic) {
		this.sic = sic;
	}

	public String getSicDesc() {
		return this.sicDesc;
	}

	public void setSicDesc(String sicDesc) {
		this.sicDesc = sicDesc;
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getSLA__c() {
		return this.SLA__c;
	}

	public void setSLA__c(String SLA__c) {
		this.SLA__c = SLA__c;
	}

	public Date getSLAExpirationDate__c() {
		return this.SLAExpirationDate__c;
	}

	public void setSLAExpirationDate__c(Date SLAExpirationDate__c) {
		this.SLAExpirationDate__c = SLAExpirationDate__c;
	}

	public String getSLASerialNumber__c() {
		return this.SLASerialNumber__c;
	}

	public void setSLASerialNumber__c(String SLASerialNumber__c) {
		this.SLASerialNumber__c = SLASerialNumber__c;
	}

	public Timestamp getSystemModstamp() {
		return this.systemModstamp;
	}

	public void setSystemModstamp(Timestamp systemModstamp) {
		this.systemModstamp = systemModstamp;
	}

	public String getTickerSymbol() {
		return this.tickerSymbol;
	}

	public void setTickerSymbol(String tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}

	public String getTradestyle() {
		return this.tradestyle;
	}

	public void setTradestyle(String tradestyle) {
		this.tradestyle = tradestyle;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUpsellOpportunity__c() {
		return this.upsellOpportunity__c;
	}

	public void setUpsellOpportunity__c(String upsellOpportunity__c) {
		this.upsellOpportunity__c = upsellOpportunity__c;
	}

	public String getVNPABillingDept__c() {
		return this.VNPABillingDept__c;
	}

	public void setVNPABillingDept__c(String VNPABillingDept__c) {
		this.VNPABillingDept__c = VNPABillingDept__c;
	}

	public String getVNPABillingDeptCode__c() {
		return this.VNPABillingDeptCode__c;
	}

	public void setVNPABillingDeptCode__c(String VNPABillingDeptCode__c) {
		this.VNPABillingDeptCode__c = VNPABillingDeptCode__c;
	}

	public String getVNPABillingEmail__c() {
		return this.VNPABillingEmail__c;
	}

	public void setVNPABillingEmail__c(String VNPABillingEmail__c) {
		this.VNPABillingEmail__c = VNPABillingEmail__c;
	}

	public String getVNPABillingId__c() {
		return this.VNPABillingId__c;
	}

	public void setVNPABillingId__c(String VNPABillingId__c) {
		this.VNPABillingId__c = VNPABillingId__c;
	}

	public String getVNPABillingMemo__c() {
		return this.VNPABillingMemo__c;
	}

	public void setVNPABillingMemo__c(String VNPABillingMemo__c) {
		this.VNPABillingMemo__c = VNPABillingMemo__c;
	}

	public String getVNPAEmailCC__c() {
		return this.VNPAEmailCC__c;
	}

	public void setVNPAEmailCC__c(String VNPAEmailCC__c) {
		this.VNPAEmailCC__c = VNPAEmailCC__c;
	}

	public String getVNPAMailingAddress1__c() {
		return this.VNPAMailingAddress1__c;
	}

	public void setVNPAMailingAddress1__c(String VNPAMailingAddress1__c) {
		this.VNPAMailingAddress1__c = VNPAMailingAddress1__c;
	}

	public String getVNPAMailingAddress2__c() {
		return this.VNPAMailingAddress2__c;
	}

	public void setVNPAMailingAddress2__c(String VNPAMailingAddress2__c) {
		this.VNPAMailingAddress2__c = VNPAMailingAddress2__c;
	}

	public String getVNPAMailingPref__c() {
		return this.VNPAMailingPref__c;
	}

	public void setVNPAMailingPref__c(String VNPAMailingPref__c) {
		this.VNPAMailingPref__c = VNPAMailingPref__c;
	}

	public String getVNPAMailingZipCode__c() {
		return this.VNPAMailingZipCode__c;
	}

	public void setVNPAMailingZipCode__c(String VNPAMailingZipCode__c) {
		this.VNPAMailingZipCode__c = VNPAMailingZipCode__c;
	}

	public boolean getVNPAUseMailingAddress__c() {
		return this.VNPAUseMailingAddress__c;
	}

	public void setVNPAUseMailingAddress__c(boolean VNPAUseMailingAddress__c) {
		this.VNPAUseMailingAddress__c = VNPAUseMailingAddress__c;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getYearStarted() {
		return this.yearStarted;
	}

	public void setYearStarted(String yearStarted) {
		this.yearStarted = yearStarted;
	}

}