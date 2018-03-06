package com;

import java.awt.Component;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5543
 */
public class XOgameForm extends javax.swing.JFrame {
    String nickname;
    String messageX = "";
    String messageO = "";
    String message1 = "";
    String messageDevloper = "";
    ImageIcon X =new ImageIcon(this.getClass().getResource("X.png"));
    ImageIcon O =new ImageIcon(this.getClass().getResource("O.png"));
    Random random;
    boolean playerX;
    boolean playerO;
    int exit1 = 0;
    javax.swing.JButton buttons[] = new javax.swing.JButton[9];
    PlayerCom playerCom = new PlayerCom();
    Player player = new Player();
    Buttons buttonsBoolean = new Buttons();
        
    /**
     * Creates new form XOgameForm
     */
    public XOgameForm() {
        initComponents();
        setResizable(false);
//        nickname = XOMenu.isNickname();
        buttons[0] = jButton1;
        buttons[1] = jButton2;
        buttons[2] = jButton3;
        buttons[3] = jButton4;
        buttons[4] = jButton5;
        buttons[5] = jButton6;
        buttons[6] = jButton7;
        buttons[7] = jButton8;
        buttons[8] = jButton9;
       playerX = player.isPlayerIsAtive();
       playerO = playerCom.isPlayerIsAtiveCom();
       playerX = true;
       messageX += "Победитель!\n";
       messageX += "Player : " + player.getName() + " \n";
       
       messageO += "ЛОХ или лузер, выбирай сам !!!\n";
       messageO += "Player : " + playerCom.getName() + " \n";
       message1 += "НИЧЬЯ !!!\n";
       message1 += "ЛОХ или лузер, выбирай сам !!!\n";
       
       
       messageDevloper = "Devloper by(is) Paheter\n";
       messageDevloper += "Or your Boss!\n";
       messageDevloper += "This is my first Programm.\n";
       messageDevloper += "Thanks! Your data now my. Thank a million!";
       
        
    }
    public void close(){
        
        if (buttons[0].getIcon() == null) {
            buttons[0].setEnabled(false);
        }
        if (buttons[1].getIcon() == null) {
            buttons[1].setEnabled(false);
        }
        if (buttons[2].getIcon() == null) {
            buttons[2].setEnabled(false);
        }
        if (buttons[3].getIcon() == null) {
            buttons[3].setEnabled(false);
        }
        if (buttons[4].getIcon() == null) {
            buttons[4].setEnabled(false);
        }
        if (buttons[5].getIcon() == null) {
            buttons[5].setEnabled(false);
        }
        if (buttons[6].getIcon() == null) {
            buttons[6].setEnabled(false);
        }
        if (buttons[7].getIcon() == null) {
            buttons[7].setEnabled(false);
        }
        if (buttons[8].getIcon() == null) {
            buttons[8].setEnabled(false);
        }
        exit1 = 1;
                
        
                
            
        
    }
    public void winner2(){
        JOptionPane.showMessageDialog(rootPane,message1,"Ничья",JOptionPane.INFORMATION_MESSAGE);
    }
    public void winner(){
        
        if(buttons[0].getIcon() == X && buttons[1].getIcon() == X && buttons[2].getIcon() == X){
            JOptionPane.showMessageDialog(rootPane,messageX,"WINER",JOptionPane.INFORMATION_MESSAGE);
            close();
            
        }else if(buttons[3].getIcon() == X && buttons[4].getIcon() == X && buttons[5].getIcon() == X){
            JOptionPane.showMessageDialog(rootPane,messageX,"WINER",JOptionPane.INFORMATION_MESSAGE);
            close();
        }else if(buttons[6].getIcon() == X && buttons[7].getIcon() == X && buttons[8].getIcon() == X){
            JOptionPane.showMessageDialog(rootPane,messageX,"WINER",JOptionPane.INFORMATION_MESSAGE);
            close();
        }else if(buttons[0].getIcon() == X && buttons[4].getIcon() == X && buttons[8].getIcon() == X){
            JOptionPane.showMessageDialog(rootPane,messageX,"WINER",JOptionPane.INFORMATION_MESSAGE);
            close();
            /// по вертикали Х
        }else if(buttons[0].getIcon() == X && buttons[3].getIcon() == X && buttons[6].getIcon() == X){
            JOptionPane.showMessageDialog(rootPane,messageX,"WINER",JOptionPane.INFORMATION_MESSAGE);
            close();
        }else if(buttons[1].getIcon() == X && buttons[4].getIcon() == X && buttons[7].getIcon() == X){
            JOptionPane.showMessageDialog(rootPane,messageX,"WINER",JOptionPane.INFORMATION_MESSAGE);
            close();
        }else if(buttons[2].getIcon() == X && buttons[5].getIcon() == X && buttons[8].getIcon() == X){
            JOptionPane.showMessageDialog(rootPane,messageX,"WINER",JOptionPane.INFORMATION_MESSAGE);
            close();
        }else if(buttons[2].getIcon() == X && buttons[4].getIcon() == X && buttons[6].getIcon() == X){
            JOptionPane.showMessageDialog(rootPane,messageX,"WINER",JOptionPane.INFORMATION_MESSAGE);
            close();
        }else{
            
        }
          
            /// по вертикали Х
          
        
    }
    public void winnerO(){
        if(buttons[0].getIcon() == O && buttons[1].getIcon() == O && buttons[2].getIcon() == O){
            JOptionPane.showMessageDialog(rootPane,messageO,"WINER",JOptionPane.INFORMATION_MESSAGE);
            close();
        }else if(buttons[3].getIcon() == O && buttons[4].getIcon() == O && buttons[5].getIcon() == O){
            JOptionPane.showMessageDialog(rootPane,messageO,"WINER",JOptionPane.INFORMATION_MESSAGE);
            close();
        }else if(buttons[6].getIcon() == O && buttons[7].getIcon() == O && buttons[8].getIcon() == O){
            JOptionPane.showMessageDialog(rootPane,messageO,"WINER",JOptionPane.INFORMATION_MESSAGE);
            close();
        }else if(buttons[0].getIcon() == O && buttons[4].getIcon() == O && buttons[8].getIcon() == O){
            JOptionPane.showMessageDialog(rootPane,messageO,"WINER",JOptionPane.INFORMATION_MESSAGE);
            close();
            
        }else if(buttons[2].getIcon() == O && buttons[4].getIcon() == O && buttons[6].getIcon() == O){
            JOptionPane.showMessageDialog(rootPane,messageO,"WINER",JOptionPane.INFORMATION_MESSAGE);
            close();    
            
            /// по вертикали О
        }else if(buttons[0].getIcon() == O && buttons[3].getIcon() == O && buttons[6].getIcon() == O){
            JOptionPane.showMessageDialog(rootPane,messageO,"WINER",JOptionPane.INFORMATION_MESSAGE);
            close();
        }else if(buttons[1].getIcon() == O && buttons[4].getIcon() == O && buttons[7].getIcon() == O){
            JOptionPane.showMessageDialog(rootPane,messageO,"WINER",JOptionPane.INFORMATION_MESSAGE);
            close();
        }else if(buttons[2].getIcon() == O && buttons[5].getIcon() == O && buttons[8].getIcon() == O){
            JOptionPane.showMessageDialog(rootPane,messageO,"WINER",JOptionPane.INFORMATION_MESSAGE);
            close();
        /// по вертикали О
            }
    }
        
    
    /**
     *
     * @param button
     */
    public void xPlayerHOD(JButton button) {
        int value = 0;
        if (playerX == true) {
            button.setIcon(X);
            button.setEnabled(false);
            player.setPlayerIsAtive(false);
            playerX = false;
            playerO = true;
            for (int i = 0; i < buttons.length; i++) {
                if (buttons[i].isEnabled() == false) {
                    value++;

                }

            }
            if (value == 9) {
                winnerO();
                winner();
                if(exit1 != 1){
                    winner2();
                }

            } else {
                
                winnerO();
                winner();
                if(exit1 != 1){
                    oPlayerHOD();
                }
            }

        }

    }
    private void oPlayerHOD() {
        if (playerO == true) {
            random = new Random();
            int x;
            
            playerX = true;
            
            while(playerO){
                
            x = random.nextInt(buttons.length);
            
            if (buttons[x].isEnabled() == true && buttons[x].getIcon() == null) {
                buttons[x].setIcon(O);
                buttons[x].setEnabled(false);
                playerO = false;
            }
            }
            winnerO();

        }
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelInfo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ButtonBackToMenu = new javax.swing.JButton();
        inputName = new javax.swing.JLabel();
        ScorePlayerLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        PanelInfo.setBackground(new java.awt.Color(153, 153, 153));
        PanelInfo.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Players :");
        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        ButtonBackToMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonBackToMenu.setText("Back to Menu");
        ButtonBackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackToMenuActionPerformed(evt);
            }
        });

        inputName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inputName.setText("Player1");
        inputName.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                inputNameComponentRemoved(evt);
            }
        });
        inputName.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                inputNameAncestorRemoved(evt);
            }
        });

        ScorePlayerLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ScorePlayerLabel.setText("Score Player:");
        ScorePlayerLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ScorePlayerLabel.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        ScorePlayerLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("0");

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("VS");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Unname");
        jLabel4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jLabel4AncestorRemoved(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("RESET");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelInfoLayout = new javax.swing.GroupLayout(PanelInfo);
        PanelInfo.setLayout(PanelInfoLayout);
        PanelInfoLayout.setHorizontalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(ScorePlayerLabel)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(PanelInfoLayout.createSequentialGroup()
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelInfoLayout.createSequentialGroup()
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43))
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addComponent(ButtonBackToMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(262, 262, 262))))
        );
        PanelInfoLayout.setVerticalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoLayout.createSequentialGroup()
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputName)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(53, 53, 53)
                        .addComponent(ScorePlayerLabel))
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelInfoLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelInfoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonBackToMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenu1.setEnabled(false);
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setEnabled(false);
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Devloper");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Devloper");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackToMenuActionPerformed
        // TODO add your handling code here:
        dispose();
        XOMenu from1 = new XOMenu();
        from1.setVisible(true);
    }//GEN-LAST:event_ButtonBackToMenuActionPerformed

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded
        // TODO add your handling code here:
        if(XOMenu.isNickname() != null){
            
            inputName.setText(player.getName());
        }
        jLabel4.setText(playerCom.getName());
        
    }//GEN-LAST:event_jLabel2AncestorAdded

    private void inputNameAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_inputNameAncestorRemoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_inputNameAncestorRemoved

    private void inputNameComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_inputNameComponentRemoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_inputNameComponentRemoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
            xPlayerHOD(jButton1);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel4AncestorRemoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel4AncestorRemoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        xPlayerHOD(jButton2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        xPlayerHOD(jButton3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        xPlayerHOD(jButton4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        xPlayerHOD(jButton5);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        xPlayerHOD(jButton6);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        xPlayerHOD(jButton7);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        xPlayerHOD(jButton8);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        xPlayerHOD(jButton9);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        dispose();
        XOgameForm form = new XOgameForm();
        form.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane,messageDevloper,"Devloper",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(XOgameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XOgameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XOgameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XOgameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XOgameForm().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBackToMenu;
    private javax.swing.JPanel PanelInfo;
    private javax.swing.JLabel ScorePlayerLabel;
    private javax.swing.JLabel inputName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
        
        
}

