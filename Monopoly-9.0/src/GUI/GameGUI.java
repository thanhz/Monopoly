/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package GUI;

import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author Thanh
 */
public class GameGUI extends javax.swing.JFrame {
    /**
     * Creates new form GameGUI
     */
    private Game game;
    private Dice dice;
    
    public GameGUI() {
        initComponents();
        startGamePanel.setVisible(false);
        gamePanel.setVisible(false);
        loadGamePanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        mainMenuPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        newGame = new javax.swing.JButton();
        loadGame = new javax.swing.JButton();
        quitGame = new javax.swing.JButton();
        mrMonopoly = new javax.swing.JLabel();
        startGamePanel = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        startGame = new javax.swing.JButton();
        back = new javax.swing.JButton();
        numberPlayer = new javax.swing.JTextField();
        enterPlayer = new javax.swing.JLabel();
        mrMonopoly1 = new javax.swing.JLabel();
        loadGamePanel = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        loadGame1 = new javax.swing.JButton();
        fileName = new javax.swing.JTextField();
        enterFile = new javax.swing.JLabel();
        mrMonopoly2 = new javax.swing.JLabel();
        back1 = new javax.swing.JButton();
        gamePanel = new javax.swing.JPanel();
        roll = new javax.swing.JButton();
        quitGame2 = new javax.swing.JButton();
        sell = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        money = new javax.swing.JTextField();
        player = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        mainMenuPanel.setBackground(new java.awt.Color(204, 255, 204));
        mainMenuPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainMenuPanel.setMaximumSize(new java.awt.Dimension(800, 600));
        mainMenuPanel.setMinimumSize(new java.awt.Dimension(800, 600));
        mainMenuPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        title.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        title.setForeground(new java.awt.Color(255, 0, 0));
        title.setText("MONOPOLY");

        newGame.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        newGame.setText("New Game");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });

        loadGame.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        loadGame.setText("Load Game");
        loadGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadGameActionPerformed(evt);
            }
        });

        quitGame.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        quitGame.setText("Quit Game");
        quitGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitGameActionPerformed(evt);
            }
        });

        mrMonopoly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/MrMonopoly.png"))); // NOI18N

        javax.swing.GroupLayout mainMenuPanelLayout = new javax.swing.GroupLayout(mainMenuPanel);
        mainMenuPanel.setLayout(mainMenuPanelLayout);
        mainMenuPanelLayout.setHorizontalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(484, 484, Short.MAX_VALUE))
            .addGroup(mainMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMenuPanelLayout.createSequentialGroup()
                        .addComponent(newGame)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainMenuPanelLayout.createSequentialGroup()
                        .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loadGame)
                            .addComponent(quitGame))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mrMonopoly))))
        );
        mainMenuPanelLayout.setVerticalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuPanelLayout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newGame)
                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMenuPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(mrMonopoly))
                    .addGroup(mainMenuPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(loadGame)
                        .addGap(36, 36, 36)
                        .addComponent(quitGame)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jLayeredPane1.add(mainMenuPanel, "card2");

        startGamePanel.setBackground(new java.awt.Color(204, 255, 204));
        startGamePanel.setPreferredSize(new java.awt.Dimension(800, 600));

        title1.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 0, 0));
        title1.setText("MONOPOLY");

        startGame.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        startGame.setText("Start Game");
        startGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        numberPlayer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        enterPlayer.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        enterPlayer.setText("Enter the Number of Players");

        mrMonopoly1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/MrMonopoly.png"))); // NOI18N

        javax.swing.GroupLayout startGamePanelLayout = new javax.swing.GroupLayout(startGamePanel);
        startGamePanel.setLayout(startGamePanelLayout);
        startGamePanelLayout.setHorizontalGroup(
            startGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startGamePanelLayout.createSequentialGroup()
                .addGroup(startGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title1)
                    .addGroup(startGamePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(startGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterPlayer)
                            .addComponent(numberPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startGame))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startGamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mrMonopoly1))
        );
        startGamePanelLayout.setVerticalGroup(
            startGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startGamePanelLayout.createSequentialGroup()
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterPlayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numberPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(startGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(startGamePanelLayout.createSequentialGroup()
                        .addComponent(startGame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(back)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startGamePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(mrMonopoly1))))
        );

        jLayeredPane1.add(startGamePanel, "card3");

        loadGamePanel.setBackground(new java.awt.Color(204, 255, 204));
        loadGamePanel.setPreferredSize(new java.awt.Dimension(800, 600));

        title2.setBackground(new java.awt.Color(255, 204, 51));
        title2.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        title2.setForeground(new java.awt.Color(255, 0, 0));
        title2.setText("MONOPOLY");

        loadGame1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        loadGame1.setText("Load Game");
        loadGame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadGame1ActionPerformed(evt);
            }
        });

        fileName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        enterFile.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        enterFile.setText("Enter the file name (.txt)");

        mrMonopoly2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/MrMonopoly.png"))); // NOI18N

        back1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        back1.setText("Back");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loadGamePanelLayout = new javax.swing.GroupLayout(loadGamePanel);
        loadGamePanel.setLayout(loadGamePanelLayout);
        loadGamePanelLayout.setHorizontalGroup(
            loadGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadGamePanelLayout.createSequentialGroup()
                .addComponent(title2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(loadGamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loadGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterFile)
                    .addComponent(fileName, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loadGamePanelLayout.createSequentialGroup()
                        .addGroup(loadGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loadGame1)
                            .addComponent(back1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(mrMonopoly2))))
        );
        loadGamePanelLayout.setVerticalGroup(
            loadGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadGamePanelLayout.createSequentialGroup()
                .addComponent(title2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loadGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loadGamePanelLayout.createSequentialGroup()
                        .addComponent(loadGame1)
                        .addGap(18, 18, 18)
                        .addComponent(back1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadGamePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(mrMonopoly2))))
        );

        jLayeredPane1.add(loadGamePanel, "card3");

        gamePanel.setBackground(new java.awt.Color(204, 255, 204));

        roll.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        roll.setIcon(new javax.swing.ImageIcon("C:\\Users\\Thanh\\Google Drive\\CSIT 3\\Semester B\\Project\\Monopoly\\src\\GUI\\dice.gif")); // NOI18N
        roll.setText("Roll");
        roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollActionPerformed(evt);
            }
        });

        quitGame2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        quitGame2.setText("Quit");
        quitGame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitGame2ActionPerformed(evt);
            }
        });

        sell.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        sell.setText("Sell");
        sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Player:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Money:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/monopoly.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        money.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        money.setText("jTextField1");

        player.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        player.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        save.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(save)
                                .addGap(18, 18, 18)
                                .addComponent(quitGame2)
                                .addGap(14, 14, 14))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                        .addGap(595, 595, 595)
                        .addComponent(sell)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(roll)))
                .addContainerGap())
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quitGame2)
                            .addComponent(save))))
                .addGap(18, 18, 18)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roll)
                            .addComponent(sell)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 32, Short.MAX_VALUE))
        );

        jLayeredPane1.add(gamePanel, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        startGamePanel.setVisible(true);
        mainMenuPanel.setVisible(false);
    }//GEN-LAST:event_newGameActionPerformed

    private void startGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameActionPerformed
  try{
        int number = Integer.parseInt(
            this.numberPlayer.getText());
        startGamePanel.setVisible(false);
        gamePanel.setVisible(true);
        game = new Monopoly(number);
        setStats();
    }
    catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Must enter a number between 1-4",
                    "Error",JOptionPane.ERROR_MESSAGE);
        startGamePanel.setVisible(true);
        gamePanel.setVisible(false);
        }    
    }//GEN-LAST:event_startGameActionPerformed

    private void setStats()
    {
        player.setText(game.getCurrentPlayerName());
        String moneyS = String.valueOf(game.getMoney());
        money.setText(moneyS);
    }   
    
    private void rollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollActionPerformed
        game.movePlayerGUI();
        jTextArea1.append(game.getCurrentPlayerName()+" Rolled "+ game.getRoll()+"\n");   
        jTextArea1.append(game.getLocationGUI()+"\n");
        game.nextTurn();
        player.setText(game.getCurrentPlayerName());
        String moneyS = String.valueOf(game.getMoney());
        money.setText(moneyS);
        jTextArea1.append(game.getCurrentPlayerName()+"'s Turn to roll "+ "\n");      
    }//GEN-LAST:event_rollActionPerformed

    private void quitGame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitGame2ActionPerformed
               int answer = JOptionPane.showConfirmDialog(this,
                    "Are you sure you want to quit?","Finish",
                    JOptionPane.YES_NO_OPTION);

            if (answer == JOptionPane.YES_OPTION)
            {
                System.exit(0); 
            }              // TODO add your handling code here:
    }//GEN-LAST:event_quitGame2ActionPerformed

    private void sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellActionPerformed

    private void quitGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitGameActionPerformed
            int answer = JOptionPane.showConfirmDialog(this,
                    "Are you sure you want to quit?","Finish",
                    JOptionPane.YES_NO_OPTION);

            if (answer == JOptionPane.YES_OPTION)
            {
                System.exit(0); 
            }              // TODO add your handling code here:
    }//GEN-LAST:event_quitGameActionPerformed

    private void loadGame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadGame1ActionPerformed
        try{
        String file = fileName.getText();
        game = new Monopoly(0);
        game.loadGame(file);
        loadGamePanel.setVisible(false);
        gamePanel.setVisible(true);
        setStats();
    }
    catch (Exception e) {
        JOptionPane.showMessageDialog(this, "File not found",
                    "Error",JOptionPane.ERROR_MESSAGE);
        gamePanel.setVisible(false);
        loadGamePanel.setVisible(true);
        }    
    }//GEN-LAST:event_loadGame1ActionPerformed

    private void loadGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadGameActionPerformed
        loadGamePanel.setVisible(true);
        mainMenuPanel.setVisible(false);
    }//GEN-LAST:event_loadGameActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String save = JOptionPane.showInputDialog(this,
                "Enter a Save name .txt","Save Game",
                JOptionPane.OK_CANCEL_OPTION);

        if (save != null)
        {
            try{
                FileOutputStream fileOut = new FileOutputStream(save);
                ObjectOutputStream oos = new ObjectOutputStream (fileOut);
                oos.writeObject (game);
                //game.saveGame(save);
                //JOptionPane.showMessageDialog(this, "game saved as " + save);
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "You must enter a file name",
                    "Error",JOptionPane.ERROR_MESSAGE);
            }    
        } 
    }//GEN-LAST:event_saveActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        startGamePanel.setVisible(false);
        mainMenuPanel.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        loadGamePanel.setVisible(false);
        mainMenuPanel.setVisible(true);
    }//GEN-LAST:event_back1ActionPerformed

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
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton back1;
    private javax.swing.JLabel enterFile;
    private javax.swing.JLabel enterPlayer;
    private javax.swing.JTextField fileName;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton loadGame;
    private javax.swing.JButton loadGame1;
    private javax.swing.JPanel loadGamePanel;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JTextField money;
    private javax.swing.JLabel mrMonopoly;
    private javax.swing.JLabel mrMonopoly1;
    private javax.swing.JLabel mrMonopoly2;
    private javax.swing.JButton newGame;
    private javax.swing.JTextField numberPlayer;
    private javax.swing.JTextField player;
    private javax.swing.JButton quitGame;
    private javax.swing.JButton quitGame2;
    private javax.swing.JButton roll;
    private javax.swing.JButton save;
    private javax.swing.JButton sell;
    private javax.swing.JButton startGame;
    private javax.swing.JPanel startGamePanel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}
