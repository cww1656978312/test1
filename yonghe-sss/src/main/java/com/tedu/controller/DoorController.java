package com.tedu.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tedu.pojo.Door;
import com.tedu.service.DoorService;

@Controller
/* @Controller����1�� ����ǰ����Ĵ�������spring����
 * ����2����Ϊ���Ʋ����ı�ʶ
 */
public class DoorController {
	
	@Autowired	//�Զ�ע��(��spring������ǰ����Ϊ���Ը�ֵ)
	private DoorService doorService;
	
	@RequestMapping("/doorList")
	public String doorList(){
		//����service���findAll��������ѯ���е��ŵ���Ϣ
		List<Door> list = doorService.findAll();
		for (Door d:list) {
			System.out.println(d);
		}
		
		return "door_list";
	}
	@RequestMapping("/doorList")
	public String doorList(Model model){
		//����service���findAll��������ѯ���е��ŵ���Ϣ
		List<Door> list = doorService.findAll();
		
		//�������ŵ���Ϣ��list���ϴ���model�У�����JSP��ʾ
		model.addAttribute("list", list);
		
		return "door_list";
	}
}