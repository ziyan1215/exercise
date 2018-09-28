package sy.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;








import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.omg.CORBA.PRIVATE_MEMBER;



import po.Tuser;
import po.UserMysql;
import po.user;

public class test {
	Logger logger =Logger.getLogger(test.class);
	private static final String admin = "admin";
	private static final int id =1;
	//private static final Integer id1 =16;
	@Test
	public void testOracle() throws IOException {
		//
		String resource = "mapper/config.xml";
		
		//得到配置文件流
		InputStream inputStream =Resources.getResourceAsStream(resource);
		
		//创建会话工厂 传入mybatis的配置文件信息
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//通过工厂得到会话sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//通过sqlsession操作数据库
		user user1=sqlSession.selectOne("test.findUserById", admin);
		System.out.println(user1);
		sqlSession.close();	
	}
	@Test
	public void testMysql() throws IOException {
	String resource = "mapper/config.xml";
		
		//得到配置文件流
		InputStream inputStream =Resources.getResourceAsStream(resource);
		
		//创建会话工厂 传入mybatis的配置文件信息
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//通过工厂得到会话sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//通过sqlsession操作数据库
		UserMysql user=sqlSession.selectOne("testmysql.findUserById", id);
		System.out.println(user);
		sqlSession.close();	
	}
	
	@Test
	public void test() throws IOException {
	String resource = "mapper/config.xml";
		
		//得到配置文件流
		InputStream inputStream =Resources.getResourceAsStream(resource);
		
		//创建会话工厂 传入mybatis的配置文件信息
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//通过工厂得到会话sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//通过sqlsession操作数据库
		Tuser user=sqlSession.selectOne("ly.mapper.TuserMapper.findById", id);
		System.out.println(user);
		sqlSession.close();	
	}
	
	@Test
	public void testAddUser() throws IOException {
		 final int resultId;
	String resource = "mapper/config.xml";
		
		//得到配置文件流
		InputStream inputStream =Resources.getResourceAsStream(resource);
		
		//创建会话工厂 传入mybatis的配置文件信息
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//通过工厂得到会话sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//通过sqlsession操作数据库
		Tuser tuser = new Tuser();
		tuser.setUser_name("xzy");
		tuser.setPassword("123456");
		sqlSession.insert("ly.mapper.TuserMapper.addUser", tuser);
		logger.debug(tuser);
		sqlSession.commit();
		logger.debug("显示刚刚新增数据的主键："+tuser.getUser_id());
		sqlSession.close();	
	}
	
	@Test
	public void testdeleteUserById() throws IOException {	
		String resource = "mapper/config.xml";
		int id =13;
		//得到配置文件流
		InputStream inputStream =Resources.getResourceAsStream(resource);
		
		//创建会话工厂 传入mybatis的配置文件信息
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//通过工厂得到会话sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//通过sqlsession操作数据库
		sqlSession.delete("ly.mapper.TuserMapper.deleteUserById",id);
		sqlSession.commit();
		//判断是否删除成功
		//查询的信息需要一个po进行存数据，所以要实例化一个实体对象
		Tuser tuser=new Tuser();
		tuser=sqlSession.selectOne("ly.mapper.TuserMapper.findById", id);
		logger.debug("tuser对象："+tuser);
		if (tuser==null) {
			logger.debug("删除成功");
		}else {
			logger.debug("删除失败");
		};
		sqlSession.close();	
	}
	
	
}
