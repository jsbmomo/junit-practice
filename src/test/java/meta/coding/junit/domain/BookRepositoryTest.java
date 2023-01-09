package meta.coding.junit.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

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

}
