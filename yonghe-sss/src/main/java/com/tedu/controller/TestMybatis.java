package com.tedu.controller;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;
/** �����ࣺ����mybatis�������� */
public class TestMybatis {
	public static void main(String[] args) throws Exception {
		//1.��ȡmybatis-config.xml�����ļ�
		InputStream in = Resources.getResourceAsStream(
				"mybatis/mybatis-config.xml");
		//2.��ȡSqlSessionFactory����
		SqlSessionFactory factory = 
				new SqlSessionFactoryBuilder()
				.build(in);
		//3.��ȡSqlSession����
		SqlSession session = factory.openSession();
		
		//4.��ȡDoorMapper�ӿڵ�ʵ��
		DoorMapper mapper = session.getMapper(DoorMapper.class);
		//5.����findAll������ѯ�����ŵ���Ϣ
		List<Door> list = mapper.findAll();
		//6.���������ŵ���Ϣ
		for(Door door : list){
			System.out.println(door);
		}
	}
}