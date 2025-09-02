// Input
// The first (and the only) input line contains integer number w (1 ≤ w ≤ 100) — the weight of the watermelon bought by the boys.

// Output
// Print YES, if the boys can divide the watermelon into two parts, each of them weighing even number of kilos; and NO in the opposite case.

// Examples
// InputCopy
// 8
// OutputCopy
// YES
// Note
// For example, the boys can divide the watermelon into two parts of 2 and 6 kilos respectively (another variant — two parts of 4 and 4 kilos).


package codeforces;

import java.util.Scanner;

public class watermelone {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(); 
        
        if (w % 2 == 0 && w > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
    
}
