package projprogllant;
import dao.UserDAO;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import projprogllant.User;

public class Menu_InformacoesEditaveis extends javax.swing.JFrame {
    public Menu_InformacoesEditaveis() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtCPFPesquisa = new javax.swing.JTextField();
        TxtPasswordEditavel = new javax.swing.JTextField();
        BTNSalvarAlteracoes = new javax.swing.JButton();
        TxtEmailEditavel = new javax.swing.JTextField();
        TxtNameEditavel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtUsernameEditavel = new javax.swing.JTextField();
        BTNPesquisar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TxtCPF = new javax.swing.JTextField();
        BTNExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Informações da conta");

        jLabel2.setText("Username:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Email:");

        jLabel5.setText("Senha:");

        BTNSalvarAlteracoes.setText("Salvar Alterações");
        BTNSalvarAlteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSalvarAlteracoesActionPerformed(evt);
            }
        });

        jLabel6.setText("Insira CPF para alterar informações:");

        BTNPesquisar.setText("Pesquisar");
        BTNPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNPesquisarActionPerformed(evt);
            }
        });

        jLabel7.setText("CPF");

        TxtCPF.setEnabled(false);

        BTNExcluir.setText("Excluir conta");
        BTNExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(TxtCPF)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCPFPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNPesquisar)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TxtEmailEditavel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                    .addComponent(TxtPasswordEditavel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtNameEditavel)
                                    .addComponent(TxtUsernameEditavel))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTNSalvarAlteracoes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTNExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtCPFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtUsernameEditavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNameEditavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEmailEditavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(TxtPasswordEditavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNSalvarAlteracoes)
                    .addComponent(BTNExcluir))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNSalvarAlteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSalvarAlteracoesActionPerformed
        String CPF = TxtCPFPesquisa.getText();
        String Name = TxtNameEditavel.getText();
        String Email = TxtEmailEditavel.getText();
        String Password = TxtPasswordEditavel.getText();
        String Username = TxtUsernameEditavel.getText();
        
        User user = new User();
        user.setCPF(CPF);
        user.setName(Name);
        user.setUsername(Username);
        user.setEmail(Email);
        user.setPassword(Password);
        
        //Inserindo o metodo de adição. Instanciando o objeto, o construtor é chamado automaticamente.
        UserDAO userDAO = new UserDAO();
        userDAO.editar(user);
        
        //limpando campos
        TxtCPFPesquisa.setText("");
        TxtNameEditavel.setText("");
        TxtEmailEditavel.setText("");
        TxtPasswordEditavel.setText("");
        TxtUsernameEditavel.setText("");                                            
    }//GEN-LAST:event_BTNSalvarAlteracoesActionPerformed

    private void BTNPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNPesquisarActionPerformed
        String CPFPesquisa = TxtCPFPesquisa.getText();
        UserDAO userDAO = new UserDAO();
        User user = userDAO.getUser(CPFPesquisa);
        
        if (user == null) {
            JOptionPane.showMessageDialog(this, "Usuário não encontrado");
        } else {
            TxtCPF.setText(user.getCPF());
            TxtUsernameEditavel.setText(user.getUsername());
            TxtNameEditavel.setText(user.getName());
            TxtEmailEditavel.setText(user.getEmail());
            TxtPasswordEditavel.setText(user.getPassword());
        }
    }//GEN-LAST:event_BTNPesquisarActionPerformed

    private void BTNExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNExcluirActionPerformed
        String cpf = TxtCPFPesquisa.getText();
        
        UserDAO userDAO = new UserDAO();
        userDAO.excluir(cpf);
        
        TxtCPFPesquisa.setText("");
        TxtNameEditavel.setText("");
        TxtEmailEditavel.setText("");
        TxtPasswordEditavel.setText("");
        TxtUsernameEditavel.setText(""); 
    }//GEN-LAST:event_BTNExcluirActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_InformacoesEditaveis().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNExcluir;
    private javax.swing.JButton BTNPesquisar;
    private javax.swing.JButton BTNSalvarAlteracoes;
    private javax.swing.JTextField TxtCPF;
    private javax.swing.JTextField TxtCPFPesquisa;
    private javax.swing.JTextField TxtEmailEditavel;
    private javax.swing.JTextField TxtNameEditavel;
    private javax.swing.JTextField TxtPasswordEditavel;
    private javax.swing.JTextField TxtUsernameEditavel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
