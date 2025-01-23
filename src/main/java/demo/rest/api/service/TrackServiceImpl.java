package demo.rest.api.service;

import demo.rest.api.model.*;
import demo.rest.api.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl implements TrackService {

    @Autowired
    TrackRepository trackRepository;

    @Override
    public List<Track> getAllTracks() {
        return null;
    }

    @Override
    public Track getTrackById(Integer id) {
        return null;
    }

    @Override
    public Track getTrackByName(String name) {
        return null;
    }

    @Override
    public Track createTrack(Track track) {
        return null;
    }

    @Override
    public Track updateTrack(Integer id, Track trackDetails) {
        return null;
    }

    @Override
    public void deleteTrack(Integer id) {

    }

    @Override
    public void deleteTrackByName(String name) {

    }
}
