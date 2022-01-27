package com.mycompany.windowexe.FirstExe;

import java.awt.Image;
import java.awt.Toolkit;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * https://github.com/waltcoder
 */
public class ThirdWindow extends javax.swing.JFrame {

    private SecondWindow secondWindow;

    /**
     * Creates new form FirstWindow
     */
    public ThirdWindow() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("/icon.png");  // default location of image
        setIconImage(icon);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Terceira Página | WaltFlix | Coded by @waltcoder");
    }

    public void setSecondWindow(SecondWindow secondWindow) {
        this.secondWindow = secondWindow;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        btnBackSecondWindows = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBackFirstWindows = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 14, 47));
        kGradientPanel1.setkGradientFocus(67);
        kGradientPanel1.setkStartColor(new java.awt.Color(60, 8, 25));

        btnBackSecondWindows.setBackground(new java.awt.Color(233, 230, 227));
        btnBackSecondWindows.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnBackSecondWindows.setIcon(new javax.swing.ImageIcon("C:\\Users\\thomm\\OneDrive\\Documentos\\poo\\windowExe\\src\\main\\java\\com\\mycompany\\windowexe\\FirstExe\\shuffle.png")); // NOI18N
        btnBackSecondWindows.setText("voltar à tela anterior");
        btnBackSecondWindows.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 26, 26), 2, true));
        btnBackSecondWindows.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBackSecondWindows.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBackSecondWindows.setIconTextGap(17);
        btnBackSecondWindows.setMargin(new java.awt.Insets(2, 44, 34, 24));
        btnBackSecondWindows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSecondWindowsActionPerformed(evt);
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

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 252, 249));
        jLabel4.setText("<html>\nOps, hoje não é dia de assistir filme.\n<br>\nBora codar! 🚀");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\thomm\\OneDrive\\Documentos\\poo\\windowExe\\src\\main\\java\\com\\mycompany\\windowexe\\FirstExe\\poster code.png")); // NOI18N

        btnBackFirstWindows.setBackground(new java.awt.Color(233, 230, 227));
        btnBackFirstWindows.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnBackFirstWindows.setIcon(new javax.swing.ImageIcon("C:\\Users\\thomm\\OneDrive\\Documentos\\poo\\windowExe\\src\\main\\java\\com\\mycompany\\windowexe\\FirstExe\\shuffle.png")); // NOI18N
        btnBackFirstWindows.setText("voltar à tela inicial");
        btnBackFirstWindows.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 26, 26), 2, true));
        btnBackFirstWindows.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBackFirstWindows.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBackFirstWindows.setIconTextGap(17);
        btnBackFirstWindows.setMargin(new java.awt.Insets(2, 44, 34, 24));
        btnBackFirstWindows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackFirstWindowsActionPerformed(evt);
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
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(284, 284, 284)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(btnBackFirstWindows, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(btnBackSecondWindows, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                                .addGap(375, 375, 375)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(162, 162, 162))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(38, 38, 38)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackFirstWindows, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackSecondWindows, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(513, 513, 513))
        );

        jLabel2.getAccessibleContext().setAccessibleName("logo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackSecondWindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSecondWindowsActionPerformed

        this.setVisible(false);
        secondWindow.setVisible(true);
    }//GEN-LAST:event_btnBackSecondWindowsActionPerformed

    private void btnBackFirstWindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackFirstWindowsActionPerformed

        FirstWindow firstWindowShow = new FirstWindow();
        firstWindowShow.show();
        dispose();
    }//GEN-LAST:event_btnBackFirstWindowsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThirdWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThirdWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThirdWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThirdWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThirdWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackFirstWindows;
    private javax.swing.JButton btnBackSecondWindows;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
