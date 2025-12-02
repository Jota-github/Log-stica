package facade;

import model.Produto;
import services.ServicoEstoque;
import services.ServicoPagamento;
import services.ServicoRemessa;

public class PedidoFacade {
    
    public void processarPedido(Produto produto) {
        System.out.println("\n--- INICIANDO PROCESSAMENTO DO PEDIDO: " + produto.name + " ---");
        
        // Passo 1: Verifica Estoque
        boolean estoqueOk = ServicoEstoque.isAvailable(produto);
        
        if (estoqueOk) {
            // Passo 2: Processa Pagamento
            boolean pagamentoOk = ServicoPagamento.makePayment();
            
            if (pagamentoOk) {
                // Passo 3: Envia Produto
                ServicoRemessa.shipProduct(produto);
                System.out.println(">>> SUCESSO: O pedido foi processado e enviado!");
            } else {
                System.out.println(">>> ERRO: Falha no processamento do pagamento.");
            }
        } else {
            System.out.println(">>> ERRO: Produto indisponível no estoque.");
        }
    }
}