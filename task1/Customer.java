public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter;

    Customer(String firstName,String lastName,String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id=this.counter;
        this.counter = this.counter+1;

    }

    public String getFirstName(){
        return firstName;
    }

    public String getUserName(){
        return userName;
    }

    public int getId(){
        return id;
    }

    @Override

    public String toString(){
        return " firstname: "+ firstName + " lastName: " + lastName + " userName: " + userName + " id:" + id;
    }
}
