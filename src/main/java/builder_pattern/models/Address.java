package builder_pattern.models;

public class Address {

    private String houseNumber;
    private String street;
    private String state;
    private String country;

    private Address(Builder builder) {

        this.houseNumber = builder.houseNumber;
        this.street = builder.street;
        this.state = builder.state;
        this.country = builder.country;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }


    /*Builder class for Address*/
    public static class Builder{

        private String houseNumber;
        private String street;
        private String state;
        private String country;

        public Builder setHouseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder setStreet(String street) {
            this.street = street;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }
}
