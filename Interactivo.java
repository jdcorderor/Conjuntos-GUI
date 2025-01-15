package PLogicaSimbolica;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.util.Locale;
import javax.swing.text.*;
/**
 *
 * @author Juan Diego Cordero.
 */
public class Interactivo extends javax.swing.JFrame {
    
    public ArrayList<String> universo;
    public ArrayList<ArrayList<String>> resultados;
    public ArrayList<String> resultado;
    private int tipo = 0;
    private int l = 0;
    private int i = 0;
    private int i0 = 0;
    private int i1 = 0;
    private int band = 0;
    private int band1 = 0;
    private String polinomio = "";
    private String c1 = "", c2 = "";
    private String[] conjuntouniversal;
    private String[] identifiers = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q"};
    public String[][] sets;
    private String[][] data;

    public Interactivo() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        elementosCU.setEnabled(false);
        editCU.setEnabled(false);
        setCU.setEnabled(false);
        subconjuntos.setEnabled(false);
        sizeSC.setEnabled(false);
        elementosSC.setEnabled(false);
        displaySC.setEnabled(false);
        seeSC.setEnabled(false);
        setSC.setEnabled(false);
        discardSC.setEnabled(false);
        setsAvailable1.setEnabled(false);
        setsAvailable2.setEnabled(false);
        unionButton.setEnabled(false);
        interseccionButton.setEnabled(false);
        diferenciaButton.setEnabled(false);
        complementoButton.setEnabled(false);
        doOperation.setEnabled(false);
        clearOperation.setEnabled(false);
        diagram.setEnabled(false);
        allOperations.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        input = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        sizeCU = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        elementosCU = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sizeSC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        subconjuntos = new javax.swing.JTextField();
        editCU = new javax.swing.JButton();
        setCU = new javax.swing.JButton();
        setSC = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        elementosSC = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        seeSC = new javax.swing.JButton();
        displaySC = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        discardSC = new javax.swing.JButton();
        results = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsDisplay = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        setsAvailable1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        unionButton = new javax.swing.JButton();
        interseccionButton = new javax.swing.JButton();
        diferenciaButton = new javax.swing.JButton();
        complementoButton = new javax.swing.JButton();
        displayOperation = new javax.swing.JTextField();
        doOperation = new javax.swing.JButton();
        diagram = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        setsAvailable2 = new javax.swing.JComboBox<>();
        clearOperation = new javax.swing.JButton();
        allOperations = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        input.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 32)); // NOI18N
        jLabel2.setText("Conjunto Universal");

        closeButton.setBackground(new java.awt.Color(255, 204, 102));
        closeButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        closeButton.setText("Salir");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        sizeCU.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        sizeCU.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sizeCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeCUActionPerformed(evt);
            }
        });
        sizeCU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sizeCUKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 32)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Subconjuntos");

        elementosCU.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        elementosCU.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        elementosCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elementosCUActionPerformed(evt);
            }
        });
        elementosCU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                elementosCUKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("N° de elementos del Conjunto Universal");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingrese un elemento:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("N° de elementos del Subconjunto");

        sizeSC.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        sizeSC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sizeSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeSCActionPerformed(evt);
            }
        });
        sizeSC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sizeSCKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ingrese un elemento:");

        subconjuntos.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        subconjuntos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        subconjuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subconjuntosActionPerformed(evt);
            }
        });

        editCU.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        editCU.setText("Editar");
        editCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCUActionPerformed(evt);
            }
        });

        setCU.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        setCU.setText("Cargar");
        setCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setCUActionPerformed(evt);
            }
        });

        setSC.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        setSC.setText("Cargar");
        setSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setSCActionPerformed(evt);
            }
        });

        menuButton.setBackground(new java.awt.Color(255, 204, 102));
        menuButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        menuButton.setText("Menú");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        elementosSC.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        elementosSC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Seleccione" }));
        elementosSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elementosSCActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("N° de Subconjuntos:");

        seeSC.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        seeSC.setText("Ver");
        seeSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeSCActionPerformed(evt);
            }
        });

        displaySC.setEditable(false);
        displaySC.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        displaySC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        displaySC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaySCActionPerformed(evt);
            }
        });
        displaySC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                displaySCKeyTyped(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(255, 204, 102));
        clearButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        clearButton.setText("Limpiar");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        discardSC.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        discardSC.setText("Descartar");
        discardSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardSCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputLayout = new javax.swing.GroupLayout(input);
        input.setLayout(inputLayout);
        inputLayout.setHorizontalGroup(
            inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputLayout.createSequentialGroup()
                        .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(displaySC, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(inputLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(elementosSC, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputLayout.createSequentialGroup()
                        .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputLayout.createSequentialGroup()
                        .addComponent(seeSC)
                        .addGap(18, 18, 18)
                        .addComponent(discardSC, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(setSC)
                        .addGap(95, 95, 95))))
            .addGroup(inputLayout.createSequentialGroup()
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(sizeSC, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputLayout.createSequentialGroup()
                        .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(inputLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(elementosCU, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(inputLayout.createSequentialGroup()
                                .addComponent(editCU)
                                .addGap(18, 18, 18)
                                .addComponent(setCU)
                                .addGap(94, 94, 94))
                            .addGroup(inputLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subconjuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputLayout.createSequentialGroup()
                        .addComponent(sizeCU, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
        );
        inputLayout.setVerticalGroup(
            inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(sizeCU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(elementosCU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setCU)
                    .addComponent(editCU, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(subconjuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sizeSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementosSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(displaySC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seeSC)
                    .addComponent(discardSC)
                    .addComponent(setSC))
                .addGap(70, 70, 70)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(menuButton)
                    .addComponent(clearButton))
                .addGap(41, 41, 41))
        );

        results.setBackground(new java.awt.Color(255, 255, 255));

        resultsDisplay.setEditable(false);
        resultsDisplay.setColumns(20);
        resultsDisplay.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        resultsDisplay.setRows(5);
        jScrollPane1.setViewportView(resultsDisplay);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 32)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Operaciones");

        setsAvailable1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        setsAvailable1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Seleccione" }));
        setsAvailable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setsAvailable1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Conjunto 1:");

        unionButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        unionButton.setText("Unión");
        unionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unionButtonActionPerformed(evt);
            }
        });

        interseccionButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        interseccionButton.setText("Intersección");
        interseccionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interseccionButtonActionPerformed(evt);
            }
        });

        diferenciaButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        diferenciaButton.setText("Diferencia");
        diferenciaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diferenciaButtonActionPerformed(evt);
            }
        });

        complementoButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        complementoButton.setText("Complemento");
        complementoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoButtonActionPerformed(evt);
            }
        });

        displayOperation.setEditable(false);
        displayOperation.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        displayOperation.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        doOperation.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        doOperation.setText("Ejecutar");
        doOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doOperationActionPerformed(evt);
            }
        });

        diagram.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        diagram.setText("Diagrama de Venn");
        diagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagramActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Conjunto 2:");

        setsAvailable2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        setsAvailable2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Seleccione" }));
        setsAvailable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setsAvailable2ActionPerformed(evt);
            }
        });

        clearOperation.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        clearOperation.setText("Limpiar");
        clearOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearOperationActionPerformed(evt);
            }
        });

        allOperations.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        allOperations.setText("Todas las Operaciones");
        allOperations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allOperationsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resultsLayout = new javax.swing.GroupLayout(results);
        results.setLayout(resultsLayout);
        resultsLayout.setHorizontalGroup(
            resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(resultsLayout.createSequentialGroup()
                .addGroup(resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultsLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(resultsLayout.createSequentialGroup()
                                .addComponent(displayOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doOperation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearOperation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diagram))
                            .addGroup(resultsLayout.createSequentialGroup()
                                .addGroup(resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(resultsLayout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(setsAvailable1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(resultsLayout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(setsAvailable2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addComponent(unionButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(interseccionButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diferenciaButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(complementoButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(allOperations)))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        resultsLayout.setVerticalGroup(
            resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultsLayout.createSequentialGroup()
                        .addGroup(resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(setsAvailable1)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(setsAvailable2)))
                    .addGroup(resultsLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diferenciaButton)
                            .addComponent(complementoButton)
                            .addComponent(interseccionButton)
                            .addComponent(unionButton)
                            .addComponent(allOperations))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(displayOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(doOperation)
                        .addComponent(diagram)
                        .addComponent(clearOperation)))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(results, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(results, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void interseccionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interseccionButtonActionPerformed
        tipo = 2;
        polinomio = polinomio + "∩";
        displayOperation.setText(polinomio);
        unionButton.setEnabled(false);
        interseccionButton.setEnabled(false);
        diferenciaButton.setEnabled(false);
        complementoButton.setEnabled(false);
        allOperations.setEnabled(false);
        setsAvailable2.setEnabled(true);
    }//GEN-LAST:event_interseccionButtonActionPerformed

    private void diferenciaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diferenciaButtonActionPerformed
        tipo = 3;
        polinomio = polinomio + "-";
        displayOperation.setText(polinomio);
        unionButton.setEnabled(false);
        interseccionButton.setEnabled(false);
        diferenciaButton.setEnabled(false);
        complementoButton.setEnabled(false);
        allOperations.setEnabled(false);
        setsAvailable2.setEnabled(true);
    }//GEN-LAST:event_diferenciaButtonActionPerformed

    private void unionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unionButtonActionPerformed
        tipo = 1;
        polinomio = polinomio + "U";
        displayOperation.setText(polinomio);
        unionButton.setEnabled(false);
        interseccionButton.setEnabled(false);
        diferenciaButton.setEnabled(false);
        complementoButton.setEnabled(false);
        allOperations.setEnabled(false);
        setsAvailable2.setEnabled(true);  
    }//GEN-LAST:event_unionButtonActionPerformed

    private void setsAvailable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setsAvailable1ActionPerformed
        if (setsAvailable1.getSelectedIndex() != 0) {
            if (setsAvailable1.getSelectedIndex() > data.length - 1) {
                polinomio = polinomio + "(" + String.valueOf(setsAvailable1.getSelectedItem()) + ")";
            } else {
                polinomio = polinomio + String.valueOf(setsAvailable1.getSelectedItem());
            }
            setsAvailable1.setEnabled(false);
            unionButton.setEnabled(true);
            interseccionButton.setEnabled(true);
            diferenciaButton.setEnabled(true);
            complementoButton.setEnabled(true);
            allOperations.setEnabled(true);
            displayOperation.setText(polinomio);
            unionButton.requestFocus();
        }
    }//GEN-LAST:event_setsAvailable1ActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        dispose();
        Main pmain = new Main();
        pmain.setVisible(true);
    }//GEN-LAST:event_menuButtonActionPerformed

    private void sizeCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeCUActionPerformed
        if (!sizeCU.getText().isEmpty()) {
            universo = new ArrayList<>();
            elementosCU.setEnabled(true);
            elementosCU.requestFocus();
            sizeCU.setEnabled(false);
        }
    }//GEN-LAST:event_sizeCUActionPerformed

    private void sizeCUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sizeCUKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') evt.consume();
        if (sizeCU.getText().length() >= 3) evt.consume();
    }//GEN-LAST:event_sizeCUKeyTyped

    private void elementosCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elementosCUActionPerformed
        if (band == 0) {
            if (!elementosCU.getText().isEmpty()) {
                if (!universo.contains(elementosCU.getText())) {
                universo.add(elementosCU.getText());
                    i++;
                    if (i < Integer.parseInt(sizeCU.getText())) {
                        elementosCU.setText(null);
                        elementosCU.requestFocus();
                    } else {
                        elementosCU.setText("Conjunto lleno");
                        elementosCU.setEnabled(false);
                        setCU.setEnabled(true);
                        editCU.setEnabled(true);
                        setCU.requestFocus();
                    }
                } else {
                    elementosCU.setText(null);
                    elementosCU.requestFocus();
                }
            }
        } else {
            String cadena = elementosCU.getText();
            Scanner separar = new Scanner(cadena);
            separar.useDelimiter(",");
            universo.clear();
            while (separar.hasNext()) {
                universo.add(separar.next());
            }
            elementosCU.setText("Conjunto lleno");
            elementosCU.setEnabled(false);
            setCU.setEnabled(true);
            setCU.requestFocus();
        }
    }//GEN-LAST:event_elementosCUActionPerformed

    private void setCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setCUActionPerformed
        String display = "\n\tU = {";
        conjuntouniversal = new String[universo.size()];
        for (int j = 0; j < universo.size(); j++) {
            conjuntouniversal[j] = universo.get(j);
            elementosSC.addItem(universo.get(j));
            display = display + universo.get(j);
            if (j == universo.size() - 1) {
                display = display + "}";
            } else {
                display = display + ", ";
            }
        }
        resultsDisplay.append(display + "\n");
        editCU.setEnabled(false);
        setCU.setEnabled(false);
        subconjuntos.setEnabled(true);
        subconjuntos.requestFocus();
    }//GEN-LAST:event_setCUActionPerformed

    private void editCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCUActionPerformed
        ((AbstractDocument) elementosCU.getDocument()).setDocumentFilter(new avoidDeletion());
        setCU.setEnabled(false);
        band = 1;
        String conjunto = "";
        for (int j = 0; j < universo.size(); j++) {
            conjunto = conjunto + universo.get(j);
            if (j == universo.size() - 1) {
                conjunto = conjunto;
            } else {
                conjunto = conjunto + ",";
            }
        }
        elementosCU.setText(conjunto);
        elementosCU.setEnabled(true);
        elementosCU.requestFocus();
    }//GEN-LAST:event_editCUActionPerformed

    private void elementosSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elementosSCActionPerformed
        displaySC.setText(null);
        if (elementosSC.getSelectedItem().equals("--- Seleccione")) {
            elementosSC.requestFocus();
        } else {
            sets[i0][i1] = String.valueOf(elementosSC.getSelectedItem());
            elementosSC.removeItem(elementosSC.getSelectedItem());
            if (i1 < Integer.parseInt(sets[i0][0])) {
                elementosSC.setSelectedIndex(0);
                elementosSC.requestFocus();
                i1++;
            } else {
                displaySC.setText("Subconjunto lleno");
                elementosSC.setSelectedIndex(0);
                elementosSC.setEnabled(false);
                discardSC.setEnabled(true);
                setSC.setEnabled(true);
                setSC.requestFocus();
                seeSC.setEnabled(true);
                allOperations.setEnabled(false);
            }
        }
    }//GEN-LAST:event_elementosSCActionPerformed

    private void setSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setSCActionPerformed
        seeSC.setEnabled(false);
        displaySC.setEnabled(false);
        String SC = "\n\t";
        SC = SC + identifiers[l] + " = {";
        setsAvailable1.addItem(identifiers[l]);
        setsAvailable2.addItem(identifiers[l]);
        for (int k = 1; k <= Integer.parseInt(sets[i0][0]); k++) {
            SC = SC + String.valueOf(sets[i0][k]);
            if (k == Integer.parseInt(sets[i0][0])) {
                SC = SC + "}";
            } else {
                SC = SC + ", ";
            }
        }
        resultsDisplay.append(SC + "\n");
        l++;
        i0++;
        if (i0 < Integer.parseInt(subconjuntos.getText())) {
            for (int j = 1; j <= Integer.parseInt(sets[i0-1][0]); j++) {
                elementosSC.addItem(sets[i0-1][j]);
            }
            sizeSC.setEnabled(true);
            sizeSC.setText(null);
            elementosSC.setSelectedIndex(0);
            sizeSC.requestFocus();
            setSC.setEnabled(false);
        } else {
            setSC.setEnabled(false);
            setsAvailable1.setEnabled(true);
            setsAvailable1.setSelectedIndex(0);
            setsAvailable1.requestFocus();
            resultados = new ArrayList<>();
            completedMatrixGenerator();
        }
        discardSC.setEnabled(false);
    }//GEN-LAST:event_setSCActionPerformed

    private void elementosCUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elementosCUKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) evt.consume();
    }//GEN-LAST:event_elementosCUKeyTyped

    private void subconjuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subconjuntosActionPerformed
        if (!subconjuntos.getText().isEmpty()) {
            if (Integer.parseInt(subconjuntos.getText()) >= 4) {
                sets = new String[Integer.parseInt(subconjuntos.getText())][(Integer.parseInt(sizeCU.getText())) + 1];
                sizeSC.requestFocus();
                subconjuntos.setEnabled(false);
                sizeSC.setEnabled(true);
            } else {
                subconjuntos.requestFocus();
            }
        }
    }//GEN-LAST:event_subconjuntosActionPerformed

    private void sizeSCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sizeSCKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_sizeSCKeyTyped

    private void sizeSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeSCActionPerformed
        if (!sizeSC.getText().isEmpty()) {
            band1 = 0;
            setSC.setEnabled(false);
            if ((Integer.parseInt(sizeSC.getText()) > 0) && ((Integer.parseInt(sizeSC.getText())) <= (Integer.parseInt(sizeCU.getText())))) {
                sets[i0][0] = sizeSC.getText();
                i1 = 1;
                sizeSC.setEnabled(false);
                displaySC.setEnabled(false);
                displaySC.setText(null);
                elementosSC.setEnabled(true);
                elementosSC.requestFocus();
            } else {
                sizeSC.requestFocus();
            }
        }
    }//GEN-LAST:event_sizeSCActionPerformed

    private void complementoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoButtonActionPerformed
        tipo = 4;
        polinomio = polinomio + "'";
        displayOperation.setText(polinomio);
        unionButton.setEnabled(false);
        interseccionButton.setEnabled(false);
        diferenciaButton.setEnabled(false);
        complementoButton.setEnabled(false);
        allOperations.setEnabled(false);
        displayOperation.setEnabled(false);
        doOperation.setEnabled(true);
        clearOperation.setEnabled(true);
        diagram.setEnabled(true);
        doOperation.requestFocus();
    }//GEN-LAST:event_complementoButtonActionPerformed

    private void doOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doOperationActionPerformed
        if (tipo < 5) {
            if (tipo == 4) {
                c1 = "U";
                c2 = String.valueOf(setsAvailable1.getSelectedItem());
            } else {
                c1 = String.valueOf(setsAvailable1.getSelectedItem());
                c2 = String.valueOf(setsAvailable2.getSelectedItem());
            }
            transferOperation();
            String pythonScript = "modules\\Operations.py";
            String pythonInterpreter = "python";
            try {
                Process process = Runtime.getRuntime().exec(pythonInterpreter + " " + pythonScript);
                process.waitFor();
            } catch (IOException | InterruptedException e) {
                System.err.println("Error executing Python script: " + e.getMessage());
            }
            getResult();
            clearOperation.setEnabled(false);
            diagram.setEnabled(false);
            setsAvailable2.setEnabled(false);
            setsAvailable1.setSelectedIndex(0);
            setsAvailable2.setSelectedIndex(0);
            setsAvailable1.setEnabled(true);
            polinomio = "";
            tipo = 0;
            displayOperation.setText(polinomio);
            doOperation.setEnabled(false);
            setsAvailable1.requestFocus();
        } else {
            transferAll();
            clearOperation.setEnabled(false);
            diagram.setEnabled(false);
            setsAvailable2.setEnabled(false);
            setsAvailable1.setSelectedIndex(0);
            setsAvailable2.setSelectedIndex(0);
            setsAvailable1.setEnabled(true);
            polinomio = "";
            tipo = 0;
            displayOperation.setText(polinomio);
            doOperation.setEnabled(false);
            setsAvailable1.requestFocus();
        }
    }//GEN-LAST:event_doOperationActionPerformed

    private void diagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagramActionPerformed
        if (tipo == 1 || tipo == 2 || tipo == 3 || tipo == 4) {
            if (tipo == 4) {
                c1 = "U";
                c2 = String.valueOf(setsAvailable1.getSelectedItem());
            } else {
                c1 = String.valueOf(setsAvailable1.getSelectedItem());
                c2 = String.valueOf(setsAvailable2.getSelectedItem());
            }
            transferOperation();
            String pythonScript = "modules\\Venn.py";
            String pythonInterpreter = "python";
            try {
                Process process = Runtime.getRuntime().exec(pythonInterpreter + " " + pythonScript);
                process.waitFor();
            } catch (IOException | InterruptedException e) {
                System.err.println("Error executing Python script: " + e.getMessage());
            }
        } else if (tipo == 5) {
            String set1 = "", set2 = "", set3 = "";
            int i = 0;
            for (int x = 0; x < data[0].length - 1; x++) {
                if (x == (data[0].length - 2)) {
                    set1 = set1 + data[0][x];
                } else {
                    set1 = set1 + data[0][x] + ",";
                }
            }
            if (setsAvailable1.getSelectedIndex() <= sets.length) {
                i = setsAvailable1.getSelectedIndex();
                set2 = set2 + data[i][0] + ",";
                for (int x = 0; x < Integer.parseInt(data[i][1]); x++) {
                    if (x == (Integer.parseInt(data[i][1]) - 1)) {
                        set2 = set2 + data[i][x + 2];
                    } else {
                        set2 = set2 + data[i][x + 2] + ",";
                    }
                }
            } else {
                i = setsAvailable1.getSelectedIndex() - data.length; 
                String vector[] = new String[resultados.get(i).size()];
                for (int j = 0; j < resultados.get(i).size(); j++) {
                    vector[j] = resultados.get(i).get(j);
                    if (j == (resultados.get(i).size() - 1)) {
                        set2 = set2 + vector[j];
                    } else {
                        set2 = set2 + vector[j] + ",";
                    }
                }
            }
            if (setsAvailable2.getSelectedIndex() <= sets.length) {
                i = setsAvailable2.getSelectedIndex();
                set3 = set3 + data[i][0] + ",";
                for (int x = 0; x < Integer.parseInt(data[i][1]); x++) {
                    if (x == (Integer.parseInt(data[i][1]) - 1)) {
                        set3 = set3 + data[i][x + 2];
                    } else {
                        set3 = set3 + data[i][x + 2] + ",";
                    }
                }
            } else {
                i = setsAvailable2.getSelectedIndex() - data.length; 
                String vector[] = new String[resultados.get(i).size()];
                for (int j = 0; j < resultados.get(i).size(); j++) {
                    vector[j] = resultados.get(i).get(j);
                    if (j == (resultados.get(i).size() - 1)) {
                        set3 = set3 + vector[j];
                    } else {
                        set3 = set3 + vector[j] + ",";
                    }
                }
            }
            try (FileWriter writer = new FileWriter("Venn3.txt")) {
                writer.write(set1 + "\n");
                writer.write(set2 + "\n");
                writer.write(set3);
                writer.close();
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
            String pythonScript = "modules\\VennAll.py";
            String pythonInterpreter = "python";
            try {
                Process process = Runtime.getRuntime().exec(pythonInterpreter + " " + pythonScript);
                process.waitFor();
            } catch (IOException | InterruptedException e) {
                System.err.println("Error executing Python script: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_diagramActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        dispose();
        Interactivo pi = new Interactivo();
        pi.setVisible(true);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void seeSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeSCActionPerformed
        seeSC.setEnabled(false);
        band1 = 1;
        String subconjunto = "";
        for (int j = 1; j <= Integer.parseInt(sets[i0][0]); j++) {
            subconjunto = subconjunto + sets[i0][j];
            if (j == (Integer.parseInt(sets[i0][0]))) {
                subconjunto = subconjunto;
            } else {
                subconjunto = subconjunto + ",";
            }
        }
        displaySC.setText(subconjunto);
        displaySC.setEnabled(false);
        displaySC.requestFocus();
    }//GEN-LAST:event_seeSCActionPerformed

    private void displaySCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaySCActionPerformed
        if (band1 == 1) {
            setSC.setEnabled(true);
        }
    }//GEN-LAST:event_displaySCActionPerformed

    private void displaySCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_displaySCKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) evt.consume();
    }//GEN-LAST:event_displaySCKeyTyped

    private void discardSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardSCActionPerformed
        for (int j = 1; j <= Integer.parseInt(sets[i0][0]); j++) {
            elementosSC.addItem(sets[i0][j]);
            sets[i0][j] = "0";
        }
        sets[i0][0] = "0";
        elementosSC.setSelectedIndex(0);
        discardSC.setEnabled(false);
        setSC.setEnabled(false);
        sizeSC.setText(null);
        sizeSC.setEnabled(true);
        sizeSC.requestFocus();
    }//GEN-LAST:event_discardSCActionPerformed

    private void setsAvailable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setsAvailable2ActionPerformed
        if (setsAvailable2.getSelectedIndex() != 0) {
            if (setsAvailable2.getSelectedIndex() > data.length - 1) {
                polinomio = polinomio + "(" + String.valueOf(setsAvailable2.getSelectedItem()) + ")";
            } else {
                polinomio = polinomio + String.valueOf(setsAvailable2.getSelectedItem());
            }
            setsAvailable2.setEnabled(false);
            displayOperation.setText(polinomio);
            doOperation.setEnabled(true);
            clearOperation.setEnabled(true);
            diagram.setEnabled(true);
            doOperation.requestFocus();
        }
    }//GEN-LAST:event_setsAvailable2ActionPerformed

    private void clearOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearOperationActionPerformed
        polinomio = "";
        tipo = 0;
        displayOperation.setText(polinomio);
        displayOperation.setEnabled(true);
        doOperation.setEnabled(false);
        clearOperation.setEnabled(false);
        diagram.setEnabled(false);
        setsAvailable1.setSelectedIndex(0);
        setsAvailable2.setSelectedIndex(0);
        setsAvailable1.setEnabled(true);
        setsAvailable1.requestFocus();
    }//GEN-LAST:event_clearOperationActionPerformed

    private void allOperationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allOperationsActionPerformed
        tipo = 5;
        polinomio = polinomio + " (U, ∩, -, ') ";
        displayOperation.setText(polinomio);
        displayOperation.setEnabled(true);
        unionButton.setEnabled(false);
        interseccionButton.setEnabled(false);
        complementoButton.setEnabled(false);
        diferenciaButton.setEnabled(false);
        allOperations.setEnabled(false);
        setsAvailable2.setEnabled(true);
        setsAvailable2.requestFocus();
    }//GEN-LAST:event_allOperationsActionPerformed

    public void completedMatrixGenerator() {
        data = new String[(sets.length) + 1][(conjuntouniversal.length) + 2];
        data[0][0] = "U";   
        for (int columna = 0; columna < data[0].length - 2; columna++) {
            data[0][columna + 1] = conjuntouniversal[columna];
        }
        for (int fila = 1; fila < data.length; fila++) {
            for (int columna = 1; columna < data[fila].length; columna++) {
                data[fila][0] = identifiers[fila - 1];
                data[fila][columna] = sets[fila - 1][columna - 1];
            }
        }
    }
    
    public void transferOperation() {
        String temp, registro1 = "", registro2 = "";
        int j1, j2;
        if ((setsAvailable1.getSelectedIndex() <= sets.length) && (setsAvailable2.getSelectedIndex() <= sets.length)) {
            for (int j = 0; j < data.length; j++) {
                temp = data[j][0];
                if (temp.equals(c1)) {
                    registro1 = "";
                    j1 = j;
                    if (j1 == 0) {
                        for (int x = 0; x < data[j1].length - 1; x++) {
                            if (x == (data[j1].length - 2)) {
                                registro1 = registro1 + data[j1][x];
                            } else {
                                registro1 = registro1 + data[j1][x] + ",";
                            }
                        }
                    } else {
                        registro1 = registro1 + c1 + ",";
                        for (int x = 0; x < Integer.parseInt(data[j1][1]); x++) {
                            if (x == (Integer.parseInt(data[j1][1]) - 1)) {
                                registro1 = registro1 + data[j1][x + 2];
                            } else {
                                registro1 = registro1 + data[j1][x + 2] + ",";
                            }
                        }
                    }

                }
                if (temp.equals(c2)) {
                    j2 = j;
                    registro2 = "";
                    registro2 = registro2 + c2 + ",";
                    for (int x = 0; x < Integer.parseInt(data[j2][1]); x++) {
                        if (x == (Integer.parseInt(data[j2][1]) - 1)) {
                            registro2 = registro2 + data[j2][x + 2];
                        } else {
                            registro2 = registro2 + data[j2][x + 2] + ",";
                        }
                    }
                }
            }
        } else if ((setsAvailable1.getSelectedIndex() > sets.length) && (setsAvailable2.getSelectedIndex() <= sets.length)) {
            if (tipo == 4) {
                for (int j = 0; j < data.length; j++) {
                    temp = data[j][0];
                    if (temp.equals(c1)) {
                        registro1 = "";
                        j1 = j;
                        if (j1 == 0) {
                            for (int x = 0; x < data[j1].length - 1; x++) {
                                if (x == (data[j1].length - 2)) {
                                    registro1 = registro1 + data[j1][x];
                                } else {
                                    registro1 = registro1 + data[j1][x] + ",";
                                }
                            }
                        }
                    }
                }
                int index = setsAvailable1.getSelectedIndex() - data.length;
                registro2 = "";
                String vector[] = new String[resultados.get(index).size()];
                for (int j = 0; j < resultados.get(index).size(); j++) {
                    vector[j] = resultados.get(index).get(j);
                    if (j == (resultados.get(index).size() - 1)) {
                        registro2 = registro2 + vector[j];
                    } else {
                        registro2 = registro2 + vector[j] + ",";
                    }
                }
            } else {
                int index = setsAvailable1.getSelectedIndex() - data.length;
                registro1 = "";
                String vector[] = new String[resultados.get(index).size()];
                for (int j = 0; j < resultados.get(index).size(); j++) {
                    vector[j] = resultados.get(index).get(j);
                    if (j == (resultados.get(index).size() - 1)) {
                        registro1 = registro1 + vector[j];
                    } else {
                        registro1 = registro1 + vector[j] + ",";
                    }
                }
                for (int j = 0; j < data.length; j++) {
                    temp = data[j][0];
                    if (temp.equals(c2)) {
                        j2 = j;
                        registro2 = "";
                        registro2 = registro2 + c2 + ",";
                        for (int x = 0; x < Integer.parseInt(data[j2][1]); x++) {
                            if (x == (Integer.parseInt(data[j2][1]) - 1)) {
                                registro2 = registro2 + data[j2][x + 2];
                            } else {
                                registro2 = registro2 + data[j2][x + 2] + ",";
                            }
                        }
                    }    
                }
            }
        } else if ((setsAvailable1.getSelectedIndex() <= sets.length) && (setsAvailable2.getSelectedIndex() > sets.length)) {
            for (int j = 0; j < data.length; j++) {
                temp = data[j][0];
                if (temp.equals(c1)) {
                    registro1 = "";
                    j1 = j;
                    if (j1 == 0) {
                        for (int x = 0; x < data[j1].length - 1; x++) {
                            if (x == (data[j1].length - 2)) {
                                registro1 = registro1 + data[j1][x];
                            } else {
                                registro1 = registro1 + data[j1][x] + ",";
                            }
                        }
                    } else {
                        registro1 = registro1 + c1 + ",";
                        for (int x = 0; x < Integer.parseInt(data[j1][1]); x++) {
                            if (x == (Integer.parseInt(data[j1][1]) - 1)) {
                                registro1 = registro1 + data[j1][x + 2];
                            } else {
                                registro1 = registro1 + data[j1][x + 2] + ",";
                            }
                        }
                    }
                }
            }
            int index = setsAvailable2.getSelectedIndex() - data.length;
            registro2 = "";
            String vector[] = new String[resultados.get(index).size()];
            for (int j = 0; j < resultados.get(index).size(); j++) {
                vector[j] = resultados.get(index).get(j);
                if (j == (resultados.get(index).size() - 1)) {
                    registro2 = registro2 + vector[j];
                } else {
                    registro2 = registro2 + vector[j] + ",";
                }
            }
        } else if ((setsAvailable1.getSelectedIndex() > sets.length) && (setsAvailable2.getSelectedIndex() > sets.length)) {
            int index = setsAvailable1.getSelectedIndex() - data.length;
            registro1 = "";
            String vector[] = new String[resultados.get(index).size()];
            for (int j = 0; j < resultados.get(index).size(); j++) {
                vector[j] = resultados.get(index).get(j);
                if (j == (resultados.get(index).size() - 1)) {
                    registro1 = registro1 + vector[j];
                } else {
                    registro1 = registro1 + vector[j] + ",";
                }
            }
            index = setsAvailable2.getSelectedIndex() - data.length;
            registro2 = "";
            vector = new String[resultados.get(index).size()];
            for (int j = 0; j < resultados.get(index).size(); j++) {
                vector[j] = resultados.get(index).get(j);
                if (j == (resultados.get(index).size() - 1)) {
                    registro2 = registro2 + vector[j];
                } else {
                    registro2 = registro2 + vector[j] + ",";
                }
            }
        }
        try (FileWriter writer = new FileWriter("Operation.txt")) {
            writer.write(String.valueOf(tipo) + "," + polinomio + "\n");
            writer.write(registro1 + "\n");
            writer.write(registro2 + "\n");
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
    
    public void transferAll() {
        String set1 = "", set2 = "", set3 = "";
        int i = 0;
        String pythonScript = "modules\\Operations.py";
        String pythonInterpreter = "python";
        for (int x = 0; x < data[0].length - 1; x++) {
            if (x == (data[0].length - 2)) {
                set1 = set1 + data[0][x];
            } else {
                set1 = set1 + data[0][x] + ",";
            }
        }
        if (setsAvailable1.getSelectedIndex() <= sets.length) {
            i = setsAvailable1.getSelectedIndex();
            set2 = set2 + data[i][0] + ",";
            for (int x = 0; x < Integer.parseInt(data[i][1]); x++) {
                if (x == (Integer.parseInt(data[i][1]) - 1)) {
                    set2 = set2 + data[i][x + 2];
                } else {
                    set2 = set2 + data[i][x + 2] + ",";
                }
            }
        } else {
            i = setsAvailable1.getSelectedIndex() - data.length; 
            String vector[] = new String[resultados.get(i).size()];
            for (int j = 0; j < resultados.get(i).size(); j++) {
                vector[j] = resultados.get(i).get(j);
                if (j == (resultados.get(i).size() - 1)) {
                    set2 = set2 + vector[j];
                } else {
                    set2 = set2 + vector[j] + ",";
                }
            }
        }
        if (setsAvailable2.getSelectedIndex() <= sets.length) {
            i = setsAvailable2.getSelectedIndex();
            set3 = set3 + data[i][0] + ",";
            for (int x = 0; x < Integer.parseInt(data[i][1]); x++) {
                if (x == (Integer.parseInt(data[i][1]) - 1)) {
                    set3 = set3 + data[i][x + 2];
                } else {
                    set3 = set3 + data[i][x + 2] + ",";
                }
            }
        } else {
            i = setsAvailable2.getSelectedIndex() - data.length; 
            String vector[] = new String[resultados.get(i).size()];
            for (int j = 0; j < resultados.get(i).size(); j++) {
                vector[j] = resultados.get(i).get(j);
                if (j == (resultados.get(i).size() - 1)) {
                    set3 = set3 + vector[j];
                } else {
                    set3 = set3 + vector[j] + ",";
                }
            }
        }
        String conjunto1, conjunto2;
        if (setsAvailable1.getSelectedIndex() > data.length - 1) {
            conjunto1 = "(" + String.valueOf(setsAvailable1.getSelectedItem()) + ")";
        } else {
            conjunto1 = String.valueOf(setsAvailable1.getSelectedItem());
        }
        if (setsAvailable2.getSelectedIndex() > data.length - 1) {
            conjunto2 = "(" + String.valueOf(setsAvailable2.getSelectedItem()) + ")";
        } else {
            conjunto2 = String.valueOf(setsAvailable2.getSelectedItem());
        }
        // Unión.
        tipo = 1;
        polinomio = conjunto1 + "U" + conjunto2;
        try (FileWriter writer = new FileWriter("Operation.txt")) {
            writer.write(String.valueOf(tipo) + "," + polinomio + "\n");
            writer.write(set2 + "\n");
            writer.write(set3 + "\n");
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        try {
            Process process = Runtime.getRuntime().exec(pythonInterpreter + " " + pythonScript);
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            System.err.println("Error executing Python script: " + e.getMessage());
        }
        getResult();
        polinomio = "";
        // Intersección.
        tipo = 2;
        polinomio = conjunto1 + "∩" + conjunto2;
        try (FileWriter writer = new FileWriter("Operation.txt")) {
            writer.write(String.valueOf(tipo) + "," + polinomio + "\n");
            writer.write(set2 + "\n");
            writer.write(set3 + "\n");
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        try {
            Process process = Runtime.getRuntime().exec(pythonInterpreter + " " + pythonScript);
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            System.err.println("Error executing Python script: " + e.getMessage());
        }
        getResult();
        polinomio = "";
        // Diferencia 1.
        tipo = 3;
        polinomio = conjunto1 + "-" + conjunto2;
        try (FileWriter writer = new FileWriter("Operation.txt")) {
            writer.write(String.valueOf(tipo) + "," + polinomio + "\n");
            writer.write(set2 + "\n");
            writer.write(set3 + "\n");
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        try {
            Process process = Runtime.getRuntime().exec(pythonInterpreter + " " + pythonScript);
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            System.err.println("Error executing Python script: " + e.getMessage());
        }
        getResult();
        polinomio = "";
        // Diferencia 2.
        tipo = 3;
        polinomio = conjunto2 + "-" + conjunto1;
        try (FileWriter writer = new FileWriter("Operation.txt")) {
            writer.write(String.valueOf(tipo) + "," + polinomio + "\n");
            writer.write(set3 + "\n");
            writer.write(set2 + "\n");
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        try {
            Process process = Runtime.getRuntime().exec(pythonInterpreter + " " + pythonScript);
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            System.err.println("Error executing Python script: " + e.getMessage());
        }
        getResult();
        polinomio = "";
        // Complemento 1.            
        tipo = 4;
        polinomio = conjunto1 + "'";
        try (FileWriter writer = new FileWriter("Operation.txt")) {
            writer.write(String.valueOf(tipo) + "," + polinomio + "\n");
            writer.write(set1 + "\n");
            writer.write(set2 + "\n");
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        try {
            Process process = Runtime.getRuntime().exec(pythonInterpreter + " " + pythonScript);
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            System.err.println("Error executing Python script: " + e.getMessage());
        }
        getResult();
        polinomio = "";
        // Complemento 2.
        tipo = 4;
        polinomio = conjunto2 + "'";
        try (FileWriter writer = new FileWriter("Operation.txt")) {
            writer.write(String.valueOf(tipo) + "," + polinomio + "\n");
            writer.write(set1 + "\n");
            writer.write(set3 + "\n");
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        try {
            Process process = Runtime.getRuntime().exec(pythonInterpreter + " " + pythonScript);
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            System.err.println("Error executing Python script: " + e.getMessage());
        }
        getResult();
        polinomio = "";
    }
    
    public void getResult() {
        resultado = new ArrayList<>();
        int iteracion = 0;
        String r = "\n\t";
        try (Scanner archivo = new Scanner(new File("Result.txt"))) {        
            while (archivo.hasNextLine()) {
                if (iteracion == 0) {
                    r = r + archivo.nextLine() + "\n";
                    resultsDisplay.append(r);
                    iteracion++;
                }
            }
            archivo.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        try (Scanner archivo = new Scanner(new File("ArrayList.txt"))) {        
            while (archivo.hasNextLine()) {
                if (iteracion == 1) {
                    String linea = archivo.nextLine();
                    Scanner separar = new Scanner(linea);
                    separar.useDelimiter(",");
                    separar.useLocale(Locale.US);
                    while (separar.hasNext()) {
                        resultado.add(separar.next());
                    }
                    setsAvailable1.addItem(resultado.get(0));
                    setsAvailable2.addItem(resultado.get(0));
                    resultados.add(resultado);
                    iteracion--;
                }
            }
            archivo.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
    
    public class avoidDeletion extends DocumentFilter {
        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            super.insertString(fb, offset, string, attr);
        }

        @Override
        public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
            Document doc = fb.getDocument();
            String text = doc.getText(0, doc.getLength());
            if (offset < text.length() && text.charAt(offset) == ',') {
                return; 
            }
            super.remove(fb, offset, length);
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (length > 0 && offset < fb.getDocument().getLength() && fb.getDocument().getText(offset, 1).equals(",")) {
                return; 
            }
            super.replace(fb, offset, length, text, attrs);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interactivo().setVisible(true);
            }  
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allOperations;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton clearOperation;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton complementoButton;
    private javax.swing.JButton diagram;
    private javax.swing.JButton diferenciaButton;
    private javax.swing.JButton discardSC;
    private javax.swing.JTextField displayOperation;
    private javax.swing.JTextField displaySC;
    private javax.swing.JButton doOperation;
    private javax.swing.JButton editCU;
    private javax.swing.JTextField elementosCU;
    private javax.swing.JComboBox<String> elementosSC;
    private javax.swing.JPanel input;
    private javax.swing.JButton interseccionButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menuButton;
    private javax.swing.JPanel results;
    private javax.swing.JTextArea resultsDisplay;
    private javax.swing.JButton seeSC;
    private javax.swing.JButton setCU;
    private javax.swing.JButton setSC;
    private javax.swing.JComboBox<String> setsAvailable1;
    private javax.swing.JComboBox<String> setsAvailable2;
    private javax.swing.JTextField sizeCU;
    private javax.swing.JTextField sizeSC;
    private javax.swing.JTextField subconjuntos;
    private javax.swing.JButton unionButton;
    // End of variables declaration//GEN-END:variables
}
