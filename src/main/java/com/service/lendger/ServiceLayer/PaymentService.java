package com.service.lendger.ServiceLayer;

import com.service.lendger.Entity.UserDetails;
import com.service.lendger.Repo.UserDataBase;

import java.util.Map;

public class PaymentService {

    public void updateEMI(String[] array) {
        String bankName = array[1];
        String userName = array[2];
        Integer amount = Integer.valueOf(array[3]);
        Integer month = Integer.valueOf(array[4]);
        UserDetails userDetails = UserDataBase.fetchUserData(bankName, userName);
        Map<Integer, Integer> extraAmount = userDetails.getExtraAmountPaidInEmi();
        if (extraAmount.containsKey(month)) {
            Integer finalAmount = extraAmount.get(month) + amount;
            extraAmount.put(month, finalAmount);
        } else {
            extraAmount.put(month, amount);
        }
    }

}
