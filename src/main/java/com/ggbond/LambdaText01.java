package com.ggbond;

public class LambdaText01 {
    public static void main(String[] args) {
        //匿名内部类
     /*LambdaDemo lambdaDemo = new LambdaDemo() {
         @Override
         public void sayHello() {
             System.out.println("Hello,Lambda!");
         }
     };*/
     //Lambda表达式转换,小口诀:拷贝小括号,写死右箭头,落地大括号
     LambdaDemo01 lambdaDemo = () -> System.out.println("Hello,Lambda!");
     lambdaDemo.sayHello();
    }
}
