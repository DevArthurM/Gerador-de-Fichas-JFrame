package geradorDeFichasCodigos;

import java.util.ArrayList;
import javax.swing.ListModel;

public class GeradorDeFichasInterface extends javax.swing.JFrame {

    ArrayList<Integer> listaTeste = new ArrayList();
    Dado dd = new Dado();

    public GeradorDeFichasInterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butaoRodar = new javax.swing.JButton();
        txtForca = new javax.swing.JLabel();
        txtDextreza = new javax.swing.JLabel();
        txtInteligencia = new javax.swing.JLabel();
        txtConstituicao = new javax.swing.JLabel();
        txtPercepção = new javax.swing.JLabel();
        txtCarisma = new javax.swing.JLabel();
        forca = new javax.swing.JLabel();
        destreza = new javax.swing.JLabel();
        inteligencia = new javax.swing.JLabel();
        constituicao = new javax.swing.JLabel();
        percepcao = new javax.swing.JLabel();
        carisma = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaJframe = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerador de fichas");
        setBackground(new java.awt.Color(255, 255, 153));

        butaoRodar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        butaoRodar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Arthur Marques\\Documents\\NetBeansProjects\\geradorDeFichas\\src\\main\\java\\icons\\iconeDados.png")); // NOI18N
        butaoRodar.setText("Rodar Dados");
        butaoRodar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        butaoRodar.setBorderPainted(false);
        butaoRodar.setRolloverEnabled(false);
        butaoRodar.setSelected(true);
        butaoRodar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoRodarActionPerformed(evt);
            }
        });

        txtForca.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtForca.setText("Força:");

        txtDextreza.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtDextreza.setText("Destreza:");

        txtInteligencia.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtInteligencia.setText("Inteligência:");

        txtConstituicao.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtConstituicao.setText("Constituição:");

        txtPercepção.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtPercepção.setText("Percepção:");

        txtCarisma.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtCarisma.setText("Carisma:");

        forca.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        forca.setText("Null");

        destreza.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        destreza.setText("Null");

        inteligencia.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        inteligencia.setText("Null");

        constituicao.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        constituicao.setText("Null");

        percepcao.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        percepcao.setText("Null");

        carisma.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        carisma.setText("Null");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Arthur Marques\\Documents\\NetBeansProjects\\geradorDeFichas\\src\\main\\java\\icons\\iconeLivro (1).png")); // NOI18N

        ListaJframe.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListaJframe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butaoRodar, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(txtForca))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDextreza, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtInteligencia, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(5, 5, 5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtPercepção)
                                        .addComponent(txtConstituicao)
                                        .addComponent(txtCarisma)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(forca)
                            .addComponent(destreza)
                            .addComponent(inteligencia)
                            .addComponent(carisma)
                            .addComponent(percepcao)
                            .addComponent(constituicao))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(forca)
                                .addComponent(txtForca))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(destreza)
                                            .addComponent(txtDextreza))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(inteligencia)
                                            .addComponent(txtInteligencia))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(constituicao)
                                            .addComponent(txtConstituicao))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(percepcao)
                                            .addComponent(txtPercepção))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(carisma)
                                            .addComponent(txtCarisma))))))
                        .addGap(16, 16, 16)
                        .addComponent(butaoRodar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butaoRodarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoRodarActionPerformed
        forca.setText(dd.getResultadoDadoString(20));
        destreza.setText(dd.getResultadoDadoString(20));
        inteligencia.setText(dd.getResultadoDadoString(20));
        constituicao.setText(dd.getResultadoDadoString(20));
        percepcao.setText(dd.getResultadoDadoString(20));
        carisma.setText(dd.getResultadoDadoString(20));
        ListaJframe.setModel((ListModel<String>) listaTeste);
    }//GEN-LAST:event_butaoRodarActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GeradorDeFichasInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeradorDeFichasInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeradorDeFichasInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeradorDeFichasInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeradorDeFichasInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaJframe;
    private javax.swing.JButton butaoRodar;
    private javax.swing.JLabel carisma;
    private javax.swing.JLabel constituicao;
    private javax.swing.JLabel destreza;
    private javax.swing.JLabel forca;
    private javax.swing.JLabel inteligencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel percepcao;
    private javax.swing.JLabel txtCarisma;
    private javax.swing.JLabel txtConstituicao;
    private javax.swing.JLabel txtDextreza;
    private javax.swing.JLabel txtForca;
    private javax.swing.JLabel txtInteligencia;
    private javax.swing.JLabel txtPercepção;
    // End of variables declaration//GEN-END:variables
}
