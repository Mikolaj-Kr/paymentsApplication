package com.krawczak.netflixPayments.domain.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "date_of_payment")
  private Date dateOfPayment;

  @Column(name = "amount_of_payment")
  private Long amountOfPayment;

  @ManyToOne
  @JoinColumn(name = "user_id")
  Users users;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getDateOfPayment() {
    return dateOfPayment;
  }

  public void setDateOfPayment(Date dateOfPayment) {
    this.dateOfPayment = dateOfPayment;
  }

  public Long getAmountOfPayment() {
    return amountOfPayment;
  }

  public void setAmountOfPayment(Long amountOfPayment) {
    this.amountOfPayment = amountOfPayment;
  }

  public Users getUsers() {
    return users;
  }

  public void setUsers(Users users) {
    this.users = users;
  }
}
