package my.enjoy.hj.week2quiz;

public class DTO {
    private String id;
    private String pw;
    private String phone;
    private String Address;
    private char gender;

    public DTO() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String printInformation() {
        return "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", phone=" + phone +
                ", Address='" + Address + '\'' +
                ", gender='" + gender +
                '\'';
    }
}
