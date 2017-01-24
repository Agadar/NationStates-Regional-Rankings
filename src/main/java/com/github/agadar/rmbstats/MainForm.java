package com.github.agadar.rmbstats;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * NationStates RMB Statistics application entry point and main GUI.
 *
 * @author Agadar <https://github.com/Agadar/>
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form EmbassyCheckerForm
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

        BtnStart = new javax.swing.JButton();
        PanelRegion = new javax.swing.JPanel();
        TxtFieldRegion = new javax.swing.JTextField();
        PanelReport = new javax.swing.JPanel();
        ScrollPaneReport = new javax.swing.JScrollPane();
        TxtAreaReport = new javax.swing.JTextArea();
        PanelFromDate = new javax.swing.JPanel();
        FTextFieldFromDate = new javax.swing.JFormattedTextField();
        PanelToDate = new javax.swing.JPanel();
        FTextFieldToDate = new javax.swing.JFormattedTextField();
        PanelMaxResults = new javax.swing.JPanel();
        FTextFieldMaxResults = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NationStates RMB Statistics 1.0.0");
        setResizable(false);

        BtnStart.setText("Build report");
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStartActionPerformed(evt);
            }
        });

        PanelRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Region to report on"));
        PanelRegion.setToolTipText("");

        TxtFieldRegion.setText("The Western Isles");
        TxtFieldRegion.setToolTipText("");

        javax.swing.GroupLayout PanelRegionLayout = new javax.swing.GroupLayout(PanelRegion);
        PanelRegion.setLayout(PanelRegionLayout);
        PanelRegionLayout.setHorizontalGroup(
            PanelRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtFieldRegion, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelRegionLayout.setVerticalGroup(
            PanelRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtFieldRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelReport.setBorder(javax.swing.BorderFactory.createTitledBorder("Report (click to copy)"));

        TxtAreaReport.setEditable(false);
        TxtAreaReport.setColumns(20);
        TxtAreaReport.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        TxtAreaReport.setRows(5);
        TxtAreaReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtAreaReportMousePressed(evt);
            }
        });
        ScrollPaneReport.setViewportView(TxtAreaReport);

        javax.swing.GroupLayout PanelReportLayout = new javax.swing.GroupLayout(PanelReport);
        PanelReport.setLayout(PanelReportLayout);
        PanelReportLayout.setHorizontalGroup(
            PanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelReportLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ScrollPaneReport, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelReportLayout.setVerticalGroup(
            PanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPaneReport)
                .addContainerGap())
        );

        PanelFromDate.setBorder(javax.swing.BorderFactory.createTitledBorder("From date (inclusive)"));
        PanelFromDate.setToolTipText("");

        FTextFieldFromDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        FTextFieldFromDate.setValue(new Date());

        javax.swing.GroupLayout PanelFromDateLayout = new javax.swing.GroupLayout(PanelFromDate);
        PanelFromDate.setLayout(PanelFromDateLayout);
        PanelFromDateLayout.setHorizontalGroup(
            PanelFromDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFromDateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FTextFieldFromDate)
                .addContainerGap())
        );
        PanelFromDateLayout.setVerticalGroup(
            PanelFromDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFromDateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FTextFieldFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelToDate.setBorder(javax.swing.BorderFactory.createTitledBorder("To date (exclusive)"));
        PanelToDate.setToolTipText("");

        FTextFieldToDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        FTextFieldToDate.setValue(TodayPlusOne()
        );

        javax.swing.GroupLayout PanelToDateLayout = new javax.swing.GroupLayout(PanelToDate);
        PanelToDate.setLayout(PanelToDateLayout);
        PanelToDateLayout.setHorizontalGroup(
            PanelToDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelToDateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FTextFieldToDate)
                .addContainerGap())
        );
        PanelToDateLayout.setVerticalGroup(
            PanelToDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelToDateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FTextFieldToDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelMaxResults.setBorder(javax.swing.BorderFactory.createTitledBorder("Max. results per list"));
        PanelMaxResults.setToolTipText("");

        FTextFieldMaxResults.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        FTextFieldMaxResults.setValue(100L);

        javax.swing.GroupLayout PanelMaxResultsLayout = new javax.swing.GroupLayout(PanelMaxResults);
        PanelMaxResults.setLayout(PanelMaxResultsLayout);
        PanelMaxResultsLayout.setHorizontalGroup(
            PanelMaxResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMaxResultsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FTextFieldMaxResults)
                .addContainerGap())
        );
        PanelMaxResultsLayout.setVerticalGroup(
            PanelMaxResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMaxResultsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FTextFieldMaxResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelFromDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelToDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelMaxResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnStart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelReport, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelToDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelMaxResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnStart))
                    .addComponent(PanelReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Called when start button is clicked.
     *
     * @param evt
     */
    private void BtnStartActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BtnStartActionPerformed
    {//GEN-HEADEREND:event_BtnStartActionPerformed
        final String region = TxtFieldRegion.getText();
        final long epochFrom = ((Date) FTextFieldFromDate.getValue()).toInstant().toEpochMilli() / 1000;
        final long epochTo = ((Date) FTextFieldToDate.getValue()).toInstant().toEpochMilli() / 1000;
        final int maxResults = (int) Math.abs((long) FTextFieldMaxResults.getValue());
        TxtAreaReport.setText(RmbStatistics.generateReport(region, maxResults, epochFrom, epochTo));
    }//GEN-LAST:event_BtnStartActionPerformed

    /**
     * Called when the report text area has been clicked. Copies its contents to
     * the clipboard.
     *
     * @param evt
     */
    private void TxtAreaReportMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtAreaReportMousePressed
        final Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        final StringSelection strSel = new StringSelection(TxtAreaReport.getText());
        clipboard.setContents(strSel, strSel);
    }//GEN-LAST:event_TxtAreaReportMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Set-up graphical form.      
        try {
            // Set cross-platform look&feel.
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

            // Create and display the form.
            java.awt.EventQueue.invokeLater(()
                    -> {
                final MainForm form = new MainForm();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
            });
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException |
                UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Simple utility function for getting today's date plus one day.
     * @return Today's date, plus one day.
     */
    private static Date TodayPlusOne() {
        Calendar c = Calendar.getInstance(); 
        c.setTime(new Date()); 
        c.add(Calendar.DATE, 1);
        return c.getTime();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton BtnStart;
    private javax.swing.JFormattedTextField FTextFieldFromDate;
    private javax.swing.JFormattedTextField FTextFieldMaxResults;
    private javax.swing.JFormattedTextField FTextFieldToDate;
    private javax.swing.JPanel PanelFromDate;
    private javax.swing.JPanel PanelMaxResults;
    private javax.swing.JPanel PanelRegion;
    private javax.swing.JPanel PanelReport;
    private javax.swing.JPanel PanelToDate;
    private javax.swing.JScrollPane ScrollPaneReport;
    protected javax.swing.JTextArea TxtAreaReport;
    protected javax.swing.JTextField TxtFieldRegion;
    // End of variables declaration//GEN-END:variables
}
