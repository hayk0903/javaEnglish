package aca.exam.musicplayer;

public interface Playlist {
	
	void addSong(Song song);
	void addFromAlbum(Album album, int i);
	void addWholeAlbum(Album album);


}
