package mainAplicacio;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador implements Runnable{
	
	
	
	@GetMapping("provar")
	String mostrarTemperatura(@RequestParam(value="variable") String strVariable) {
		String htmlResponse="";
		
			 htmlResponse = "<html><body><h1>"+strVariable+"</h1></body></html>";
		
		return htmlResponse;
	}
	
	
	
	
	public void run() {
		
	}
	
	
}
