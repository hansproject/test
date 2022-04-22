package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/healthcheck")
public class DemoController {
	@GetMapping(value="", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, HttpStatus> healthCheck(@RequestParam String format) {
		
		Map<String, HttpStatus> m= null;
		
		try {
			if(format!=null) {
				if(format.equals("short")) {
					m=new HashMap<>();
					m.put("status", HttpStatus.OK);
				}
			}
		}catch(NullPointerException npe) {
			npe.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			return m;
		}
	}
	
	@GetMapping(value="/status", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, HttpStatus> healthCheck() {
		
		Map<String, HttpStatus> m= null;
		
		try {
			m=new HashMap<>();
			m.put("status", HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			return m;
		}
	}
}
