package com.sinaucoding.perpustakaan.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "loan")
@NoArgsConstructor
public class Loan extends BaseEntity<Loan> {

    private static final long serialVersionUID = 286258783421285669L;
    @Column(name = "type_identity")
    private String type;

    @Column(name = "number_identity")
    private String number;

    @Column(name = "duration")
    private String duration;

    @Column(name = "loan_date")
    @Temporal(TemporalType.DATE)
    private Date loadDate;

    @Column(name = "return_date")
    @Temporal(TemporalType.DATE)
    private Date returnDate;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusLoan status;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public enum StatusLoan {
        BORROWED,
        RETURNED
    }
}
