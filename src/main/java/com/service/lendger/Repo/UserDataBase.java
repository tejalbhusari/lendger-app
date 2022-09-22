package com.service.lendger.Repo;

import com.service.lendger.Entity.UserDetails;

import java.util.HashMap;
import java.util.Map;

public class UserDataBase {

    // using this hash map as temp data base
    // map key = bank name
    // map sub key = user name
    // map value  = user details
    static Map<String, Map<String, UserDetails>> map = new HashMap<>();

    public static UserDetails fetchUserData(String bankName, String userName) {
        return map.get(bankName).get(userName);
    }

    public static void createNewEntryInDB(UserDetails userDetails, String bankName,
                                          String userName) {
        Map<String, UserDetails> userDetailMap;
        if (map.containsKey(bankName)) {
            userDetailMap = map.get(bankName);
            userDetailMap.put(userName, userDetails);
        } else {
            userDetailMap = new HashMap<>();
            userDetailMap.put(userName, userDetails);
            map.put(bankName, userDetailMap);
        }
    }
}
