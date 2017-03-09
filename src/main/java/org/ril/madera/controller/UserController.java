package org.ril.madera.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.ril.madera.model.Users;
import org.ril.madera.service.ServicesUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.crypto.Mac;
import javax.xml.bind.DatatypeConverter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;


@Controller
public class UserController {

	@Autowired
	private
	ServicesUser serviceUser;

	private static final String HMAC_ALGO = "HmacSHA256";
	private static final String SEPARATOR = ".";
	private static final String SEPARATOR_SPLITTER = "\\.";
	private Mac hmac;

	@RequestMapping(value =  { "/", "/welcome**" }, method = RequestMethod.GET, headers = "Accept=application/json")
	public ModelAndView defaultPage() {
//		List<Users> listOfUsers = serviceUser.getAll();
//		model.addAttribute("country", new Users());
//		model.addAttribute("listOfUsers", listOfUsers);
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Login Form - Database Authentication");
		model.addObject("message", "This is default page!");
		model.setViewName("users");
		return model;
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Users getCountryById(@PathVariable int id) {
		return serviceUser.getById(id);
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addCountry(@ModelAttribute("country") Users country) {
		if(country.getId()==0)
		{
			serviceUser.add(country);
		}
		else
		{
			serviceUser.update(country);
		}

		return "redirect:/users";
	}

	@RequestMapping(value = "/updateUser/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updateCountry(@PathVariable("id") int id,Model model) {
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
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;
	}

	public Users parseUserFromToken(String token) {
		final String[] parts = token.split(SEPARATOR_SPLITTER);
		if (parts.length == 2 && parts[0].length() > 0 && parts[1].length() > 0) {
			try {
				final byte[] userBytes = fromBase64(parts[0]);
				final byte[] hash = fromBase64(parts[1]);

				boolean validHash = Arrays.equals(createHmac(userBytes), hash);
				if (validHash) {
					final Users user = fromJSON(userBytes);
					if (new Date().getTime() < user.getExpire()) {
						return user;
					}
				}
			} catch (IllegalArgumentException e) {
				//log tampering attempt here
			}
		}
		return null;
	}

	private Users fromJSON(final byte[] userBytes) {
		try {
			return new ObjectMapper().readValue(new ByteArrayInputStream(userBytes), Users.class);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}

	private byte[] fromBase64(String content) {
		return DatatypeConverter.parseBase64Binary(content);
	}

	private synchronized byte[] createHmac(byte[] content) {
		return hmac.doFinal(content);
	}
}
