package www.fengtingxin.cn.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="loginuser")
public class LoginUser {
	private Integer l_id; //id
	private String l_userName; //用户名
	private String l_password; //用户密码
	private String l_qq; //qq号
	private String l_headPortrait; //头像
	private Integer l_personalizedSignature; //个性签名	
	private Boolean l_status; //状态
	private String l_email;//用户注册邮箱 //邮箱
//	private Role role;
	private UserInfo userInfo;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getL_id() {
		return l_id;
	}
	public void setL_id(Integer l_id) {
		this.l_id = l_id;
	}
	
	@Column(length=40,unique=true,nullable=false,name="l_userName")
	public String getL_userName() {
		return l_userName;
	}
	public void setL_userName(String l_userName) {
		this.l_userName = l_userName;
	}
	
	@Column(length=40,nullable=false,name="l_password")
	public String getL_password() {
		return l_password;
	}
	public void setL_password(String l_password) {
		this.l_password = l_password;
	}
	
	@Column(length=40,name="l_qq")
	public String getL_qq() {
		return l_qq;
	}
	public void setL_qq(String l_qq) {
		this.l_qq = l_qq;
	}
	
	@Column(length=100,name="l_headPortrait")
	public String getL_headPortrait() {
		return l_headPortrait;
	}
	public void setL_headPortrait(String l_headPortrait) {
		this.l_headPortrait = l_headPortrait;
	}
	
	@Column(length=200,name="l_personalizedSignature",columnDefinition="这家伙很懒，还没有个人签名0.0")
	public Integer getL_personalizedSignature() {
		return l_personalizedSignature;
	}
	public void setL_personalizedSignature(Integer l_personalizedSignature) {
		this.l_personalizedSignature = l_personalizedSignature;
	}
	@Column(name="l_status")
	public Boolean getL_status() {
		return l_status;
	}
	public void setL_status(Boolean l_status) {
		this.l_status = l_status;
	}
	
	@Column(length=100,name="l_email",unique=true)
	public String getL_email() {
		return l_email;
	}
	public void setL_email(String l_email) {
		this.l_email = l_email;
	}
//	@ManyToOne
//	@JoinColumn(name = "roleId")
//	public Role getRole() {
//		return role;
//	}
//	public void setRole(Role role) {
//		this.role = role;
//	}
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER) // fetch���ü�������
	@PrimaryKeyJoinColumn
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
}
