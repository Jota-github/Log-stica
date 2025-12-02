package app;

import facade.PedidoFacade;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        // Criando um produto de exemplo
        Produto smartphone = new Produto(1, "Smartphone Galaxy S23");
        
        // Criando a fachada
        PedidoFacade pedidoFacade = new PedidoFacade();
        
        // Solicitando o processamento do pedido de forma simples
        // O cliente não precisa saber sobre Estoque, Pagamento ou Remessa
        pedidoFacade.processarPedido(smartphone);
    }
}