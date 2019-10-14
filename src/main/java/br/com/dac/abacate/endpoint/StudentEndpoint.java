package br.com.dac.abacate.endpoint;

import br.com.dac.abacate.model.*;
import br.com.dac.abacate.util.Props;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentEndpoint {
	
	@Autowired
	private Props props;
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/list")
	public List<Student> listAll() {
		
		System.out.println(props.getName());
		
		return java.util.Arrays.asList(
				new Student("Ana"), 
				new Student("Daniel"));
	}
}
