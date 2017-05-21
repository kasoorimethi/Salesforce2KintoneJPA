package application;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the �ڋq���X�g database table.
 * 
 */
@Entity
@NamedQuery(name="�ڋq���X�g.findAll", query="SELECT �� FROM �ڋq���X�g ��")
public class �ڋq���X�g implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"RecordId\"")
	private int recordId;

	@Column(name="\"AppId\"")
	private int appId;

	@Column(name="\"FAX(�����̂�)\"")
	private String fax_�����̂�_;

	@Column(name="\"Revision\"")
	private int revision;

	@Column(name="\"TEL(�����̂�)\"")
	private String tel_�����̂�_;

	private String ���[���A�h���X;

	private String ���R�[�h�ԍ�;

	private String �ܓx;

	private String ��Ж�;

	private String �o�x;

	private String �Z��;

	private String �S���Җ�;

	private String ���l;

	private String ������;

	@Column(name="\"�X�֔ԍ�(�����̂�)\"")
	private String �X�֔ԍ�_�����̂�_;

	public �ڋq���X�g() {
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

	public String getFax_�����̂�_() {
		return this.fax_�����̂�_;
	}

	public void setFax_�����̂�_(String fax_�����̂�_) {
		this.fax_�����̂�_ = fax_�����̂�_;
	}

	public int getRevision() {
		return this.revision;
	}

	public void setRevision(int revision) {
		this.revision = revision;
	}

	public String getTel_�����̂�_() {
		return this.tel_�����̂�_;
	}

	public void setTel_�����̂�_(String tel_�����̂�_) {
		this.tel_�����̂�_ = tel_�����̂�_;
	}

	public String get���[���A�h���X() {
		return this.���[���A�h���X;
	}

	public void set���[���A�h���X(String ���[���A�h���X) {
		this.���[���A�h���X = ���[���A�h���X;
	}

	public String get���R�[�h�ԍ�() {
		return this.���R�[�h�ԍ�;
	}

	public void set���R�[�h�ԍ�(String ���R�[�h�ԍ�) {
		this.���R�[�h�ԍ� = ���R�[�h�ԍ�;
	}

	public String get�ܓx() {
		return this.�ܓx;
	}

	public void set�ܓx(String �ܓx) {
		this.�ܓx = �ܓx;
	}

	public String get��Ж�() {
		return this.��Ж�;
	}

	public void set��Ж�(String ��Ж�) {
		this.��Ж� = ��Ж�;
	}

	public String get�o�x() {
		return this.�o�x;
	}

	public void set�o�x(String �o�x) {
		this.�o�x = �o�x;
	}

	public String get�Z��() {
		return this.�Z��;
	}

	public void set�Z��(String �Z��) {
		this.�Z�� = �Z��;
	}

	public String get�S���Җ�() {
		return this.�S���Җ�;
	}

	public void set�S���Җ�(String �S���Җ�) {
		this.�S���Җ� = �S���Җ�;
	}

	public String get���l() {
		return this.���l;
	}

	public void set���l(String ���l) {
		this.���l = ���l;
	}

	public String get������() {
		return this.������;
	}

	public void set������(String ������) {
		this.������ = ������;
	}

	public String get�X�֔ԍ�_�����̂�_() {
		return this.�X�֔ԍ�_�����̂�_;
	}

	public void set�X�֔ԍ�_�����̂�_(String �X�֔ԍ�_�����̂�_) {
		this.�X�֔ԍ�_�����̂�_ = �X�֔ԍ�_�����̂�_;
	}

}