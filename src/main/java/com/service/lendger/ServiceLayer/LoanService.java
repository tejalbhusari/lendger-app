package com.service.lendger.ServiceLayer;

import com.service.lendger.Entity.UserDetails;
import com.service.lendger.Repo.UserDataBase;

public class LoanService {

    public void createLoanData(String[] array) {
        String bankName = array[1];
        String userName = array[2];
        Integer principalAmount = Integer.valueOf(array[3]);
        Integer noOfYears = Integer.valueOf(array[4]);
        Integer interestRate = Integer.valueOf(array[5]);
        createNewEntryInDB(bankName, userName, principalAmount, noOfYears, interestRate);
    }

    private void createNewEntryInDB(String bankName, String userName, Integer principalAmount, Integer noOfYears,
                                    Integer interestRate) {
        UserSerice userSerice = new UserSerice();
        UserDetails userDetails = userSerice.createUserData(principalAmount, noOfYears, interestRate);
        UserDataBase.createNewEntryInDB(userDetails, bankName, userName);
    }

}
