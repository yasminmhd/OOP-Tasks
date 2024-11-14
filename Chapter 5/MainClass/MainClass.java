package mainclass;
public class MainClass {
    public static void main(String[] args) {
        //new object. (classname objectname)
        GradeBook myGradeBook=new GradeBook();
        myGradeBook.displayMessage();
        //new object for user class
        User identity=new User();
        identity.gradebookuser();
        //new object
        joptionpane books=new joptionpane();
        books.readbook();
    }
}
