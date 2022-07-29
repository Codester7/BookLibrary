public class Books {
    public static void main(String[] args) {

        Library Book1 = new Library("Корабль Дураков", "Сибастиан Брант", 278, "Поэзия");
        Library Book2 = new Library("Повелитель мух", "Уильям Голдинг", 318, "Художественная литературва");
        Library Book3 = new Library("История России", "А.С. Орлов", 544, "Учебная литература");
        Book1.hellodiscription();
        Book1.pages();
    }
}