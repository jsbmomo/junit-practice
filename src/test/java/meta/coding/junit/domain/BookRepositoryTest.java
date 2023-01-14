package meta.coding.junit.domain;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

/**
 * 1. 책 등록
 * 2. 책 목록보기
 * 3. 책 한 건 보기
 * 4. 책 수정
 * 5. 책 삭제
 */
@DataJpaTest // DB와 관련된 컴포넌트만 메모리에 로딩
public class BookRepositoryTest {

  @Autowired // DI
  private BookRpository bookRepository;

//  @BeforeAll // 테스트 시작전 한번만 실행
  @BeforeEach // 각 테스트 시작전에 한번 씩 실행행
  public void data_set() {
    String title = "Junit5";
    String author = "Coding";

    Book book = Book.builder()
        .title(title)
        .author(author)
        .build();

    Book bookPs = bookRepository.save(book);
  }

  @Test
  public void book_register() {
    String title = "Junit5";
    String author = "Coding";

    Book book = Book.builder()
        .title(title)
        .author(author)
        .build();

    Book bookPs = bookRepository.save(book);

    Assertions.assertEquals(title, bookPs.getTitle());
    Assertions.assertEquals(author, bookPs.getAuthor());
  } // 트랜잭션 종료 (저장된 테이터를 초기화) - 트랜직션 종료가 안되게해야함.

  @Test
  public void find_book_all() {
    String title = "Junit5";
    String author = "Coding";

    List<Book> books = bookRepository.findAll();

    Assertions.assertEquals(title, books.get(0).getTitle());
  }

  @Test
  public void find_book() {
    String title = "Junit5";
    String author = "Coding";

    Book bookPS = bookRepository.findById(1L).get();

    Assertions.assertEquals(title, bookPS.getTitle());
    Assertions.assertEquals(author, bookPS.getTitle());
  }

}
