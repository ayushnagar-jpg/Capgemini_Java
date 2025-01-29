import java.util.*;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        System.out.print("Enter the marks of Maths: ");
        int Maths = sc.nextInt();

        System.out.print("Enter the marks of Science: ");
        int Science = sc.nextInt();

        System.out.print("Enter marks of Hindi: ");
        int Hindi = sc.nextInt();

      
        if ((Maths < 0 || Maths > 100) || (Science < 0 || Science > 100) || (Hindi < 0 || Hindi > 100)) {
            System.out.println("Invalid marks entered. Please ensure all marks are between 0 and 100.");
        } else {
          
            int Total = Maths + Science + Hindi;
            int MaximumMarks = 300; 
            double Percentage = (Total / (double) MaximumMarks) * 100;

            
            System.out.println("Total Marks: " + Total + " out of " + MaximumMarks);
            System.out.println("Percentage: " + Percentage + "%");

     
            if (Percentage >= 75) {
                System.out.println("Result: Distinction");
            } else if (Percentage >= 40) {
                System.out.println("Result: Pass");
            } else {
                System.out.println("Result: Fail");
            }
        }

        sc.close(); 
    }
}
