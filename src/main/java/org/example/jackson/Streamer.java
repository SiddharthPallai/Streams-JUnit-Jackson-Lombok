package org.example.jackson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Sidharth
 */
public class Streamer {

    public static void main(String[] args) {
        Map<String, Map<String,Integer>> playerStats = new HashMap<>();

        Map<String,Integer> matchTypeToTotalRunsMapForVirat = new HashMap<>();
        matchTypeToTotalRunsMapForVirat.put("ODI",10);
        matchTypeToTotalRunsMapForVirat.put("TESTS",10);
        matchTypeToTotalRunsMapForVirat.put("IPL",10);

        Map<String,Integer> matchTypeToTotalRunsMapForDravid = new HashMap<>();
        matchTypeToTotalRunsMapForDravid.put("ODI",20);
        matchTypeToTotalRunsMapForDravid.put("TESTS",20);
        matchTypeToTotalRunsMapForDravid.put("IPL",20);

        playerStats.put("Virat",matchTypeToTotalRunsMapForVirat);
        playerStats.put("Dravid",matchTypeToTotalRunsMapForDravid);

        int sum = playerStats.get("Virat").values().stream().reduce(0, (a,b)->a+b);
        int sum1 = playerStats.get("Virat").values().stream().mapToInt(x -> x.intValue()).sum();

        System.out.println(sum);
        System.out.println(sum1);
    }
}
