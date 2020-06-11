package com.tc.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author tc
 * @since 2020-06-11
 */
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String username;
	private String password;
	private String nickname;
	private String name;
	private String birth;
	private String phone;
	private String qq;
	private String integral;
	private String signature;
	private String avater;
	private String createtime;
	private String status;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getIntegral() {
		return integral;
	}

	public void setIntegral(String integral) {
		this.integral = integral;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getAvater() {
		return avater;
	}

	public void setAvater(String avater) {
		this.avater = avater;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static final String ID = "id";

	public static final String USERNAME = "username";

	public static final String PASSWORD = "password";

	public static final String NICKNAME = "nickname";

	public static final String NAME = "name";

	public static final String BIRTH = "birth";

	public static final String PHONE = "phone";

	public static final String QQ = "qq";

	public static final String INTEGRAL = "integral";

	public static final String SIGNATURE = "signature";

	public static final String AVATER = "avater";

	public static final String CREATETIME = "createtime";

	public static final String STATUS = "status";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "User{" +
			", id=" + id +
			", username=" + username +
			", password=" + password +
			", nickname=" + nickname +
			", name=" + name +
			", birth=" + birth +
			", phone=" + phone +
			", qq=" + qq +
			", integral=" + integral +
			", signature=" + signature +
			", avater=" + avater +
			", createtime=" + createtime +
			", status=" + status +
			"}";
	}
}
