package cap.accountservice.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cap.accountservice.beans.User;

@FeignClient(name="user-service")
@RibbonClient(name="user-service")
public interface UserProxy 
{
	@PostMapping("/processLogin")
	public User getUser(@RequestParam("username") String username);
}
