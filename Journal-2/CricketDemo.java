/*9. Design a class Cricketer having data member name and a number of matches and appropriate member function to set the values. Derived two classes Batsman and Bowler from cricketer class with data member total number of runs and wickets respectively. Batsman class is having method to calculate average wicket. Write a program to create two objects and display information of one batsman and bowler along with average run and wicket.**/

// Base class
class Cricketer {
    String name;
    int matches;

    void setData(String n, int m) {
        name = n;
        matches = m;
    }
}

// Derived class Batsman
class Batsman extends Cricketer {
    int runs;

    void setRuns(int r) {
        runs = r;
    }

    double averageRuns() {
        return (double) runs / matches;
    }

    void display() {
        System.out.println("Batsman Name: " + name);
        System.out.println("Matches: " + matches);
        System.out.println("Total Runs: " + runs);
        System.out.println("Average Runs: " + averageRuns());
    }
}

// Derived class Bowler
class Bowler extends Cricketer {
    int wickets;

    void setWickets(int w) {
        wickets = w;
    }

    double averageWickets() {
        return (double) wickets / matches;
    }

    void display() {
        System.out.println("Bowler Name: " + name);
        System.out.println("Matches: " + matches);
        System.out.println("Total Wickets: " + wickets);
        System.out.println("Average Wickets: " + averageWickets());
    }
}

// Main class
class CricketDemo {
    public static void main(String args[]) {

        Batsman b = new Batsman();
        b.setData("Hardik Pandya", 100);
        b.setRuns(5000);

        Bowler bw = new Bowler();
        bw.setData("Jasprit Bumrah", 80);
        bw.setWickets(160);

        System.out.println("---- Batsman Information ----");
        b.display();

        System.out.println("\n---- Bowler Information ----");
        bw.display();
    }
}
