package Registro;

import Model.Cliente;
import Model.Produto;
import Model.Venda;
import Model.Vendedor;
import Repository.ClienteRepository;
import Repository.VendaRepository;
import Repository.VendedorRepository;

import java.time.LocalDate;
import java.util.Scanner;

public class ClienteRegistro {
    private ClienteRepository clienteRepository = new ClienteRepository();
    private VendaRepository vendaRepository = new VendaRepository();
    private VendedorRepository vendedorRepository = new VendedorRepository();
    private Cliente cliente;
    static Scanner scanner = new Scanner(System.in);

    public void cadastrarCliente() {

        System.out.println("Qual seu nome: ");
        String nomeC = scanner.nextLine();
        if (!nomeC.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Valor informado não é uma string, digite seu nome com uma String valida e sem espaço!");
        }
        System.out.println("Qual seu email: ");
        String emailC = scanner.nextLine();
        if (!emailC.contains("@")) {
            throw new IllegalArgumentException("O email precisa conter o @");
        }

        System.out.println("Qual seu cpf: ");
        String cpfC = scanner.next();

        System.out.println("Digite a senha:");
        String senha = scanner.next();
        cliente = new Cliente(emailC, nomeC, cpfC, senha);
        if (!clienteRepository.clienteJaExiste(cliente)) {
            throw new IllegalArgumentException("Cliente já cadastrado");
        }
    }

    public void loginCliente() {
        System.out.println("Informe seu e-mail");
        String email = scanner.next();
        if (!(email.contains("@"))) {
            throw new UnsupportedOperationException();
        }
        System.out.println("Informe sua senha");
        String senha = scanner.next();
        if (clienteRepository.procuraClienteEmail(email, senha) == null) {
            throw new IllegalArgumentException("Cliente não cadastrado");
        }
        cliente = clienteRepository.procuraClienteEmail(email, senha);
    }

    public void comprarProduto() {

        System.out.println("Qual o codigo do produto que deseja: ");
        int codigo = scanner.nextInt();
        Produto produto = new Produto(0, "", 0);

        if (produto.getNomeProduto().isEmpty()) {
            throw new IllegalArgumentException("Codigo não encontrado");
        }
        System.out.println("Quantas unidades deseja desse produto: ");
        int quantidade = scanner.nextInt();
        System.out.println();
        Vendedor vendedor = vendedorRepository.turnoDaVez();

//        vendaRepository.adicionarVenda(new Venda(vendedor, cliente, codigo, produto.getNomeProduto(), produto.getPreco(), quantidade));
    }
}


