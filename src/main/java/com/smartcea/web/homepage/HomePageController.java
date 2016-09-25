package com.smartcea.web.homepage;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author Smart
 * @since 2016/09/25
 */
@Controller("HomePage")
@RequestMapping("/")
public class HomePageController {
	
	@RequestMapping(name="index",method=RequestMethod.GET)
	public void homePage(HttpServletRequest request){
		System.out.println(request.getRequestURL());
	}
}
