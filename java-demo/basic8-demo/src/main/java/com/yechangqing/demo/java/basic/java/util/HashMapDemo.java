package com.yechangqing.demo.java.basic.java.util;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

  public static void main(String[] args) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(1, 1);
    map.get(1);
    System.out.println(map);
  }
}
