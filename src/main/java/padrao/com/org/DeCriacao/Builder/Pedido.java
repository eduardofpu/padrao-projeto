package padrao.com.org.DeCriacao.Builder;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.List;

public class Pedido {

    private String numeroPedido;

    private List<Produto> produtos;
    private Cliente cliente;
    private Vendedor vendedor;

    public BigDecimal getValor() {
        BigDecimal total = BigDecimal.ZERO;

        for (Produto produto : produtos) {

            total = total.add(produto.getValor().multiply(new BigDecimal(produto.getQuantidade())));
        }
        return total;
    }

    public int getTotalProdutos() {
        int total = 0;
        for (Produto produto : produtos) {

            total += produto.getQuantidade();

        }
        return total;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setClient(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void informacoes() {
        System.out.println("N Pedido: " + getNumeroPedido());
        System.out.println("cliente: " + getCliente().getNome());
        System.out.println("Vendedor: " + getVendedor().getNome());
        System.out.println("Produto(s): " + getTotalProdutos());
        System.out.println("Valor total: R$ " + getValor());
    }

    public void informacoesDialog() {

        JOptionPane.showMessageDialog(null,
               "N Pedido: "       + getNumeroPedido()+ "\n"
                + "cliente: "        + getCliente().getNome() + "\n"
                + "Vendedor: "       + getVendedor().getNome() + "\n"
                + "Produto(s): "     + getTotalProdutos()+ "\n"
                + "Valor total: R$ " + getValor());

    }


}
