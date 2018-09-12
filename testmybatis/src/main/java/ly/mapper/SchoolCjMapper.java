package ly.mapper;

import java.util.List;

import po.Course;
import po.CourseExtend;
import po.Student;

public interface SchoolCjMapper {
	/**
	 * 通过用户ID找用户信息
	 */
	public List<CourseExtend> queryCourse() throws Exception;
	
	/**
	 * 通过resultMap的方式实现
	 */
	public List<Course> queryCourseResultMap() throws Exception;
	
	/**
	 * 查询学生各科目成绩
	 */
	public List<Student> queryStudentCoursrSource() throws Exception;
}
