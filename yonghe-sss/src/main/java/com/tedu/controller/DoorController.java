package com.tedu.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tedu.pojo.Door;
import com.tedu.service.DoorService;

@Controller
/* @Controller作用1： 将当前对象的创建交给spring管理
 * 作用2：作为控制层代码的标识
 */
public class DoorController {
	
	@Autowired	//自动注入(由spring创建当前对象并为属性赋值)
	private DoorService doorService;
	
	@RequestMapping("/doorList")
	public String doorList(){
		//调用service层的findAll方法，查询所有的门店信息
		List<Door> list = doorService.findAll();
		for (Door d:list) {
			System.out.println(d);
		}
		
		return "door_list";
	}
	@RequestMapping("/doorList")
	public String doorList(Model model){
		//调用service层的findAll方法，查询所有的门店信息
		List<Door> list = doorService.findAll();
		
		//将所有门店信息的list集合存入model中，带到JSP显示
		model.addAttribute("list", list);
		
		return "door_list";
	}
}