package com.tedu.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.tedu.pojo.Door;

public interface DoorService {
	/**
	 * 1.��ѯ�����ŵ���Ϣ
	 * @return List<Door>
	 */
	public List<Door> findAll();
}