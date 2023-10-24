/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SetterGetter;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.SetUsername("anandarizki");
        user.SetPassword("rahasia");
        
        System.out.println("Usernamenya : "+ user.GetUsername());
        System.out.println("Passwordnya : "+ user.GetPassword());
    }
}
