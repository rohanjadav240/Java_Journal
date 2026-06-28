// 7. Write a java application which accepts 10 names of student and their age. Sort names and age in descending order at an interval of 1 second using thread.

class StudentThread extends Thread {

    String name[];
    int age[];

    StudentThread(String n[], int a[]) {
        name = n;
        age = a;
    }

    public void run() {
        try {
            // Sorting in descending order of age
            for (int i = 0; i < age.length - 1; i++) {
                for (int j = i + 1; j < age.length; j++) {
                    if (age[i] < age[j]) {
                        int tempAge = age[i];
                        age[i] = age[j];
                        age[j] = tempAge;

                        String tempName = name[i];
                        name[i] = name[j];
                        name[j] = tempName;
                    }
                }
            }

            // Display result every 1 second
            for (int i = 0; i < age.length; i++) {
                System.out.println(name[i] + " - " + age[i]);
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class StudentSort {
    public static void main(String args[]) {

        String name[] = {"Rohan","Amit","Rahul","Neha","Priya","Kiran","Soni","Ajay","Vikas","Pooja"};
        int age[] = {19,21,19,22,20,23,18,24,21,19};

        StudentThread t = new StudentThread(name, age);
        t.start();
    }
}