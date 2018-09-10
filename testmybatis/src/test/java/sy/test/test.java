package sy.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;






import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import po.Tuser;
import po.UserMysql;
import po.user;

public class test {

	private static final String admin = "admin";
	private static final int id =1;

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
	
}
