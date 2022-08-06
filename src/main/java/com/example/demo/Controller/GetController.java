package com.example.demo.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Empolyee;
import com.example.demo.Service.ServiceInt;

@RestController
@RequestMapping("/getcontroller")
public class GetController {
@Autowired
private ServiceInt serviceInt;
@GetMapping(value="/getbyid/{id}",produces =  "application/json")
public ResponseEntity<Empolyee> getById(@PathVariable int id){
	Empolyee findById = serviceInt.FindById(id);
	if(findById!=null) {
	return new ResponseEntity<Empolyee>(findById,HttpStatus.OK);	
	}else {
	return new ResponseEntity<Empolyee>(findById,HttpStatus.NO_CONTENT);
	}
	
}
@GetMapping(value="/getall",produces =  "application/json",consumes = "application/json")
public ResponseEntity<Empolyee> getAll(){
	List<Empolyee> getall = serviceInt.getall();
	if(getall!=null) {
		return new ResponseEntity(getall,HttpStatus.OK);
	}else {
	return new ResponseEntity(getall,HttpStatus.NO_CONTENT);
	}
}

}
