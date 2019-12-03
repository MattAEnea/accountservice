package cap.accountservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import cap.accountservice.beans.User;
import cap.accountservice.dao.UserRepo;
import cap.accountservice.service.UserProxy;

@Controller
public class AccountController
{
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private UserProxy proxy;
	
	@GetMapping("/account")
	public String account(Model model, @SessionAttribute("user") User u1, 
			@RequestParam("username") String username)
	{
		u1 = proxy.getUser(username);
		model.addAttribute("user", u1);
		return "account";
	}
	
	@PostMapping("/changeBalance")
	public String changeBalance(@RequestParam String accountType, @RequestParam String action,
			@RequestParam double amount, @SessionAttribute("user") User u1, Model model)
	{
		if("withdraw".equalsIgnoreCase(action))
		{
			if("savings".equalsIgnoreCase(accountType))
			{
				u1.setBalanceS(u1.getBalanceS() - amount);
			}
			else if("checking".equalsIgnoreCase(accountType))
			{
				u1.setBalanceC(u1.getBalanceC() - amount);
			}
			else if("cd".equalsIgnoreCase(accountType))
			{
				u1.setBalanceCD(u1.getBalanceCD() - amount);
			}
		}
		else if("deposit".equalsIgnoreCase(action))
		{
			if("savings".equalsIgnoreCase(accountType))
			{
				u1.setBalanceS(u1.getBalanceS() + amount);
			}
			else if("checking".equalsIgnoreCase(accountType))
			{
				u1.setBalanceC(u1.getBalanceC() + amount);
			}
			else if("cd".equalsIgnoreCase(accountType))
			{
				u1.setBalanceCD(u1.getBalanceCD() + amount);
			}
		}
		userRepo.save(u1);
		model.addAttribute("user", u1);
		return "redirect:/account";
	}
}
