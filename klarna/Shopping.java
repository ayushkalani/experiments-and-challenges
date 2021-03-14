package com.ayush;

import java.util.*;

class Shopping {

    public static int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
        int ret = entry2.getValue().compareTo(entry1.getValue());
        if (ret == 0) {// if 0 the are the same then compare the keys
            return entry1.getKey().compareTo(entry2.getKey());
        }
        return ret;
    }

    static List<String> popularShoppingCategories(Map<String, List<String>> usersPurchases) {
        HashMap<String, List<String>> data = getData();
        HashMap<String, Integer> categoryCountMap = new HashMap<>();
        List<String> res = new ArrayList<>();
        int maxCount = 0;

        for (Map.Entry<String, List<String>> purchase : usersPurchases.entrySet()) {
            List<String> items = purchase.getValue();
            for (String item : items) {
                if (item == null || !data.containsKey(item.toLowerCase())) {
                    throw new IllegalArgumentException();
                } else {
                    for (String category : data.get(item.toLowerCase())) {
                        Integer count = categoryCountMap.get(category);
                        if (count == null) {
                            categoryCountMap.put(category, 1);
                        } else {
                            categoryCountMap.put(category, count + 1);
                        }
                    }
                }
            }

        }
        Object[] ans = categoryCountMap.entrySet().toArray();
        Arrays.sort(ans, (Comparator) (o1, o2) -> ((Map.Entry<String, Integer>) o2).getValue()
                .compareTo(((Map.Entry<String, Integer>) o1).getValue()));
        for (Object e : ans) {
            if (res.isEmpty()) {
                res.add(((Map.Entry<String, Integer>) e).getKey());
                maxCount = (((Map.Entry<String, Integer>) e).getValue());
            } else {
                if (maxCount == (((Map.Entry<String, Integer>) e).getValue())) {
                    res.add(((Map.Entry<String, Integer>) e).getKey());
                }
            }
        }


        return res;
    }


    static HashMap getData() {
        HashMap<String, List<String>> shoppingMeta = new HashMap<String, List<String>>();
        shoppingMeta.put("shirt", Arrays.asList("Clothing"));
        shoppingMeta.put("sweater", Arrays.asList("Clothing"));
        shoppingMeta.put("jacket", Arrays.asList("Clothing"));
        shoppingMeta.put("shorts", Arrays.asList("Clothing", "Sports"));
        shoppingMeta.put("shoes", Arrays.asList("Clothing", "Sports"));
        shoppingMeta.put("socks", Arrays.asList("Sports"));
        shoppingMeta.put("helmet", Arrays.asList("Sports"));
        shoppingMeta.put("bag", Arrays.asList("Sports", "Accessories"));
        shoppingMeta.put("belt", Arrays.asList("Accessories"));
        shoppingMeta.put("hat", Arrays.asList("Accessories"));
        shoppingMeta.put("sunglasses", Arrays.asList("Accessories"));
        shoppingMeta.put("watch", Arrays.asList("Accessories"));
        shoppingMeta.put("TV", Arrays.asList("Electronics"));
        shoppingMeta.put("camera", Arrays.asList("Electronics"));
        shoppingMeta.put("headphones", Arrays.asList("Electronics"));
        shoppingMeta.put("laptop", Arrays.asList("Electronics"));
        return shoppingMeta;
    }


    public static void main(String[] args) {
    }

}
