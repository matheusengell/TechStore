package org.example.descontos;

public class DescontoCupom implements EstrategiaDesconto{

    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.90;
    }

}
