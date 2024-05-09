package dev.patika.library.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="publisher")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id", unique = true, nullable = false)
    private Integer publisherId;

    @Column(name = "publisher_name", length = 100, nullable = false)
    private String publisherName;


    @Column(name = "establishment_year")
    private Integer establishmentYear;

    @Column(name = "publisher_address")
    private String publisherAddress;


    /*@OneToMany(mappedBy = "publisher",cascade = CascadeType.REMOVE)
    private List<Book> bookList;

     */

}
