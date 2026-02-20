public class Duties {
    public static void main(String[] args) {
        char[] CODE = new char[10];
        char[][] KOTA = new char[10][12];
        
        // Initialize CODE array with license plate codes
        CODE[0] = 'A';
        CODE[1] = 'B';
        CODE[2] = 'D';
        CODE[3] = 'E';
        CODE[4] = 'F';
        CODE[5] = 'G';
        CODE[6] = 'H';
        CODE[7] = 'K';
        CODE[8] = 'L';
        CODE[9] = 'M';
        
        // Initialize KOTA array with city names
        String[] cities = {
            "Jakarta",
            "Bandung",
            "Semarang",
            "Surabaya",
            "Yogyakarta",
            "Surakarta",
            "Bandar Lampung",
            "Palembang",
            "Medan",
            "Makassar"
        };
        
        for (int i = 0; i < 10; i++) {
            char[] cityChars = cities[i].toCharArray();
            for (int j = 0; j < cityChars.length && j < 12; j++) {
                KOTA[i][j] = cityChars[j];
            }
            // Fill remaining with spaces if needed, but not necessary for display
        }
        
        // Display the arrays
        System.out.println("CODE\tKOTA");
        for (int i = 0; i < 10; i++) {
            System.out.print(CODE[i] + "\t");
            // Print the city name by converting char array to string and trimming
            String city = new String(KOTA[i]).trim();
            System.out.println(city);
        }
    }
}
