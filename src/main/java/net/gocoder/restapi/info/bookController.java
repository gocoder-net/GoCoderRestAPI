package net.gocoder.restapi.info;

import java.util.HashMap;			
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.gocoder.restapi.info.model.GoCoder;

@Controller
public class bookController {


	@GetMapping("/books")
	@ResponseBody
	public String book() {		
		String[] books = new String[] {"������", "���õ� �츮�� �ڵ��� �մϴ�.","HTML","�̾߱�� �ٰ����� HTML"};		
		
		return books;
	}
	
}