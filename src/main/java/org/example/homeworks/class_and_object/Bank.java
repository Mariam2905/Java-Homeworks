package org.example.homeworks.class_and_object;

public class Bank {

    public String bankName;
    public Address address;

    //        String branchName;
//        String phoneNumber;
//        Long capital;
    public Bank(String bankName) {
        this.bankName = bankName;
//            this.branchName = "Abovyan";
//            this.phoneNumber = "+37410580014";
//            this.capital = 14528647L;
    }

    public static void main(String[] args) {
        Bank bank = new Bank("HSBC");
        Address address = bank.new Address("Armenia", " ", " ", " ", " ");
        bank.address = address;
        System.out.println(bank.bankName);
        System.out.println(bank.address.city);
    }

    class Address {
        public String country;
        public String region;
        public String city;
        public String street;
        public String house;

        public Address(String country, String region, String city, String street, String house) {
            this.country = country;
            this.region = region;
            this.city = "Yerevan";
            this.street = "Isahakyan";
            this.house = "36";
        }
    }
}
