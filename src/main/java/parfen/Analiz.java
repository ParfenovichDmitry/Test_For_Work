package parfen;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class Analiz extends ResClass implements GetRezults{


        public HashMap <Integer,Double> getTop(List<ResClass>res){
            HashMap<Integer,Double> topMap = new HashMap<>();
            HashMap<Set<Integer>, Double> topMapResults = new HashMap<>();

            for (ResClass res1:res){
                topMap.put((Integer) res1.getId(),(Double) Math.max(Math.max(res1.getHome(),res1.getDraw()), res1.getAway()));
            }

            return topMap;

        }
    public static LinkedHashMap<Integer,Double> sortByValue(HashMap<Integer,Double> hashMap )
    {

              LinkedHashMap<Integer,Double> reverseSortedMap = new LinkedHashMap<>();
              hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        return reverseSortedMap;
    }
}
