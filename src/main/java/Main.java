import Model.Cliente;
import Model.Vendedor;
import Registro.ClienteRegistro;
import Registro.VendedorRegistro;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        VendedorRegistro vendedorRegistro = new VendedorRegistro();
        ClienteRegistro clienteRegistro = new ClienteRegistro();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Cadastrar Cliente\n2-Cadastrar Vendedor\n3-Logar como cliente\n4-Logar como vendedor\5-Sair");
    while (true){
        switch (scanner.next()){
            case "1":
                clienteRegistro.cadastrarCliente();
                break;
            case "2":
                vendedorRegistro.cadastrarVendedor();
                break;
            case "3":
                clienteRegistro.loginCliente();
                break;
            case "4":
                vendedorRegistro.loginVendedor();
                break;
            case "5":
                exit(0);
            default:
                System.out.println("Opção inválida");
    }
    }
    }

    public static void menuVendedor(){
        VendedorRegistro vendedorRegistro = new VendedorRegistro();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1-Listar Vendedores\n2-Listar Clientes\n3-Listar Vendas\n4-Listar Estoque\n5-Buscar Cliente por CPF\n6-Buscar Vendedor por Email\n7-Voltar para o menu principal");
            switch (scanner.next()){
                case "1":
                 vendedorRegistro.listarVendedores();
                 break;
                case "2":
                    vendedorRegistro.listarClientes();
                    break;
                case "3":
                    vendedorRegistro.vendas();
                    break;
                case "4":
                    break;
                case "5":
                    System.out.println("Qual é o CPF que o vendedor deseja procurar?");
                    vendedorRegistro.vendasPorCliente(scanner.next());
                    break;
                case "6":
                    System.out.println("Qual é o Email do vendedor deseja procurar?");
                    vendedorRegistro.vendasPorVendedor(scanner.next());
                    break;
                case "7":
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public static void menuCliente(){
        Scanner scanner = new Scanner(System.in);
        ClienteRegistro clienteRegistro = new ClienteRegistro();
        while(true){
            switch (scanner.next()){
                case "1":
                    clienteRegistro.comprarProduto();
                    break;
                case "2":
                    return;
                default:
                    System.out.println("Opção invalida");
        }
        }
        }
    }