package Abnormal;

public class teacher {

    public void th(int a) throws student {
        if (a < 0 || a > 100) {
            throw new student("你输入了错误的分数");
        } else {
            System.out.println("你输入的分数正常");
        }
    }
}
