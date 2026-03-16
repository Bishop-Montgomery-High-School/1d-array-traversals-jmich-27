public class SumAverage {

    /**
     * Returns the sum of all elements in the array.
     *
     * Traversal strategy: initialize an accumulator to 0 before
     * the loop, then add each element to it during the traversal.
     * An enhanced for loop works well here since the index is not needed.
     *
     * Assume the array is non-null and has at least one element.
     *
     * Example:
     *   arr = {3, 7, 2, 8, 5}  →  returns 25
     *   arr = {-4, 10, -6}     →  returns 0
     */
    public int sum(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        return sum;
    }

    /**
     * Returns the integer average (mean) of all elements in the array,
     * using integer division.
     *
     * Traversal strategy: compute the sum first (you may call sum() or
     * re-traverse), then divide by arr.length using integer division.
     * No casting is needed — let Java truncate toward zero naturally.
     *
     * Assume the array is non-null and has at least one element.
     *
     * Example:
     *   arr = {3, 7, 2, 8, 5}  →  returns 5   (25 / 5 = 5)
     *   arr = {1, 2, 3, 4}     →  returns 2   (10 / 4 = 2, truncated)
     *   arr = {-4, 10, -6}     →  returns 0   (0 / 3 = 0)
     */
    public int average(int[] arr) {
        return sum(arr) / arr.length;
    }
}