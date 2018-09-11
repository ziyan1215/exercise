package po;

public class CourseExtend extends Course {
	private String t_name;//授课教师姓名

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	@Override
	public String toString() {
		return "CourseExtend [t_name=" + t_name + "]";
	}
	
	
}
