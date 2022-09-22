package com.service.lendger.ServiceLayer;

import com.service.lendger.Entity.UserDetails;
import com.service.lendger.Repo.UserDataBase;

import java.util.Map;

public class BalanceService {

    public void fetchBalance(String[] array) {
        String bankName = array[1];
        String userName = array[2];
        Integer monthEMI = Integer.valueOf(array[3]);
        UserDetails userDetails = UserDataBase.fetchUserData(bankName, userName);
        Integer toTalAmount = userDetails.getTotalAmountToReturn();
        Integer monthlyEMI = userDetails.getMonthlyEmi();
        Integer totalAmountPaidTillNow = monthlyEMI * monthEMI;
        totalAmountPaidTillNow =
                totalAmountPaidTillNow + addExtraAmount(userDetails.getExtraAmountPaidInEmi(), monthEMI);
        Integer remainingAmount = toTalAmount - totalAmountPaidTillNow;
        Integer emiRemaining = (int) Math.ceil(remainingAmount * 1.0 / monthlyEMI);
        System.out.println(
                bankName + " " + userName + " " + totalAmountPaidTillNow + " " + emiRemaining);
    }

    private Integer addExtraAmount(Map<Integer, Integer> extraAmount, Integer monthEMI) {
        int sum = 0;
        for (Integer key : extraAmount.keySet()) {
            if (key <= monthEMI) {
                sum = sum + extraAmount.get(key);
            }
        }
        return sum;
    }

}
