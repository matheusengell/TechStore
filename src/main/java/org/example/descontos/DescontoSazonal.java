package org.example.descontos;

public class DescontoSazonal implements EstrategiaDesconto{


    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.95;
    }
}
