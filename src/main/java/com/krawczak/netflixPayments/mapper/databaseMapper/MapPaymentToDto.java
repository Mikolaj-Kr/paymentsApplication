package com.krawczak.netflixPayments.mapper.databaseMapper;

import com.krawczak.netflixPayments.domain.dto.PaymentDto;
import com.krawczak.netflixPayments.domain.entity.Payment;
import com.krawczak.netflixPayments.service.GetPolishNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapPaymentToDto {

  @Autowired
  MapUserToDto mapUserToDto;

  @Autowired
  GetPolishNames getPolishNames;

  public PaymentDto paymentDto(Payment payment) {
    PaymentDto paymentDto = new PaymentDto();
    paymentDto.setId(payment.getId());
    paymentDto.setAmountOfPayment(payment.getAmountOfPayment());
    paymentDto.setDateOfPayment(payment.getDateOfPayment());
    paymentDto.setStatus(payment.getStatus());
    paymentDto.setMonthOfPayment(getPolishNames.getMonth(payment.getDateOfPayment().getMonth().getValue()));
    paymentDto.setUsersDto(mapUserToDto.userToDto(payment.getUsers()));
    return paymentDto;
  }
}