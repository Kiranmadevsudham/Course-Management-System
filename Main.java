/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course.management.system;

interface Interface {
    void project();
}

class Implementation implements Interface {
    @Override
    public void project() {
        System.out.println("Executing project method.");
        // Implement your logic here
    }
}

public class Main {
    Interface ob;

    public Main() {
        // Initialize ob with an instance of Implementation
        ob = new Implementation();
    }

    public static void main(String[] args) {
        Main main = new Main();  // Create an instance of Main
        main.ob.project();       // Call the project method on ob
    }
}


