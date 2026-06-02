package casemethod02;

public class Buyer {
    String nama, phone;
    int queueIndex;
    public Buyer(String nama, String phone,int queueIndex) {
        this.nama = nama;
        this.phone = phone;
    }
    public void print() {
        System.out.println(nama + " " + phone);
    }
}
