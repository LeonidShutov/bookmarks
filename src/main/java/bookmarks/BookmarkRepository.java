package bookmarks;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by Leonid Shutov on 29.07.2016.
 */
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

    Collection<Bookmark> findByAccountUsername(String username);
}
