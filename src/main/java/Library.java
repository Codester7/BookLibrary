import java.util.Scanner;

public class Library {
    int allPages;
    int pagesCount;
    String name;
    String author;
    String type;
    String Status;

    public Library(String name, String author, int allPages, String type) {
        this.allPages = allPages;
        this.name = name;
        this.author = author;
        this.type = type;
    }
        void pages () {                                       // Считает сколько страниц осталось до конца книги.

        Scanner in = new Scanner(System.in);
        System.out.println("На какой вы странице?");
        int a = in.nextInt();

        if (a < allPages && a>0) {
            int result = allPages - a;
            System.out.println("До конца этой книги осталось" + " " + result);
        } else if (a >= allPages) {
            System.out.println("Поздравляю! Вы закончили книгу! Можете приступить к следующей.");
        } else
            System.out.println("Введенные данные некорректны.");
    }

     void hellodiscription(){                                // Приветсвенное сообщение при выборе книги
         System.out.println("Приветсвую!");
         System.out.println("Вы читает следующую книгу:");
         System.out.println("Название:" +" "+ name + " ");
         System.out.println("Автор:" +" "+ author + " ");
         System.out.println("Тип:" +" "+ type + " ");
    }

}

