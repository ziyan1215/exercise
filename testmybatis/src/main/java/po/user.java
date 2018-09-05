package po;

/**
 * @author xuziyan
 *
 */
public class user {
	private String user_key ;
	public String getUser_key() {
		return user_key;
	}
	public void setUser_key(String user_key) {
		this.user_key = user_key;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword_() {
		return password_;
	}
	public void setPassword_(String password_) {
		this.password_ = password_;
	}
	public String getId_card() {
		return id_card;
	}
	public void setId_card(String id_card) {
		this.id_card = id_card;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getLast_update_date() {
		return last_update_date;
	}
	public void setLast_update_date(String last_update_date) {
		this.last_update_date = last_update_date;
	}
	public String getStatus_() {
		return status_;
	}
	public void setStatus_(String status_) {
		this.status_ = status_;
	}
	public String getType_() {
		return type_;
	}
	public void setType_(String type_) {
		this.type_ = type_;
	}
	public String getDelete_Flag() {
		return delete_Flag;
	}
	public void setDelete_Flag(String delete_Flag) {
		this.delete_Flag = delete_Flag;
	}
	public String getOrigin_() {
		return origin_;
	}
	public void setOrigin_(String origin_) {
		this.origin_ = origin_;
	}

	
	private String user_name;
	private String email;
	private String password_;
	private String id_card;
	private String create_date;
	private String last_update_date;
	private String status_;
	private String type_;
	private String delete_Flag;
	private String origin_;
	private String encrypt_Type;
	public String getEncrypt_Type() {
		return encrypt_Type;
	}
	public void setEncrypt_Type(String encrypt_Type) {
		this.encrypt_Type = encrypt_Type;
	}
	@Override
	public String toString() {
		return "user [user_key=" + user_key + ", user_name=" + user_name
				+ ", email=" + email + ", password_=" + password_
				+ ", id_card=" + id_card + ", create_date=" + create_date
				+ ", last_update_date=" + last_update_date + ", status_="
				+ status_ + ", type_=" + type_ + ", delete_Flag=" + delete_Flag
				+ ", origin_=" + origin_ + ", encode_Type=" + encrypt_Type + "]";
	}
	
}
