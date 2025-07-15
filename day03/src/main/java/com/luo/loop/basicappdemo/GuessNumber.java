package com.luo.loop.basicappdemo;

public class GuessNumber {
    public static void main(String[] args) {

        guess();
    }
    public static void guess()
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        //随机生成一个1到100之间的数字
        //让用户进行猜测，如果猜对了，则结束游戏，否则猜大了提示过大，猜小了提示过小
        int number = (int)(Math.random()*100+1);//math.random()生成0到1之间的随机数,小数
        while(true)
        {
            System.out.println("请输入猜测的数字：");
            int guess = scanner.nextInt();
            if(guess == number)
            { System.out.println("恭喜你，猜对了！");break;}
            else if(guess > number)
                System.out.println("你猜的数字太大了！");
            else
                System.out.println("你猜的数字太小了！");
                System.out.println("是否继续游戏？y/n");
                String choice = scanner.next();
                if(choice.equals("n"))
                    break;
        }
    }
}
