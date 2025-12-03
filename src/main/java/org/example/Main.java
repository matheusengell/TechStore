package org.example;

import org.example.descontos.DescontoAniversario;
import org.example.descontos.DescontoCupom;
import org.example.descontos.DescontoSazonal;
import org.example.descontos.DescontoVip;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor:");
        double valor = leia.nextDouble();

        CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();
        System.out.println("""
                ==== ESCOLHA O DESCONTO =====
                    1 - SAZONAL (5%)
                    2 - CUPOM (10%) 
                    3 - VIP (15%)
                    4 - ANIVERSÁIO (20%)
                """);
            int escolha = leia.nextInt();

            Pedido pedido = new Pedido("321321", valor, 10, "email@email.com");
            double valorFinal = pedido.getValorBruto();
            switch (escolha){
                case 1 ->{
                    pedido.setTipoDesconto(TipoDesconto.SAZONAL);
                    DescontoSazonal descontoSazonal = new DescontoSazonal();
                    valorFinal = calculadoraDescontos.aplicarDesconto(pedido, descontoSazonal);
                }
                case 2->{
                    pedido.setTipoDesconto(TipoDesconto.CUPOM);
                    DescontoCupom descontoCupom = new DescontoCupom();
                    valorFinal = calculadoraDescontos.aplicarDesconto(pedido, descontoCupom);
                }
                case 3->{
                    pedido.setTipoDesconto(TipoDesconto.VIP);
                    DescontoVip descontoVip = new DescontoVip();
                    valorFinal = calculadoraDescontos.aplicarDesconto(pedido, descontoVip);
                }
                case 4->{
                    pedido.setTipoDesconto(TipoDesconto.ANIVERSARIO);
                    DescontoAniversario descontoAniversario = new DescontoAniversario();
                    valorFinal = calculadoraDescontos.aplicarDesconto(pedido, descontoAniversario);
                }
            }
        System.out.println("Valor final com o desconto: "+ valorFinal);
        }
    }
