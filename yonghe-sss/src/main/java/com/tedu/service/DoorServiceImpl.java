package com.tedu.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;
/* @Service����1�� ����ǰ����Ĵ�������spring����
 * ����2����Ϊҵ������ı�ʶ
 */
@Service
public class DoorServiceImpl implements DoorService {
	@Autowired //�Զ�ע��(��spring����mapper����Ϊ���Ը�ֵ)
	private DoorMapper mapper;
	
	@Override
	public List<Door> findAll() {
		//1.����DoorMapper��findAll��������ѯ�����ŵ���Ϣ
		List<Door> list = DoorMapper.findAll();
		//2.�������ŵ���Ϣ��List���Ϸ���
		return list;
	}
} 