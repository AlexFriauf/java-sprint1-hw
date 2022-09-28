import java.util.Scanner;
public class Main {
           public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            StepTracker stepTracker = new StepTracker();


            printMenu();
            int userInput = scanner.nextInt();

            while (userInput != 0) {

                if (userInput == 1) {
                    System.out.println("Ввдите месяц");
                    int month = scanner.nextInt();
                    while (month < 0 || month > 11) {
                        System.out.println("Такого месяца не существует");
                        System.out.println("Введите месяц");
                        month = scanner.nextInt();
                    }
                    System.out.println("Ввдите день");
                    int day = scanner.nextInt();
                    while (day < 0 || day > 29) {
                        System.out.println("Такого деня не существует");
                        System.out.println("Введите день");
                        day = scanner.nextInt();
                    }
                        System.out.println("Введите количество шагов");
                        int step = scanner.nextInt();
                        while (step < 0) {
                            System.out.println("Введите количество шагов");
                            step = scanner.nextInt();
                        }
                            stepTracker.monthToData[month].dayToData[day].steps = step;
                            System.out.println("Результат сохранен");


                        }  else if (userInput == 2) {
                          System.out.println("Выберите месяц");
                          int month = scanner.nextInt();
                          while (month < 0 || month > 11) {
                          System.out.println("Такого месяца не существует");
                          System.out.println("Введите месяц");
                          month = scanner.nextInt();
                          }
                           stepTracker.printStepsByDay(month);
                           System.out.println( "\n" +stepTracker.getSumSteps(month));
                           System.out.println(stepTracker.getAverageSteps(month));
                           System.out.println("Вы прошли за месяц:" + stepTracker.getDistance(month)+"км.");
                           System.out.println("Было сожжено коллорий: "+stepTracker.getCallories(month));
                           System.out.println("Лучшая серия: " + stepTracker.getSeriasSteps(month));
                        } else if (userInput == 3) {
                            System.out.println("Введите количество шагов");
                            int goal = scanner.nextInt();
                            while (goal < 0) {
                                System.out.println("Введите количество шагов");
                                goal = scanner.nextInt();
                                stepTracker.goal = goal;
                            }
                                stepTracker.goal = goal;
                                System.out.println("Знеачанеие сохранено, теперь :" + goal);

                            } else if (userInput == 4) {
                                System.out.println("Выход");
                                break;
                            } else {
                                System.out.println("Извините, такой команды пока нет.");
                            }

                            printMenu();
                            userInput = scanner.nextInt();
                        }
                        System.out.println("Программа завершена");
                    }



                private static void printMenu () {
                    System.out.println("Что вы хотите сделать?");
                    System.out.println("1 - Ввести количество шагов за определённый день");
                    System.out.println("2 - Напечатать статистику за определённый месяц;");
                    System.out.println("3 - Изменить цель по количеству шагов в день");
                    System.out.println("4 - Выйти из приложения");
                }

        }

