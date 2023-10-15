package com.onlinevoting.html.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.onlinevoting.html.model.User;
import com.onlinevoting.html.model.VoterDetails;
import com.onlinevoting.html.repo.UserRepository;
import com.onlinevoting.html.repo.VoterRepository;

@Controller
public class IndexController {

	@Autowired
	private UserRepository userrepo;
	@Autowired
	private VoterRepository voterrepo;
	
	@GetMapping("/")
	public String index() {
		return "Home";
	}
	
	@GetMapping("/Home")
	public String home() {
		return "Home";
	}
	
	@GetMapping("/VoterLogin")
	public String voterLogin() {
		return "Voterlogin";
	}
	
	@PostMapping("/VoterLogin")
	public String voterLoginPost(@ModelAttribute VoterDetails voterDetails, Model model) {
		String voterId = voterDetails.getVoterid();
		Optional<VoterDetails> details = voterrepo.findById(voterId);
		
		try {
			if (voterDetails.getPassword().equals(details.get().getPassword())) {
				return "loginSuccess";
			}else {
				return "Voterlogin";
				}
			}catch (Exception e) {
			return "Voterlogin";
			}
		}
	
	@GetMapping("/VoterRegistration")
	public String voterRegistration() {
		return "voterregistration";
	}
	
	@PostMapping("/vregister")
	public String voterRegistrationPost(@ModelAttribute VoterDetails voterDetails, Model model) {
		VoterDetails voter_inserted = voterrepo.save(voterDetails);
		model.addAttribute("message", voter_inserted.getVoterid() + " inserted.");
		return "welcome";
		
	}
	
	@GetMapping("/candidateRegistration")
	public String candidateRegistration() {
		return "candidateregistration";
	}
	
	@PostMapping("/register")
	public String userRegistration(@ModelAttribute User user, Model model) {
		User user_inserted = userrepo.save(user);
		
		model.addAttribute("message", user_inserted.getVoterid() + " inserted.");
		return "welcome";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "Contact";
	}
	
	@GetMapping("/info")
	public String info() {
		return "info";
	}
	
	@GetMapping("/info2")
	public String info2() {
		return "info2";
	}
}
