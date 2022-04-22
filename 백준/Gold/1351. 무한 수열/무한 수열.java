import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static Map<Long, Long> map = new HashMap<>();
    static int p,q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        p = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());

        System.out.println(recur(n));
    }

    static long recur(long n) {
        if(n == 0) return 1;
        if(map.containsKey(n)) return map.get(n);

        long a = (long)Math.floor(n/p);
        long b = (long)Math.floor(n/q);

        map.put(n, recur(a) + recur(b));
        return map.get(n);
    }
}
