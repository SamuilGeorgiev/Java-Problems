package chapter9;

import java.math.BigInteger;

public class factoriel {
    public static void main(String[] args) {
            for (int n = 1; n <= 100;  n++) {


                BigInteger factorial = calculateFactorial(n);
                System.out.println(factorial);
            }
        }

        public static BigInteger calculateFactorial(int n) {
            BigInteger result = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }
    }


