package services;

import model.Produto;

public class ServicoRemessa {
    public static void shipProduct(Produto product) {
        /* Conecta-se a serviço externo de logística para enviar o produto */
        System.out.println("ServicoRemessa: Enviando produto " + product.name + " para o cliente.");
    }
}