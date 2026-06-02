package casemethod02;

public class Buyer {
    String nama, phone;
<<<<<<< HEAD
    int queueIndex;
    public Buyer(String nama, String phone,int queueIndex) {
=======
    int queueNumber;
    public Buyer(String nama, String phone, int queueNumber) {
>>>>>>> c6ecf6a3eaebbbd1eded66ea410379acd0172ca7
        this.nama = nama;
        this.phone = phone;
        this.queueNumber = queueNumber;
    }
    public void print() {
        System.out.println("Queue Number: " + queueNumber + ", Name: " + nama + ", Phone: " + phone);
    }
}
