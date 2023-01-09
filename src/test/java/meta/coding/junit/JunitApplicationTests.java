package meta.coding.junit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 테스트 환경에서는 단위 테스트 진행.
 *
 * [ 테스트 순서 ]
 * 1. Repository = DB쪽 관련 테스트
 * 2. Service    = 기능들이 트랜잭션을 잘 타는지
 * 3. Controller = 클라이언트와 테스트
 */
@SpringBootTest
class JunitApplicationTests {

  @Test
  void contextLoads() {
  }

}
