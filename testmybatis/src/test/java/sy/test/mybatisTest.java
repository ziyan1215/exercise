package sy.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import po.UserMysql;
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
	public void testMysql() throws IOException {
		createSqlSessionFactory();
		//通过工厂得到会话sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int id=1;
		//通过sqlsession操作数据库
		UserMysql user=sqlSession.selectOne("testmysql.findUserById", id);
		System.out.println(user);
		sqlSession.close();	
	}
}
