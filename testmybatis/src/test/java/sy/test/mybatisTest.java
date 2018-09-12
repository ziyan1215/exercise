package sy.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import ly.mapper.SchoolCjMapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import po.Course;
import po.Student;
import po.UserMysql;
import po.CourseExtend;
import po.user;

public class mybatisTest {
	//会话工厂
	public  SqlSessionFactory sqlSessionFactory;
	@Before
	public void createSqlSessionFactory() throws IOException{
		//获取配置文件
		String resource = "mapper/config.xml";
		//得到配置文件流
		InputStream inputStream =Resources.getResourceAsStream(resource);
		//创建会话工厂 传入mybatis的配置文件信息
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);	
	}
	
	@Test
	public void testQueryCourse() throws Exception {
		//createSqlSessionFactory();
		//通过工厂得到会话sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();
	
		//通过sqlsession操作数据库
		//List<Course> list =sqlSession.selectList("ly.mapper.SchoolCjMapper.queryCourse");
		
		SchoolCjMapper schoolCjMapper =sqlSession.getMapper(SchoolCjMapper.class);
		
		List<CourseExtend> courseExtendlist =schoolCjMapper.queryCourse();
		for(CourseExtend courseExtend:courseExtendlist){
			System.out.println(courseExtend.toString()+courseExtend.getC_name());
		}
		System.out.println(courseExtendlist);
		sqlSession.close();	
	}
	
	@Test
	public void testQueryCourseResultMap() throws Exception {
		//createSqlSessionFactory();
		//通过工厂得到会话sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//获取mapper接口实例
		SchoolCjMapper schoolCjMapper =sqlSession.getMapper(SchoolCjMapper.class);
		
		List<Course> list1 =schoolCjMapper.queryCourseResultMap();
		System.out.println(list1.size());
	    for (Course course : list1) {
	        System.out.println(course.toString());
	    }
		//通过sqlsession操作数据库
		//SchoolCjMapper schoolCjMapper=sqlSession.selectList("ly.mapper.SchoolCjMapper.queryCourseResultMap");
		//System.out.println(list.toArray());
		sqlSession.close();	
	}
	
	@Test
	public void testqueryStudentCoursrSource() throws Exception {
		//createSqlSessionFactory();
		//通过工厂得到会话sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//获取mapper接口实例
		SchoolCjMapper schoolCjMapper =sqlSession.getMapper(SchoolCjMapper.class);
		
		List<Student> list2 =schoolCjMapper.queryStudentCoursrSource();
		System.out.println(list2.size());
	    for (Student student : list2) {
	        System.out.println(student.toString());
	    }
	    System.out.println("-------------------------");
	    int index = 0;
	    Student student =list2.get(index);
	    
	    student.toString();
	    System.out.println(student.toString());
	    //Student [s_id=01, s_name=赵雷, s_birth=1990-01-01, s_sex=男, course=[Course [c_id=null, c_name=语文, t_id=null, teacher=null], Course [c_id=null, c_name=数学, t_id=null, teacher=null], Course [c_id=null, c_name=英语, t_id=null, teacher=null]], score=[Score [s_id=null, c_id=null, s_score=80], Score [s_id=null, c_id=null, s_score=90], Score [s_id=null, c_id=null, s_score=99]]]
	    //这样的数据应该是不合理的，学生跟课程、成绩信息对应不上了 
		//通过sqlsession操作数据库
		//SchoolCjMapper schoolCjMapper=sqlSession.selectList("ly.mapper.SchoolCjMapper.queryCourseResultMap");
		//System.out.println(list.toArray());
		sqlSession.close();	
	}
	
	
}
