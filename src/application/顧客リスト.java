package application;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the 顧客リスト database table.
 * 
 */
@Entity
@NamedQuery(name="顧客リスト.findAll", query="SELECT 顧 FROM 顧客リスト 顧")
public class 顧客リスト implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"RecordId\"")
	private int recordId;

	@Column(name="\"AppId\"")
	private int appId;

	@Column(name="\"FAX(数字のみ)\"")
	private String fax_数字のみ_;

	@Column(name="\"Revision\"")
	private int revision;

	@Column(name="\"TEL(数字のみ)\"")
	private String tel_数字のみ_;

	private String メールアドレス;

	private String レコード番号;

	private String 緯度;

	private String 会社名;

	private String 経度;

	private String 住所;

	private String 担当者名;

	private String 備考;

	private String 部署名;

	@Column(name="\"郵便番号(数字のみ)\"")
	private String 郵便番号_数字のみ_;

	public 顧客リスト() {
	}

	public int getRecordId() {
		return this.recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public int getAppId() {
		return this.appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getFax_数字のみ_() {
		return this.fax_数字のみ_;
	}

	public void setFax_数字のみ_(String fax_数字のみ_) {
		this.fax_数字のみ_ = fax_数字のみ_;
	}

	public int getRevision() {
		return this.revision;
	}

	public void setRevision(int revision) {
		this.revision = revision;
	}

	public String getTel_数字のみ_() {
		return this.tel_数字のみ_;
	}

	public void setTel_数字のみ_(String tel_数字のみ_) {
		this.tel_数字のみ_ = tel_数字のみ_;
	}

	public String getメールアドレス() {
		return this.メールアドレス;
	}

	public void setメールアドレス(String メールアドレス) {
		this.メールアドレス = メールアドレス;
	}

	public String getレコード番号() {
		return this.レコード番号;
	}

	public void setレコード番号(String レコード番号) {
		this.レコード番号 = レコード番号;
	}

	public String get緯度() {
		return this.緯度;
	}

	public void set緯度(String 緯度) {
		this.緯度 = 緯度;
	}

	public String get会社名() {
		return this.会社名;
	}

	public void set会社名(String 会社名) {
		this.会社名 = 会社名;
	}

	public String get経度() {
		return this.経度;
	}

	public void set経度(String 経度) {
		this.経度 = 経度;
	}

	public String get住所() {
		return this.住所;
	}

	public void set住所(String 住所) {
		this.住所 = 住所;
	}

	public String get担当者名() {
		return this.担当者名;
	}

	public void set担当者名(String 担当者名) {
		this.担当者名 = 担当者名;
	}

	public String get備考() {
		return this.備考;
	}

	public void set備考(String 備考) {
		this.備考 = 備考;
	}

	public String get部署名() {
		return this.部署名;
	}

	public void set部署名(String 部署名) {
		this.部署名 = 部署名;
	}

	public String get郵便番号_数字のみ_() {
		return this.郵便番号_数字のみ_;
	}

	public void set郵便番号_数字のみ_(String 郵便番号_数字のみ_) {
		this.郵便番号_数字のみ_ = 郵便番号_数字のみ_;
	}

}