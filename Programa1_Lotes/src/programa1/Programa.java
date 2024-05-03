// Importar los paquete necesarios
package programa1;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 ** @author Carlos Mendoza
 */
// Declaración de la clase Programa que extiende de javax.swing.JFrame
public class Programa extends javax.swing.JFrame {

    public Object[] ProcesosP = new Object[100000];
    public Object[] ProcesosDe5 = new Object[100000];
    public Object[] TIME = new Object[100000];
    private int contadorLote = 0, NumeroProcesos = 0, contadorGlobal;
    private int ProcesoEjecucion = 0;
    public Proceso objetoProceso = new Proceso();
    boolean RunStop = true;
    private String procesoStringTerminados = "", procesoStringTerminados2 = "";
    private int contadorLote2;

    // Constructor de la clase Programa
    public Programa() {
        // Inicializar los componentes creados en el formulario
        initComponents();
        // Establecer la posición de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        // Crear un nuevo objeto Color con los valores RGB proporcionados
        Color miColor = new Color(244, 246, 192);
        // Establecer el color de fondo del contenido de la ventana (JFrame)
        this.getContentPane().setBackground(miColor);
        // Establecer el icono de la ventana
        setIconImage(new ImageIcon(getClass().getResource("/img/ProcPorLo.png")).getImage());
        //Eliminar el archivo de datos si existe
        objetoProceso.BorrarArchivos();
        //Hacer visible la ventana
        this.setVisible(true);

    }

