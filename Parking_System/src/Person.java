import java.util.Scanner;

public class Person {


    String id;
    String firstName;
    String lastName;
    String Password;
    int contact;
    String emailAddress;
    String carRegNo;

    public Person(String firstName, String lastName, String email, int contact, String regNo){

        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = email;
        this.contact = contact;
        this.carRegNo = regNo;
    }

    public Person(String firstName, String lastName, String password,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.Password = password;
        this.emailAddress = email;
    }

    public Person(){

    }

    public int getContact() {
        return contact;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return Password;
    }

    private void setPassword(String password) {
        Password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    private void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserName() {
        return firstName +" " + lastName;
    }

    void sysPrint(String str) {
        System.out.println(str);
    }

    void login() {
        Scanner scan = new Scanner(System.in);
        sysPrint("Enter Email Address :");
        String emailAddress = scan.next();
        sysPrint("Enter Password :");
        String password = scan.next();
        FileBase myLogin = new FileBase();
        myLogin.checkPerson(emailAddress, password);
    }

    void register() {
        Scanner scan = new Scanner(System.in);
        sysPrint("Enter FirstName :");
        String first_name = scan.next();
        setFirstName(first_name);
        sysPrint("Enter LastName");
        String last_name = scan.next();
        setLastName(last_name);
        sysPrint("Enter Email Address");
        String email = scan.next();
        setEmailAddress(email);
        sysPrint("Enter your new user password");
        String pass = scan.next();
        setPassword(pass);
    }

}
