package www.fengtingxin.cn.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
@Entity
@Table(name="userinfo")
public class UserInfo {

	//属性
	private Integer u_id; //id
	private String u_realName; //真实名字
	private String u_idNumber; //身份证号
	private String u_phone; //手机号
	private String u_weChatNum; //微信账号
	private String u_Alipay; //支付宝账号
	private Date u_birthday; //生日
	private String u_sex; //性别
	private Date u_registTime; //注册时间
	
	private LoginUser loginUser;
	
	@Id
	@GenericGenerator(name = "foreignkey", strategy = "foreign", parameters = @Parameter(value = "loginUser", name = "property") )
	@GeneratedValue(generator = "foreignkey")
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	
	@Column(name="u_realName",length=20)
	public String getU_realName() {
		return u_realName;
	}
	public void setU_realName(String u_realName) {
		this.u_realName = u_realName;
	}
	
	@Column(name="u_idNumber",length=18)
	public String getU_idNumber() {
		return u_idNumber;
	}
	public void setU_idNumber(String u_idNumber) {
		this.u_idNumber = u_idNumber;
	}
	
	@Column(name="u_weChatNum",length=11)
	public String getU_phone() {
		return u_phone;
	}
	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}
	
	@Column(name="u_weChatNum",length=20)
	public String getU_weChatNum() {
		return u_weChatNum;
	}
	public void setU_weChatNum(String u_weChatNum) {
		this.u_weChatNum = u_weChatNum;
	}
	
	@Column(name="u_weChatNum",length=20)
	public String getU_Alipay() {
		return u_Alipay;
	}
	public void setU_Alipay(String u_Alipay) {
		this.u_Alipay = u_Alipay;
	}
	
	@Column(name="u_birthday")
	public Date getU_birthday() {
		return u_birthday;
	}
	public void setU_birthday(Date u_birthday) {
		this.u_birthday = u_birthday;
	}
	
	@Column(name="u_sex")
	public String getU_sex() {
		return u_sex;
	}
	public void setU_sex(String u_sex) {
		this.u_sex = u_sex;
	}
	
	@Column(name="u_registTime")
	public Date getU_registTime() {
		return u_registTime;
	}
	public void setU_registTime(Date u_registTime) {
		this.u_registTime = u_registTime;
	}

	@OneToOne
	@PrimaryKeyJoinColumn
	public LoginUser getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(LoginUser loginUser) {
		this.loginUser = loginUser;
	}
	
	
}
