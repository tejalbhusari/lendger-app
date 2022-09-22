package com.service.lendger.ServiceLayer;

import com.service.lendger.Entity.UserDetails;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Objects;

class UserSericeTest {

    @BeforeClass
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createUserData() {
        UserSerice userSerice = new UserSerice();
        UserDetails userDetails = new UserDetails(200, new HashMap<>(),
                12000, 10000, 4, 60);
        UserDetails userServiceResponse = userSerice.createUserData(10000, 5,4);
        assert(Objects.equals(userDetails.getMonthlyEmi(), userServiceResponse.getMonthlyEmi())
        && Objects.equals(userDetails.getTotalAmountToReturn(), userServiceResponse.getTotalAmountToReturn()));
    }
}