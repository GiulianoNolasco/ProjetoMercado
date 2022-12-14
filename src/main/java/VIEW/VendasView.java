/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.ComandosDAO;
import DAO.ComboBoxDAO;
import DTO.ClientesDTO;
import DTO.FuncionariosDTO;
import DTO.ProdutosDTO;
import DTO.VendasDTO;
import DTO.Tabela;
import com.google.protobuf.JavaType;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giuliano
 */
public class VendasView extends javax.swing.JFrame {

    private ComboBoxDAO controladorCBClienteDAO;
    private ComboBoxDAO controladorCBFuncionarioDAO;
    private ComboBoxDAO controladorCBProdutoDAO;

    private int acao = 0; // 0 = visualizando - 1 = inserindo - 2 = editando;

    /**
     * Creates new form NewJFrame
     */
    public VendasView() {
        ClientesDTO cli = new ClientesDTO();
        initComponents();
        controladorCBClienteDAO = new ComboBoxDAO(edtFk_cliente, cli.getId_cliente(), cli.getNome_cliente(), cli);

        ProdutosDTO pro = new ProdutosDTO();
        controladorCBProdutoDAO = new ComboBoxDAO(edtFk_produto, pro.getId_produto(), pro.getDescricao_produto(), pro);
        
        FuncionariosDTO fun = new FuncionariosDTO();
        controladorCBFuncionarioDAO = new ComboBoxDAO(edtFk_funcionario, fun.getId_funcionario(),fun.getNome_funcionario(), fun);
    
        limpaCamposTela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        edtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        cbCampos = new javax.swing.JComboBox<>();
        edtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        cbOperacao = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        edtQuantidade = new javax.swing.JTextField();
        edtFk_cliente = new javax.swing.JComboBox<>();
        edtFk_produto = new javax.swing.JComboBox<>();
        edtFk_funcionario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendas");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Identificador Venda");

