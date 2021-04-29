package Abnormal;

import java.util.Scanner;

public class teacherTest {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("请输入分数");
        int i = sn.nextInt();

        teacher t = new teacher();
        try {
            t.th(i);
        } catch (Abnormal.student student) {
            student.printStackTrace();
        }
    }
}
