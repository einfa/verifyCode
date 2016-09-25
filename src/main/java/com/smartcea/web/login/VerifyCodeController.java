package com.smartcea.web.login;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smartcea.common.Constants;
import com.smartcea.common.VerifyCodeUtils;

/**
 * 该类主要为登录页面生产验证码图片
 * @author Smart
 * @see http://blog.csdn.net/qq_23077365/article/details/51679481
 */
@Controller("VerifyCodeImg")
public class VerifyCodeController {

	@RequestMapping("/verifyCode/getImg")
	public void getVerifyCodeImg(HttpServletResponse response, HttpServletRequest request){
		initHeader(response);
		String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
		//将验证码放入session
		HttpSession session = request.getSession(true);
		session.setAttribute(Constants.VERIFYCODE, verifyCode.toLowerCase());
		int width = 100 , height = 30;
		try {
			VerifyCodeUtils.outputImage(width, height, response.getOutputStream(), verifyCode);
		} catch (IOException e) {
			//TODO
		}
	}
	
	/**
	 * 初始化response响应头部，向浏览器发送图片数据
	 * @param response
	 */
	private void initHeader(HttpServletResponse response){
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/jpeg");
	}
}
