public class Business extends Contact{
    private String phoneNumber;

    public Business(String name, String email, String phoneNum) {
        super(name, email);
        this.phoneNumber = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNumber;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNumber = phoneNum;
    }

    @Override
    public void display(){
        System.out.println("Name: " + this.getName() +
                "\nEmail: " + this.getEmail() +
                "\nPhone number: " + this.getPhoneNum() +
                "\n");
    }
}