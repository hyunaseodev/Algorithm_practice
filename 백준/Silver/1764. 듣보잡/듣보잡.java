import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int neverHeardCount = sc.nextInt();
        int neverSeenCount = sc.nextInt();

        String[] neverHeardNames = new String[neverHeardCount];
        String[] neverSeenNames = new String[neverSeenCount];
        for(int i = 0; i < neverHeardCount; i++){
            neverHeardNames[i] = sc.next();
        }
        for(int i = 0; i < neverSeenCount; i++){
            neverSeenNames[i] = sc.next();
        }

        solve(neverHeardCount, neverSeenCount, neverHeardNames, neverSeenNames);
    }

    static void solve(int neverHeardCount, int neverSeenCount, String[] neverHeardNames, String[] neverSeenNames) {
        String[] answer = new String[Math.max(neverHeardCount, neverSeenCount)];

        //듣도 못한 사람과 보도 못한 사람을 map에 넣는다.
        TreeMap<String, Integer> allNamesMap = new TreeMap<>();
        for(String neverHeardName : neverHeardNames){
            allNamesMap.put(neverHeardName, allNamesMap.getOrDefault(neverHeardName, 0) + 1);
        }
        for(String neverSeenName : neverSeenNames){
            allNamesMap.put(neverSeenName, allNamesMap.getOrDefault(neverSeenName, 0) + 1);
        }

        //map의 value가 1보다 큰 경우 answer배열에 넣는다.
        int neverHeardSeenCount = 0;
        for(String key : allNamesMap.keySet()){
            if(allNamesMap.get(key) > 1) answer[neverHeardSeenCount++] = key;
        }

        System.out.println(neverHeardSeenCount);
        for(int i = 0; i < neverHeardSeenCount; i++){
            System.out.println(answer[i]);
        }
    }
}
