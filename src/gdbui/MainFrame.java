package gdbui;

import javax.swing.*;
import java.math.BigInteger;
import java.lang.NumberFormatException;

public class MainFrame extends javax.swing.JFrame {
    
    public JLabel[] labels_cpu;  
    public JLabel[] labels_fpu;

    public MainFrame() {
        initComponents();

        this.labels_cpu = new javax.swing.JLabel[]{eaxVal_lbl, ebxVal_lbl, ecxVal_lbl, edxVal_lbl, espVal_lbl, ebpVal_lbl, esiVal_lbl, ediVal_lbl, eipVal_lbl, csVal_lbl, ssVal_lbl, esVal_lbl, dsVal_lbl, gsVal_lbl, fsVal_lbl};
        this.labels_fpu = new javax.swing.JLabel[]{st0Val_lbl, st1Val_lbl, st2Val_lbl, st3Val_lbl, st4Val_lbl, st5Val_lbl, st6Val_lbl, st7Val_lbl};

        for(javax.swing.JLabel label : labels_cpu){
            if(RadButtInt.isSelected()){
                label.setText("0");
            } else if (RadButtHex.isSelected()) {
                label.setText("0x0");
            }
        }
        
        for(javax.swing.JLabel label : labels_fpu){
            if(RadButtInt.isSelected()){
                label.setText("0");
            } else if (RadButtHex.isSelected()) {
                label.setText("0x0");
            }
        }
        
        eflagVal_lbl.setText("[ PF ZF IF ]");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadButtonGrp = new javax.swing.ButtonGroup();
        reg_lbl = new javax.swing.JLabel();
        eax_lbl = new javax.swing.JLabel();
        ebx_lbl = new javax.swing.JLabel();
        ecx_lbl = new javax.swing.JLabel();
        edx_lbl = new javax.swing.JLabel();
        esp_lbl = new javax.swing.JLabel();
        ebp_lbl = new javax.swing.JLabel();
        esi_lbl = new javax.swing.JLabel();
        edi_lbl = new javax.swing.JLabel();
        eip_lbl = new javax.swing.JLabel();
        eflag_lbl = new javax.swing.JLabel();
        cs_lbl = new javax.swing.JLabel();
        ss_lbl = new javax.swing.JLabel();
        es_lbl = new javax.swing.JLabel();
        ds_lbl = new javax.swing.JLabel();
        gs_lbl = new javax.swing.JLabel();
        fs_lbl = new javax.swing.JLabel();
        st1_lbl = new javax.swing.JLabel();
        st3_lbl = new javax.swing.JLabel();
        st2_lbl = new javax.swing.JLabel();
        st5_lbl = new javax.swing.JLabel();
        st4_lbl = new javax.swing.JLabel();
        st0_lbl = new javax.swing.JLabel();
        st7_lbl = new javax.swing.JLabel();
        st6_lbl = new javax.swing.JLabel();
        st2Val_lbl = new javax.swing.JLabel();
        st5Val_lbl = new javax.swing.JLabel();
        st4Val_lbl = new javax.swing.JLabel();
        st0Val_lbl = new javax.swing.JLabel();
        st7Val_lbl = new javax.swing.JLabel();
        st6Val_lbl = new javax.swing.JLabel();
        esiVal_lbl = new javax.swing.JLabel();
        ediVal_lbl = new javax.swing.JLabel();
        eipVal_lbl = new javax.swing.JLabel();
        eflagVal_lbl = new javax.swing.JLabel();
        csVal_lbl = new javax.swing.JLabel();
        ssVal_lbl = new javax.swing.JLabel();
        esVal_lbl = new javax.swing.JLabel();
        dsVal_lbl = new javax.swing.JLabel();
        gsVal_lbl = new javax.swing.JLabel();
        fsVal_lbl = new javax.swing.JLabel();
        eaxVal_lbl = new javax.swing.JLabel();
        ebxVal_lbl = new javax.swing.JLabel();
        ecxVal_lbl = new javax.swing.JLabel();
        edxVal_lbl = new javax.swing.JLabel();
        espVal_lbl = new javax.swing.JLabel();
        ebpVal_lbl = new javax.swing.JLabel();
        st1Val_lbl = new javax.swing.JLabel();
        st3Val_lbl = new javax.swing.JLabel();
        Value_selector_lbl = new javax.swing.JLabel();
        RadButtInt = new javax.swing.JRadioButton();
        RadButtHex = new javax.swing.JRadioButton();
        MenuBar = new javax.swing.JMenuBar();
        MenuFile = new javax.swing.JMenu();
        MenuEdit = new javax.swing.JMenu();
        MenuView = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        reg_lbl.setText("Registers:");

        eax_lbl.setText("EAX :");

        ebx_lbl.setText("EBX:");

        ecx_lbl.setText("ECX :");

        edx_lbl.setText("EDX :");

        esp_lbl.setText("ESP :");

        ebp_lbl.setText("EBP :");

        esi_lbl.setText("ESI :");

        edi_lbl.setText("EDI :");

        eip_lbl.setText("EIP :");

        eflag_lbl.setText("EFlags :");

        cs_lbl.setText("CS :");

        ss_lbl.setText("SS :");

        es_lbl.setText("ES :");

        ds_lbl.setText("DS :");

        gs_lbl.setText("GS :");

        fs_lbl.setText("FS :");

        st1_lbl.setText("ST1 :");

        st3_lbl.setText("ST3: ");

        st2_lbl.setText("ST2 :");

        st5_lbl.setText("ST5:");

        st4_lbl.setText("ST4 :");

        st0_lbl.setText("ST0 :");

        st7_lbl.setText("ST7:");

        st6_lbl.setText("ST6 :");

        st2Val_lbl.setText("ST2 :");

        st5Val_lbl.setText("ST5:");

        st4Val_lbl.setText("ST4 :");

        st0Val_lbl.setText("ST0: ");

        st7Val_lbl.setText("ST7:");

        st6Val_lbl.setText("ST6 :");

        esiVal_lbl.setText("ESI :");

        ediVal_lbl.setText("EDI :");

        eipVal_lbl.setText("EIP :");

        eflagVal_lbl.setText("EFlags :");

        csVal_lbl.setText("CS :");

        ssVal_lbl.setText("SS :");

        esVal_lbl.setText("ES :");

        dsVal_lbl.setText("DS :");

        gsVal_lbl.setText("GS :");

        fsVal_lbl.setText("FS :");

        eaxVal_lbl.setText("0x00000000000000000000");

        ebxVal_lbl.setText("EBX:");

        ecxVal_lbl.setText("ECX :");

        edxVal_lbl.setText("EDX :");

        espVal_lbl.setText("ESP :");

        ebpVal_lbl.setText("EBP :");

        st1Val_lbl.setText("ST1 :");

        st3Val_lbl.setText("ST3: ");

        Value_selector_lbl.setText("Value type:");

        RadButtonGrp.add(RadButtInt);
        RadButtInt.setSelected(true);
        RadButtInt.setText("Integer");
        RadButtInt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RadButtIntItemStateChanged(evt);
            }
        });

        RadButtonGrp.add(RadButtHex);
        RadButtHex.setText("Hexadecimal");
        RadButtHex.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RadButtHexItemStateChanged(evt);
            }
        });

        MenuFile.setText("File");
        MenuBar.add(MenuFile);

        MenuEdit.setText("Edit");
        MenuBar.add(MenuEdit);

        MenuView.setText("View");
        MenuView.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuBar.add(MenuView);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(760, 760, 760)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reg_lbl)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eax_lbl)
                            .addComponent(ebx_lbl)
                            .addComponent(ecx_lbl)
                            .addComponent(edx_lbl)
                            .addComponent(esp_lbl)
                            .addComponent(ebp_lbl)
                            .addComponent(esi_lbl)
                            .addComponent(edi_lbl)
                            .addComponent(eip_lbl)
                            .addComponent(eflag_lbl)
                            .addComponent(cs_lbl)
                            .addComponent(ss_lbl)
                            .addComponent(ds_lbl)
                            .addComponent(es_lbl)
                            .addComponent(fs_lbl)
                            .addComponent(gs_lbl)
                            .addComponent(st0_lbl)
                            .addComponent(st1_lbl)
                            .addComponent(st2_lbl)
                            .addComponent(st3_lbl)
                            .addComponent(st4_lbl)
                            .addComponent(st5_lbl)
                            .addComponent(st6_lbl)
                            .addComponent(st7_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ecxVal_lbl)
                            .addComponent(st5Val_lbl)
                            .addComponent(st6Val_lbl)
                            .addComponent(st7Val_lbl)
                            .addComponent(ebpVal_lbl)
                            .addComponent(esiVal_lbl)
                            .addComponent(ediVal_lbl)
                            .addComponent(eipVal_lbl)
                            .addComponent(eflagVal_lbl)
                            .addComponent(csVal_lbl)
                            .addComponent(ssVal_lbl)
                            .addComponent(dsVal_lbl)
                            .addComponent(esVal_lbl)
                            .addComponent(fsVal_lbl)
                            .addComponent(gsVal_lbl)
                            .addComponent(st0Val_lbl)
                            .addComponent(st1Val_lbl)
                            .addComponent(st2Val_lbl)
                            .addComponent(st3Val_lbl)
                            .addComponent(st4Val_lbl)
                            .addComponent(edxVal_lbl)
                            .addComponent(espVal_lbl)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eaxVal_lbl)
                                    .addComponent(ebxVal_lbl))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RadButtHex)
                                    .addComponent(Value_selector_lbl)
                                    .addComponent(RadButtInt))))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reg_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eax_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ebx_lbl)
                            .addComponent(ebxVal_lbl)
                            .addComponent(RadButtHex))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ecx_lbl)
                            .addComponent(ecxVal_lbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Value_selector_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eaxVal_lbl)
                            .addComponent(RadButtInt))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edx_lbl)
                    .addComponent(edxVal_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esp_lbl)
                    .addComponent(espVal_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ebp_lbl)
                    .addComponent(ebpVal_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esi_lbl)
                    .addComponent(esiVal_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edi_lbl)
                    .addComponent(ediVal_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eip_lbl)
                    .addComponent(eipVal_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eflag_lbl)
                    .addComponent(eflagVal_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cs_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ss_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ds_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(es_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fs_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gs_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st0_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st1_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st2_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st3_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st4_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st5_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st6_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st7_lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(csVal_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ssVal_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dsVal_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(esVal_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fsVal_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gsVal_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st0Val_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st1Val_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st2Val_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st3Val_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st4Val_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st5Val_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st6Val_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st7Val_lbl)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadButtIntItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RadButtIntItemStateChanged
        String getTxt;
        if(RadButtInt.isSelected()){
            for(JLabel label : labels_cpu){
                try{
                    getTxt = label.getText();
                    if("0x".equals(getTxt.substring(0,2))){
                        int ValLabel = Integer.parseInt(getTxt.substring(2));
                        String intValue = String.format("%d", ValLabel);
                        label.setText(intValue);
                    } else {
                        throw new NumberFormatException();
                    }                  
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Invalid number format in :" + label.getText(), "Warning: Invalid format",JOptionPane.ERROR_MESSAGE);
                }
            }
            
            for(JLabel label : labels_fpu){
                try{
                    getTxt = label.getText();
                    if("0x".equals(getTxt.substring(0,2))){
                        double ValLabel = Double.parseDouble(getTxt.substring(2));
                        String floatValue = String.format("%e", ValLabel);
                        label.setText(floatValue);
                    } else {
                        throw new NumberFormatException();
                    }    
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(this, "Invalid number format in :" + label.getText(), "Warning: Invalid format",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_RadButtIntItemStateChanged

    private void RadButtHexItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RadButtHexItemStateChanged
        if(RadButtHex.isSelected()){
            for(JLabel label : labels_cpu){
                try{
                    int ValLabel = Integer.parseInt(label.getText());
                    String hexValue = String.format("0x%X", ValLabel);
                    label.setText(hexValue);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Invalid number format in :" + label.getText(), "Warning: Invalid format",JOptionPane.ERROR_MESSAGE);
                }
            }
             for(JLabel label : labels_fpu){
                 try{
                     double ValLabel = Float.parseFloat(label.getText());
                     long FloatVal = Double.doubleToLongBits(ValLabel);
                     String floatValue = String.format("0x%016X", FloatVal);
                     label.setText(floatValue);
                 } catch (NumberFormatException e){
                     JOptionPane.showMessageDialog(this, "Invalid number format in :" + label.getText(), "Warning: Invalid format",JOptionPane.ERROR_MESSAGE);
                 }
             }
            
        }
    }//GEN-LAST:event_RadButtHexItemStateChanged

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuEdit;
    private javax.swing.JMenu MenuFile;
    private javax.swing.JMenu MenuView;
    private javax.swing.JRadioButton RadButtHex;
    private javax.swing.JRadioButton RadButtInt;
    private javax.swing.ButtonGroup RadButtonGrp;
    private javax.swing.JLabel Value_selector_lbl;
    private javax.swing.JLabel csVal_lbl;
    private javax.swing.JLabel cs_lbl;
    private javax.swing.JLabel dsVal_lbl;
    private javax.swing.JLabel ds_lbl;
    private javax.swing.JLabel eaxVal_lbl;
    private javax.swing.JLabel eax_lbl;
    private javax.swing.JLabel ebpVal_lbl;
    private javax.swing.JLabel ebp_lbl;
    private javax.swing.JLabel ebxVal_lbl;
    private javax.swing.JLabel ebx_lbl;
    private javax.swing.JLabel ecxVal_lbl;
    private javax.swing.JLabel ecx_lbl;
    private javax.swing.JLabel ediVal_lbl;
    private javax.swing.JLabel edi_lbl;
    private javax.swing.JLabel edxVal_lbl;
    private javax.swing.JLabel edx_lbl;
    private javax.swing.JLabel eflagVal_lbl;
    private javax.swing.JLabel eflag_lbl;
    private javax.swing.JLabel eipVal_lbl;
    private javax.swing.JLabel eip_lbl;
    private javax.swing.JLabel esVal_lbl;
    private javax.swing.JLabel es_lbl;
    private javax.swing.JLabel esiVal_lbl;
    private javax.swing.JLabel esi_lbl;
    private javax.swing.JLabel espVal_lbl;
    private javax.swing.JLabel esp_lbl;
    private javax.swing.JLabel fsVal_lbl;
    private javax.swing.JLabel fs_lbl;
    private javax.swing.JLabel gsVal_lbl;
    private javax.swing.JLabel gs_lbl;
    private javax.swing.JLabel reg_lbl;
    private javax.swing.JLabel ssVal_lbl;
    private javax.swing.JLabel ss_lbl;
    private javax.swing.JLabel st0Val_lbl;
    private javax.swing.JLabel st0_lbl;
    private javax.swing.JLabel st1Val_lbl;
    private javax.swing.JLabel st1_lbl;
    private javax.swing.JLabel st2Val_lbl;
    private javax.swing.JLabel st2_lbl;
    private javax.swing.JLabel st3Val_lbl;
    private javax.swing.JLabel st3_lbl;
    private javax.swing.JLabel st4Val_lbl;
    private javax.swing.JLabel st4_lbl;
    private javax.swing.JLabel st5Val_lbl;
    private javax.swing.JLabel st5_lbl;
    private javax.swing.JLabel st6Val_lbl;
    private javax.swing.JLabel st6_lbl;
    private javax.swing.JLabel st7Val_lbl;
    private javax.swing.JLabel st7_lbl;
    // End of variables declaration//GEN-END:variables
}
