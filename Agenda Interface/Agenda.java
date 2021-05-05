package q2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Agenda extends javax.swing.JFrame {
    static LinkedList<Task> tarefasTODO = new LinkedList<Task>();
    static LinkedList<Task> tarefasDOING = new LinkedList<Task>();
    static LinkedList<Task> tarefasDONE= new LinkedList<Task>();
    static LinkedList<Task> tarefas= new LinkedList<Task>();
    static LinkedList<Appointment> encontros = new LinkedList<Appointment>();
    static LinkedList<Memo> memorandos = new LinkedList<Memo>();
    String meet;
    String pessoas;
    String shortDescription;
    String data;
    String hora;
    Boolean condition;
    Calendar deadline = Calendar.getInstance();
    int td=0;int dg=0;int dn=0;
    String aa;
    public Agenda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TabelaTODO = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TabelaDOING = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        TabelaDONE = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        memoTable = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        encTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        DataT = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        HoraT = new javax.swing.JFormattedTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        DescT = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FreeT = new javax.swing.JRadioButton();
        BlockedT = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        todo = new javax.swing.JRadioButton();
        doing = new javax.swing.JRadioButton();
        done = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        pessoasE = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        localE = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        dataE = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        horaE = new javax.swing.JFormattedTextField();
        freeE = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        blockedE = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        descM = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        freeM = new javax.swing.JRadioButton();
        blockedM = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");
        setBackground(new java.awt.Color(153, 153, 153));
        setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N

        TabelaTODO.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        TabelaTODO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaTODO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaTODO.setDragEnabled(true);
        TabelaTODO.setMinimumSize(new java.awt.Dimension(30, 160));
        TabelaTODO.setName(""); // NOI18N
        TabelaTODO.setRowHeight(30);
        TabelaTODO.setRowMargin(10);
        TabelaTODO.setRowSelectionAllowed(false);
        TabelaTODO.getTableHeader().setReorderingAllowed(false);
        TabelaTODO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaTODOMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(TabelaTODO);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("TODO", jPanel3);

        TabelaDOING.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        TabelaDOING.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaDOING.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaDOING.setDragEnabled(true);
        TabelaDOING.setMinimumSize(new java.awt.Dimension(30, 160));
        TabelaDOING.setName(""); // NOI18N
        TabelaDOING.setRowHeight(30);
        TabelaDOING.setRowMargin(10);
        TabelaDOING.getTableHeader().setReorderingAllowed(false);
        TabelaDOING.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaDOINGMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(TabelaDOING);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("DOING", jPanel2);

        TabelaDONE.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        TabelaDONE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaDONE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaDONE.setDragEnabled(true);
        TabelaDONE.setMinimumSize(new java.awt.Dimension(30, 160));
        TabelaDONE.setName(""); // NOI18N
        TabelaDONE.setRowHeight(30);
        TabelaDONE.setRowMargin(10);
        TabelaDONE.getTableHeader().setReorderingAllowed(false);
        TabelaDONE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaDONEMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(TabelaDONE);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("DONE", jPanel4);

        memoTable.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        memoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        memoTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        memoTable.setDragEnabled(true);
        memoTable.setMinimumSize(new java.awt.Dimension(30, 160));
        memoTable.setName(""); // NOI18N
        memoTable.setRowHeight(30);
        memoTable.setRowMargin(10);
        memoTable.getTableHeader().setReorderingAllowed(false);
        memoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memoTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(memoTable);

        encTable.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        encTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Local de Encontro", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        encTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        encTable.setDragEnabled(true);
        encTable.setMinimumSize(new java.awt.Dimension(30, 160));
        encTable.setName(""); // NOI18N
        encTable.setRowHeight(30);
        encTable.setRowMargin(10);
        encTable.getTableHeader().setReorderingAllowed(false);
        encTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encTableMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(encTable);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TAREFAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N

        try {
            DataT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DataT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataTActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hora");

        try {
            HoraT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        HoraT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraTActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(DescT);

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Descrição");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Condição");

        FreeT.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        FreeT.setForeground(new java.awt.Color(255, 255, 255));
        FreeT.setText("Free");
        FreeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FreeTActionPerformed(evt);
            }
        });

        BlockedT.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        BlockedT.setForeground(new java.awt.Color(255, 255, 255));
        BlockedT.setText("Blocked");
        BlockedT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlockedTActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jButton1.setText("INSERIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Status");

        todo.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        todo.setForeground(new java.awt.Color(255, 255, 255));
        todo.setText("TODO");
        todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todoActionPerformed(evt);
            }
        });

        doing.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        doing.setForeground(new java.awt.Color(255, 255, 255));
        doing.setText("DOING");
        doing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doingActionPerformed(evt);
            }
        });

        done.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        done.setForeground(new java.awt.Color(255, 255, 255));
        done.setText("DONE");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(FreeT)
                        .addGap(18, 18, 18)
                        .addComponent(BlockedT)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DataT, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(HoraT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(todo)
                        .addGap(18, 18, 18)
                        .addComponent(doing)
                        .addGap(18, 18, 18)
                        .addComponent(done)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HoraT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(todo)
                    .addComponent(doing)
                    .addComponent(done))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FreeT)
                    .addComponent(BlockedT))
                .addGap(9, 9, 9)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENCONTROS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pessoas");

        pessoasE.setName(""); // NOI18N
        jScrollPane6.setViewportView(pessoasE);

        jButton2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jButton2.setText("INSERIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Local de Encontro");

        localE.setName(""); // NOI18N
        jScrollPane7.setViewportView(localE);

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data");

        try {
            dataE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Hora");

        try {
            horaE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        horaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaEActionPerformed(evt);
            }
        });

        freeE.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        freeE.setForeground(new java.awt.Color(255, 255, 255));
        freeE.setText("Free");
        freeE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freeEActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Status");

        blockedE.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        blockedE.setForeground(new java.awt.Color(255, 255, 255));
        blockedE.setText("Blocked");
        blockedE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockedEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(35, 35, 35))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(dataE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(horaE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel11)))
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(freeE)
                        .addGap(18, 18, 18)
                        .addComponent(blockedE))
                    .addComponent(jLabel12))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(blockedE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(freeE))
                .addContainerGap())
        );

        jScrollPane6.getAccessibleContext().setAccessibleDescription("Formato-> nome,nome,...,nome");

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MEMORANDOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descrição");

        jButton3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jButton3.setText("INSERIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane11.setViewportView(descM);

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Status");

        freeM.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        freeM.setForeground(new java.awt.Color(255, 255, 255));
        freeM.setText("Free");
        freeM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freeMActionPerformed(evt);
            }
        });

        blockedM.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        blockedM.setForeground(new java.awt.Color(255, 255, 255));
        blockedM.setText("Blocked");
        blockedM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockedMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(22, 22, 22))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(freeM)
                        .addGap(18, 18, 18)
                        .addComponent(blockedM)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(blockedM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(freeM)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DataTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataTActionPerformed

    private void HoraTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraTActionPerformed

    private void BlockedTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlockedTActionPerformed
        if(BlockedT.isSelected()){
           FreeT.setSelected(false);
       }
    }//GEN-LAST:event_BlockedTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        shortDescription = DescT.getText();
        data = DataT.getText();
        hora = HoraT.getText();
        if(FreeT.isSelected())
        {condition = false;}
        if(BlockedT.isSelected())
        {condition = true;}
        String split[] = data.split("/");
        Boolean d = false, m = false, y = false;
                while(d!=true || m!=true || y!=true)
                {
                  if((Integer.parseInt(split[0]) - 31) <= 0 && (Integer.parseInt(split[0]) - 31) >= -30)d = true;
                  else
                  {
                    split[0] = JOptionPane.showInputDialog(null, "*Valor inválido para o dia*\nInforme o dia novamente: (Formato -> dd)");
                    d = false;
                  }
                  if((Integer.parseInt(split[1]) - 12) <=0 && (Integer.parseInt(split[1]) - 12) >= -11)m = true;
                  else
                  {
                    split[1] = JOptionPane.showInputDialog(null, "*Valor inválido para o mês*\nInforme o mês novamente: (Formato -> mm)");
                    m = false;
                  }
                  if((Integer.parseInt(split[2]) - 2021) == 0)y = true;
                  else
                  {
                    split[2] = JOptionPane.showInputDialog(null, "*Valor inválido para o ano*\nInforme o ano novamente: (Formato -> yyyy)");
                    y = false;
                  }
                }
                String aux = split[0] + split[1] + split[2];
                DataT.setText(aux);
                
                String hour[] = hora.split(":");
                d = false;
                y = false;
                while(d!=true || y!=true)
                {
                  if((Integer.parseInt(hour[0]) - 23) <= 0 && (Integer.parseInt(hour[0]) - 23) >= -23)d=true;
                  else
                  {
                    hour[0] = JOptionPane.showInputDialog(null, "*Valor inválido para a hora*\nInforme a hora novamente: (Formato -> hh)");
                    d = false;
                  }
                  if((Integer.parseInt(hour[1]) - 59) <= 0 && (Integer.parseInt(hour[1]) - 59) >= -59)y=true;
                  else
                  {
                    hour[1] = JOptionPane.showInputDialog(null, "*Valor inválido para os minutos*\nInforme os minutos novamente: (Formato -> mm)");
                  }
                }
                
                if(todo.isSelected()){tarefasTODO.add(new Task(shortDescription,split,hour,condition,"TO-DO"));}
                else if(doing.isSelected()){tarefasDOING.add(new Task(shortDescription,split,hour,condition,"DOING"));}
                else if(done.isSelected()){tarefasDONE.add(new Task(shortDescription,split,hour,condition,"DONE"));}
                else
                {tarefasTODO.add(new Task(shortDescription,split,hour,condition,"TO-DO"));}
                
                DataT.setText("");
                HoraT.setText("");
                DescT.setText("");
                if(BlockedT.isSelected()){
                BlockedT.setSelected(false);
                }
                if(FreeT.isSelected()){
                FreeT.setSelected(false);
                }    
                if(todo.isSelected()){
                todo.setSelected(false);
                }
                if(doing.isSelected()){
                doing.setSelected(false);
                }
                if(done.isSelected()){
                done.setSelected(false);
                }
               
                
                DefaultTableModel todo = (DefaultTableModel)TabelaTODO.getModel();
                DefaultTableModel doing = (DefaultTableModel)TabelaDOING.getModel();
                DefaultTableModel done = (DefaultTableModel)TabelaDONE.getModel();
                todo.setNumRows(0);
                doing.setNumRows(0);
                done.setNumRows(0);
                    for(Task td:tarefasTODO){
                    
                    todo.addRow(new Object[]{
                    td.getShortDescription(),
                    td.getDeadLine()
                    });
                    }
                    for(Task dg:tarefasDOING){
                    doing.addRow(new Object[]{
                    dg.getShortDescription(),
                    dg.getDeadLine()
                    });
                    }
                    for(Task dn:tarefasDONE){
                    done.addRow(new Object[]{
                    dn.getShortDescription(),
                    dn.getDeadLine()
                    });
                    }
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    pessoas = pessoasE.getText();
    meet = localE.getText();
    data = dataE.getText();
    hora = horaE.getText();
    if(freeE.isSelected())
    {condition = false;}
    if(blockedE.isSelected())
    {condition = true;}
    String split[] = data.split("/");
        Boolean d = false, m = false, y = false;
                while(d!=true || m!=true || y!=true)
                {
                  if((Integer.parseInt(split[0]) - 31) <= 0 && (Integer.parseInt(split[0]) - 31) >= -30)d = true;
                  else
                  {
                    split[0] = JOptionPane.showInputDialog(null, "*Valor inválido para o dia*\nInforme o dia novamente: (Formato -> dd)");
                    d = false;
                  }
                  if((Integer.parseInt(split[1]) - 12) <=0 && (Integer.parseInt(split[1]) - 12) >= -11)m = true;
                  else
                  {
                    split[1] = JOptionPane.showInputDialog(null, "*Valor inválido para o mês*\nInforme o mês novamente: (Formato -> mm)");
                    m = false;
                  }
                  if((Integer.parseInt(split[2]) - 2021) == 0)y = true;
                  else
                  {
                    split[2] = JOptionPane.showInputDialog(null, "*Valor inválido para o ano*\nInforme o ano novamente: (Formato -> yyyy)");
                    y = false;
                  }
                }
                String aux = split[0] + split[1] + split[2];
                dataE.setText(aux);
                
                String hour[] = hora.split(":");
                d = false;
                y = false;
                while(d!=true || y!=true)
                {
                  if((Integer.parseInt(hour[0]) - 18) <= 0 && (Integer.parseInt(hour[0]) - 8) >= 0)d=true;
                  else
                  {
                    hour[0] = JOptionPane.showInputDialog(null, "*Valor inválido para a hora*\nInforme a hora novamente: (Formato -> hh)");
                    d = false;
                  }
                  if((Integer.parseInt(hour[1]) - 59) <= 0 && (Integer.parseInt(hour[1]) - 59) >= -59)y=true;
                  else
                  {
                    hour[1] = JOptionPane.showInputDialog(null, "*Valor inválido para os minutos*\nInforme os minutos novamente: (Formato -> mm)");
                    y = false;
                  }
                }
                encontros.add(new Appointment(pessoas,meet,split, hour, condition));
                
                pessoasE.setText("");
                dataE.setText("");
                horaE.setText("");
                localE.setText("");
                if(blockedE.isSelected()){
                blockedE.setSelected(false);
                }
                if(freeE.isSelected()){
                freeE.setSelected(false);
                }    
               
                
                DefaultTableModel todo = (DefaultTableModel)encTable.getModel();
                todo.setNumRows(0);
                for(Appointment a:encontros)
                {
                    todo.addRow(new Object[]{
                    a.getMeetingPlace(),
                    a.getAppointmentDate()
                    });
                }
                
                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    aa = descM.getText();
    if(freeM.isSelected())
    {condition = false;}
    if(blockedM.isSelected())
    {condition = true;}
    
    memorandos.add(new Memo(aa, condition));
    
    DefaultTableModel memo = (DefaultTableModel)memoTable.getModel();
                memo.setNumRows(0);
                for(Memo m:memorandos)
                {
                    memo.addRow(new Object[]{
                    m.getTexto()
                    });
                }
                
                descM.setText("");
                if(blockedM.isSelected()){
                blockedM.setSelected(false);
                }
                if(freeM.isSelected()){
                freeM.setSelected(false);
                }    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void dataEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEActionPerformed

    private void horaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaEActionPerformed

    private void blockedEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockedEActionPerformed
   if(blockedE.isSelected()){
           freeE.setSelected(false);
    }
    }//GEN-LAST:event_blockedEActionPerformed

    private void blockedMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockedMActionPerformed
      if(blockedE.isSelected()){
           freeE.setSelected(false);
    }
    }//GEN-LAST:event_blockedMActionPerformed

    private void FreeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FreeTActionPerformed
       if(FreeT.isSelected()){
           BlockedT.setSelected(false);
       }
    }//GEN-LAST:event_FreeTActionPerformed

    private void TabelaTODOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaTODOMouseClicked
        int line = TabelaTODO.getSelectedRow();
        JOptionPane.showMessageDialog(null, tarefasTODO.get(line).toStringShow());
    }//GEN-LAST:event_TabelaTODOMouseClicked

    private void todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todoActionPerformed
        if(todo.isSelected()){
           doing.setSelected(false);
           done.setSelected(false);
       }
    }//GEN-LAST:event_todoActionPerformed

    private void doingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doingActionPerformed
        if(doing.isSelected()){
           todo.setSelected(false);
           done.setSelected(false);
       }
    }//GEN-LAST:event_doingActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        if(done.isSelected()){
           doing.setSelected(false);
           todo.setSelected(false);
       }
    }//GEN-LAST:event_doneActionPerformed

    private void TabelaDOINGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaDOINGMouseClicked
        int line = TabelaDOING.getSelectedRow();
        JOptionPane.showMessageDialog(null, tarefasDOING.get(line).toStringShow());
    }//GEN-LAST:event_TabelaDOINGMouseClicked

    private void TabelaDONEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaDONEMouseClicked
        int line = TabelaDONE.getSelectedRow();
        JOptionPane.showMessageDialog(null, tarefasDONE.get(line).toStringShow());
    }//GEN-LAST:event_TabelaDONEMouseClicked

    private void freeEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freeEActionPerformed
    if(freeE.isSelected()){
           blockedE.setSelected(false);
    }
    }//GEN-LAST:event_freeEActionPerformed

    private void encTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encTableMouseClicked
       int line = encTable.getSelectedRow();
        JOptionPane.showMessageDialog(null, encontros.get(line).toStringShow());
    }//GEN-LAST:event_encTableMouseClicked

    private void freeMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freeMActionPerformed
    if(freeM.isSelected()){
           blockedM.setSelected(false);
    }
    }//GEN-LAST:event_freeMActionPerformed

    private void memoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memoTableMouseClicked
        int line = memoTable.getSelectedRow();
        JOptionPane.showMessageDialog(null, memorandos.get(line).toString());
    }//GEN-LAST:event_memoTableMouseClicked

    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Agenda close = new Agenda();
               close.setVisible(true);
               /*String t, e, m;
               File read = new File(encontros,tarefas,memorandos);
               t = read.readTarefas();
                System.out.println(t);
               String splitt[] = t.split("\n");
               for(int j=0;j<splitt.length;j++){
                       System.out.println(splitt[j]);
                   }
               for(int x = 0; x<splitt.length; x++)
               {   
                   String tar[];
                   String a;
                   tar = splitt[x].split("|");
                  
                   String sd = tar[0];
                   
                   
                   String div[] = tar[1].split("-");
                   String dataI[] = div[0].split("/");
                   String horaI[] = div[1].split(":");
                   String div2[] = tar[2].split("-");
                   String dataD[] = div2[0].split("/");
                   String horaD[] = div2[1].split(":");
                   Boolean c;
                   if(tar[4].matches("true")){c = true;}
                   else{c = false;}
                   
                     Calendar aa = Calendar.getInstance();
                      aa.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dataI[0]));
                      aa.set(Calendar.MONTH, Integer.parseInt(dataI[1])-1);
                      aa.set(Calendar.YEAR, Integer.parseInt(dataI[2]));
                      aa.set(Calendar.HOUR_OF_DAY,Integer.parseInt(horaI[0]));
                      aa.set(Calendar.MINUTE,Integer.parseInt(horaI[1]));
                   if(tar[3].matches("TO-DO"))
                   {    
                       Task obj = new Task(sd,dataD,horaD,c,"TO-DO");
     
                       obj.setIDate(aa);
                       tarefasTODO.add(obj);
                   }
                   if(tar[3].matches("DOING"))
                   {
                        Task obj = new Task(sd,dataD,horaD,c,"DOING");
                        obj.setIDate(aa);
                       tarefasDOING.add(obj);
                   }
                   if(tar[3].matches("DONE"))
                   {
                        Task obj = new Task(sd,dataD,horaD,c,"DONE");
                        obj.setIDate(aa);
                       tarefasDONE.add(obj);
                    }
               }
               e = read.readEncontros();
               String splite[] = e.split("\n");
               String tare[];
               for(int x = 0; x<splite.length; x++)
               {
                   tare = splite[x].split("|");
                   String p = tare[0];
                   String div[] = tare[1].split("-");
                   String dataI[] = div[0].split("/");
                   String horaI[] = div[1].split(":");
                   String div2[] = tare[2].split("-");
                   String dataD[] = div2[0].split("/");
                   String horaD[] = div2[1].split(":");
                   String mp = tare[3];
                   Boolean c;
                   if(tare[4].matches("true")){c = true;}
                   else{c = false;}
                   Appointment enc = new Appointment(p,mp,dataD,horaD,c);
                   encontros.add(enc);
               }
               
               m = read.readMemorandos();
               String splitm[] = e.split("\n");
               String tarm[];
               for(int x = 0; x<splitm.length; x++)
               {
                   tarm = splitm[x].split("|");
                   String p = tarm[0];
                   Boolean c;
                   if(tarm[1].matches("true")){c = true;}
                   else{c = false;}
                   Memo mem = new Memo(p,c);
                   memorandos.add(mem);
               }
                DefaultTableModel todo = (DefaultTableModel)TabelaTODO.getModel();
                DefaultTableModel doing = (DefaultTableModel)TabelaDOING.getModel();
                DefaultTableModel done = (DefaultTableModel)TabelaDONE.getModel();
                todo.setNumRows(0);
                doing.setNumRows(0);
                done.setNumRows(0);
                    for(Task td:tarefasTODO){
                    
                    todo.addRow(new Object[]{
                    td.getShortDescription(),
                    td.getDeadLine()
                    });
                    }
                    for(Task dg:tarefasDOING){
                    doing.addRow(new Object[]{
                    dg.getShortDescription(),
                    dg.getDeadLine()
                    });
                    }
                    for(Task dn:tarefasDONE){
                    done.addRow(new Object[]{
                    dn.getShortDescription(),
                    dn.getDeadLine()
                    });
                    }
                
                DefaultTableModel memo = (DefaultTableModel)memoTable.getModel();
                memo.setNumRows(0);
                for(Memo mm:memorandos)
                {
                    memo.addRow(new Object[]{
                    mm.getTexto()
                    });
                }
               DefaultTableModel enco = (DefaultTableModel)encTable.getModel();
               enco.setNumRows(0);
                for(Appointment a:encontros)
                {
                   enco.addRow(new Object[]{
                    a.getMeetingPlace(),
                    a.getAppointmentDate()
                    });
                }*/
               
               close.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
               close.addWindowListener(new WindowAdapter(){
                   public void windowClosing(WindowEvent evt)
                   {
                      for(Task t:tarefasTODO)
                      {
                          tarefas.add(t);
                      }
                      for(Task t:tarefasDOING)
                      {
                        tarefas.add(t);
                      }
                      for(Task t:tarefasDONE)
                      {
                        tarefas.add(t);
                      }
                      
                      File save = new File(encontros,tarefas, memorandos);
                      save.write();
                      System.exit(0);
                   }
               });
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BlockedT;
    private javax.swing.JFormattedTextField DataT;
    private javax.swing.JTextPane DescT;
    private javax.swing.JRadioButton FreeT;
    private javax.swing.JFormattedTextField HoraT;
    private static javax.swing.JTable TabelaDOING;
    private static javax.swing.JTable TabelaDONE;
    private static javax.swing.JTable TabelaTODO;
    private javax.swing.JRadioButton blockedE;
    private javax.swing.JRadioButton blockedM;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField dataE;
    private javax.swing.JTextPane descM;
    private javax.swing.JRadioButton doing;
    private javax.swing.JRadioButton done;
    private static javax.swing.JTable encTable;
    private javax.swing.JRadioButton freeE;
    private javax.swing.JRadioButton freeM;
    private javax.swing.JFormattedTextField horaE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane localE;
    private static javax.swing.JTable memoTable;
    private javax.swing.JTextPane pessoasE;
    private javax.swing.JRadioButton todo;
    // End of variables declaration//GEN-END:variables
}
