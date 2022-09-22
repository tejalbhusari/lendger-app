package com.service.lendger.ServiceLayer;

public class RouterService {

    public void processEachCommand(String line) {
        String array[] = line.split(" ");
        switch (array[0]) {
            case "BALANCE":
                // time complexity ( O (no. of payments))
                new BalanceService().fetchBalance(array);
                break;
            case "LOAN":
                // time complexity ( O (1))
                new LoanService().createLoanData(array);
                break;
            case "PAYMENT":
                // time complexity ( O (1))
                new PaymentService().updateEMI(array);
                break;
        }
    }
}
