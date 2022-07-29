public class Books {
    public static void main(String[] args) {

        Library book1 = new Library("Корабль Дураков", "Сибастиан Брант", 278, "Поэзия");
        Library book2 = new Library("Повелитель мух", "Уильям Голдинг", 318, "Художественная литературва");
        Library book3 = new Library("История России", "А.С. Орлов", 544, "Учебная литература");
        book1.printinfo();
        book1.countpages();
    }
}