import modelo.Cliente;
import modelo.Produto;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        //Cliente cliente2 = new    Cliente(1l, "Anderson","dada.anderson@hotmail",31);

        cliente.setId(1l);
        cliente.setNome("Anderson");
        cliente.setEmail("dada.     anderson    @hotmail    .com");
        cliente.setIdade(31);

        Produto detergente = new Produto();

        detergente.setAtivoInativo(false);

        detergente.setCodigo("cd12");
        detergente.setDescricao("Detergente");
        detergente.setValorUnitario(10.00);

        System.out.println(detergente);

        Produto produto2 = new Produto();


        //produto2.setDescricao("Desinfetante");


//         System.out.println(cliente.transformarNomeMaiusculo());
//        System.out.println(cliente);
//        System.out.println(cliente2);
//        System.out.println("Soma da Idade" + cliente.calcularIdade(5));
//        System.out.println(cliente2.sobrenome("Ferreira"));
//        System.out.println(cliente2.email());
    }


}
