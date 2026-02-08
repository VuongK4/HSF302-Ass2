package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "settings")
public class Setting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "value",length = 255)
    private String value;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Setting type_id;

    @Column(name = "order_index")
    private int orderIndex;

    @Column(name = "status")
    private boolean status;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
}
