package org.example;

import org.example.descontos.EstrategiaDesconto;

public class CalculadoraDescontos {

    public double aplicarDesconto(Pedido pedido, EstrategiaDesconto estrategiaDesconto){
        double valor = pedido.getValorBruto();

        return estrategiaDesconto.aplicarDesconto(valor);
    }

}
