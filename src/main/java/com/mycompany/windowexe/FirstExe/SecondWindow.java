package com.mycompany.windowexe.FirstExe;

import java.awt.Image;
import java.awt.Toolkit;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * https://github.com/waltcoder
 */
public class SecondWindow extends javax.swing.JFrame {

    private FirstWindow firstWindow;
    private ThirdWindow thirdWindow;

    public SecondWindow() {
        initComponents();
       Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");
        setIconImage(icon);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Segunda Página | WaltFlix | Coded by @waltcoder");
        thirdWindow = new ThirdWindow();

    }

    public void setFirstWindow(FirstWindow firstWindow) {
        this.firstWindow = firstWindow;
    }

    public void setThirdWindow(ThirdWindow thirdWindow) {
        this.thirdWindow = thirdWindow;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        btnThirdWindow = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBackFirstWindow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 14, 47));
        kGradientPanel1.setkGradientFocus(67);
        kGradientPanel1.setkStartColor(new java.awt.Color(60, 8, 25));

        btnThirdWindow.setBackground(new java.awt.Color(233, 230, 227));
        btnThirdWindow.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnThirdWindow.setIcon(new javax.swing.ImageIcon("C:\\Users\\thomm\\OneDrive\\Documentos\\poo\\windowExe\\src\\main\\java\\com\\mycompany\\windowexe\\FirstExe\\shuffle.png")); // NOI18N
        btnThirdWindow.setText("veja mais");
        btnThirdWindow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 26, 26), 2, true));
        btnThirdWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnThirdWindow.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnThirdWindow.setIconTextGap(17);
        btnThirdWindow.setMargin(new java.awt.Insets(2, 44, 34, 24));
        btnThirdWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThirdWindowActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 252, 249));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Não sabe o que assistir?");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(1440, 940));
        jLabel1.setMinimumSize(new java.awt.Dimension(375, 940));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\thomm\\OneDrive\\Documentos\\poo\\windowExe\\src\\main\\java\\com\\mycompany\\windowexe\\FirstExe\\logo.png")); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 252, 249));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html>\nClique em \"Encontrar filme\" que traremos informações\n<br>\nde algum filme para você assistir hoje.");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerifyInputWhenFocusTarget(false);

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 252, 249));
        jLabel5.setText("Os Caça-Fantasmas ");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 252, 249));
        jLabel4.setText("<html>\nEm Nova York Peter Venkman, Ray Stantz e Egon\n<br>\nSpengler são três cientistas do departamento de\n<br>\npsicologia da Columbia University, que se dedica\n<br>\nao estudo de casos paranormais. Quando a\n<br>\nsubvenção termina eles são despedidos e Venkman\n<br>\nsugere que abram um negócio próprio, a\n<br>\nexterminadora de fantasmas Ghostbusters.\n<br>\nInicialmente eles só têm despesas e nenhum\n<br>\ncliente, mas eis que surge Dana Barrett, uma\n<br>\nvioloncelista que teve uma experiência\n<br>\nassustadora em seu apartamento.\n");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\thomm\\OneDrive\\Documentos\\poo\\windowExe\\src\\main\\java\\com\\mycompany\\windowexe\\FirstExe\\poster.png")); // NOI18N

        btnBackFirstWindow.setBackground(new java.awt.Color(233, 230, 227));
        btnBackFirstWindow.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnBackFirstWindow.setIcon(new javax.swing.ImageIcon("C:\\Users\\thomm\\OneDrive\\Documentos\\poo\\windowExe\\src\\main\\java\\com\\mycompany\\windowexe\\FirstExe\\shuffle.png")); // NOI18N
        btnBackFirstWindow.setText("voltar à tela inicial");
        btnBackFirstWindow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 26, 26), 2, true));
        btnBackFirstWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBackFirstWindow.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBackFirstWindow.setIconTextGap(17);
        btnBackFirstWindow.setMargin(new java.awt.Insets(2, 44, 34, 24));
        btnBackFirstWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackFirstWindowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(503, 503, 503))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(162, 162, 162))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBackFirstWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnThirdWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(513, 513, 513))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(529, 529, 529)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThirdWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackFirstWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(580, 580, 580))
        );

        jLabel2.getAccessibleContext().setAccessibleName("logo");
        jLabel5.getAccessibleContext().setAccessibleName("Os Caça-Fantasmas  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThirdWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThirdWindowActionPerformed

       thirdWindow.setSecondWindow(this);
        thirdWindow.setVisible(true);
                this.setVisible(false);
        
    }//GEN-LAST:event_btnThirdWindowActionPerformed

    private void btnBackFirstWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackFirstWindowActionPerformed
        this.setVisible(false);
        firstWindow.setVisible(true);

    }//GEN-LAST:event_btnBackFirstWindowActionPerformed

    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SecondWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackFirstWindow;
    private javax.swing.JButton btnThirdWindow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
