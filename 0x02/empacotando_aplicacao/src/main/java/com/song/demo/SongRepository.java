package com.song.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {
    private List<Song> list = new ArrayList<Song>();

    public List<Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
        // TODO
        return null;
    }

    public void addSong(Song s) {
        // TODO
    }

    public void updateSong(Song s) {
        // TODO
    }

    public void removeSong(Song s) {
        // TODO
    }
}
