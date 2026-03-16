public class PropertyChecker {

    /**
     * Returns true if at least one element in the array is positive (> 0),
     * false otherwise.
     *
     * Traversal strategy: initialize a boolean flag to false before the loop.
     * Set it to true the moment a qualifying element is found.
     * Continue looping through all remaining elements — do NOT use return
     * or break inside the loop.
     *
     * Assume the array is non-null and has at least one element.
     *
     * Example:
     *   arr = {-3, -1, 4, -2}  →  returns true   (4 is positive)
     *   arr = {-5, 0, -1}      →  returns false   (none are > 0)
     *   arr = {7, 8, 9}        →  returns true
     */
    public boolean hasPositive(int[] arr) {
        boolean hasPos = false;

        for (int i : arr) {
            if (i > 0) {
                hasPos = true;
            }
        }

        return hasPos;
    }

    /**
     * Returns true if every element in the array is positive (> 0),
     * false otherwise.
     *
     * Traversal strategy: initialize a boolean flag to true before the loop.
     * Set it to false the moment a non-qualifying element is found.
     * Continue looping through all remaining elements — do NOT use return
     * or break inside the loop.
     *
     * Assume the array is non-null and has at least one element.
     *
     * Example:
     *   arr = {1, 5, 3, 8}   →  returns true    (all are > 0)
     *   arr = {1, 5, -3, 8}  →  returns false   (-3 is not > 0)
     *   arr = {0, 2, 4}      →  returns false   (0 is not > 0)
     */
    public boolean allPositive(int[] arr) {
        boolean allPos = true;

        for (int i : arr) {
            if (i <= 0) {
                allPos = false;
            }
        }

        return allPos;
    }
}