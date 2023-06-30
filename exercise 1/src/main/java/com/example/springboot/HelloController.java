package com.example.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;


@RestController
public class HelloController {

	@GetMapping("/hello")
	public String index() {
		return "Hello Word";
	}

	@GetMapping("/greeting")
	public ResponseEntity<String> greeting() {
		String message = "Good Afternoon!";
		return ResponseEntity.status(HttpStatus.OK).body(message);
	}
	@GetMapping("/info")
	public ResponseEntity<String>info(){
		return ResponseEntity.ok("information!!");
	}
	@GetMapping("/random")
	public ResponseEntity<String>bool(){
		boolean randoBoolean=new Random().nextBoolean();
		if (randoBoolean){
			return ResponseEntity.ok("true");
		}else {
			return ResponseEntity.badRequest().body("false");
			}
		}

	}



