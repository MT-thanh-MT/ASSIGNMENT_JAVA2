/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author XUÂN THÀNH
 */
public class Employee_list implements Employee_list_interface<Employee>{
    private ArrayList<Employee> list;
    private int currentIndex = -1;

    public Employee_list() {
        this.list = new ArrayList<>();
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }
    
    
    public int getCurrentEmployeeIndex(){
        return currentIndex;
    }
    
    public Employee getCurrentEmployee(){
        if (this.list.size() == 0) return null;
        
        return this.list.get(currentIndex);
    }
    
    public void first(){
        if (currentIndex > 0) {
            currentIndex = 0;
        }
    }
    
    public void last(){
        
            currentIndex = list.size() - 1;
        
    }
    
    public void pre(){
        if (currentIndex > 0) {
            currentIndex--;
        }
    }
    
    public void next(){
        if (currentIndex < list.size() - 1) {
            currentIndex++;
        }
    }
    
    @Override
    public void Add(Employee nv) {
        this.list.add(nv);
    }

    @Override
    public void Update(int n, Employee nv) {
        this.list.set(n, nv);
    }

    @Override
    public boolean RemoveByID(String ID) {
        for (Employee employee : list) {
            if (employee.getManv().equals(ID)) {
                this.list.remove(employee);
                return true;
            }
        }
        return false;
    }

    @Override
    public Employee findByID(String ID) {
        for (Employee employee : list) {
            if (employee.getManv().equals(ID)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Employee> getList() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<Employee> list) {
        this.list = list;
    }
    
    public static void write(String path, Employee_list list) throws FileNotFoundException, IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path, false));

        oos.writeObject(list.getList());
        
        oos.flush();
        oos.close();
    }
    
    public static Employee_list read(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        
        Employee_list list = new Employee_list();
        list.setList((ArrayList<Employee>)ois.readObject());
        
        ois.close();
        return list;
    }
    
}
