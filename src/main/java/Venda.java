import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Venda {
    private Vendedor vendedor;
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private double totalCompra;
    private String dataCompra;

    public Venda(Vendedor vendedor, Cliente cliente, Produto produto, int quantidade, double totalCompra) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.totalCompra = totalCompra;
        LocalDate data = LocalDate.now();
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataCompra = data.format(formatarData);
    }

}
