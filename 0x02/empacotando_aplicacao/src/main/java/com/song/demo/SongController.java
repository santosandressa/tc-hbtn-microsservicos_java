package com.song.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class SongController {

    private SongRepository songRepository;

    public SongController(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    final Logger LOG =  Logger.getLogger(SongController.class.getName());

    @GetMapping
    public String teste(){
        LOG.info("GET teste");
        return "teste";
    }

    @GetMapping("/welcome")
    public String mensagemBoasVindas() {
        // TODO
        return null;
    }

    @GetMapping(path = "/allSongs")
    public List<Song> getAllSongs() {
        // TODO
        return null;
    }

    @GetMapping(path = "/findSong/{id}")
    public Song findSongById(@PathVariable Integer id) {
        // TODO
        return null;
    }

    @PostMapping(path = "/addSong", consumes = "application/json", produces = "application/json")
    public Song addSong(@RequestBody Song song) {
        // TODO
        return null;
    }

    @PutMapping(path = "/updateSong", consumes = "application/json", produces = "application/json")
    public Song updadeSong(@RequestBody Song song) {
        // TODO
        return null;
    }

    @DeleteMapping(path = "/removeSong", consumes = "application/json", produces = "application/json")
    public void deleteSongById(@RequestBody Song song) {
        // TODO
    }
}
