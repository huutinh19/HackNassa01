/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author ADMIN
 */
public class Book {
    private Integer id;
    private String title;
    private Float pirice;

    public Book() {
    }

    public Book(Integer id, String title, Float pirice) {
        this.id = id;
        this.title = title;
        this.pirice = pirice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPirice() {
        return pirice;
    }

    public void setPirice(Float pirice) {
        this.pirice = pirice;
    }
    
    
}
