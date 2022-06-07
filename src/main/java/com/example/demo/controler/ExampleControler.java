/**
 * 
 */
package com.example.demo.controler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author user
 *
 */
@RestController
@RequestMapping("/api/example")
public class ExampleControler {
	
	@GetMapping("/hello-world")
	public ResponseEntity<String> get(){
		return ResponseEntity.ok("Hello World");
	}

}
