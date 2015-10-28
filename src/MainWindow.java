
public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ParametersLabel = new javax.swing.JLabel();
        OpenFileButton = new javax.swing.JButton();
        AddParamButton = new javax.swing.JButton();
        ParamTableScroll = new javax.swing.JScrollPane();
        ParametersTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(800, 500));

        ParametersLabel.setText("Parameters table");

        OpenFileButton.setText("Open file");
        OpenFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFileButtonActionPerformed(evt);
            }
        });

        AddParamButton.setText("Add manual");
        AddParamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddParamButtonActionPerformed(evt);
            }
        });

        ParamTableScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        ParametersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parameter", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ParamTableScroll.setViewportView(ParametersTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ParametersLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OpenFileButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddParamButton))
                    .addComponent(ParamTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(590, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ParametersLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ParamTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpenFileButton)
                    .addComponent(AddParamButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OpenFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFileButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpenFileButtonActionPerformed

    private void AddParamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddParamButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddParamButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddParamButton;
    private javax.swing.JButton OpenFileButton;
    private javax.swing.JScrollPane ParamTableScroll;
    private javax.swing.JLabel ParametersLabel;
    private javax.swing.JTable ParametersTable;
    // End of variables declaration//GEN-END:variables
}
