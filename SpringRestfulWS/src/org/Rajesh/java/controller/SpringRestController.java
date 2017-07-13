package org.Rajesh.java.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SpringRestController {
	
	@RequestMapping(value="{/name}",method=RequestMethod.GET)
	public String hello(@PathVariable String name){
		String result="Hello"+name;
		return result;
	}
	
	private List<String> dataList=new ArrayList<>(Arrays.asList("soring","rest","src"));
	
	@RequestMapping("/getData")
	public Data getData (@RequestParam(value="id",defaultValue="0") Integer id){
		return new Data(id,dataList.get(id));
	}
}
