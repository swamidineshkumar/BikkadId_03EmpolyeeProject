package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Empolyee;
import com.example.demo.Repositray.EmpolyeeRepositary;

@Service
public class ServiceImp implements ServiceInt {
 @Autowired
 private EmpolyeeRepositary repositary;
	@Override
	public Empolyee savedata(Empolyee empolyee) {
		Empolyee save = repositary.save(empolyee);
		return save;
	}

	@Override
	public List<Empolyee> saveAllData(List<Empolyee> empolyee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empolyee FindById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empolyee> getall(Empolyee empolyee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empolyee FindByAgeLessThanOrEqual(String age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empolyee Logingcheck(String name, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByID(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Empolyee updateByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empolyee> updateAll(List<Empolyee> empolyees) {
		// TODO Auto-generated method stub
		return null;
	}

}
