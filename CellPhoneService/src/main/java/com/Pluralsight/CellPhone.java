package com.Pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

//this is the constructor
    //  in this case it is decided the value for the properties
    public CellPhone(){
        this.serialNumber = 0;
        this.model = "" ;
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }
      //getters and setters are below this comment

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public class cellPhones {
        private String customer;
        private String phoneNumber;
        private String model;

        //Constrictor
        public cellPhone(String owner, String phoneNumber, String model) {

            this.customer = customer;
            this.phoneNumber = phoneNumber;
            this.model = model;
        }

        public String getCustomer() {
            return customer;
        }

        public void setCustomer(String customer) {
            this.customer = customer;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void dial(String phoneNumber) {
            System.out.println(owner + " 's phone is calling " + phoneNumber);
        }

    }

    public class CellPhone {
        private int serialNumber;
        private String model;
        private String carrier;
        private String phoneNumber;
        private String owner;

        //this is the constructor
        //  in this case it is decided the value for the properties
        public CellPhone(){
            this.serialNumber = 0;
            this.model = "" ;
            this.carrier = "";
            this.phoneNumber = "";
            this.owner = "";

        public CellPhone(String serialNumber, String model, String phoneNumber,String owner)
          this.serialNumber=serialNumber;
          this.model = model;
          this.phoneNumber = phoneNumber;
          this.phoneNumber = phonwNumber;
          this.owner = owner
                  //Setters
            public void setserialNumber

    }
}







