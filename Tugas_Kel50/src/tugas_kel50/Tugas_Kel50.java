package tugas_kel50;

import java.util.Scanner;

public class Tugas_Kel50 {

    public static void main(String[] args) {
        String email, password;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
        
        userService ambil = new userService(email, password);
        ambil.login();
    }
    
}
