package pl.coderslab;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    MockBookService bookService = new MockBookService();


    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable long id) {
        return bookService.get(id).get();
    }
    @PostMapping("/books")
    public void addBook(@RequestBody Book book) {
        bookService.add(book);
    }
    @PutMapping("/books")
    public void updateBook(@RequestBody Book book) {
        bookService.update(book);
    }
    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable long id) {
        bookService.delete(id);
    }
}