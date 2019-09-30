package com.tedu.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;


/** �����ࣺ����SSM�������� */
@Controller /* ���ע���ʾ��ǰ������Controller����� */
public class TestSSM {
	
	/** �Զ�װ�䣺��spring�Զ�Ϊ���Ը�ֵ(����)  */
	@Autowired
	DoorMapper mapper;
	
	
	@RequestMapping("/testssm")
	public String testSSM(){
		//1.����findAll������ѯ�����ŵ���Ϣ
		List<Door> list = mapper.findAll();
		//2.���������ŵ���Ϣ
		for(Door door : list){
			System.out.println(door);
		}
		return "test";
	}
	
	@RequestMapping("/doorlist")
	public List<Door> doorList() {
		List<Door> list =mapper.findAll();
		return list;
	}
	
	
	
	
	
	

		
		
	
	
}