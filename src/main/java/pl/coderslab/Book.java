package pl.coderslab;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(force = true)
@Getter
@Setter
@AllArgsConstructor

public class Book {
    private Long id;
    private final String isbn;
    private final String title;
    private final String author;
    private final String publisher;

    public Book(String isbn, String title, String author, String publisher, String type) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.type = type;
    }

    private final String type;
}
