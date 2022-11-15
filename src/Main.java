
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        stepsMethods stepsWhole = new stepsMethods();
        while (true) {
            showMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                    System.out.println("Введите номер месяца");
                    int inputMonth = scanner.nextInt();
                    System.out.println("Введите номер дня");
                    int inputDay = scanner.nextInt();
                    System.out.println("Введите количество шагов");
                    int inputSteps = scanner.nextInt();
                    stepsWhole.saveSteps(inputMonth, (inputDay-1), inputSteps);
            } else if (command == 2) {
                System.out.println("Введите номер месяца");
                int monthNumber = scanner.nextInt();
                stepsWhole.showStat(monthNumber);
            } else if (command == 3) {
                System.out.println("Введите целевое количество шагов");
                int inputGoal = scanner.nextInt();
                while (inputGoal < 0){
                    System.out.println("Пожалуйста, введите положительное число");
                    inputGoal = scanner.nextInt();
                }
                stepsWhole.changeGoalSteps(inputGoal);
            } else if (command == 4) {
                System.out.println("Выход");
                break;
            }
        }
    }
    public static void showMenu() {
        System.out.println("Пользовательское меню: ");
        System.out.println("1. Ввести количество шагов за определённый день");
        System.out.println("2. Напечатать статистику за определённый месяц");
        System.out.println("3. Изменить цель по количеству шагов в день");
        System.out.println("4. Выйти из приложения");
    }
}