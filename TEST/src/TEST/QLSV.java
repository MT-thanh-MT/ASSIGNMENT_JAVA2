/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author XUÂN THÀNH
 */
public class QLSV implements QLSVInterface<SinhVien, QLSV>{
    private ArrayList<SinhVien> list;

    public QLSV() {
        this.list = new ArrayList<>();
                
    }
    
    @Override
    public void them(SinhVien e) {
        this.list.add(e);
    }

    @Override
    public void sua(int index, SinhVien e) {
        this.list.set(index, e);
                
    }

    @Override
    public void xoa(int index) {
        this.list.remove(index);
    }

    @Override
    public void setList(ArrayList<SinhVien> list) {
        this.list = list;
    }

    @Override
    public ArrayList<SinhVien> getList() {
        return this.list;
    }

    @Override
    public void ghiFile(String path, QLSV e) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path,false));
        
        oos.writeObject(e.getList());
        
        oos.flush();
        
        oos.close();
        
    }
    
    public static void writeFile(String path, QLSV e) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path,false));
        
        oos.writeObject(e.getList());
        
        oos.flush();
        
        oos.close();
        
    }

    @Override
    public QLSV docFile(String path) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        
        QLSV listSV = new QLSV();
        
        listSV.setList((ArrayList<SinhVien>)ois.readObject());
        
        ois.close();
        return listSV;
    }
    
}
