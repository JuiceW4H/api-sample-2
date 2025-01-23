package demo.rest.api.repository;

import demo.rest.api.model.Album;
import demo.rest.api.model.Artist;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlbumRepository extends CrudRepository<Album, Integer> {

    List<Album> findByTitle(String title);
    List<Album> findByArtist(Artist artist);
    List<Album> findByArtistOrderByTitleAsc(Artist artist);
    List<Album> findByArtistOrderByTitleDesc(Artist artist);

}
