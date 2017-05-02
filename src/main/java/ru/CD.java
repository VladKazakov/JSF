package ru;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vlad on 09.04.17.
 */
@Entity
@NamedQuery(name = CD.FIND_ALL, query = "SELECT c FROM CD c")
public class CD {
    public static final String FIND_ALL = "CD.FIND_ALL";
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Float price;
    private String description;
//    @Lob
//    private byte[] cover;
    @ElementCollection
    @CollectionTable(name="track")
    @MapKeyColumn(name = "position")
    @Column(name = "title")
    private Map<Integer, String> tracks = new HashMap<>();

    public CD() {
    }



    public CD(String title, Float price, String description, Map<Integer, String> tracks) {
        this.title = title;
        this.price = price;
        this.description = description;
       // this.cover = cover;
        this.tracks = tracks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Map<Integer, String> getTracks() {
        return tracks;
    }

    public void setTracks(Map<Integer, String> tracks) {
        this.tracks = tracks;
    }
}