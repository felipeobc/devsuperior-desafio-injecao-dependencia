package br.com.devsuperior.desafio.injecao.dependencia.service;

import br.com.devsuperior.desafio.injecao.dependencia.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){

        if(order.getBasic() <= 100){
            order.setBasic(order.getBasic() + 20);
            return order.getBasic();
        }else if (order.getBasic() > 100 && order.getBasic() <= 200) {
            order.setBasic(order.getBasic() + 12);
            return order.getBasic();
        }else {
            return order.getBasic();
        }

    }

}
