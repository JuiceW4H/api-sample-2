package demo.rest.api.service;

import demo.rest.api.model.*;

import java.util.List;

public interface TrackService {

    List<Track> getAllTracks();
    Track getTrackById(Integer id);
    Track getTrackByName(String name);
    Track createTrack(Track track);
    Track updateTrack(Integer id, Track trackDetails);
    void deleteTrack(Integer id);
    void deleteTrackByName(String name);




}
