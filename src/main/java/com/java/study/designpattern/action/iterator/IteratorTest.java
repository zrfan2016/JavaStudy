package com.java.study.designpattern.action.iterator;

import java.util.*;


/**
 * @Auther: zrfan
 * @Date: 2020/6/6 16:07
 * @Description: TODO
 */
public class IteratorTest {


    public static void main(String[] args) {
        Map<String,String> strMap=new HashMap<>();
        strMap.entrySet().iterator();

       List list=new LinkedList<String>();
       list.add("1");
       list.add("2");
       list.add("3");

       Iterator it=list.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }

//       System.out.println(3>>1);

    }

}
