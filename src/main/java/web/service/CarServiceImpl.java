package web.service;

import java.util.List;

public class CarServiceImpl implements CarService {

    public static List getCarsFromList(List list, int number) {
        return list.stream().limit(number).toList();
    }
}
