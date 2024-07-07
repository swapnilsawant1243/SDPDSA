
class Tester {

    public static void mergeSort(int[] elements, int size) {
    if (size < 2) {
    return;
    }
    int mid = size / 2;
    int[] left = new int[mid];
    int[] right = new int[size - mid];
    
    for (int i = 0; i < mid; i++) {
    left[i] = elements[i];
    }
    for (int i = mid; i < size; i++) {
    right[i - mid] = elements[i];
    }
    
    mergeSort(left, mid);
    mergeSort(right, size - mid);
    
    merge(elements, left, right, mid, size - mid);
    }
    
    public static void merge(int[] elements, int[] left, int[] right, int leftMerge, int rightMerge) {
    int i = 0, j = 0, k = 0;
    while (i < leftMerge && j < rightMerge) {
    if (left[i] <= right[j]) {
    elements[k++] = left[i++];
    } else {
    elements[k++] = right[j++];
    }
    }
    while (i < leftMerge) {
    elements[k++] = left[i++];
    }
    while (j < rightMerge) {
    elements[k++] = right[j++];
    }
    }
    
    public static double findMedian(int[] elements) {
    int n = elements.length;
    if (n % 2 != 0) {
    return elements[n / 2];
    } else {
    return (elements[(n - 1) / 2] + elements[n / 2]) / 2.0;
    }
    }
    
    public static void main(String[] args) {
    int elements[] = { 64, 34, 25, 12, 22, 11, 90 };
            mergeSort(elements, elements.length);
            System.out.println("Median: " + findMedian(elements));
    }
    }
