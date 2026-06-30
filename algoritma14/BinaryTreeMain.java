package algoritma14;
import java.util.Scanner;
public class BinaryTreeMain {


    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    BinaryTree bst = new BinaryTree();


        int pilih;
        do{
            System.out.println("\n===== MENU BST =====");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. InOrder");
            System.out.println("3. PreOrder");
            System.out.println("4. PostOrder");
            System.out.println("5. Cari Mahasiswa");
            System.out.println("6. Hapus Mahasiswa");
            System.out.println("7. IPK Minimum");
            System.out.println("8. IPK Maksimum");
            System.out.println("9. Tampilkan IPK > tertentu");
            System.out.println("0. Keluar");

            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih){
                 case 1:
                    // input mahasiswa
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.println("Name");
                    String name = sc.nextLine();
                    System.out.println("Class : " );
                    String className = sc.nextLine();
                    System.out.println("IPK : " );
                    Double ipk = sc.nextDouble();
                    bst.add(new Student19(nim,name,className,ipk));
                    break;

                case 2:
                    // inorder
                    System.out.println("\n=== InOrder ===");
                    if(bst.root == null){
                        System.out.println("Tree kosong");
                    } else {
                        bst.traverseInOrder(bst.root);
                    }
                    break;

                case 3:
                    // preorder
                    System.out.println("\n=== PreOrder ===");
                    if(bst.root == null){
                        System.out.println("Tree kosong");
                    } else {
                        bst.traversePreOrder(bst.root);
                    }


                    break;

                case 4:
                    // postorder
                    System.out.println("\n=== PostOrder ===");

                    if(bst.root == null){
                        System.out.println("Tree kosong");
                    } else {
                        bst.traversePostOrder(bst.root);
                    }

                    break;

                case 5:
                    // search
                    System.out.print("Masukkan IPK yang dicari: ");
                    double cari = sc.nextDouble();

                    if(bst.find(cari)){
                        System.out.println("Data ditemukan");
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;

                case 6:
                    // delete
                    System.out.print("Masukkan IPK yang akan dihapus: ");
                    double hapus = sc.nextDouble();

                    bst.delete(hapus);

                    System.out.println("Proses hapus selesai");

                    break;

                    

                case 7:
                    // min
                    if(bst.root == null){
                    System.out.println("Tree kosong");
                    } else {
                        bst.getMinIPK().print();
                    }
                    break;

                case 8:
                    // max
                    if(bst.root == null){
                    System.out.println("Tree kosong");
                    } else {
                        bst.getMaxIPK().print();
                    }
                    break;

                case 9:
                    // ipk di atas
                    System.out.print("Batas IPK: ");
                    double batas = sc.nextDouble();

                    bst.displayStudentsWithIPKAbove(batas);

                    break;
        }}while(pilih!=0);
            sc.close();
            
      /*  bst.add(new Student19("244107020138", "Devin", "TI-1I", 3.57));
        bst.add(new Student19("244107020023", "Dewi", "TI-1I", 3.85));
        bst.add(new Student19("244107020225", "Wahyu", "TI-1I", 3.21));
        bst.add(new Student19("244107020076", "Angelina", "TI-1I", 3.54));


        System.out.println("Student list (in-order traversal)");
        bst.traverseInOrder(bst.root);


        System.out.println("Search data");
        System.out.print("Search a student with IPK: 3.54: ");
        String result = bst.find(3.54) ? "Found" : "Not Found";
        System.out.println(result);


        System.out.print("Search a student with IPK: 3.22: ");
        result = bst.find(3.22) ? "Found" : "Not Found";
        System.out.println(result);


        bst.add(new Student19("244107020223", "Andhika", "TI-1I", 3.72));
        bst.add(new Student19("244107020226", "Bima", "TI-1I", 3.37));
        bst.add(new Student19("244107020181", "Eiyu", "TI-1I", 3.46));
        System.out.println("Student list:");
        System.out.println("In-order traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("Pre-order traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("Post-order traversal:");
        bst.traversePostOrder(bst.root);


        System.out.println("Data deletion");
        bst.delete(3.57);
        System.out.println("Student list after deletion:");
        bst.traverseInOrder(bst.root);
        System.out.println("------------------------------");
        System.out.println("Minimum IPK: ");
        bst.getMinIPK().print();
        System.out.println("Maximum IPK: ");
        bst.getMaxIPK().print();
        System.out.println("Students with IPK above 3.5:");
        bst.displayStudentsWithIPKAbove(3.5);
    }*/}
}
