package meta.coding.junit.web;

import meta.coding.junit.domain.Book;

public class BookApiControllerTest {
  private void test() {
    Book book = Book.builder()
        .id(1L)
        .title("Hello")
        .author("Jeon")
        .build();
  }
}
