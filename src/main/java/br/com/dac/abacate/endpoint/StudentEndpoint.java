package br.com.dac.abacate.endpoint;

import br.com.dac.abacate.model.*;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentEndpoint {
	
	@RequestMapping(method = RequestMethod.GET, path = "/list")
	public List<Student> listAll() {
		return java.util.Arrays.asList(
				new Student("Ana"), 
				new Student("Daniel"));
	}
}
