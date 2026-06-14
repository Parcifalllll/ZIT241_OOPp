import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Добавить студента");
            System.out.println("2 - Удалить студента");
            System.out.println("3 - Поиск по фамилии");
            System.out.println("4 - Вывод по группе");
            System.out.println("0 - Выход");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Фамилия: ");
                    String ln = scanner.nextLine();
                    System.out.print("Имя: ");
                    String fn = scanner.nextLine();
                    System.out.print("Отчество: ");
                    String mn = scanner.nextLine();
                    System.out.print("Группа: ");
                    String gr = scanner.nextLine();
                    manager.addStudent(new Student(ln, fn, mn, gr));
                    break;

                case 2:
                    System.out.print("Фамилия: ");
                    ln = scanner.nextLine();
                    System.out.print("Имя: ");
                    fn = scanner.nextLine();
                    System.out.print("Отчество: ");
                    mn = scanner.nextLine();
                    if (manager.removeStudent(ln, fn, mn)) {
                        System.out.println("Студент удален");
                    } else {
                        System.out.println("Студент не найден");
                    }
                    break;

                case 3:
                    System.out.print("Фамилия: ");
                    ln = scanner.nextLine();
                    manager.findStudent(ln);
                    break;

                case 4:
                    System.out.print("Группа: ");
                    gr = scanner.nextLine();
                    manager.printByGroup(gr);
                    break;

                case 0:
                    System.out.println("Выход");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
}
