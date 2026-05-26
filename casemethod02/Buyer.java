package casemethod02;

public class Buyer {
    String nama, phone;
    int queueNumber;
    public Buyer(String nama, String phone, int queueNumber) {
        this.nama = nama;
        this.phone = phone;
        this.queueNumber = queueNumber;
    }
    public void print() {
        System.out.println("Queue Number: " + queueNumber + ", Name: " + nama + ", Phone: " + phone);
    }
}