        edtID.setEditable(false);
        edtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtIDActionPerformed(evt);
            }
        });

        jLabel2.setText("Cliente");

        jLabel3.setText("Funcion??rio");

        jLabel4.setText("Produto");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Desktop\\icones\\vendas icone (1).png")); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel10.setText("Vendas");

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Desktop\\logo\\logo_size.jpg")); // NOI18N

        btnNovo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Desktop\\icones\\24\\new.png")); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Desktop\\icones\\24\\update.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnApagar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Desktop\\icones\\24\\delete.png")); // NOI18N
        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Desktop\\icones\\uso\\cancel.png")); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Desktop\\icones\\uso\\confirm.png")); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setEnabled(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        cbCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCamposActionPerformed(evt);
            }
        });

        edtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPesquisaActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Desktop\\icones\\pesquisa e limpar\\Search.png")); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Desktop\\icones\\pesquisa e limpar\\Clean.png")); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        cbOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Igual", "Cont??m" }));

        jLabel5.setText("Quantidade");

        edtQuantidade.setEditable(false);
        edtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtQuantidadeActionPerformed(evt);
            }
        });

        edtFk_cliente.setEnabled(false);
        edtFk_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtFk_clienteActionPerformed(evt);
            }
        });

        edtFk_produto.setEnabled(false);
        edtFk_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtFk_produtoActionPerformed(evt);
            }
        });

        edtFk_funcionario.setEnabled(false);
        edtFk_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtFk_funcionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(114, 114, 114)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(edtQuantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(edtID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtFk_cliente, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edtFk_funcionario, javax.swing.GroupLayout.Alignment.TRAILING, 0, 223, Short.MAX_VALUE)
                            .addComponent(edtFk_produto, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbCampos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar))
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(edtFk_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(edtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(edtFk_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtFk_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(edtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnPesquisar)
                    .addComponent(edtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnApagar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizaRegistrosTela() throws SQLException {
        if (acao == 0) {
            
        VendasDTO cli = new VendasDTO();
        ComandosDAO DAO = new ComandosDAO();
        tabela.setModel(DAO.retornaRegistroCRUD(cli, ""));
        cbCampos.removeAllItems();
        controladorCBClienteDAO.atualizaDadosComboBox();
        controladorCBFuncionarioDAO.atualizaDadosComboBox();
        controladorCBProdutoDAO.atualizaDadosComboBox();
        limpaCamposTela();
        Set<String> apelidos = cli.retornaApelidoCampos().keySet();
        for (String apelido : apelidos) {
            cbCampos.addItem(apelido);
        }
        }
    }

    private void modoEdicao(boolean editando) {
        edtFk_cliente.setEnabled(editando);
        edtFk_produto.setEnabled(editando);
        edtFk_funcionario.setEnabled(editando);
        edtQuantidade.setEditable(editando);
        btnCancelar.setEnabled(editando);
        btnConfirmar.setEnabled(editando);
        btnNovo.setEnabled(!editando);
        btnEditar.setEnabled(!editando);
        btnApagar.setEnabled(!editando);
        if (!editando) {
            acao = 0;
        }
    }

    private void limpaCamposTela() {
        edtID.setText("");
        edtFk_cliente.setSelectedIndex(-1);
        edtFk_funcionario.setSelectedIndex(-1);
        edtFk_produto.setSelectedIndex(-1);
        edtQuantidade.setText("");
    }


    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            atualizaRegistrosTela();
        } catch (SQLException ex) {
            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        modoEdicao(true);
        acao = 1;
        limpaCamposTela();

    }//GEN-LAST:event_btnNovoActionPerformed

    private void edtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtIDActionPerformed
        limpaCamposTela();
    }//GEN-LAST:event_edtIDActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        VendasDTO cli = new VendasDTO();
        ComandosDAO comando = new ComandosDAO();
        String mensagemApagar = "Deseja realmente apagar a Venda? \n\n"
                + "Venda ID: " + edtID.getText()
                + "\n\nEsta a????o n??o poder?? ser revertida!!!";

        if (JOptionPane.showConfirmDialog(this, mensagemApagar, "Apagando Venda", 0, 2) == 0) {
            cli.setId_venda(Integer.parseInt(edtID.getText()));
            comando.apagaRegistro(cli);
            limpaCamposTela();
            try {
                atualizaRegistrosTela();
            } catch (SQLException ex) {
                Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        modoEdicao(true);
        acao = 2;
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        modoEdicao(false);
        limpaCamposTela();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        VendasDTO cli = new VendasDTO();
        ComandosDAO comando = new ComandosDAO();
        cli.setFk_cliente(controladorCBClienteDAO.retornaChaveSelecionada());
        cli.setFk_funcionario(controladorCBFuncionarioDAO.retornaChaveSelecionada());
        cli.setFk_produto(controladorCBProdutoDAO.retornaChaveSelecionada());
        cli.setQuantidade(Integer.parseInt(edtQuantidade.getText()));

        if (acao == 1) {
            comando.insereRegistro(cli);
            JOptionPane.showMessageDialog(this, "Venda Inserida! ", "Confirma????o", 1);

        } else {
            cli.setId_venda((Integer.parseInt(edtID.getText())));
            comando.atualizaRegistro(cli);
            JOptionPane.showMessageDialog(this, "Venda atualizada! ", "Confirma????o", 1);
        }

        try {
            atualizaRegistrosTela();
        } catch (SQLException ex) {
            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
        }
        modoEdicao(false);
        limpaCamposTela();

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if (acao == 0) {
            edtID.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
            controladorCBClienteDAO.posicionaComboBoxPelaChave(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 1).toString()));
            controladorCBProdutoDAO.posicionaComboBoxPelaChave(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 2).toString()));
            controladorCBFuncionarioDAO.posicionaComboBoxPelaChave(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 3).toString()));
            edtQuantidade.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void cbCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCamposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCamposActionPerformed

    private void edtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPesquisaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        VendasDTO cli = new VendasDTO();
        ComandosDAO DAO = new ComandosDAO();
        // tabela.setModel(DAO.retornaRegistroCRUD(cli, ""));

        String operacao = " = ";
        String contem = "";
        if (cbOperacao.getSelectedIndex() == 1) {
            operacao = " like ";
            contem = "%";
        }

        String campo = cli.retornaApelidoCampos().get(cbCampos.getSelectedItem());

        String comando = "WHERE "
                + campo + operacao + "'" + contem + edtPesquisa.getText() + contem + "'";

        tabela.setModel(DAO.retornaRegistroCRUD(cli, comando));

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        try {
            atualizaRegistrosTela();
        } catch (SQLException ex) {
            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
        }
        edtPesquisa.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void edtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtQuantidadeActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void edtFk_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtFk_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtFk_clienteActionPerformed

    private void edtFk_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtFk_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtFk_produtoActionPerformed

    private void edtFk_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtFk_funcionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtFk_funcionarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbCampos;
    private javax.swing.JComboBox<String> cbOperacao;
    private javax.swing.JComboBox<String> edtFk_cliente;
    private javax.swing.JComboBox<String> edtFk_funcionario;
    private javax.swing.JComboBox<String> edtFk_produto;
    private javax.swing.JTextField edtID;
    private javax.swing.JTextField edtPesquisa;
    private javax.swing.JTextField edtQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
