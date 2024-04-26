package com.example.testing.Entity;


import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "train")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trains {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trainnumber;
    private String trainname;
    private LocalDateTime departuretime;
    private LocalDateTime arrivaltime;
    private Duration duration;
    private long price;

    @ManyToOne
    private City sourcecity;

    @ManyToOne
    private City destinationcity;
}
