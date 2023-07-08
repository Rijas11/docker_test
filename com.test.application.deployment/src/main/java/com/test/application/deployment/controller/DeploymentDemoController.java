package com.test.application.deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeploymentDemoController {

	@GetMapping("/getData")
	public String getData() {
		return "Data fetched successfully.";

	}
}
