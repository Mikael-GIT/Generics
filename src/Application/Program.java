package Application;

import java.util.Scanner;

import domain.services.PrintService;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		PrintService ps = new PrintService();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first(); //Problema de Type safety quando utilizamos o Object como generico, nao e a melhor implementacao
        //pois para nao dar este erro precisa ficar fazendo casting, nesse caso de string para (Integer) e afins
		System.out.println("First: " + x);
		
		sc.close();
    }
}