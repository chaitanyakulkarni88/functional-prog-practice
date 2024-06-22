package practice;

public class Person {
    String fname;
    String lname;
    int rollno;

    public Person(String fname, String lname, int rollno) {
        this.fname = fname;
        this.lname = lname;
        this.rollno = rollno;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getRollno() {
        return rollno;
    }

    @Override
    public String toString() {
        return "practice.Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
