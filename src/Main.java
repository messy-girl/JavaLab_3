import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность символов: ");
        String input = scanner.nextLine();

        for (char c : input.toCharArray()) { // Помещаем каждый символ в стек
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("Обратная последовательность: " + reversed.toString());
    }
}