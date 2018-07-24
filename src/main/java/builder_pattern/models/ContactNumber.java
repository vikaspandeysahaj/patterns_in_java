package builder_pattern.models;

public class ContactNumber {

    private String mobile;
    private String landLine;

    private ContactNumber(Builder builder) {
        this.mobile = builder.mobile;
        this.landLine = builder.landLine;
    }

    public String getMobile() {
        return mobile;
    }

    public String getLandLine() {
        return landLine;
    }


    /*Builder class for ContactNumber*/
    public static class Builder{

        private String mobile;
        private String landLine;

        public Builder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder setLandLine(String landLine) {
            this.landLine = landLine;
            return this;
        }

        public ContactNumber build(){
            return new ContactNumber(this);
        }
    }
}
