package TestCollection;

import TestFactory.Service;
import sun.security.x509.AttributeNameEnumeration;

import java.util.*;

/**
 * Time      2017/9/1 下午9:58
 * Author    JoanneGeng
 * File      TestPriorityQueue.java
 * Software  IntelliJ IDEA
 */
public class TestPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random rand = new Random(47);
        for(int i = 0; i < 10; i++) {
            priorityQueue.offer(rand.nextInt(i + 10));
        }

        System.out.println(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 22, 20, 19, 29, 3, 4, 5, 23, 20, 94);

        priorityQueue = new PriorityQueue<>(ints);

        System.out.println(priorityQueue);

        priorityQueue = new PriorityQueue<>(ints.size(), Collections.reverseOrder());

        priorityQueue.addAll(ints);

        System.out.println(priorityQueue);

        String fact = "THIS IS ABOUT PRIORITY QUEUE DEMO";

        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>(strings);

        System.out.println(stringPriorityQueue);

        stringPriorityQueue = new PriorityQueue<>(strings.size(), Collections.reverseOrder()); //这是干嘛？？？

        stringPriorityQueue.addAll(strings);
        System.out.println(stringPriorityQueue);

        Set<Character> characterSet = new HashSet<>();
        for (char c : fact.toCharArray()) {
            characterSet.add(c);
        }

        PriorityQueue<Character> characterPriorityQueue = new PriorityQueue<>(characterSet);

        System.out.println(characterPriorityQueue);

        /**
         * 对象在队列中进行排序
         * 使用工具类Arrays.asList()把数组转换成集合时，不能使用其修改集合相关的方法，
         * 它的add/remove/clear方法会抛出UnsupportedOperationException异常
         */


    }
}
