    public class ElseIfExpression {
        public static void main(String[] args) {
            // if (condition1) {
            //     // block of code to be executed if condition1 is true
            //   } else if (condition2) {
            //     // block of code to be executed if the condition1 is false and condition2 is true
            //   } else {
            //     // block of code to be executed if the condition1 is false and condition2 is false
            //   }       


            int time = 20;
            if (time < 10) {
                System.out.println("Good morning.");
            } else if (time < 18) {
                System.out.println("Good day.");
            } else {
                System.out.println("Good evening.");
            }
            // Outputs "Good evening."





        }



    }