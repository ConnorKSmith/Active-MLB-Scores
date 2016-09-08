/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scores;

import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author Connor
 */
public class ActiveGamesDisplay extends javax.swing.JFrame  {

    /**
     * Creates new form ActiveGamesDisplay
     */
    int page;
    
    
            
    ArrayList<ActiveGame> activegames;
    
    public ActiveGamesDisplay(ArrayList<ActiveGame> activegames, int pagenumber) {
        initComponents();
        this.activegames = activegames;
        
        
            int numgames = activegames.size();
            games.setText("ACTIVE GAMES: " + numgames);
            
            ActiveGame ag = null;
            page = pagenumber;
            if (page == 1){
            if (numgames > 0){
                ag = activegames.get(0);
                hscore0.setText(ag.getHscore());
                ascore0.setText(ag.getAscore());
                hteam0.setText(ag.getHname());
                ateam0.setText(ag.getAname());
                period0.setText(ag.getPeriod());
            }
            else {
                hscore0.setVisible(false);
                ascore0.setVisible(false);
                hteam0.setVisible(false);
                ateam0.setVisible(false);
                period0.setVisible(false);}
            if (numgames > 1){
                ag = activegames.get(1);
                hscore1.setText(ag.getHscore());
                ascore1.setText(ag.getAscore());
                hteam1.setText(ag.getHname());
                ateam1.setText(ag.getAname());
                period1.setText(ag.getPeriod());
            }
            else {
                hscore1.setVisible(false);
                ascore1.setVisible(false);
                hteam1.setVisible(false);
                ateam1.setVisible(false);
                period1.setVisible(false);
                sep01.setVisible(false);
            }
            if (numgames > 2){
                ag = activegames.get(2);
                hscore2.setText(ag.getHscore());
                ascore2.setText(ag.getAscore());
                hteam2.setText(ag.getHname());
                ateam2.setText(ag.getAname());
                period2.setText(ag.getPeriod());
            }
            else {
                hscore2.setVisible(false);
                ascore2.setVisible(false);
                hteam2.setVisible(false);
                ateam2.setVisible(false);
                period2.setVisible(false);}
            if (numgames > 3){
                ag = activegames.get(3);
                hscore3.setText(ag.getHscore());
                ascore3.setText(ag.getAscore());
                hteam3.setText(ag.getHname());
                ateam3.setText(ag.getAname());
                period3.setText(ag.getPeriod());
            }
            else {
                hscore3.setVisible(false);
                ascore3.setVisible(false);
                hteam3.setVisible(false);
                ateam3.setVisible(false);
                period3.setVisible(false);
                sep23.setVisible(false);
            
                }
            }
            if (page == 2){
            if (numgames > 4){
                ag = activegames.get(4);
                hscore0.setText(ag.getHscore());
                ascore0.setText(ag.getAscore());
                hteam0.setText(ag.getHname());
                ateam0.setText(ag.getAname());
                period0.setText(ag.getPeriod());
            }
            else {
                hscore0.setVisible(false);
                ascore0.setVisible(false);
                hteam0.setVisible(false);
                ateam0.setVisible(false);
                period0.setVisible(false);}
            if (numgames > 5){
                ag = activegames.get(5);
                hscore1.setText(ag.getHscore());
                ascore1.setText(ag.getAscore());
                hteam1.setText(ag.getHname());
                ateam1.setText(ag.getAname());
                period1.setText(ag.getPeriod());
            }
            else {
                hscore1.setVisible(false);
                ascore1.setVisible(false);
                hteam1.setVisible(false);
                ateam1.setVisible(false);
                period1.setVisible(false);
                sep01.setVisible(false);
            }
            if (numgames > 6){
                ag = activegames.get(6);
                hscore2.setText(ag.getHscore());
                ascore2.setText(ag.getAscore());
                hteam2.setText(ag.getHname());
                ateam2.setText(ag.getAname());
                period2.setText(ag.getPeriod());
            }
            else {
                hscore2.setVisible(false);
                ascore2.setVisible(false);
                hteam2.setVisible(false);
                ateam2.setVisible(false);
                period2.setVisible(false);}
            if (numgames > 7){
                ag = activegames.get(7);
                hscore3.setText(ag.getHscore());
                ascore3.setText(ag.getAscore());
                hteam3.setText(ag.getHname());
                ateam3.setText(ag.getAname());
                period3.setText(ag.getPeriod());
            }
            else {
                hscore3.setVisible(false);
                ascore3.setVisible(false);
                hteam3.setVisible(false);
                ateam3.setVisible(false);
                period3.setVisible(false);
                sep23.setVisible(false);
            
                }
            
            
          }
            
            if (page == 3){
            if (numgames > 8){
                ag = activegames.get(8);
                hscore0.setText(ag.getHscore());
                ascore0.setText(ag.getAscore());
                hteam0.setText(ag.getHname());
                ateam0.setText(ag.getAname());
                period0.setText(ag.getPeriod());
            }
            else {
                hscore0.setVisible(false);
                ascore0.setVisible(false);
                hteam0.setVisible(false);
                ateam0.setVisible(false);
                period0.setVisible(false);}
            if (numgames > 9){
                ag = activegames.get(9);
                hscore1.setText(ag.getHscore());
                ascore1.setText(ag.getAscore());
                hteam1.setText(ag.getHname());
                ateam1.setText(ag.getAname());
                period1.setText(ag.getPeriod());
            }
            else {
                hscore1.setVisible(false);
                ascore1.setVisible(false);
                hteam1.setVisible(false);
                ateam1.setVisible(false);
                period1.setVisible(false);
                sep01.setVisible(false);
            }
            if (numgames > 10){
                ag = activegames.get(10);
                hscore2.setText(ag.getHscore());
                ascore2.setText(ag.getAscore());
                hteam2.setText(ag.getHname());
                ateam2.setText(ag.getAname());
                period2.setText(ag.getPeriod());
            }
            else {
                hscore2.setVisible(false);
                ascore2.setVisible(false);
                hteam2.setVisible(false);
                ateam2.setVisible(false);
                period2.setVisible(false);}
            if (numgames > 11){
                ag = activegames.get(11);
                hscore3.setText(ag.getHscore());
                ascore3.setText(ag.getAscore());
                hteam3.setText(ag.getHname());
                ateam3.setText(ag.getAname());
                period3.setText(ag.getPeriod());
            }
            else {
                hscore3.setVisible(false);
                ascore3.setVisible(false);
                hteam3.setVisible(false);
                ateam3.setVisible(false);
                period3.setVisible(false);
                sep23.setVisible(false);
            
                }
            
            
          }
            if (page == 4){
            if (numgames > 12){
                ag = activegames.get(12);
                hscore0.setText(ag.getHscore());
                ascore0.setText(ag.getAscore());
                hteam0.setText(ag.getHname());
                ateam0.setText(ag.getAname());
                period0.setText(ag.getPeriod());
            }
            else {
                hscore0.setVisible(false);
                ascore0.setVisible(false);
                hteam0.setVisible(false);
                ateam0.setVisible(false);
                period0.setVisible(false);}
            if (numgames > 13){
                ag = activegames.get(13);
                hscore1.setText(ag.getHscore());
                ascore1.setText(ag.getAscore());
                hteam1.setText(ag.getHname());
                ateam1.setText(ag.getAname());
                period1.setText(ag.getPeriod());
            }
            else {
                hscore1.setVisible(false);
                ascore1.setVisible(false);
                hteam1.setVisible(false);
                ateam1.setVisible(false);
                period1.setVisible(false);
                sep01.setVisible(false);
            }
            if (numgames > 14){
                ag = activegames.get(14);
                hscore2.setText(ag.getHscore());
                ascore2.setText(ag.getAscore());
                hteam2.setText(ag.getHname());
                ateam2.setText(ag.getAname());
                period2.setText(ag.getPeriod());
            }
            else {
                hscore2.setVisible(false);
                ascore2.setVisible(false);
                hteam2.setVisible(false);
                ateam2.setVisible(false);
                period2.setVisible(false);}
            if (numgames > 15){
                ag = activegames.get(15);
                hscore3.setText(ag.getHscore());
                ascore3.setText(ag.getAscore());
                hteam3.setText(ag.getHname());
                ateam3.setText(ag.getAname());
                period3.setText(ag.getPeriod());
            }
            else {
                hscore3.setVisible(false);
                ascore3.setVisible(false);
                hteam3.setVisible(false);
                ateam3.setVisible(false);
                period3.setVisible(false);
                sep23.setVisible(false);
            
                }
            
            
          }
            if (numgames < 1){
                page1.setVisible(false);
                
            }
            if (numgames < 5){
                page2.setVisible(false);
            }
            if (numgames < 9){
                page3.setVisible(false);
            }
            if (numgames < 13){
                page4.setVisible(false);
            }
            
    }
        
    
            

