//3. Write a program that stores details of 5 employees and display these information after every one second.

class EmployeeDetails {
    public static void main(String args[]) {

        String name[] = {"Rohan", "Amit", "Rahul", "Priya", "Neha"};
        int id[] = {101, 102, 103, 104, 105};
        double salary[] = {25000, 30000, 28000, 32000, 27000};

        try {
            for(int i = 0; i < 5; i++) {
                System.out.println("Employee ID: " + id[i]);
                System.out.println("Employee Name: " + name[i]);
                System.out.println("Salary: " + salary[i]);
                System.out.println("-----------------------");

                Thread.sleep(1000); // 1 second delay
            }
        } 
        catch(Exception e) {
            System.out.println(e);
        }
    }
}