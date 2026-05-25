package casemethod02;

public class Buyer {
    String nama, phone;
    public Buyer(String nama, String phone) {
        this.nama = nama;
        this.phone = phone;
    }
    public void print() {
        System.out.println(nama + " " + phone);
    }
}
