package po;

import java.util.Date;

public class UserMysql {
	private int user_id;
	private String user_name;
	private String password;
	private int credits;
	private Date last_visit;
	private String last_ip;
	@Override
	public String toString() {
		return "UserMysql [user_id=" + user_id + ", user_name=" + user_name
				+ ", password=" + password + ", credits=" + credits
				+ ", last_visit=" + last_visit + ", last_ip=" + last_ip + "]";
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public Date getLast_visit() {
		return last_visit;
	}
	public void setLast_visit(Date last_visit) {
		this.last_visit = last_visit;
	}
	public String getLast_ip() {
		return last_ip;
	}
	public void setLast_ip(String last_ip) {
		this.last_ip = last_ip;
	}
}
