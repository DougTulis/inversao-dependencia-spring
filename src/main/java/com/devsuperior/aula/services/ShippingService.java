package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;

public class ShippingService {

    public double shipment(Order order) {
        if (order.getBasic() < 100.00) {
            return 20.00;
        } else if (order.getBasic() < 200.00) {
            return 12.00;
        }
        return 0;
    }
}
