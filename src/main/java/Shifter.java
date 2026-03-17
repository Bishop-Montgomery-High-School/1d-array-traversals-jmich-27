public class Shifter {

    /**
     * Shifts all elements one position to the LEFT.
     * The element at index 0 is discarded.
     * The last position (index arr.length - 1) is filled with 0.
     * The original array is modified in place; nothing is returned.
     *
     * Traversal strategy: loop from index 0 to arr.length - 2.
     * At each index i, copy arr[i + 1] into arr[i].
     * After the loop, set the last element to 0.
     *
     * Assume the array is non-null and has at least one element.
     *
     * Example (before → after):
     *   {10, 20, 30, 40, 50}  →  {20, 30, 40, 50, 0}
     *   {7}                   →  {0}
     */
    public void shiftLeft(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;
    }

    /**
     * Shifts all elements one position to the RIGHT.
     * The element at index arr.length - 1 is discarded.
     * The first position (index 0) is filled with 0.
     * The original array is modified in place; nothing is returned.
     *
     * Traversal strategy: loop from index arr.length - 1 DOWN to index 1.
     * At each index i, copy arr[i - 1] into arr[i].
     * After the loop, set the first element to 0.
     *
     * IMPORTANT: the loop must run in reverse to avoid overwriting
     * values before they have been moved.
     *
     * Assume the array is non-null and has at least one element.
     *
     * Example (before → after):
     *   {10, 20, 30, 40, 50}  →  {0, 10, 20, 30, 40}
     *   {7}                   →  {0}
     */
    public void shiftRight(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = 0;
    }
}