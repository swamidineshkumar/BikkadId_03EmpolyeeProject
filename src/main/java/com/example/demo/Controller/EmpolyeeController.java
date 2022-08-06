package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Empolyee;
import com.example.demo.Service.ServiceInt;

@RestController
public class EmpolyeeController {
@Autowired
private ServiceInt serviceInt;
@PostMapping(value="/save",consumes = "application/json",produces = "application/json")
public ResponseEntity<String> saveDate(@RequestBody Empolyee empolyee){
	Empolyee savedata = serviceInt.savedata(empolyee);
	if(savedata!=null) {
		String msg="save data sucessfully";
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	String msg="data not save sucessfully";
	return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
	
}
@PostMapping(value="/saveall",consumes = "application/json",produces = "application/json")
public ResponseEntity<List<Empolyee>> saveAllData(@RequestBody List<Empolyee>  empolyees){
	List<Empolyee> saveAllData = serviceInt.saveAllData(empolyees);
	if(saveAllData!=null) {
		
		return new ResponseEntity<List<Empolyee>>(saveAllData,HttpStatus.CREATED);
	}
	else {
		String msg=" no data added";
	return new ResponseEntity<List<Empolyee>>(saveAllData,HttpStatus.NO_CONTENT);
	}
}

}
