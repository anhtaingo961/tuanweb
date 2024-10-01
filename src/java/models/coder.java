/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author LOQ
 */
public class coder extends preson {

    private String programing_language;

    public coder() {
        super(null, 0, null);
    }
    

    public coder(String programing_language, String name, int age, String phone) {
        super(name, age, phone);
        this.programing_language = programing_language;
    }

    public String getPrograming_language() {
        return programing_language;
    }

    public void setPrograming_language(String programing_language) {
        this.programing_language = programing_language;
    }

    @Override
    public String toString() {
        return "coder{" +this.getName()+"phone"+this.getPhone()+"tuoi"+this.getAge()+"ngon ngu lap trinh"+this.getPrograming_language()+'}';
    }
    
}
