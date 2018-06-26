package com.higgsup.intern.w01.sec07.general.scjp;

import java.util.Map;
import java.util.HashMap;

public class Exercise05 {
    private Map<String, Integer> accountTotals = new HashMap<String, Integer>();
    private int retirementFund;
    public int getBalanse(String accountName){
        Integer total = (Integer)accountTotals.get(accountName);
        if (total == null) total = 0;
        return total;
    }

    public void setBalance(String accountName, int amount) {
        accountTotals.put(accountName, amount);
    }


/*  This class is to be updated to make use of appropriate generic types, with no changes in behavior (for better or worse). Which of these steps could be performed? (Choose three.)
    A. Replace line 13 with
        private Map<String, int> accountTotals = new HashMap<String, int>();
    B. Replace line 13 with
        private Map<String, Integer> accountTotals = new HashMap<String, Integer>();
    C. Replace line 13 with
        private Map<String<Integer>> accountTotals = new HashMap<String<Integer>>();
    D. Replace lines 17–20 with
        int total = accountTotals.get(accountName);
         if (total == null)
          total = 0;
        return total;
    E. Replace lines 17–20 with
        Integer total = accountTotals.get(accountName);
         if (total == null) total = 0;
        return total;
    F. Replace lines 17–20 with
        return accountTotals.get(accountName);
    G. Replace line 24 with
        accountTotals.put(accountName, amount);
    H. Replace line 24 with
        accountTotals.put(accountName, amount.intValue());  */
/*Choose B E G
 A: kiểu của parameter không đc để là primitive
  C: truyền sai parameter cho Map
  D: int không thể trả về giá trị null nên k so sánh if (total == null) được
  F: hàm return về 1 int value mà phương thức get trả về Interger value
  H: Vì đã có int amount nên không sử dụng đc amount.intValue() nữa*/

}
