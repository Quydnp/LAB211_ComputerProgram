/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.ComputerProgram;
import view.Menu;

/**
 *
 * @author HI
 */
public class ComputerProgramController extends Menu {
    private ComputerProgram computerProgram;
    static String[] options = {
        "Normal Calculator",
        "BMI Calculator",
        "Exit"
    };

    public ComputerProgramController() {
        super("========= CALCULATOR PROGRAM =========", options);
        computerProgram = new ComputerProgram();
    }
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1: {
                computerProgram.normalCalculator();
                break;
            }
            case 2: {
                computerProgram.BMICalculator();
                break;
            }
            case 3: {
                System.exit(0);
            }
        }
    }
    
}
