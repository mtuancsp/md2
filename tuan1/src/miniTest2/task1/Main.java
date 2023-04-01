package miniTest2.task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        books.add(new ProgrammingBook("P1", "Java Programming", 250, "John Doe", "Java", "Spring"));
        books.add(new ProgrammingBook("P2", "Python Programming", 299.9, "Jane Smith", "Python", "Django"));
        books.add(new ProgrammingBook("P3", "JavaScript Programming", 150.5, "Adam Johnson", "JavaScript", "React"));
        books.add(new ProgrammingBook("P4", "C# Programming", 350.0, "James Lee", "C#", ".NET"));
        books.add(new ProgrammingBook("P5", "Ruby Programming", 199.9, "Emily Brown", "Ruby", "Ruby on Rails"));
        books.add(new FictionBook("F6", "Harry Potter and the Philosopher's Stone", 120.0, "J.K. Rowling", "Fantasy"));
        books.add(new FictionBook("F7", "The Hitchhiker's Guide to the Galaxy", 88.8, "Douglas Adams", "Viễn tưởng 1"));
        books.add(new FictionBook("F8", "The Da Vinci Code", 99.9, "Dan Brown", "Mystery"));
        books.add(new FictionBook("F9", "The Hunger Games", 111.1, "Suzanne Collins", "Dystopian"));
        books.add(new FictionBook("F10", "To Kill a Mockingbird", 69.9, "Harper Lee", "Viễn tưởng 1"));

        double totalCost = 0;
        int countFiction1 = 0;
        int countPriceUnder100 = 0;

        for (Book book : books) {
            totalCost += book.getPrice();
            if (book instanceof FictionBook fictionBook) {
                if (fictionBook.getCategory().equals("Viễn tưởng 1")) {
                    countFiction1++;
                }
            }
            if (book.getPrice() < 100) {
                countPriceUnder100++;
            }
        }

        System.out.println("Tổng tiền của 10 cuốn sách: " + totalCost);
        System.out.println("Số sách Fiction có category là \"Viễn tưởng 1\": " + countFiction1);
        System.out.println("Số sách có giá < 100: " + countPriceUnder100);

        books.add(new FictionBook());
        System.out.println(books.get(books.size() - 1).getClass().getSimpleName());
        System.out.println(( (FictionBook)books.get(10)).getCategory());

    }
}
