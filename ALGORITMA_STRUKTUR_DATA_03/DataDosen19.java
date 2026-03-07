public class DataDosen19 {
    String code;
    String name;
    Boolean gender;
    int age;

    //method total lecturers 
    public void numberOfLecturersPerGender(Dosen19[] ArrayofDosen){
        int maleCount = 0;
        int femaleCount = 0;
        for (Dosen19 dosen : ArrayofDosen) {
            if (dosen.gender) {
                maleCount++;
            } else {
                femaleCount++;
            }   
        }
        System.out.println("Jumlah Dosen Laki-laki: " + maleCount);
        System.out.println("Jumlah Dosen Perempuan: " + femaleCount);
    }
    //method average age
    public void AverageAgeOfLecturersPerGender(Dosen19[] ArrayofDosen){
        
    double totalMaleAge = 0;
    double totalFemaleAge = 0;
    int maleCount = 0;
    int femaleCount = 0;

    for (Dosen19 dosen : ArrayofDosen) {
        if (dosen.gender) {
            totalMaleAge += dosen.age;
            maleCount++;
        } else {
            totalFemaleAge += dosen.age;
            femaleCount++;
        }
    }

    double avgMale = 0;
    double avgFemale = 0;

    if(maleCount > 0){
        avgMale = totalMaleAge / maleCount;
    }

    if(femaleCount > 0){
        avgFemale = totalFemaleAge / femaleCount;
    }

    System.out.println("Rata-rata umur dosen laki-laki: " + avgMale);
    System.out.println("Rata-rata umur dosen perempuan: " + avgFemale);
}
    //method oldest and youngest lecturer
    public void infoDosenPalingTua(Dosen19[] ArrayofDosen){
        Dosen19 oldestDosen = ArrayofDosen[0];
        for (Dosen19 dosen : ArrayofDosen) {
            if (dosen.age > oldestDosen.age) {
                oldestDosen = dosen;
            }
        }
        System.out.println("Dosen Tertua:");
        System.out.println("Kode Dosen: " + oldestDosen.code);
        System.out.println("Nama Dosen: " + oldestDosen.name);
    }
    //method youngest lecturer
    public void infoDosenMostYoungest(Dosen19[] ArrayofDosen){
        Dosen19 youngestDosen = ArrayofDosen[0];
        for (Dosen19 dosen : ArrayofDosen) {
            if (dosen.age < youngestDosen.age) {
                youngestDosen = dosen;
            }
        }
        System.out.println("Dosen Termuda:");
        System.out.println("Kode Dosen: " + youngestDosen.code);
        System.out.println("Nama Dosen: " + youngestDosen.name);
    }

}