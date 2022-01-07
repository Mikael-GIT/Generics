package Application;

import java.util.InputMismatchException;
import java.util.Scanner;

import domain.services.PrintService;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		PrintService<String> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
        try {
            for (int i = 0; i < n; i++) {
                String value = sc.nextLine();
                ps.addValue(value);
            }
        } catch(InputMismatchException e) {
            System.out.println("Tipo do valor não esperado.");
        }

        try {
            ps.print();
            String x = ps.first(); //Problema de Type safety quando utilizamos o Object como generico, nao e a melhor implementacao
            //pois para nao dar este erro precisa ficar fazendo casting, nesse caso de string para (Integer) e afins
            System.out.println("First: " + x);
        } catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
		
		sc.close();
    }
}