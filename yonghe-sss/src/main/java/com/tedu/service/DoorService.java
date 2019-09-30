package com.tedu.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.tedu.pojo.Door;

public interface DoorService {
	/**
	 * 1.查询所有门店信息
	 * @return List<Door>
	 */
	public List<Door> findAll();
}