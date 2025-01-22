package gr.aueb.cf.ch17.builder;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book.Builder(1, "43434").build();
        Book book2 = new Book.Builder(1, "3434")

                .author("Morfon")
                .title("Java")
                .build();


    }
}
