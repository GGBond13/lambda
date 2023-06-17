package com.ggbond;

public class LambdaText02 {
    public static void main(String[] args) {
        /*LambdaDemo02 lambdaDemo02 = new LambdaDemo02() {
            @Override
            public int add(int x, int y) {
                int result;
                result=x+y;
                return result;
            }
        };*/
        //Lambda表达式转换:
        LambdaDemo02 lambdaDemo02 = (x,y) -> {int result;result=x+y;return result;};
        System.out.println(lambdaDemo02.add(13,29));
    }
}
