package java.medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.in;

public class PrimeChecker {

    class Prime {
        public void checkPrime(int... nums) {
            for (final int num : nums) {
                int v = 1;
                boolean isPrime = true;
                while (++v < num) {
                    if (num % v == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime && num > 1)
                    System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public class Solution {

        public void main(String[] args) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                int n1 = Integer.parseInt(br.readLine());
                int n2 = Integer.parseInt(br.readLine());
                int n3 = Integer.parseInt(br.readLine());
                int n4 = Integer.parseInt(br.readLine());
                int n5 = Integer.parseInt(br.readLine());
                Prime ob = new Prime();
                ob.checkPrime(n1);
                ob.checkPrime(n1, n2);
                ob.checkPrime(n1, n2, n3);
                ob.checkPrime(n1, n2, n3, n4, n5);
                Method[] methods = Prime.class.getDeclaredMethods();
                Set<String> set = new HashSet<>();
                boolean overload = false;
                for (int i = 0; i < methods.length; i++) {
                    if (set.contains(methods[i].getName())) {
                        overload = true;
                        break;
                    }
                    set.add(methods[i].getName());

                }
                if (overload) {
                    throw new Exception("Overloading not allowed");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
