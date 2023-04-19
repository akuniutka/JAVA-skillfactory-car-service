package ru.skillfactory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.skillfactory.entity.DefaultCar;

@Service
public class GibddService {
    @Autowired
    private DefaultCar defaultCar;

    public void checkSpeed() {
        if (defaultCar.getSpeed() > 20) {
            System.out.println("Данный автомобиль нарушает установленный скоростной лимит");
        }
    }
}
