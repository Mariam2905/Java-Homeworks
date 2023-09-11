package org.example.homeworks.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//1. Write a simple Lambda expression that takes two integers as arguments and returns their sum.
public class Sum {
    public static void main(String[] args) {
        List<Integer> doubleList = Arrays.asList(5, 90, 7, 5, 60, 9);
        List<Integer> list = doubleList
                .stream().filter(n -> n > 50).collect(Collectors.toList());
        for (Integer integer : list) {
            System.out.println(integer);
        }


        LambdaOne one = (a, b) -> (a + b);
        //        LambdaOne one= Integer::sum;
        System.out.println("\n" + one.sumOfNum(5, 6));


        //13
        List<Integer> nums = Arrays.asList(1, 2, 3, 3, 4, 3, 2, 5, 6, 1, 7, 7, 8, 10);
        List<Integer> unique_nums = new ArrayList<>();
        nums.stream()
                .distinct()
                .forEach(unique_nums::add);


//5
        List<Integer> numbers = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());


//9

        List<Integer> greaterFifty = numbers.stream()
                .filter(n -> n > 50)
                .collect(Collectors.toList());


        for (Integer n : unique_nums) {
            System.out.print(n + ", ");
        }
        System.out.println();

        for (Integer n : evenNumbers) {
            System.out.print(n + ", ");
        }
        System.out.println();
        for (Integer n : greaterFifty) {
            System.out.print(n + ", ");
        }

//        LambdaOne one= Integer::sum;


        //3
        int[] numbers1 = {5, 10, 3, 8, 2};
        int highestValue = Arrays.stream(numbers1).reduce((a, b) -> a > b ? a : b).orElse(0);
        System.out.println("Highest value: " + highestValue);

//7

        int sum1 = numbers.stream().filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("SUm of even numbers: " + sum1);

        List<String> strings = new ArrayList<>();
        strings.add("Banana");
        strings.add("Bananas");
        strings.sort((s1, s2) -> s1.compareTo(s2));
//        strings.sort(Comparator.naturalOrder());
//        strings.sort((String::compareTo));


        Predicate<Integer> isPrime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

//    public Double avg(List<Double> list) {
//        return list.stream()
//                .mapToDouble(Double::doubleValue)
//                .average()
//                .orElse(Double list);
//    }


    //4
    String concat(String st1, String st2) {
        BiFunction<String, String, String> concat = (s1, s2) ->" " + st1 + st2;
        String result = concat.apply(st1, st2);
        return result;
    }





}

