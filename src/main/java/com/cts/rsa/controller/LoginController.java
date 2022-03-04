package com.cts.rsa.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.catalina.authenticator.SavedRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@PropertySource("classpath:config.properties")
@RequestMapping("/GSALogin.htm")
public class LoginController {

	//private Log logger = LogFactory.getLog(getClass());

//	@Value("${name}")
//	private String name;

	public static void main(String[] args) {
		SpringApplication.run(LoginController.class, args);
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Model model, HttpServletRequest request, HttpServletResponse response) {
		String logoutParam = request.getParameter("logout");
		
		return "logoutParam value is " + logoutParam;
	}
}
