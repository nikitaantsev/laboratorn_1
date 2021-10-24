package lesson1_m;

import java.util.ArrayList;
import java.util.Scanner;
public class MyTask {

	static void DoTask()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел > ");
        int N = sc.nextInt();
        
        double a;
        ArrayList<Double> aa = new ArrayList();
        
        //заполняем
        for (int i = 0; i < N; i++) {
        	System.out.print("Введите число "+ String.valueOf(i+1) +" > ");
        	a = sc.nextDouble();
        	aa.add(a);
        }
        
        for (int j = 0; j < N; j++) {
        	System.out.print("Введите число "+ String.valueOf(j+1) +" > ");
        	a = sc.nextDouble();
        	aa.add(a);
        }
        
        double b = 0;
        System.out.println("результирующая последовательность:");
        //Вывод
        for (int j = 0; j < N; j++) {
        	b+=((aa.get(j)+j)*aa.get(j)); 
        	System.out.println(b);
        }
        sc.close();
    }  
}
