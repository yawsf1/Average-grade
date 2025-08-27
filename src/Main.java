import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Float> grades = new ArrayList<Float>();
        float total = 0;

        System.out.print("Entrer nombre des note: ");
        int times = scanner.nextInt();
        for(int i = 1; i <= times ; i++){
            System.out.print("Entrer la note: ");
            float grade = scanner.nextFloat();
            grades.add(grade);
            total+= grade;
        }
        float result = total / times;
        System.out.printf("Result is %.2f", result);
        scanner.close();
    }
}