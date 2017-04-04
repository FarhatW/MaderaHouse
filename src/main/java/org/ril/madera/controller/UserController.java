package org.ril.madera.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.ril.madera.model.Users;
//import org.ril.madera.service.TokenAuthenticationService;

import org.ril.madera.service.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {

	@Autowired
	private UsersServices serviceUser;

	@RequestMapping(value =  { "/", "/index**" }, method = RequestMethod.GET, headers = "Accept=application/json")
	public ModelAndView defaultPage() {
		//final Authentication authentication = TokenAuthenticationService.getAuthentication();
		//final Users currentUser = serviceUser.getByEmail(authentication.getName());
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Login Form - Database Authentication");
		model.addObject("message", "This is default page!");
		model.setViewName("index");
		return model;
	}

	@RequestMapping(value =  { "/", "/EditDevis**" }, method = RequestMethod.GET, headers = "Accept=application/json")
	public ModelAndView updateModule() {
		Authentication aut = SecurityContextHolder.getContext().getAuthentication();
		Users user = serviceUser.getByEmail(aut.getName());
		ModelAndView model = new ModelAndView();
		model.addObject("user", user);
		model.addObject("clients", serviceUser.getClients());
		model.setViewName("EditDevis");
		return model;
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Users getCountryById(@PathVariable int id) {
		return serviceUser.getById(id);
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addCountry(@ModelAttribute("country") Users country) {
		if (country.getId() == 0) {
			serviceUser.add(country);
		} else {
			serviceUser.update(country);
		}

		return "redirect:/users";
	}

	@RequestMapping(value = "/updateUser/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updateCountry(@PathVariable("id") int id, Model model) {
		model.addAttribute("country", this.serviceUser.getById(id));
		model.addAttribute("listOfCountries", this.serviceUser.getAll());
		return "country";
	}

	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String deleteCountry(@PathVariable("id") int id) {
		serviceUser.delete(id);
		return "redirect:/Users";

	}


	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
							  @RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Email ou mot de passe incorrect.");
		}

		if (logout != null) {
			model.addObject("msg", "Vous avez bien été déconnecté.");
		}
		model.setViewName("login");

		return model;
	}
}