    //Código generado automaticamente de la creación 
    //de los Widgets.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbGenerar = new javax.swing.JButton();
        jbObtenerResultados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtNumeroProcesos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEjecucion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTerminados = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtEspera = new javax.swing.JTextArea();
        jlLotesPendientes = new javax.swing.JLabel();
        jlContadorGlobal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Procesamiento Por Lotes.");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jbGenerar.setText("Generar");
        jbGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGenerar.setFocusPainted(false);
        jbGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGenerarActionPerformed(evt);
            }
        });

        jbObtenerResultados.setText("OBTENER RESULTADOS");
        jbObtenerResultados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbObtenerResultados.setFocusPainted(false);
        jbObtenerResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbObtenerResultadosActionPerformed(evt);
            }
        });

        jLabel1.setText("# Procesos");

        jLabel2.setText("EN ESPERA");

        jLabel3.setText("EJECUCIÓN");

        jLabel4.setText("TERMINADOS");

        jLabel5.setText("Reloj Global:");

        jLabel6.setText("# de Lotes Pendientes:");

        jtNumeroProcesos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jtNumeroProcesos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtNumeroProcesos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNumeroProcesosKeyTyped(evt);
            }
        });

        jtEjecucion.setEditable(false);
        jtEjecucion.setColumns(20);
        jtEjecucion.setRows(5);
        jScrollPane1.setViewportView(jtEjecucion);

        jtTerminados.setEditable(false);
        jtTerminados.setColumns(20);
        jtTerminados.setRows(5);
        jScrollPane2.setViewportView(jtTerminados);

        jtEspera.setEditable(false);
        jtEspera.setColumns(20);
        jtEspera.setRows(5);
        jScrollPane3.setViewportView(jtEspera);

        jlLotesPendientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlLotesPendientes.setText("0");

        jlContadorGlobal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlContadorGlobal.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNumeroProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbGenerar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlLotesPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jlContadorGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbObtenerResultados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGenerar)
                    .addComponent(jLabel1)
                    .addComponent(jtNumeroProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jlContadorGlobal))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jlLotesPendientes))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 33, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)
                        .addComponent(jbObtenerResultados)
                        .addGap(50, 50, 50))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContadorGlobal() {
        Timer timer = new Timer(400, new ActionListener() {
            int nuevoValor = 1, bandera2 = 0, contadorLoteI = 0;
            int bandera = 0, procesosPendientes = 0, ultimosP = (NumeroProcesos % 5);
            int ultimosP2 = ultimosP - 2, ultimosP3 = ultimosP - 2;

            @Override
            public void actionPerformed(ActionEvent e) {
                // Actualizar el texto del JLabel con el valor actual del contador
                jlContadorGlobal.setText(String.valueOf(contadorGlobal++));
                //Comptrobamos si se termino de realizar un proceso con la cantidad de lotes que se requeria
                //Decrementamos el contador de lotes
                if (bandera == 4) {
                    bandera2++;
                    if (0 != contadorLote2) {
                        if (bandera2 == 1) {
                            contadorLote2--;
                            jlLotesPendientes.setText(String.valueOf(contadorLote2));
                        }
                    }
                }

                if (NumeroProcesos == ProcesoEjecucion + 1) {
                    jtEspera.setText("");

                } else {

                    if ((Integer.parseInt(jlLotesPendientes.getText()) == 0) && ultimosP != 0) {

                        if (NumeroProcesos < 5) {
                            procesosPendientes = ultimosP2 - ProcesoEjecucion;
                        }
                        if (NumeroProcesos > 5) {
                            procesosPendientes = (((contadorLote - 1) * 5) + ultimosP3) - ProcesoEjecucion;
                            System.out.println(procesosPendientes);
                        }
                    } else {
                        procesosPendientes = (((contadorLote - Integer.parseInt(jlLotesPendientes.getText())) * 5) - (ProcesoEjecucion + 2));
                    }

                    Object[] procesoActual1 = (Object[]) ProcesosP[ProcesoEjecucion + 1];
                    DecimalFormat dfDosDecimales1 = new DecimalFormat("#.##");
                    String elemento21 = dfDosDecimales1.format(procesoActual1[2]);
                    String elemento41 = dfDosDecimales1.format(procesoActual1[4]);
                    String procesoString1 = "    " + procesoActual1[0] + ". " + procesoActual1[1] + "\n"
                            + "    " + elemento21 + " " + procesoActual1[3] + " " + elemento41 + "\n"
                            + "    TME: " + procesoActual1[6] + "\n\n" + "Procesos Pendientes: "
                            + procesosPendientes;
                    jtEspera.setText(procesoString1);
                }

                if (nuevoValor == 0) {

                    jtEspera.setText("");
                    Object[] procesoActual = (Object[]) ProcesosP[ProcesoEjecucion];
                    DecimalFormat dfDosDecimales = new DecimalFormat("#.##");
                    String elemento2 = dfDosDecimales.format(procesoActual[2]);
                    String elemento4 = dfDosDecimales.format(procesoActual[4]);
                    String elemento5 = dfDosDecimales.format(procesoActual[5]);
                    String procesoString = procesoActual[0] + ". " + procesoActual[1] + "\n"
                            + elemento2 + " " + procesoActual[3] + " " + elemento4 + "\n" + "TME: " + TIME[ProcesoEjecucion] + "\n\n";
                    String procesoString2 = procesoActual[0] + ". " + procesoActual[1] + "\n"
                            + elemento2 + " " + procesoActual[3] + " " + elemento4 + " = " + elemento5
                            + "\n" + "TME: " + TIME[ProcesoEjecucion] + "\n\n";

                    if (ProcesoEjecucion % 5 == 0) {
                        contadorLoteI++;
                        procesoStringTerminados += ("***** Lote " + contadorLoteI + " *****\n");
                        procesoStringTerminados2 += ("***** Lote " + contadorLoteI + " *****\n");
                    }

                    procesoStringTerminados += procesoString2;
                    procesoStringTerminados2 += procesoString;
                    jtTerminados.setText(procesoStringTerminados2);

                    if (NumeroProcesos == ProcesoEjecucion + 1) {
                        RunStop = false;
                    } else {
                        ProcesoEjecucion++;
                    }
                }
                if (nuevoValor >= 0) {

                    Object[] procesoActual = (Object[]) ProcesosP[ProcesoEjecucion];
                    DecimalFormat dfDosDecimales = new DecimalFormat("#.##");
                    String elemento2 = dfDosDecimales.format(procesoActual[2]);
                    String elemento4 = dfDosDecimales.format(procesoActual[4]);
                    String elemento6 = dfDosDecimales.format(procesoActual[6]);
                    String procesoString = "    " + procesoActual[0] + ". " + procesoActual[1] + "\n"
                            + "    " + elemento2 + " " + procesoActual[3] + " " + elemento4 + "\n"
                            + "    TME: " + procesoActual[6] + "\n";

                    jtEjecucion.setText(procesoString);
                    nuevoValor = Integer.parseInt(elemento6) - 1;

                    procesoActual[6] = nuevoValor;
                    if (nuevoValor == 0) {
                        bandera++;
                        if (bandera == 5) {
                            bandera = 0;
                            bandera2 = 0;
                        }

                    }
                }

                if (!RunStop) {
                    jtEjecucion.setText("");
                    jtEspera.setText("");
                    ((Timer) e.getSource()).stop();
                }
            }
        });
        timer.start();
    }

    private void jbGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGenerarActionPerformed
        String texto = jtNumeroProcesos.getText();
        if (texto.isEmpty()) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Ingrese un número entero válido.", "Advertencia.", JOptionPane.WARNING_MESSAGE);
        } else {
            jbGenerar.setEnabled(false);
            jtNumeroProcesos.setEditable(false);

            NumeroProcesos = Integer.parseInt(jtNumeroProcesos.getText());
            GenerarProcesosAleatorios();
            jlLotesPendientes.setText(String.valueOf(contadorLote - 1));
            contadorLote2 = contadorLote - 1;
            ContadorGlobal();
        }
    }//GEN-LAST:event_jbGenerarActionPerformed

    private void GenerarProcesosAleatorios() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt"))) {
            // Inicializar el contador de lote
            for (int i = 0; i < NumeroProcesos; i++) {
                Object[] Proceso = new Object[7];
                Proceso[0] = i + 1;
                Proceso[1] = objetoProceso.generarNombreAleatorio();
                Proceso[2] = objetoProceso.generarNumeroAleatorio();
                Proceso[3] = objetoProceso.obtenerOperadorAleatorio();
                Proceso[4] = objetoProceso.generarNumeroAleatorio();

                // Realiza la operación y asigna el resultado a Procesos[6]
                if (Proceso[3].equals("+")) {
                    Proceso[5] = (double) Proceso[2] + (double) Proceso[4]; // Suma
                } else if (Proceso[3].equals("-")) {
                    Proceso[5] = (double) Proceso[2] - (double) Proceso[4]; // Resta
                } else if (Proceso[3].equals("*")) {
                    Proceso[5] = (double) Proceso[2] * (double) Proceso[4]; // Multiplicación
                } else if (Proceso[3].equals("/")) {
                    Proceso[5] = (double) Proceso[2] / (double) Proceso[4]; // División
                }
                Proceso[6] = objetoProceso.tiempoMaximoEstimado();

                DecimalFormat dfDosDecimales = new DecimalFormat("#.##");
                String elemento2 = dfDosDecimales.format(Proceso[2]);
                String elemento4 = dfDosDecimales.format(Proceso[4]);

                ProcesosP[i] = Proceso;
                // Escribimos las líneas en el archivo
                if (i % 5 == 0) {
                    // Agregar encabezado del lote al archivo
                    writer.write("***** Lote " + contadorLote + " *****\n");
                    //Contador de lotes
                    contadorLote++; // Incrementar el contador de lote
                }
                writer.write(Proceso[0] + ". " + Proceso[1] + "\n");
                writer.write(elemento2 + " " + Proceso[3] + " " + elemento4 + "\n");
                TIME[i] = Proceso[6];
                writer.write("TME: " + Proceso[6] + "\n\n");
            }

        } catch (IOException e) {
        }
    }

    private void jtNumeroProcesosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNumeroProcesosKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || c == java.awt.event.KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            super.processKeyEvent(evt);
        } else {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Ingrese un número entero válido.", "Infomración", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jtNumeroProcesosKeyTyped

    private void jbObtenerResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObtenerResultadosActionPerformed
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Resultados.txt"))) {

            writer.write(procesoStringTerminados);

        } catch (IOException e) {
        }
    }//GEN-LAST:event_jbObtenerResultadosActionPerformed

    public static void main(String args[]) {
        SwingUtilities.invokeLater(Programa::new);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbGenerar;
    private javax.swing.JButton jbObtenerResultados;
    private javax.swing.JLabel jlContadorGlobal;
    private javax.swing.JLabel jlLotesPendientes;
    private javax.swing.JTextArea jtEjecucion;
    private javax.swing.JTextArea jtEspera;
    private javax.swing.JTextField jtNumeroProcesos;
    private javax.swing.JTextArea jtTerminados;
    // End of variables declaration//GEN-END:variables
}
