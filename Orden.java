public class Orden {
    public static void main(String[] args) {
        int [] numeros = {6, 1, 5, 3, 4, 2,};

        selectionSort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    private static int partition(int[] numeros, int low, int high) {
        int pivot = numeros[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (numeros[j] < pivot) {
                i++;
                int temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;
            }
        }
        int temp = numeros[i + 1];
        numeros[i + 1] = numeros[high];
        numeros[high] = temp;
        return i + 1;
    }

    public static int [] merge(int [] numeros, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int [] L = new int[n1];
        int [] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = numeros[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = numeros[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                numeros[k] = L[i];
                i++;
            } else {
                numeros[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            numeros[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            numeros[k] = R[j];
            j++;
            k++;
        }
        return numeros;
    }
    public static void insertionSort(int [] numeros) {
        for (int i = 1; i < numeros.length; i++) {
            int actual = numeros[i];
            int j = i - 1;
            while (j >= 0 && numeros[j] > actual) {
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = actual;
        }
    }

    public static void selectionSort(int [] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[min]) {
                    min = j;
                }
            }
            int temp = numeros[i];
            numeros[i] = numeros[min];
            numeros[min] = temp;
        }
    }

    public static void bubbleSort(int [] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(int [] numeros, int low, int high) {
        if (low < high) {
            int pi = partition(numeros, low, high);
            quickSort(numeros, low, pi - 1);
            quickSort(numeros, pi + 1, high);
        }
    }

    public static void mergeSort(int [] numeros, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(numeros, l, m);
            mergeSort(numeros, m + 1, r);
            merge(numeros, l, m, r);
        }
    }

    public static void shellSort(int [] numeros) {
        int n = numeros.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = numeros[i];
                int j;
                for (j = i; j >= gap && numeros[j - gap] > temp; j -= gap) {
                    numeros[j] = numeros[j - gap];
                }
                numeros[j] = temp;
            }
        }
    }
}