/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

 package views.views_cliente;

/**
 *
 * @author sebastian
 */
public class Principal_Cliente extends javax.swing.JFrame {

    /** Creates new form PrincipalCliente */
    public Principal_Cliente() {
        initComponents();
        setLocationRelativeTo(this);// Centra la ventana en la pantalla
        setResizable(false); // Evita el redimensionamiento de la interfaz
        pack(); 
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnCompras = new javax.swing.JButton();
        btnProductoUno = new javax.swing.JButton();
        btnProductoDos = new javax.swing.JButton();
        btnProductoTres = new javax.swing.JButton();
        btnProductoCuatro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        lblCliente = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        lblMonto = new javax.swing.JLabel();
        ProductoUno = new javax.swing.JPanel();
        btnComprar4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnAll = new javax.swing.JButton();
        ProductoUno1 = new javax.swing.JPanel();
        btnComprar7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ProductoUno2 = new javax.swing.JPanel();
        btnComprar8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ProductoUno3 = new javax.swing.JPanel();
        btnComprar9 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ProductoUno4 = new javax.swing.JPanel();
        btnComprar10 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ProductoUno5 = new javax.swing.JPanel();
        btnComprar11 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ProductoUno6 = new javax.swing.JPanel();
        btnComprar12 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ProductoUno7 = new javax.swing.JPanel();
        btnComprar13 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ProductoUno8 = new javax.swing.JPanel();
        btnComprar14 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnProductoUno1 = new javax.swing.JButton();
        btnProductoDos1 = new javax.swing.JButton();
        btnProductoTres1 = new javax.swing.JButton();
        btnProductoCuatro1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCompras.setBackground(new java.awt.Color(0, 51, 51));
        btnCompras.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCompras.setForeground(new java.awt.Color(0, 0, 0));
        btnCompras.setText("Compras");
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });

        btnProductoUno.setBackground(new java.awt.Color(0, 51, 51));
        btnProductoUno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnProductoUno.setForeground(new java.awt.Color(0, 0, 0));
        btnProductoUno.setText("Producto Uno");

        btnProductoDos.setBackground(new java.awt.Color(0, 51, 51));
        btnProductoDos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnProductoDos.setForeground(new java.awt.Color(0, 0, 0));
        btnProductoDos.setText("Producto Dos");

        btnProductoTres.setBackground(new java.awt.Color(0, 51, 51));
        btnProductoTres.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnProductoTres.setForeground(new java.awt.Color(0, 0, 0));
        btnProductoTres.setText("Producto Tres");

        btnProductoCuatro.setBackground(new java.awt.Color(0, 51, 51));
        btnProductoCuatro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnProductoCuatro.setForeground(new java.awt.Color(0, 0, 0));
        btnProductoCuatro.setText("Producto Cuatro");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Carrito de compras");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductoUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductoTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductoCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductoDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnProductoUno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnProductoDos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnProductoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnProductoCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(6, 0, 352, 796);

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setText("Pedir");
        jPanel1.add(jButton1);
        jButton1.setBounds(80, 810, 200, 40);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        btnCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setText("--Cliente--");

        lblCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente.setText("Cliente");

        btnBuscar.setBackground(new java.awt.Color(51, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(153, 153, 153));
        btnBuscar.setText("Buscar");

        lblMonto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMonto.setForeground(new java.awt.Color(255, 255, 255));
        lblMonto.setText("Monto");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblMonto)
                        .addGap(668, 668, 668)
                        .addComponent(lblCliente))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2175, Short.MAX_VALUE)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonto)
                    .addComponent(lblCliente))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCliente)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        ProductoUno.setPreferredSize(new java.awt.Dimension(200, 200));
        ProductoUno.setLayout(null);

        btnComprar4.setBackground(new java.awt.Color(0, 153, 51));
        btnComprar4.setText("Comprar");
        btnComprar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar4ActionPerformed(evt);
            }
        });
        ProductoUno.add(btnComprar4);
        btnComprar4.setBounds(30, 160, 136, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Images/producto1.png"))); // NOI18N
        ProductoUno.add(jLabel3);
        jLabel3.setBounds(0, 0, 200, 200);

        btnAll.setBackground(new java.awt.Color(51, 0, 0));
        btnAll.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAll.setForeground(new java.awt.Color(153, 153, 153));
        btnAll.setText("All");

        ProductoUno1.setPreferredSize(new java.awt.Dimension(200, 200));
        ProductoUno1.setLayout(null);

        btnComprar7.setBackground(new java.awt.Color(0, 153, 51));
        btnComprar7.setText("Comprar");
        btnComprar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar7ActionPerformed(evt);
            }
        });
        ProductoUno1.add(btnComprar7);
        btnComprar7.setBounds(30, 160, 136, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Images/producto2.jpg"))); // NOI18N
        ProductoUno1.add(jLabel4);
        jLabel4.setBounds(0, 0, 200, 200);

        ProductoUno2.setPreferredSize(new java.awt.Dimension(200, 200));
        ProductoUno2.setLayout(null);

        btnComprar8.setBackground(new java.awt.Color(0, 153, 51));
        btnComprar8.setText("Comprar");
        btnComprar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar8ActionPerformed(evt);
            }
        });
        ProductoUno2.add(btnComprar8);
        btnComprar8.setBounds(30, 160, 136, 23);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Images/producto7.jpg"))); // NOI18N
        ProductoUno2.add(jLabel10);
        jLabel10.setBounds(0, 0, 200, 200);

        ProductoUno3.setPreferredSize(new java.awt.Dimension(200, 200));
        ProductoUno3.setLayout(null);

        btnComprar9.setBackground(new java.awt.Color(0, 153, 51));
        btnComprar9.setText("Comprar");
        btnComprar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar9ActionPerformed(evt);
            }
        });
        ProductoUno3.add(btnComprar9);
        btnComprar9.setBounds(30, 160, 136, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Images/producto5.jpg"))); // NOI18N
        ProductoUno3.add(jLabel6);
        jLabel6.setBounds(0, 0, 200, 200);

        ProductoUno4.setPreferredSize(new java.awt.Dimension(200, 200));
        ProductoUno4.setLayout(null);

        btnComprar10.setBackground(new java.awt.Color(0, 153, 51));
        btnComprar10.setText("Comprar");
        btnComprar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar10ActionPerformed(evt);
            }
        });
        ProductoUno4.add(btnComprar10);
        btnComprar10.setBounds(30, 160, 136, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Images/producto1.png"))); // NOI18N
        ProductoUno4.add(jLabel7);
        jLabel7.setBounds(0, 0, 200, 200);

        ProductoUno5.setPreferredSize(new java.awt.Dimension(200, 200));
        ProductoUno5.setLayout(null);

        btnComprar11.setBackground(new java.awt.Color(0, 153, 51));
        btnComprar11.setText("Comprar");
        btnComprar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar11ActionPerformed(evt);
            }
        });
        ProductoUno5.add(btnComprar11);
        btnComprar11.setBounds(30, 160, 136, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Images/producto6.jpg"))); // NOI18N
        ProductoUno5.add(jLabel8);
        jLabel8.setBounds(0, 0, 200, 200);

        ProductoUno6.setPreferredSize(new java.awt.Dimension(200, 200));
        ProductoUno6.setLayout(null);

        btnComprar12.setBackground(new java.awt.Color(0, 153, 51));
        btnComprar12.setText("Comprar");
        btnComprar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar12ActionPerformed(evt);
            }
        });
        ProductoUno6.add(btnComprar12);
        btnComprar12.setBounds(30, 160, 136, 23);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Images/producto3.jpg"))); // NOI18N
        ProductoUno6.add(jLabel9);
        jLabel9.setBounds(0, 0, 200, 200);

        ProductoUno7.setPreferredSize(new java.awt.Dimension(200, 200));
        ProductoUno7.setLayout(null);

        btnComprar13.setBackground(new java.awt.Color(0, 153, 51));
        btnComprar13.setText("Comprar");
        btnComprar13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar13ActionPerformed(evt);
            }
        });
        ProductoUno7.add(btnComprar13);
        btnComprar13.setBounds(30, 160, 136, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Images/producto3.jpg"))); // NOI18N
        ProductoUno7.add(jLabel5);
        jLabel5.setBounds(0, 0, 200, 200);

        ProductoUno8.setPreferredSize(new java.awt.Dimension(200, 200));
        ProductoUno8.setLayout(null);

        btnComprar14.setBackground(new java.awt.Color(0, 153, 51));
        btnComprar14.setText("Comprar");
        btnComprar14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar14ActionPerformed(evt);
            }
        });
        ProductoUno8.add(btnComprar14);
        btnComprar14.setBounds(30, 160, 136, 23);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Images/producto5.jpg"))); // NOI18N
        ProductoUno8.add(jLabel11);
        jLabel11.setBounds(0, 0, 200, 200);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(ProductoUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)
                                .addComponent(ProductoUno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProductoUno3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProductoUno6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(126, 126, 126)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProductoUno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProductoUno4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductoUno5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductoUno7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductoUno8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ProductoUno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProductoUno4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductoUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductoUno7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ProductoUno3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(ProductoUno5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProductoUno6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductoUno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductoUno8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnProductoUno1.setBackground(new java.awt.Color(0, 51, 51));
        btnProductoUno1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnProductoUno1.setForeground(new java.awt.Color(0, 0, 0));
        btnProductoUno1.setText("Producto Uno");

        btnProductoDos1.setBackground(new java.awt.Color(0, 51, 51));
        btnProductoDos1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnProductoDos1.setForeground(new java.awt.Color(0, 0, 0));
        btnProductoDos1.setText("Producto Dos");

        btnProductoTres1.setBackground(new java.awt.Color(0, 51, 51));
        btnProductoTres1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnProductoTres1.setForeground(new java.awt.Color(0, 0, 0));
        btnProductoTres1.setText("Producto Tres");

        btnProductoCuatro1.setBackground(new java.awt.Color(0, 51, 51));
        btnProductoCuatro1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnProductoCuatro1.setForeground(new java.awt.Color(0, 0, 0));
        btnProductoCuatro1.setText("Producto Cuatro");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Pedidos realizados");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Pedidos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProductoUno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductoTres1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductoCuatro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductoDos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel12)
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProductoUno1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProductoDos1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProductoTres1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProductoCuatro1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 888, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar4ActionPerformed
        Cliente_Comprar cambio= new Cliente_Comprar();
        cambio.setVisible(true);
    }//GEN-LAST:event_btnComprar4ActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        Cliente_Compras cambio= new Cliente_Compras();
        cambio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnComprar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprar7ActionPerformed

    private void btnComprar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprar8ActionPerformed

    private void btnComprar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprar9ActionPerformed

    private void btnComprar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprar10ActionPerformed

    private void btnComprar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprar11ActionPerformed

    private void btnComprar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprar12ActionPerformed

    private void btnComprar13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprar13ActionPerformed

    private void btnComprar14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprar14ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ProductoUno;
    private javax.swing.JPanel ProductoUno1;
    private javax.swing.JPanel ProductoUno2;
    private javax.swing.JPanel ProductoUno3;
    private javax.swing.JPanel ProductoUno4;
    private javax.swing.JPanel ProductoUno5;
    private javax.swing.JPanel ProductoUno6;
    private javax.swing.JPanel ProductoUno7;
    private javax.swing.JPanel ProductoUno8;
    private javax.swing.JButton btnAll;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnComprar10;
    private javax.swing.JButton btnComprar11;
    private javax.swing.JButton btnComprar12;
    private javax.swing.JButton btnComprar13;
    private javax.swing.JButton btnComprar14;
    private javax.swing.JButton btnComprar4;
    private javax.swing.JButton btnComprar7;
    private javax.swing.JButton btnComprar8;
    private javax.swing.JButton btnComprar9;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnProductoCuatro;
    private javax.swing.JButton btnProductoCuatro1;
    private javax.swing.JButton btnProductoDos;
    private javax.swing.JButton btnProductoDos1;
    private javax.swing.JButton btnProductoTres;
    private javax.swing.JButton btnProductoTres1;
    private javax.swing.JButton btnProductoUno;
    private javax.swing.JButton btnProductoUno1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables

}
