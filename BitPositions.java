import java.util.ArrayList;

public class BitPositions {

    public static ArrayList<Integer> getSetBitPositions(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        int position = 1; // Start with position 1 for the least significant bit
        ArrayList<Integer> positions = new ArrayList<>();
        int count = 0;   // Initialize count of set bits
        
        // Traverse the bits of the number
        while (n > 0) {
            if ((n & 1) == 1) { // Check if the least significant bit is set
                positions.add(position); // Add the current bit position to a temporary list
                count++; // Increment the count of set bits
            }
            n >>= 1; // Right shift to process the next bit
            position++; // Increment the position counter
        }
        
        // Add the count of set bits as the first element in the result list
        result.add(count);
        result.addAll(positions); // Add the positions after the count
        
        return result;
    }

    public static void main(String[] args) {
        int n = 161; // Example number (161 in decimal)
        ArrayList<Integer> positions = getSetBitPositions(n);
        System.out.println(positions); // Expected output: [3, 1, 3, 8]
    }
}
