package net.gocoder.restapi.info;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.gocoder.restapi.info.model.GoCoder;

@RestController
public class infoController {

	@GetMapping("/info")
	public String info() {
		return "Hello RestController";
	}

	@RequestMapping(value = { "/creative", "/author" })	
	public Map<String, String> testHashMap() {

		Map<String, String> members = new HashMap<>();

		members.put("name", "GoCoder");
		members.put("blog", "gocoder.tistroy.com");
		members.put("created date", "2023-01-01");

		return members;
	}

	@GetMapping("/gocoder")	
	public Object goCoderInfo() {

		GoCoder gocoder = new GoCoder();

		gocoder.homepage = "GoCoder.net";
		gocoder.brunch =  "brunch.co.kr/@gocoder";
		gocoder.job =  "developer, author";

		return gocoder;

	}


}
