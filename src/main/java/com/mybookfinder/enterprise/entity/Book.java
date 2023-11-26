package com.mybookfinder.enterprise.entity;


import jakarta.persistence.*;

@Entity
@Table
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int ID;

    @Column(name = "Title")
    private String Title;

    @Column(name = "Author")
    private String Author;

    @Column(name = "Genre")
    private String Genre;

    @Column(name = "Description")
    private String Description;

    @Column(name = "ISBN")
    private String ISBN;

    //set the constructors
    public Book(){

    }

    public Book(int id, String title, String author, String genre, String description, String ISBN) {
        this.ID = id;
        this.Title = title;
        this.Author = author;
        this.Genre = genre;
        this.Description = description;
        this.ISBN = ISBN;
    }

    public int getId() {
        return ID;
    }

    public void setId(int id) {
        this.ID = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + ID +
                ", Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", Genre='" + Genre + '\'' +
                ", Description='" + Description + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}
