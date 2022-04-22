import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int row = sc.nextInt();
        int col = sc.nextInt();

        String[] strArr = new String[row];
        for(int i = 0; i < row; i++){
            strArr[i] = sc.next();
        }

        System.out.println(solve(strArr, row, col));
    }

    static int solve(String[] strArr, int row, int col){
        int answer = 0;

        //strArr의 각 원소의 값을 변형하여 새로운 배열에 값 넣기
        String[] fixStrArr = new String[col];
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                if(j == 0) fixStrArr[i] = strArr[j].substring(i, i+1);
                else fixStrArr[i] = fixStrArr[i] + strArr[j].substring(i, i+1);
            }
        }

        int fixStrArrLen = fixStrArr.length;
        for(int i = 0; i < row; i++){
            HashSet<String> hs = new HashSet<>();
            for(int j = 0; j < fixStrArrLen; j++){
                hs.add(fixStrArr[j].substring(i+1));
            }

            if(hs.size() == col) answer++;
        }
        return answer;
    }
}
