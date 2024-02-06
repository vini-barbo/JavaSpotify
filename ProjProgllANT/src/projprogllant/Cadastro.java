package projprogllant;
import dao.UserDAO;
public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jColorChooser3 = new javax.swing.JColorChooser();
        TxtCPF_Cadastro = new javax.swing.JTextField();
        TxtEmail_Cadastro = new javax.swing.JTextField();
        TxtPassword_Cadastro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtUsername_Cadastro = new javax.swing.JTextField();
        BTNCadastrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TxtName_Cadastro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");

        TxtCPF_Cadastro.setBackground(new java.awt.Color(255, 255, 255));

        TxtEmail_Cadastro.setBackground(new java.awt.Color(255, 255, 255));

        TxtPassword_Cadastro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Cadastro");

        jLabel1.setText("Insira seu nome:");

        jLabel2.setText("Insira seu email:");

        jLabel3.setText("Insira sua senha:");

        jLabel5.setText("Insira seu UserName:");

        TxtUsername_Cadastro.setBackground(new java.awt.Color(255, 255, 255));

        BTNCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        BTNCadastrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTNCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        BTNCadastrar.setText("Cadastrar");
        BTNCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCadastrarActionPerformed(evt);
            }
        });

        jLabel6.setText("Insira seu CPF:");

        TxtName_Cadastro.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTNCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(TxtCPF_Cadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(TxtEmail_Cadastro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtPassword_Cadastro)
                            .addComponent(TxtUsername_Cadastro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtName_Cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtCPF_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtName_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtEmail_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtPassword_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtUsername_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(BTNCadastrar)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTNCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCadastrarActionPerformed
        String CPF = TxtCPF_Cadastro.getText().trim();
        String Name = TxtName_Cadastro.getText().trim();
        String Email = TxtEmail_Cadastro.getText().trim();
        String Password = TxtPassword_Cadastro.getText().trim();
        String Username = TxtUsername_Cadastro.getText().trim();
        
        User user = new User();
        user.setCPF(CPF);
        user.setName(Name);
        user.setUsername(Username);
        user.setEmail(Email);
        user.setPassword(Password);
        
        UserDAO userDAO = new UserDAO();
        userDAO.adicionar(user);
        
        //limpando campos
        TxtCPF_Cadastro.setText("");
        TxtName_Cadastro.setText("");
        TxtEmail_Cadastro.setText("");
        TxtPassword_Cadastro.setText("");
        TxtUsername_Cadastro.setText("");
    }//GEN-LAST:event_BTNCadastrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCadastrar;
    private javax.swing.JTextField TxtCPF_Cadastro;
    private javax.swing.JTextField TxtEmail_Cadastro;
    private javax.swing.JTextField TxtName_Cadastro;
    private javax.swing.JTextField TxtPassword_Cadastro;
    private javax.swing.JTextField TxtUsername_Cadastro;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JColorChooser jColorChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
