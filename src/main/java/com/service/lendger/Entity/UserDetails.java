package com.service.lendger.Entity;

import java.util.Map;

public class UserDetails {

    Integer monthlyEmi;
    Map<Integer, Integer> extraAmountPaidInEmi;

    public UserDetails() {
    }

    public UserDetails(Integer monthlyEmi, Map<Integer, Integer> extraAmountPaidInEmi, Integer totalAmountToReturn,
                       Integer principalAmount, Integer interestRate, Integer totalMonths) {
        this.monthlyEmi = monthlyEmi;
        this.extraAmountPaidInEmi = extraAmountPaidInEmi;
        this.totalAmountToReturn = totalAmountToReturn;
        this.principalAmount = principalAmount;
        this.interestRate = interestRate;
        this.totalMonths = totalMonths;
    }

    Integer totalAmountToReturn;
    Integer principalAmount;
    Integer interestRate;
    Integer totalMonths;

    public void setMonthlyEmi(Integer monthlyEmi) {
        this.monthlyEmi = monthlyEmi;
    }

    public void setExtraAmountPaidInEmi(Map<Integer, Integer> extraAmountPaidInEmi) {
        this.extraAmountPaidInEmi = extraAmountPaidInEmi;
    }

    public void setTotalAmountToReturn(Integer totalAmountToReturn) {
        this.totalAmountToReturn = totalAmountToReturn;
    }

    public void setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
    }

    public void setTotalMonths(Integer totalMonths) {
        this.totalMonths = totalMonths;
    }

    public void setPrincipalAmount(Integer principalAmount) {
        this.principalAmount = principalAmount;
    }

    public Integer getMonthlyEmi() {
        return monthlyEmi;
    }

    public Map<Integer, Integer> getExtraAmountPaidInEmi() {
        return extraAmountPaidInEmi;
    }

    public Integer getTotalAmountToReturn() {
        return totalAmountToReturn;
    }

    public Integer getInterestRate() {
        return interestRate;
    }

    public Integer getTotalMonths() {
        return totalMonths;
    }

    public Integer getPrincipalAmount() {
        return principalAmount;
    }

}
