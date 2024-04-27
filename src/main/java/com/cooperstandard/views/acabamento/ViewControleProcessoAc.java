/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cooperstandard.views.acabamento;

import com.cooperstandard.model.ModelControleProcesso;
import com.cooperstandard.model.ModelMetodoAvaliacao;
import com.cooperstandard.util.ControleInstancias;
import com.cooperstandard.util.EstiloTablaHeader;
import com.cooperstandard.util.EstiloTablaRenderer;
import com.cooperstandard.util.HeaderRenderer;
import com.cooperstandard.controller.acabamento.ControllerControleProcesso;
import com.cooperstandard.controller.acabamento.ControllerMetodoAvaliacao;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rsouza10
 */
public class ViewControleProcessoAc extends javax.swing.JFrame {

    ModelControleProcesso modelControleProcesso = new ModelControleProcesso();
    ControllerControleProcesso controllerControleProcesso = new ControllerControleProcesso();
    ArrayList<ModelControleProcesso> listaModelControleProcesso = new ArrayList<ModelControleProcesso>();
    ControllerMetodoAvaliacao controllerMetodoAvaliacao = new ControllerMetodoAvaliacao();
    ArrayList<ModelMetodoAvaliacao> listaModelMetodoAvaliacao = new ArrayList<ModelMetodoAvaliacao>();
    String tipoCadastro;
    private JFrame solicitante = null;

    public ViewControleProcessoAc() {
        initComponents();
        carregaControleProcesso();
        ListarMetodoAvaliacao();
        tbControleProcesso.getTableHeader().setDefaultRenderer(new HeaderRenderer(tbControleProcesso));
        tbControleProcesso.setDefaultRenderer(String.class, new EstiloTablaRenderer());
        tbControleProcesso.setDefaultRenderer(Integer.class, new EstiloTablaRenderer());
    }

    public ViewControleProcessoAc(JFrame frame) {
        initComponents();
        carregaControleProcesso();
        ListarMetodoAvaliacao();
        solicitante = frame;
        tbControleProcesso.getTableHeader().setDefaultRenderer(new HeaderRenderer(tbControleProcesso));
        tbControleProcesso.setDefaultRenderer(String.class, new EstiloTablaRenderer());
        tbControleProcesso.setDefaultRenderer(Integer.class, new EstiloTablaRenderer());
    }

