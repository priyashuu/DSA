import java.io.*;
import java.math.*;
import java.util.*;

public class toh {
    public static void towerofHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 0) {
            return;
        }
        // Move n-1 disks from 'from_rod' to 'aux_rod' using 'to_rod'
        towerofHanoi(n - 1, from_rod, aux_rod, to_rod);
        
        // Move the nth disk from 'from_rod' to 'to_rod'
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        
        // Move the n-1 disks from 'aux_rod' to 'to_rod' using 'from_rod'
        towerofHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args) {
        int N = 5; // Number of disks
        towerofHanoi(N, 'A', 'C', 'B'); // Pass 'C' and 'B' as char
    }
}
