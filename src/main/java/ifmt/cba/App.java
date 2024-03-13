package ifmt.cba;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.swing.JOptionPane;
import javax.xml.namespace.QName;

import ifmt.cba.servico.ProdutoVO;
import ifmt.cba.servico.ServicoControleEstoque;
import jakarta.xml.ws.Service;

public class App {

    private static ServicoControleEstoque controleEstoque;

    public static void main(String[] args) {

        URL url;
        try {
            url = new URL("http://localhost:8083/servico/estoque?wsdl");
            QName qname = new QName("http://servico.cba.ifmt/", "ServicoControleEstoqueImplService");

            Service service = Service.create(url, qname);
            controleEstoque = service.getPort(ServicoControleEstoque.class);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (controleEstoque != null) {
            String opcoesMenu = "[1] Adicionar Produto\n[2] Remover Produto\n[3] Adicionar Estoque\n[4] Baixar Estoque\n"
                    + "[5] Contar Produtos\n[6] Contar Estoque Físico\n[7] Listar Produtos\n[8] Sair";
            int opcao;
            do {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, opcoesMenu));

                switch (opcao) {
                    case 1:
                        novoProduto();
                        break;
                    case 2:
                        removerProduto();
                        break;
                    case 3:
                        adicionarEstoque();
                        break;
                    case 4:
                        baixarEstoque();
                        break;
                    case 5:
                        contarProdutos();
                        break;
                    case 6:
                        contarEstoqueProdutos();
                        break;
                    case 7:
                        listarProdutos();
                        break;
                }
            } while (opcao != 8);
        }
    }

    private static void novoProduto() {
        ProdutoVO produtoVOTemp = null;
        int codigo;
        String nome;
        boolean sair = false;
        do {
            try {
                codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Forneça o código do produto"));
                nome = JOptionPane.showInputDialog(null, "Forneça o nome do produto");
                produtoVOTemp = new ProdutoVO();
                produtoVOTemp.setCodigo(codigo);
                produtoVOTemp.setNome(nome);
                controleEstoque.adicionarProduto(produtoVOTemp);
                sair = true;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao executar a operação" + ex.getMessage());
            }
        } while (!sair);
    }

    private static void removerProduto() {
        ProdutoVO produtoVOTemp = null;
        int codigo;
        try {
            codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Forneça o código do produto"));
            produtoVOTemp = controleEstoque.buscarProdutoPorCodigo(codigo);
            if (produtoVOTemp != null) {
                controleEstoque.removerProduto(produtoVOTemp);
            } else {
                JOptionPane.showMessageDialog(null, "Produto não localizado");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Dados inconsistentes");
        }
    }

    private static void adicionarEstoque() {
        ProdutoVO produtoVOTemp = null;
        int codigo;
        int quantidade;
        boolean sair = false;
        do {
            try {
                codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Forneça o código do produto"));
                produtoVOTemp = controleEstoque.buscarProdutoPorCodigo(codigo);
                if (produtoVOTemp != null) {
                    quantidade = Integer.parseInt(
                            JOptionPane.showInputDialog(null, "Forneça a quantidade a ser adicionada ao estoque"));
                    controleEstoque.adicionarEstoqueProduto(produtoVOTemp, quantidade);
                    sair = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Produto não localizado");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao executar a operação" + ex.getMessage());
            }
        } while (!sair);
    }

    private static void baixarEstoque() {
        ProdutoVO produtoVOTemp = null;
        int codigo;
        int quantidade;
        boolean sair = false;
        do {
            try {
                codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Forneça o código do produto"));
                produtoVOTemp = controleEstoque.buscarProdutoPorCodigo(codigo);
                if (produtoVOTemp != null) {
                    quantidade = Integer.parseInt(
                            JOptionPane.showInputDialog(null, "Forneça a quantidade a ser baixada do estoque"));
                    controleEstoque.baixarEstoqueProduto(produtoVOTemp, quantidade);
                    sair = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Produto não localizado");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao executar a operação" + ex.getMessage());
            }
        } while (!sair);
    }

    private static void contarProdutos() {
        System.out.println("------------------------------");
        System.out.println("Quantidade de Produtos: " + controleEstoque.contadorProduto());
    }

    private static void contarEstoqueProdutos() {
        System.out.println("------------------------------");
        System.out.println("Total Estoque Físico dos Produtos: " + controleEstoque.totalEstoqueFisico());
    }

    private static void listarProdutos() {
        List<ProdutoVO> listaProduto = controleEstoque.listaProduto();
        for (ProdutoVO produtoTemp : listaProduto) {
            System.out.println("------------------------------");
            System.out.println("Código: " + produtoTemp.getCodigo());
            System.out.println("Nome: " + produtoTemp.getNome());
            System.out.println("Estoque: " + produtoTemp.getEstoque());
        }
    }
}
