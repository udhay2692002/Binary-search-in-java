class binarysearch {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 3;
        int left = 0;
        int right = a.length - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2; // Calculate the middle index

            if (key == a[mid]) {
                System.out.println("THE KEY IS FOUND AT INDEX: " + mid);
                break; // Exit the loop since we found the key
            } else if (key < a[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            System.out.println("loop");
        }

        if (left > right) {
            System.out.println("THE KEY IS NOT FOUND IN THE ARRAY.");
        }
    }
}