    public void setSolicitante(JFrame solicitante) {
        this.solicitante = solicitante;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbDescCaracteristica = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        cbControles = new javax.swing.JComboBox<>();
        lbControles = new javax.swing.JLabel();
        cbMetodo = new javax.swing.JComboBox<>();
        lbMetodos = new javax.swing.JLabel();
        cbSetor = new javax.swing.JComboBox<>();
        lbSetor = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lbId = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbControleProcesso = new javax.swing.JTable();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Controle de Processo");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbDescCaracteristica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDescCaracteristica.setText("Descrição de Característica:");

        txtDesc.setEnabled(false);

        cbControles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Detectivo", "Preventivo" }));
        cbControles.setEnabled(false);

        lbControles.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbControles.setText("Tipo de Controles:");

        cbMetodo.setEnabled(false);

        lbMetodos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbMetodos.setText("Método de Avaliação:");

        cbSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acabamento" }));
        cbSetor.setEnabled(false);
        cbSetor.setFocusable(false);

        lbSetor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbSetor.setText("Setor:");

        txtId.setEnabled(false);

        lbId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbId.setText("Código:");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 20/icons8-adicionar-filled-50.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescCaracteristica))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbControles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbControles, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbMetodos)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbMetodo, 0, 189, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSetor)
                    .addComponent(cbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbSetor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDescCaracteristica)
                            .addComponent(lbControles)
                            .addComponent(lbMetodos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbControleProcesso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Desc. Característica", "Tipo de Controle", "Método de Avaliação", "Setor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbControleProcesso.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbControleProcesso);
        if (tbControleProcesso.getColumnModel().getColumnCount() > 0) {
            tbControleProcesso.getColumnModel().getColumn(0).setMinWidth(0);
            tbControleProcesso.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btnLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 20/icons8-n¦o-perturbe-filled-50.png"))); // NOI18N
        btnLimpar.setText("Cancelar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 20/icons8-excluir-filled-50.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 20/icons8-editar-filled-50.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnNovo.setBackground(new java.awt.Color(255, 255, 255));
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 20/icons8-joyent-filled-20 (1).png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 20/icons8-salvar-filled-50.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnNovo)
                    .addComponent(btnLimpar)
                    .addComponent(btnSalvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.desabilitarCampos();
        limparDados();
        btnSalvar.setEnabled(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linhasselecionada = tbControleProcesso.getSelectedRow();

        if (linhasselecionada < 0) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar um item antes de clicar no botão!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {
            this.excluirControleProcesso();
            limparDados();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linhasselecionada = tbControleProcesso.getSelectedRow();

        if (linhasselecionada < 0) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar um item antes de clicar no botão!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {
            novoProjeto();
            btnSalvar.setEnabled(true);
            habilitarCampos();
            recuperarControleProcesso();
            tipoCadastro = "alteracao";

        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        novoProjeto();
        btnSalvar.setEnabled(true);
        habilitarCampos();
        tipoCadastro = "novo";
        txtDesc.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (tipoCadastro.equals("novo")) {
            if (txtDesc.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Campo obrigatório!", "ERRO", JOptionPane.WARNING_MESSAGE);
                txtDesc.requestFocus();
            } else if (cbControles.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Campo obrigatório!", "ERRO", JOptionPane.WARNING_MESSAGE);
                cbControles.requestFocus();
            } else if (cbMetodo.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Campo obrigatório!", "ERRO", JOptionPane.WARNING_MESSAGE);
                cbMetodo.requestFocus();
            } else if (cbSetor.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Campo obrigatório!", "ERRO", JOptionPane.WARNING_MESSAGE);
                cbSetor.requestFocus();
            } else {
                salvarControleProcesso();
            }
        } else if (tipoCadastro.equals("alteracao")) {
            if (txtDesc.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Campo obrigatório!", "ERRO", JOptionPane.WARNING_MESSAGE);
                txtDesc.requestFocus();
            } else if (cbControles.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Campo obrigatório!", "ERRO", JOptionPane.WARNING_MESSAGE);
                cbControles.requestFocus();
            } else if (cbMetodo.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Campo obrigatório!", "ERRO", JOptionPane.WARNING_MESSAGE);
                cbMetodo.requestFocus();
            } else if (cbSetor.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Campo obrigatório!", "ERRO", JOptionPane.WARNING_MESSAGE);
                cbSetor.requestFocus();
            } else {
                alterarControleProcesso();
                btnSalvar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        ViewMetodoAvaliacaoAc vm = null;
        if (ControleInstancias.isInstaced(ViewMetodoAvaliacaoAc.class)) {
            vm = (ViewMetodoAvaliacaoAc) ControleInstancias.getInstance(ViewMetodoAvaliacaoAc.class.getName(), ViewMetodoAvaliacaoAc.class);
            vm.setSolicitante(this);
        } else {
            vm = new ViewMetodoAvaliacaoAc(this);
        }
        vm.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    public void addItemLista(String item) {
        cbMetodo.addItem(item);
        ListarMetodoAvaliacao();
    }

    private void ListarMetodoAvaliacao() {
        listaModelMetodoAvaliacao = controllerMetodoAvaliacao.getListaMetodoAvaliacaoAcController();
        cbMetodo.removeAllItems();
        for (int i = 0; i < listaModelMetodoAvaliacao.size(); i++) {
            cbMetodo.addItem(listaModelMetodoAvaliacao.get(i).getDesc_metodo());
        }
    }

    private void excluirControleProcesso() {
        int linha = tbControleProcesso.getSelectedRow();
        String nome = (String) tbControleProcesso.getValueAt(linha, 1);
        int codigo = (Integer) tbControleProcesso.getValueAt(linha, 0);
        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                + " excluir o registro \nNome: "
                + nome + " ?", "Atenção", JOptionPane.YES_OPTION);

        if (opcao == JOptionPane.OK_OPTION) {
            if (controllerControleProcesso.excluirControleProcessoAcController(codigo)) {
                JOptionPane.showMessageDialog(this, "Registro excluido com sucesso!");
                if (solicitante != null) {
                    if (solicitante instanceof ViewTesteAc) {
                        ViewTesteAc vp = (ViewTesteAc) solicitante;
                        vp.addItemLista(txtDesc.getText());
                    }
                }
                carregaControleProcesso();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private boolean salvarControleProcesso() {
        modelControleProcesso.setDesc_controle(this.txtDesc.getText());
        modelControleProcesso.setPrevent_detect(this.cbControles.getSelectedItem().toString());
        modelControleProcesso.setMetodo_avaliacao(this.cbMetodo.getSelectedItem().toString());
        modelControleProcesso.setSetor(this.cbSetor.getSelectedItem().toString());
        if (controllerControleProcesso.salvarControleProcessoAcController(modelControleProcesso) > 0) {
            JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
            this.desabilitarCampos();
            this.carregaControleProcesso();
            if (solicitante != null) {
                if (solicitante instanceof ViewTesteAc) {
                    ViewTesteAc vp = (ViewTesteAc) solicitante;
                    vp.addItemLista(txtDesc.getText());
                }
            }
            limparDados();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao tentar gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean recuperarControleProcesso() {
        int linha = this.tbControleProcesso.getSelectedRow();
        int codigo = (Integer) tbControleProcesso.getValueAt(linha, 0);
        try {
            modelControleProcesso = controllerControleProcesso.getControleProcessoAcController(codigo);
            this.txtId.setText(String.valueOf(modelControleProcesso.getId()));
            this.txtDesc.setText(String.valueOf(modelControleProcesso.getDesc_controle()));
            this.cbControles.setSelectedItem(modelControleProcesso.getPrevent_detect());
            this.cbMetodo.setSelectedItem(modelControleProcesso.getMetodo_avaliacao());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private boolean alterarControleProcesso() {
        modelControleProcesso.setDesc_controle(this.txtDesc.getText());
        modelControleProcesso.setPrevent_detect(this.cbControles.getSelectedItem().toString());
        modelControleProcesso.setMetodo_avaliacao(this.cbMetodo.getSelectedItem().toString());
        modelControleProcesso.setSetor(this.cbSetor.getSelectedItem().toString());
        if (controllerControleProcesso.atualizarControleProcessoAcController(modelControleProcesso)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.desabilitarCampos();
            this.carregaControleProcesso();
            if (solicitante != null) {
                if (solicitante instanceof ViewTesteAc) {
                    ViewTesteAc vp = (ViewTesteAc) solicitante;
                    vp.addItemLista(txtDesc.getText());
                }
            }
            limparDados();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private void carregaControleProcesso() {
        listaModelControleProcesso = controllerControleProcesso.getListaControleProcessoAcController();
        DefaultTableModel modelo = (DefaultTableModel) tbControleProcesso.getModel();
        modelo.setNumRows(0);
        int cont = listaModelControleProcesso.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelControleProcesso.get(i).getId(),
                listaModelControleProcesso.get(i).getDesc_controle(),
                listaModelControleProcesso.get(i).getPrevent_detect(),
                listaModelControleProcesso.get(i).getMetodo_avaliacao(),
                listaModelControleProcesso.get(i).getSetor()

            });

        }

    }

    public void desabilitarCampos() {
        txtDesc.setEnabled(false);
        cbControles.setEnabled(false);
        cbMetodo.setEnabled(false);

    }

    public void limparDados() {
        txtId.setText("");
        txtDesc.setText("");
        cbControles.setSelectedIndex(-1);
        cbMetodo.setSelectedIndex(-1);
    }

    public void novoProjeto() {
        habilitarCampos();
        txtDesc.setText("");
        cbControles.setSelectedIndex(-1);
        cbMetodo.setSelectedIndex(-1);
        txtId.setText("Novo");
    }

    public void habilitarCampos() {
        txtDesc.setEnabled(true);
        cbControles.setEnabled(true);
        cbMetodo.setEnabled(true);
    }

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
            java.util.logging.Logger.getLogger(ViewControleProcessoAc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewControleProcessoAc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewControleProcessoAc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewControleProcessoAc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewControleProcessoAc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbControles;
    private javax.swing.JComboBox<String> cbMetodo;
    private javax.swing.JComboBox<String> cbSetor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbControles;
    private javax.swing.JLabel lbDescCaracteristica;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbMetodos;
    private javax.swing.JLabel lbSetor;
    private javax.swing.JTable tbControleProcesso;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
