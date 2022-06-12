package chapter7.homework;

//this program demonstrates the difference between public and private
public class PPTest {
    int a; // default access
    public int b; // public access
    private int c; // private access

    //methods to access
    void setc (int i) { //set c's value
        c = 1;
    }
    int getc () { // get c's value
        return c;
    }

}
