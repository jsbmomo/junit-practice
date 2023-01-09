package meta.coding.junit.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRpository extends JpaRepository<Book, Long> {

}
