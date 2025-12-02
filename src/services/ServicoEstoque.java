package services;

import model.Produto;

public class ServicoEstoque {
    public static boolean isAvailable(Produto product) {
        /* Verifica se o produto está disponível no estoque */
        System.out.println("ServicoEstoque: Verificando disponibilidade do produto " + product.name);
        return true;
    }
}