package meta.coding.junit.web.dto;

import meta.coding.junit.domain.Book;

public class BookSaveReqDto {
  private String title;
  private String author;

  public Book toEntity() {
    return Book.builder()
        .title(title)
        .author(author)
        .build();
  }
}
