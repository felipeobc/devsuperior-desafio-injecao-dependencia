package br.com.devsuperior.desafio.injecao.dependencia.service;

import br.com.devsuperior.desafio.injecao.dependencia.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        double discont = (order.getBasic() * order.getDicount()) / 100;

        order.setBasic(order.getBasic() - discont);

        order.setBasic(shippingService.shipment(order));
        return order.getBasic();


    }

}
