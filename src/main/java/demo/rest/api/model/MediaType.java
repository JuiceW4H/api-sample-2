package demo.rest.api.model;

import lombok.Data;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "media_types")
@Data
public class MediaType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mediaTypeId;

    private String name;

    @OneToMany(mappedBy = "mediaType", cascade = CascadeType.ALL)
    private List<Track> tracks;
}

