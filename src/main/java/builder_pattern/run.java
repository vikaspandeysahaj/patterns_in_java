package builder_pattern;

import builder_pattern.models.Address;
import builder_pattern.models.ContactNumber;
import builder_pattern.models.Employee;
import builder_pattern.models.Name;

public class run {

    public static void main(String[] arg){


        Address address = new Address.Builder()
                                    .setHouseNumber("#008")
                                    .setStreet("3rd main")
                                    .setState("Karnataka")
                                    .setCountry("India")
                                    .build();

        Name name = new Name.Builder()
                            .setFirstName("Vikas")
                            .setLastName("Pandey")
                            .build();


        ContactNumber number = new ContactNumber.Builder()
                                                .setMobile("+919010101010")
                                                .setLandLine("08034567891")
                                                .build();

        Employee employee = new Employee.Builder()
                                        .setId(12)
                                        .setEmail("vp@abc.com")
                                        .setName(name)
                                        .setAddress(address)
                                        .setNumber(number).build();

        employee.printInfo();


    }
}
