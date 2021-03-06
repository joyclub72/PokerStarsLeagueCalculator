package joyclub.pokerstarsleaguecalculator;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author nicola
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLPremiati = new javax.swing.JLabel();
        jLPunti = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTIscritti = new javax.swing.JFormattedTextField();
        jTRimasti = new javax.swing.JFormattedTextField();
        jLPercentuale = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PokerStars League Calculator");
        setResizable(false);
        setSize(new java.awt.Dimension(263, 216));

        jLPremiati.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLPremiati.setForeground(java.awt.Color.red);
        jLPremiati.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPremiati.setText("0");

        jLPunti.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLPunti.setForeground(java.awt.Color.red);
        jLPunti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPunti.setText("0");

        jLabel1.setText("Iscritti");

        jLabel2.setText("Posizione");

        jLabel3.setText("A Premio");

        jLabel4.setText("Punti");

        jTIscritti.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jTIscritti.setAutoscrolls(false);
        jTIscritti.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jTRimasti.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jTRimasti.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jLPercentuale.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLPercentuale.setForeground(java.awt.Color.red);
        jLPercentuale.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jTIscritti, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTRimasti, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLPercentuale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel4)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLPremiati, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLPunti, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTRimasti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTIscritti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPercentuale)
                    .addComponent(jLPremiati)
                    .addComponent(jLPunti)))
        );

        jTIscritti.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                premiati();
            }
            public void removeUpdate(DocumentEvent e) {
                premiati();
            }
            public void insertUpdate(DocumentEvent e) {
                premiati();
            }

            public void premiati() {
                if (!jTIscritti.getText().isEmpty()) {
                    PuntiLeague aPunti = new PuntiLeague();
                    String strIscritti = jTIscritti.getText();
                    int iscritti = Integer.parseInt(strIscritti);
                    int premiati = aPunti.aPremio(iscritti);
                    String strPremiati = Integer.toString(premiati);
                    jLPremiati.setText(strPremiati);
                }
                else jLPremiati.setText("0");
            }
        });
        jTRimasti.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                punti();
            }
            public void removeUpdate(DocumentEvent e) {
                punti();
            }
            public void insertUpdate(DocumentEvent e) {
                punti();
            }

            public void punti() {
                if (!jTRimasti.getText().isEmpty()) {
                    PuntiLeague aPunti = new PuntiLeague();
                    String strIscritti = jTIscritti.getText();
                    int iscritti = Integer.parseInt(strIscritti);
                    int premiati = aPunti.aPremio(iscritti);
                    String strPosizione = jTRimasti.getText();
                    int posizione = Integer.parseInt(strPosizione);
                    double percentuale = aPunti.percentuale(iscritti, posizione);
                    String strPercentuale = String.format("%.4g%n", percentuale)+"%";
                    jLPercentuale.setText(strPercentuale);
                    if (posizione <= premiati) {
                        double puntiAssegnati = aPunti.puntiAssegnati(iscritti, posizione);
                        String strPuntiAssegnati = String.format("%.4g%n", puntiAssegnati);
                        jLPunti.setText(strPuntiAssegnati);
                    }
                    else jLPunti.setText("0");
                }
                else jLPunti.setText("0");
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLPercentuale;
    private javax.swing.JLabel jLPremiati;
    private javax.swing.JLabel jLPunti;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JFormattedTextField jTIscritti;
    private javax.swing.JFormattedTextField jTRimasti;
    // End of variables declaration//GEN-END:variables
}
