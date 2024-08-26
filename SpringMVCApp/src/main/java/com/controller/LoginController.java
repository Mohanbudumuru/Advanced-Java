package com.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Login;
import com.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	
	@RequestMapping(value = "signup", method = RequestMethod.POST)
	public ModelAndView storeUsers(HttpServletRequest req) {
		List<Map<String, Object>> numOfUsers = loginService.retrieveAllProductsAsListOfMap();
		int count = numOfUsers.size();
		Login l = new Login();
		l.setEmailId( req.getParameter("emailid"));
		l.setPassword( req.getParameter("password"));
		l.setTypeOfUser(req.getParameter("typeofuser"));
		loginService.storeUser(l);
		List<Map<String, Object>> numOfUsersAfterNewSignUp = loginService.retrieveAllProductsAsListOfMap();
		ModelAndView mav = new ModelAndView();
		if(numOfUsersAfterNewSignUp.size() > count) {
		mav.setViewName("success.jsp");
		} else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
	

	@RequestMapping(value = "signin",method = RequestMethod.POST)  // di for request object 
	public ModelAndView chechUserWithPostMethod(HttpServletRequest req) {
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		String user = req.getParameter("typeofuser");
		ModelAndView mav = new ModelAndView();
		List<Map<String, Object>> listOfusers = loginService.retrieveAllProductsAsListOfMap();
		
		for(Map<String, Object> mm : listOfusers) {
			if(emailid.equals(mm.get("email")) && password.equals(mm.get("password"))) {
				if(user.equals("admin")) {
					mav.setViewName("display1.jsp");
				}else {
					mav.setViewName("display2.jsp");
				}
			} 
        
        }
		return mav;
	}


	
}
