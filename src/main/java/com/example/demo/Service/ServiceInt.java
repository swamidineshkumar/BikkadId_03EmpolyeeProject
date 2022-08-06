package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Empolyee;

public interface ServiceInt {
public Empolyee savedata(Empolyee empolyee);
public List<Empolyee> saveAllData(List<Empolyee> empolyee);
public Empolyee FindById(int id);
public List<Empolyee> getall(Empolyee empolyee);
public Empolyee FindByAgeLessThanOrEqual(String age);
public Empolyee Logingcheck(String name, int id);
public void deleteByID(int id);
public void DeleteAll();
public Empolyee updateByID(int id);
public List<Empolyee> updateAll(List<Empolyee> empolyees);
}