    private ActiveGamesDisplay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ateam0 = new javax.swing.JTextField();
        hteam0 = new javax.swing.JTextField();
        ascore0 = new javax.swing.JTextField();
        hscore0 = new javax.swing.JTextField();
        period0 = new javax.swing.JTextField();
        ateam1 = new javax.swing.JTextField();
        hteam1 = new javax.swing.JTextField();
        ascore1 = new javax.swing.JTextField();
        hscore1 = new javax.swing.JTextField();
        period1 = new javax.swing.JTextField();
        sep01 = new javax.swing.JSeparator();
        ateam2 = new javax.swing.JTextField();
        hteam2 = new javax.swing.JTextField();
        ascore2 = new javax.swing.JTextField();
        hscore2 = new javax.swing.JTextField();
        period2 = new javax.swing.JTextField();
        ateam3 = new javax.swing.JTextField();
        period3 = new javax.swing.JTextField();
        hteam3 = new javax.swing.JTextField();
        hscore3 = new javax.swing.JTextField();
        ascore3 = new javax.swing.JTextField();
        sep23 = new javax.swing.JSeparator();
        games = new javax.swing.JTextField();
        page1 = new javax.swing.JToggleButton();
        page2 = new javax.swing.JToggleButton();
        page3 = new javax.swing.JToggleButton();
        page4 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ateam0.setText("jTextField1");

