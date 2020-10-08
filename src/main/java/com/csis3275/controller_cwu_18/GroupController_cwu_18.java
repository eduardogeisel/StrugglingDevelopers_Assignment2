package com.csis3275.controller_cwu_18;

import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.csis3275.model_cwu_18.GroupDescription_cwu_18;
import com.csis3275.model_cwu_18.GroupMember_cwu_18;

@Controller
//Here we will have this controller respond to requests from /employee for the employee servlet.
@RequestMapping("/group")
public class GroupController_cwu_18 {

	/*
	 * This method will serve as default GET handler.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String newProfile(ModelMap model) {
		GroupDescription_cwu_18 group = new GroupDescription_cwu_18();
		GroupMember_cwu_18 member = new GroupMember_cwu_18();
		model.addAttribute("group", group);
		model.addAttribute("member", member);
		return "group_cwu_18";
	}

}
