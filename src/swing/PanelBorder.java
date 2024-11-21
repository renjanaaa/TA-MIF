
package swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class PanelBorder extends javax.swing.JPanel {

    public PanelBorder() {
        initComponents();
        setOpaque(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D Graphics2Dg = null;
        g2setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setcolor(getBackground());
        g2.fillRoundRect (0, 0, getWidth(), getHeight(), 20, 20);
        super.paintComponent(g); 
    }

    private void g2setRenderingHint(RenderingHints.Key KEY_ANTIALIASING, Object VALUE_ANTIALIAS_ON) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static class g2 {

        private static void fillRoundRect(int i, int i0, int width, int height, int i1, int i2) {
            throw new UnsupportedOperationException("Not supported yet."); 


        }

        private static void setcolor(Color background) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
