package br.com.projetoIGO.view;

import br.com.projetoIGO.control.ControladoraCidade2;
import br.com.projetoIGO.model.Entidades.Cidade;
import br.com.projetoIGO.model.Entidades.Estado;
import br.com.projetoIGO.model.Tabela.Tabela;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author samuel
 */
public class TelaCidade extends javax.swing.JInternalFrame {

    ControladoraCidade2 controo;
    Cidade cidade;
    
    /**
     * Creates new form TelaCidade
     */
    public TelaCidade() {
	initComponents();
	controo = new ControladoraCidade2();
	cidade = new Cidade();
	for (Estado estado : controo.ListarEstado()) {
	    jComboBox1_estado.addItem(estado);
	}

	carregarTabela();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1_Usuario = new javax.swing.JTextField();
        jComboBox1_estado = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButton1_novo = new javax.swing.JButton();
        jButton2_salvar = new javax.swing.JButton();
        jButton3_alterar = new javax.swing.JButton();
        jButton4_Excluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_assuntos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Tela Cidade");

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome da cidade");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Estado");

        jTextField1_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_UsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jButton1_novo.setText("Novo");
        jButton1_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_novoActionPerformed(evt);
            }
        });

        jButton2_salvar.setText("Salvar");
        jButton2_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_salvarActionPerformed(evt);
            }
        });

        jButton3_alterar.setText("Alterar");
        jButton3_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_alterarActionPerformed(evt);
            }
        });

        jButton4_Excluir.setText("Excluir");
        jButton4_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_ExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1_novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2_salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4_Excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2_salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4_Excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        jTable1_assuntos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1_assuntos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1_assuntosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_assuntos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_UsuarioActionPerformed
	// TODO add your handling code here:
	// this function no
    }//GEN-LAST:event_jTextField1_UsuarioActionPerformed

    private void jButton2_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_salvarActionPerformed
       //aqui
       
       cidade.setNome_cidade(jTextField1_Usuario.getText());
     
       Estado estado = (Estado) jComboBox1_estado.getSelectedItem();
       cidade.setCod_estado(estado.getCod_estado());
       
       if(camposPreenchidos(cidade.getNome_cidade())){
	   if(controo.salvarCidade(cidade)){
	      JOptionPane.showMessageDialog(null, "Dados salvo com sucesso.");
	   }else{
	      JOptionPane.showMessageDialog(null, "Erro ao salvar.");
	   }
       }
    }//GEN-LAST:event_jButton2_salvarActionPerformed

    private void jButton3_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_alterarActionPerformed
        // metodo para alterar um cadastro
	// tenho que selecionar uma linha da tabela 
	// e qd clicar preencher os campos e dai pode 
	// apaguar modificar e alterar COMO?
	cidade.setNome_cidade(jTextField1_Usuario.getText());
	if(camposPreenchidos(cidade.getNome_cidade())){
	    if(controo.atualizarCidade(cidade)){
	        JOptionPane.showMessageDialog(null, "Cidade atualizado com sucesso");
	    }else{
		JOptionPane.showMessageDialog(null, "Erro na alteração");
	    }
	}
    }//GEN-LAST:event_jButton3_alterarActionPerformed

    private void jButton1_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_novoActionPerformed
        
    }//GEN-LAST:event_jButton1_novoActionPerformed

    private void jTable1_assuntosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_assuntosMousePressed
        int linhaSelecinda = jTable1_assuntos.getSelectedRow();
	cidade.setCod_cidade((int) jTable1_assuntos.getValueAt(linhaSelecinda, 0));
	cidade.setNome_cidade((String) jTable1_assuntos.getValueAt(linhaSelecinda, 1));
	String nomeEstado = (String) jTable1_assuntos.getValueAt(linhaSelecinda, 2);
	cidade.setCod_estado(controo.buscaEstadoPeloNome(nomeEstado));
	
	jTextField1_Usuario.setText(cidade.getNome_cidade());
	jComboBox1_estado.setSelectedIndex(cidade.getCod_estado()-1);
    }//GEN-LAST:event_jTable1_assuntosMousePressed

    private void jButton4_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_ExcluirActionPerformed
      
	/* 
	tbm pode no confirma fazer assim
	if(linhaSelecionada > -1){
	   Object[] opcao = {"Sim","Não"}
	   int confirma = joptionPana.showOptionDialog(null,"Deseja realmente excluir "+(String)jTable1_assuntos.getValueAt(linhaSelecionada,1),"Excuir cidade",joptionPane.DEFALT_OPTION,JoptionPane.WARNING_MESSAGE,null,opcao, opcao[0]);
	if(confirma==0){
	  controo.ecliur();
	}
	}
	
	*/
	int linhaSelecionada = jTable1_assuntos.getSelectedRow();
	if(linhaSelecionada > -1){
	   int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja exclui "+jTable1_assuntos.getValueAt(linhaSelecionada,1)+"?","Atenção",JOptionPane.YES_NO_OPTION);
	   if(confirma == JOptionPane.YES_OPTION){
	       controo.excluirCadastro(cidade.getCod_cidade());
	   }
	}else{
	   JOptionPane.showMessageDialog(null, "Não pode excluir cidade!!!");
	}
    }//GEN-LAST:event_jButton4_ExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_novo;
    private javax.swing.JButton jButton2_salvar;
    private javax.swing.JButton jButton3_alterar;
    private javax.swing.JButton jButton4_Excluir;
    private javax.swing.JComboBox<Object> jComboBox1_estado;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_assuntos;
    private javax.swing.JTextField jTextField1_Usuario;
    // End of variables declaration//GEN-END:variables

    private void carregarTabela() {
	ArrayList linhas = new ArrayList();
	String[] colunas = new String[]{"Códido", "Nome", "Estado"};

	// foi feito para pegar o nome do estado e não o codigo
	Estado estado;
	for (Cidade cidade : controo.carregarCidades()) {
	    estado = controo.buscarEstadoPeloCodigo(cidade.getCod_estado());

	    linhas.add(new Object[]{cidade.getCod_cidade(),
		cidade.getNome_cidade(),
		estado.getNome_estado()});
	}

	Tabela tabela = new Tabela(linhas, colunas);
	jTable1_assuntos.setModel(tabela);

	// setar o tamanho da coluna
	jTable1_assuntos.getColumnModel().getColumn(0).setPreferredWidth(36);
	jTable1_assuntos.getColumnModel().getColumn(1).setPreferredWidth(36);
	jTable1_assuntos.getColumnModel().getColumn(2).setPreferredWidth(36);
	//nao pode ser redimensionado
	jTable1_assuntos.getColumnModel().getColumn(0).setResizable(false);
	jTable1_assuntos.getColumnModel().getColumn(0).setResizable(false);
	jTable1_assuntos.getColumnModel().getColumn(0).setResizable(false);
	// nao deixa troca as colunas da tabela
        jTable1_assuntos.getTableHeader().setReorderingAllowed(false);
	//so deixa selecionar uma linha por vez
	jTable1_assuntos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    private boolean camposPreenchidos(String nome) {
	String mensagem = "Preencha o campo";
	boolean resul = true;
	
	if(nome.equals("")){
	    mensagem += " *nome";
	    resul = false;
	}
	if(!resul){
	    JOptionPane.showMessageDialog(null, mensagem);
	}
	return resul;
    }
}
