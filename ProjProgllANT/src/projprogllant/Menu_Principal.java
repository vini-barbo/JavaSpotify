package projprogllant;
import java.io.InputStream;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
public class Menu_Principal extends javax.swing.JFrame {

    private String[] Musicas = new String[4];
    private Player ply;
    private boolean pl;
    private int cont = 0;
    
    public Menu_Principal() {
        initComponents();
        Musicas[0] = "50PorCento";
        Musicas[1] = "AntiAmor";
        Musicas[2] = "DesbeijarMinhaBoca";
        Musicas[3] = "QuemPegouPegou";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JLabel();
        BtnPlay = new javax.swing.JButton();
        BtnPause = new javax.swing.JButton();
        BtnAvancar = new javax.swing.JButton();
        BtnVoltar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu_Conta = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        JMIinformacoes = new javax.swing.JMenuItem();
        JMenu_Ajuda = new javax.swing.JMenu();
        JMenu_ajuda = new javax.swing.JMenuItem();
        JMenu_Sair = new javax.swing.JMenu();
        jMenu_ItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Principal");

        nome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nome.setText("Música:");

        BtnPlay.setBackground(new java.awt.Color(0, 0, 0));
        BtnPlay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnPlay.setText("Play");
        BtnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlayActionPerformed(evt);
            }
        });

        BtnPause.setBackground(new java.awt.Color(0, 0, 0));
        BtnPause.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnPause.setText("Pause");
        BtnPause.setEnabled(false);
        BtnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPauseActionPerformed(evt);
            }
        });

        BtnAvancar.setBackground(new java.awt.Color(0, 0, 0));
        BtnAvancar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnAvancar.setText("Avançar");
        BtnAvancar.setEnabled(false);
        BtnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAvancarActionPerformed(evt);
            }
        });

        BtnVoltar.setBackground(new java.awt.Color(0, 0, 0));
        BtnVoltar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnVoltar.setText("Voltar");
        BtnVoltar.setEnabled(false);
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });

        JMenu_Conta.setText("Conta");
        JMenu_Conta.add(jSeparator1);

        JMIinformacoes.setText("Informações");
        JMIinformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIinformacoesActionPerformed(evt);
            }
        });
        JMenu_Conta.add(JMIinformacoes);

        jMenuBar1.add(JMenu_Conta);

        JMenu_Ajuda.setText("Ajuda");

        JMenu_ajuda.setText("Como funciona?");
        JMenu_ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenu_ajudaActionPerformed(evt);
            }
        });
        JMenu_Ajuda.add(JMenu_ajuda);

        jMenuBar1.add(JMenu_Ajuda);

        JMenu_Sair.setText("Sair");
        JMenu_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenu_SairActionPerformed(evt);
            }
        });

        jMenu_ItemSair.setText("Sair");
        jMenu_ItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_ItemSairActionPerformed(evt);
            }
        });
        JMenu_Sair.add(jMenu_ItemSair);

        jMenuBar1.add(JMenu_Sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BtnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnAvancar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(nome)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPlay)
                    .addComponent(BtnAvancar)
                    .addComponent(BtnPause)
                    .addComponent(BtnVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlayActionPerformed
        musicas mp3 = new musicas();
        nome.setText("Música: "+ Musicas[cont]);
        mp3.start();
        pl = true;
        BtnPlay.setEnabled(false);
        BtnPause.setEnabled(true);
        if(cont < 3) {  //logica pra correção de bug          
            BtnAvancar.setEnabled(true);
        } 
        if(cont == 3)    {
            BtnAvancar.setEnabled(false);
        }
    }//GEN-LAST:event_BtnPlayActionPerformed

    private void BtnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPauseActionPerformed
        ply.close(); //faz com que a música pare para reiniciar
        BtnPlay.setEnabled(true);
    }//GEN-LAST:event_BtnPauseActionPerformed

    private void BtnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAvancarActionPerformed
        cont++;
        BtnVoltar.setEnabled(true);
        nome.setText("Música: "+ Musicas[cont]);
        
        if(pl = true) {
            ply.close();
            BtnVoltar.setEnabled(true);
            musicas mp3 = new musicas();
            mp3.start();
        } if(cont == 3) {
          BtnAvancar.setEnabled(false);  
        }
    }//GEN-LAST:event_BtnAvancarActionPerformed

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        cont--;
        nome.setText("Música: "+ Musicas[cont]);
        if(pl = true) {
            ply.close();
            musicas mp3 = new musicas();
            mp3.start();         
        }
        if(cont < 3) {
            BtnAvancar.setEnabled(true);
        } 
        if(cont == 0) {
            BtnVoltar.setEnabled(false);
        }
    }//GEN-LAST:event_BtnVoltarActionPerformed

    //desconsiderar
    private void JMenu_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenu_SairActionPerformed
    }//GEN-LAST:event_JMenu_SairActionPerformed

    private void jMenu_ItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_ItemSairActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            Menu_inicial menuInicial = new Menu_inicial();
            menuInicial.setVisible(true);
            
            dispose();
        }
    }//GEN-LAST:event_jMenu_ItemSairActionPerformed

    private void JMenu_ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenu_ajudaActionPerformed
        Menu_Ajuda menuajuda = new Menu_Ajuda();
        menuajuda.setVisible(true);
    }//GEN-LAST:event_JMenu_ajudaActionPerformed

    private void JMIinformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIinformacoesActionPerformed
        Menu_InformacoesEditaveis MIE = new Menu_InformacoesEditaveis();
        MIE.setVisible(true);
    }//GEN-LAST:event_JMIinformacoesActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }
    class musicas extends Thread {
            @Override
             public void run() {
                try {            
                InputStream input = this.getClass().getResourceAsStream("/musicas/" + Musicas[cont] + ".mp3");    
                ply = new Player(input);
                ply.play();
                } catch(JavaLayerException e){
                e.printStackTrace();    
                }
            }
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAvancar;
    private javax.swing.JButton BtnPause;
    private javax.swing.JButton BtnPlay;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JMenuItem JMIinformacoes;
    private javax.swing.JMenu JMenu_Ajuda;
    private javax.swing.JMenu JMenu_Conta;
    private javax.swing.JMenu JMenu_Sair;
    private javax.swing.JMenuItem JMenu_ajuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenu_ItemSair;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel nome;
    // End of variables declaration//GEN-END:variables
}
