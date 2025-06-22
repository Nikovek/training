package org.calc.gpt.homework.n3_13.two;

public class Movie {
    public String title;
    public String genre;
    public double rating;

    public Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getInfo() {
        return "Название: " + title + ", Жанр: " + genre + ", Рейтинг: " + rating;
    }
}
