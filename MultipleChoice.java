/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplechoice;

import java.util.Scanner;

/**St 10446180
 * Seonya Bokang
 *
 * @author MY PC
 */
public class MultipleChoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] questions = {// Array of 5 multiple choice questions
            "where is Rosebank College ?",
            "What is the largest provice in south africa?",
            "Who is the minister of Education ?",
            "What is the richest country in africa ?",
            "Which is the tallest mammal?"
        };
// Array of options (A, B, C)
        String[] options  = {"A", "B", "C"};
          // Array of correct answers corresponding to each question
        String[] answers = {"A", "C", "B", "B", "A"};

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
// Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]); // Display the question
                        // Display the answer options
            for (int j = 0; j < options.length; j++) {
                System.out.println(options[j] + ": " + options[j]);
            }
            System.out.print("Enter your answer (A, B, or C): ");
            String userAnswer = scanner.next().toUpperCase();// Read user's answer and convert to uppercase

            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect! The correct answer is: " + answers[i]);
            }
        }

        scanner.close();
    }

    }
    

