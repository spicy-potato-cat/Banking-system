/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package root.oop_project;

/**
 *
 * @author harsh
 */
public class User {
    private String name, email;
    private int id;
    
    public void setId(int id){
        this.id=id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getEmail(){
        return this.email;
    }

    @Override
    public String toString(){
        return ("Name: "+name+", email: "+email+" user id: "+id);
    }
}
