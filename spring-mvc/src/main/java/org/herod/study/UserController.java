/**
 * All right reserved.
 */
package org.herod.study;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Xiong
 * 
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/add")
	public String addUser(User user, Model model) {
		System.out.println("Add " + user);
		model.addAttribute("user", user);
		return "user.show";
	}
}
