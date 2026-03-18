public class MinMax {

    /**
     * Returns the smallest value in the array.
     *
     * Traversal strategy: initialize your tracking variable to arr[0],
     * then loop from index 1 to the end, updating whenever you find
     * a smaller value.
     *
     * Assume the array is non-null and has at least one element.
     *
     * Example:
     *   arr = {5, 3, 8, 1, 6}  →  returns 1
     *   arr = {4, 4, 4}        →  returns 4
     */
    public int min(int[] arr) {
        int min = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }

    /**
     * Returns the largest value in the array.
     *
     * Traversal strategy: same pattern as min(), but update when you
     * find a larger value instead.
     *
     * Assume the array is non-null and has at least one element.
     *
     * Example:
     *   arr = {5, 3, 8, 1, 6}  →  returns 8
     *   arr = {-2, -5, -1}     →  returns -1
     */
    public int max(int[] arr) {
        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }
}