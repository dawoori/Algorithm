package com.dawool;

import java.util.LinkedList;
public class TestT {
    static final int h=130, w=130; // 596722340
    static int[][] dp = new int[h+1][w+1];
    public static void main(String[] args){
        clac();
        System.out.println(dp[h][w]);
    }

    //메모화
    static int dfs(int nowh, int noww) {
        if (nowh>h || noww>w) return 0;
        if (nowh==h && noww==w) return 1;
        if (dp[nowh][noww] != 0) return dp[nowh][noww];

        return dp[nowh][noww] = dfs(nowh+1,noww) + dfs(nowh, noww+1);
    }

    //동적 계획법
    static void clac() {
        dp[0][0] = 1;
        for(int i=0;i<=h;i++) {
            for(int j=0;j<=w;j++){
                if (i != 0) dp[i][j] += dp[i-1][j];
                if (j != 0) dp[i][j] += dp[i][j-1];
            }
        }
        System.out.println(dp[h][w]);
    }
}
