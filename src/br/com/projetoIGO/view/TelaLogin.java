package br.com.projetoIGO.view;

import br.com.projetoIGO.control.ControladaLogin;
import br.com.projetoIGO.model.conexao.Conexao;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author samuel
 */
public class TelaLogin extends javax.swing.JFrame {

    // tem que ter a classe controladoraLogin
    ControladaLogin contro;

    public TelaLogin() {
	initComponents();
	contro = new ControladaLogin();
	this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoIGO/model/imagens/IconeLogin.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_cpf = new javax.swing.JLabel();
        jLabel2_senha = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1_senha = new javax.swing.JPasswordField();
        jTextField1_cpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jLabel1_cpf.setText("CPF");

        jLabel2_senha.setText("Senha");

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Login");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoIGO/model/imagens/IconeLogin.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2_senha)
                    .addComponent(jLabel1_cpf))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_cpf)
                    .addComponent(jTextField1_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_senha)
                    .addComponent(jPasswordField1_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(309, 342));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	String cpf = jTextField1_cpf.getText();
	String senha = jPasswordField1_senha.getText();

	if (verificarCampoPreenchidos(cpf, senha)) {
	    if (contro.verificaAcesso(cpf, senha)) {
		TelaPricipal telapricipal = new TelaPricipal();
		telapricipal.setVisible(true);
		dispose();
	    } else {
		JOptionPane.showMessageDialog(null, "CPF e/ou Senha inválidos", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);
	    }
	}
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new TelaLogin().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_cpf;
    private javax.swing.JLabel jLabel2_senha;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1_senha;
    private javax.swing.JTextField jTextField1_cpf;
    // End of variables declaration//GEN-END:variables

    private boolean verificarCampoPreenchidos(String cpf, String senha) {
	String mensagem = "Preencha o(s) campos(s): ";
	jLabel1_cpf.setForeground(Color.black);
	jLabel2_senha.setForeground(Color.black);

	boolean resultado = true;

	if (cpf.equals("")) {
	    mensagem += "*CPF\n";
	    jLabel1_cpf.setForeground(Color.red);

	    resultado = false;
	}

	if (senha.equals("")) {
	    mensagem += "*Senha";

	    jLabel2_senha.setForeground(Color.red);
	    resultado = false;
	}

	if (!resultado) {
	    JOptionPane.showMessageDialog(null, mensagem);
	}
	return resultado;
    }

}