        hteam0.setText("jTextField2");
        hteam0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hteam0ActionPerformed(evt);
            }
        });

        ascore0.setText("jTextField3");

        hscore0.setText("jTextField4");
        hscore0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hscore0ActionPerformed(evt);
            }
        });

        period0.setText("jTextField5");

        ateam1.setText("jTextField1");

        hteam1.setText("jTextField2");

        ascore1.setText("jTextField3");

        hscore1.setText("jTextField4");

        period1.setText("jTextField5");

        ateam2.setText("jTextField1");

        hteam2.setText("jTextField2");

        ascore2.setText("jTextField3");

        hscore2.setText("jTextField4");

        period2.setText("jTextField5");

        ateam3.setText("jTextField6");

        period3.setText("jTextField7");

        hteam3.setText("jTextField8");

        hscore3.setText("jTextField9");

        ascore3.setText("jTextField10");

        games.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        games.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        games.setText("ACTIVE GAMES:");

        page1.setText("PAGE 1");
        page1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page1MouseClicked(evt);
            }
        });

        page2.setText("PAGE 2");
        page2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page2MouseClicked(evt);
            }
        });

        page3.setText("PAGE 3");
        page3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page3MouseClicked(evt);
            }
        });

        page4.setText("PAGE 4");
        page4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sep01)
                            .addComponent(sep23)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ateam2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(hteam2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ascore2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                    .addComponent(hscore2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(period2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hteam3, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(ateam3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ascore3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(period3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(hscore3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ateam0, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(hteam0))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ascore0, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                    .addComponent(hscore0, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(period0, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hteam1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(ateam1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ascore1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(hscore1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(period1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(page1)
                                        .addGap(39, 39, 39)
                                        .addComponent(page2)
                                        .addGap(38, 38, 38)
                                        .addComponent(page3)
                                        .addGap(39, 39, 39)
                                        .addComponent(page4))
                                    .addComponent(games, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ateam0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ascore0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(period0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ateam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ascore1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(period1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hteam0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hscore0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hteam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hscore1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sep01, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ateam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ascore2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(period2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ateam3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(period3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ascore3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hteam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hscore2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hteam3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hscore3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sep23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(page1)
                    .addComponent(page2)
                    .addComponent(page4)
                    .addComponent(page3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addComponent(games, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hscore0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hscore0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hscore0ActionPerformed

    private void hteam0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hteam0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hteam0ActionPerformed

    private void page1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page1MouseClicked
        // TODO add your handling code here:
        page = 1;
        this.dispose();
        new ActiveGamesDisplay(activegames, 1).setVisible(true);
    }//GEN-LAST:event_page1MouseClicked

    private void page2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page2MouseClicked
        // TODO add your handling code here:
        page = 2;
        this.dispose();
        new ActiveGamesDisplay(activegames, 2).setVisible(true);
    }//GEN-LAST:event_page2MouseClicked

    private void page3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page3MouseClicked
        // TODO add your handling code here:
        page = 3;
        this.dispose();
        new ActiveGamesDisplay(activegames, 3).setVisible(true);
    }//GEN-LAST:event_page3MouseClicked

    private void page4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page4MouseClicked
        // TODO add your handling code here:
        page = 4;
        this.dispose();
        new ActiveGamesDisplay(activegames, 4).setVisible(true);
    }//GEN-LAST:event_page4MouseClicked

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
            java.util.logging.Logger.getLogger(ActiveGamesDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActiveGamesDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActiveGamesDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActiveGamesDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActiveGamesDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ascore0;
    private javax.swing.JTextField ascore1;
    private javax.swing.JTextField ascore2;
    private javax.swing.JTextField ascore3;
    private javax.swing.JTextField ateam0;
    private javax.swing.JTextField ateam1;
    private javax.swing.JTextField ateam2;
    private javax.swing.JTextField ateam3;
    private javax.swing.JTextField games;
    private javax.swing.JTextField hscore0;
    private javax.swing.JTextField hscore1;
    private javax.swing.JTextField hscore2;
    private javax.swing.JTextField hscore3;
    private javax.swing.JTextField hteam0;
    private javax.swing.JTextField hteam1;
    private javax.swing.JTextField hteam2;
    private javax.swing.JTextField hteam3;
    private javax.swing.JToggleButton page1;
    private javax.swing.JToggleButton page2;
    private javax.swing.JToggleButton page3;
    private javax.swing.JToggleButton page4;
    private javax.swing.JTextField period0;
    private javax.swing.JTextField period1;
    private javax.swing.JTextField period2;
    private javax.swing.JTextField period3;
    private javax.swing.JSeparator sep01;
    private javax.swing.JSeparator sep23;
    // End of variables declaration//GEN-END:variables
    

}
