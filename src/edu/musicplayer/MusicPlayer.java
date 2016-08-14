package aca.exam.musicplayer;
import java.util.ArrayList;

public interface MusicPlayer {
	String CurrentSong(Song song);
	void playSong(Song song);
	void nextSong();
	void previousSong();
	String showArtists(ArrayList<Song> songList);
	String showSongTitles(ArrayList<Song> songList);
	String showAlbums(ArrayList<Album> albumList);

}
