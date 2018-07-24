package builder_pattern.models;

public class Employee {

    private int id;
    private String email;
    private Name name;
    private Address address;
    private ContactNumber number;

    private Employee(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.address = builder.address;
        this.name = builder.name;
        this.number = builder.number;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public ContactNumber getNumber() {
        return number;
    }

    public void printInfo(){
        System.out.println("id: "+ this.id);
        System.out.println("email:"+ this.email);
        System.out.println("\nfirst name:"+ this.name.getFirstName());
        System.out.println("last name:"+ this.name.getLastName());
        System.out.println("houseNumber: "+ this.address.getHouseNumber());
        System.out.println("street: "+ this.address.getStreet());
        System.out.println("state: "+ this.address.getState());
        System.out.println("country: "+ this.address.getCountry());
        System.out.println("mobile :"+ this.number.getMobile());
        System.out.println("land line :"+ this.number.getLandLine());
    }

    /* Builder inner class for Employee */
    public static class Builder{
        private int id;
        private String email;
        private Name name;
        private Address address;
        private ContactNumber number;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setNumber(ContactNumber number) {
            this.number = number;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}
