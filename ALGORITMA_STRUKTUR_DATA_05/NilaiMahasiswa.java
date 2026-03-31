public class NilaiMahasiswa {

    int maxDC(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;

        int leftMax = maxDC(arr, l, mid);
        int rightMax = maxDC(arr, mid + 1, r);
    if (leftMax > rightMax) {
        return leftMax;
    } else {
        return rightMax;
    }

    }

    int minDC(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;

        int leftMin = minDC(arr, l, mid);
        int rightMin = minDC(arr, mid + 1, r);

        if (leftMin < rightMin) {
            return leftMin;
        } else {
            return rightMin;
}
    }

    
    double avgBF(int arr[]) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        return (double) total / arr.length;
    }
}