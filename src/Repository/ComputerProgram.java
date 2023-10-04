/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Common.Validation;

/**
 *
 * @author HI
 */
public class ComputerProgram implements IComputerProgram{
    Validation validation = new Validation();
    public void normalCalculator() {
            double memory;
            memory = validation.inputDouble("Enter number: ");
            while (true) {
                System.out.print("Enter operator: ");
                String operator = validation.checkInputOperator();
                if (operator.equalsIgnoreCase("+")) {
                    memory += validation.inputDouble("Enter number: ");  // Thực hiện phép cộng và cập nhật bộ nhớ.
                    System.out.println("Memory: " + memory);
                }
                if (operator.equalsIgnoreCase("-")) {
                    memory -= validation.inputDouble("Enter number: ");
                    System.out.println("Memory: " + memory);
                }
                if (operator.equalsIgnoreCase("*")) {
                    memory *= validation.inputDouble("Enter number: ");
                    System.out.println("Memory: " + memory);
                }
                if (operator.equalsIgnoreCase("/")) {
                    memory /= validation.inputDouble("Enter number: ");
                    System.out.println("Memory: " + memory);
                }
                if (operator.equalsIgnoreCase("^")) {
                    memory = Math.pow(memory, validation.inputDouble("Enter number: "));
                    System.out.println("Memory: " + memory);
                }
                if (operator.equalsIgnoreCase("=")) {
                    System.out.println("Result: " + memory);// Hiển thị kết quả và thoát.
                    return;
                }
            }

        }

    // Phương thức này trả về trạng thái BMI dựa trên chỉ số BMI được tính toán.
        public String BMIStatus(double bmi) {
            if (bmi < 19) {
                return "Under-standard.";
            } else if (bmi >= 19 && bmi < 25) {
                return "Standard.";
            } else if (bmi >= 25 && bmi < 30) {
                return "Overweight.";
            } else if (bmi >= 30 && bmi < 40) {
                return "Fat-should lose weight";
            } else {
                return "Very fat - should lose weight immediately";
            }
        }

    // Phương thức cho phép người dùng sử dụng máy tính BMI để tính chỉ số BMI và hiển thị trạng thái BMI.
        public void BMICalculator() {
            double weight = validation.inputDouble("Enter Weight(kg): ");
            double height = validation.inputDouble("Enter Height(cm): ");
            double bmi = weight * 10000 / (height * height);
            System.out.printf("BMI number: %.2f\n", bmi);
            System.out.println("BMI Status: " + BMIStatus(bmi));
        }
}
