package day12.task5;

import java.util.List;

public class MusicBand {
  private String name;
  private int year;
  private List<MusicArtist> members;

  public void setName(String name) {
    this.name = name;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setMembers(List<MusicArtist> members) {
    this.members = members;
  }

  public List<MusicArtist> getMembers() {
    return members;
  }

  public String getName() {
    return name;
  }

  public int getYear() {
    return year;
  }

  public MusicBand(String name, int year, List<MusicArtist> artists) {
    this.name = name;
    this.year = year;
    this.members = artists;
  }

  @Override
  public String toString() {
    return "MusicBand{" +
        "name='" + name + '\'' +
        ", year=" + year +
        ", members=" + members +
        '}';
  }

  public static void transferMembers (MusicBand bandA, MusicBand bandB) {
    bandB.members.addAll(bandA.members);
    bandA.members.clear();
  }
  public void printMembers () {
    System.out.println(members);
  }
}
