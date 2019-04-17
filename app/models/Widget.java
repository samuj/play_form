package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import io.ebean.*;

/**
 * Presentation object used for displaying data in a template.
 *
 * Note that it's a good practice to keep the presentation DTO,
 * which are used for reads, distinct from the form processing DTO,
 * which are used for writes.
 */
@Entity
public class Widget extends Model{

    @Id
    private Long id;

    public static final Finder<Long, Widget> find = new Finder<>(Widget.class);

    public String name;
    public int age;
    public String branch;
    public int marks;

    public Widget(String name, int age, String branch, int marks) {
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.marks = marks;
    }
}
