package demo.rest.api.repository;

import demo.rest.api.model.Album;
import demo.rest.api.model.Genre;
import demo.rest.api.model.MediaType;
import demo.rest.api.model.Track;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TrackRepository extends CrudRepository<Track, Integer> {

    List<Track> findByName(String name);
    List<Track> findByAlbum(Album album);
    List<Track> findByGenre(Genre genre);
    List<Track> findByMediaType(MediaType mediaType);
    List<Track> findByComposer(String composer);
    List<Track> findByAlbumOrderByNameAsc(Album album);
    List<Track> findByAlbumOrderByNameDesc(Album album);

}
