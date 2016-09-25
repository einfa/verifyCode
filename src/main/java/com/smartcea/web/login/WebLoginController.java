package com.smartcea.web.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.smartcea.common.Constants;

/**
 * @author Smart
 * @since 2016/09/25
 */
@Controller("webLogin")
public class WebLoginController {
	
	@RequestMapping(name="/login/",method=RequestMethod.GET)
	public String showLoginPage(HttpServletRequest request){
		System.out.println(request.getRequestURL());
		return "login";
	}

	@RequestMapping(name="/login/",method=RequestMethod.POST)
	public String processLogin(HttpSession session,@RequestParam("verifyCode") String verifyCode){
		if(verifyCode != null && session.getAttribute(Constants.VERIFYCODE).equals(verifyCode.toLowerCase())){
			System.out.println("验证码输入正确");
			//TODO login process
		}
		return "index";
	}
}
