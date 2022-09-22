package com.service.lendger.ServiceLayer;

import com.service.lendger.Entity.UserDetails;

import java.util.HashMap;

public class UserSerice {

    public UserDetails createUserData(Integer principalAmount, Integer noOfYears, Integer interestRate) {
        UserDetails userDetails = new UserDetails();
        userDetails.setInterestRate(interestRate);
        userDetails.setPrincipalAmount(principalAmount);
        userDetails.setTotalMonths(noOfYears * 12);
        Double totalAmount = (1.0 * principalAmount * interestRate * noOfYears / 100) + principalAmount;
        Integer monthlyEMI = (int) Math.ceil(totalAmount / (12 * noOfYears));
        Integer finalTotalAmount = monthlyEMI * 12 * noOfYears;
        userDetails.setMonthlyEmi(monthlyEMI);
        userDetails.setTotalAmountToReturn(finalTotalAmount);
        userDetails.setExtraAmountPaidInEmi(new HashMap<>());
        return userDetails;
    }

}
