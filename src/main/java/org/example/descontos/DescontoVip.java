package org.example.descontos;

public class DescontoVip implements EstrategiaDesconto{

    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.85;
    }

}
