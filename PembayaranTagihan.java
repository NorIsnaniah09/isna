package TugasKreasi;

 import java.awt.event.*;
import javax.swing.*;

public class PembayaranTagihan extends JFrame {
   
    
    
    JLabel lblnama=new JLabel("Nama");
    JTextField txnama=new JTextField(20);
    JLabel lblalamat=new JLabel("Alamat");
    JTextField txalamat=new JTextField(30);
    JLabel lbltoken=new JLabel("Token");
    JTextField txtoken=new JTextField(30);
     JTextField txtagihan=new JTextField(30);
    JTextField txtlp=new JTextField(12);
    JCheckBox Listrik = new JCheckBox("Listrik");
    JCheckBox Pdam = new JCheckBox("PDAM");
    JCheckBox Telpon = new JCheckBox("Telpon");
    JLabel lblTagihanbulan=new JLabel("TagihanBulan");
    JRadioButton jn = new JRadioButton("Januari");
    JRadioButton fe = new JRadioButton("Febuari");
    JRadioButton mr = new JRadioButton("Maret");
    JRadioButton ap = new JRadioButton("April");
    JRadioButton mi = new JRadioButton("Mei");
    JRadioButton ju = new JRadioButton("Juni");
    JRadioButton jl = new JRadioButton("Juli");
    JRadioButton ag = new JRadioButton("Agustus");
    JRadioButton sr = new JRadioButton("September");
    JRadioButton or = new JRadioButton("Oktober");
    JRadioButton nr = new JRadioButton("November");
    JRadioButton dr = new JRadioButton("Desember");
     JLabel lbltotagihan=new JLabel("Total Tagihan");
    JTextField txtotagihan=new JTextField(30);

    ButtonGroup ukuran = new ButtonGroup(); 
    JTextArea hasil=new JTextArea();
    JButton cetak = new JButton("Cetak");
    
    PembayaranTagihan() 
    {
        setTitle("PAYMENT");
        setLocation(500,100);
        setSize(600,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void KomponenVisual()
    {
        getContentPane().setLayout(null);
        getContentPane().add(lblnama);
        lblnama.setBounds(30,10,130,20);
        getContentPane().add(txnama);
        txnama.setBounds(165,10,250,20);
        getContentPane().add(lblalamat);
        lblalamat.setBounds(30,30,130,20);
        getContentPane().add(txalamat);
        txalamat.setBounds(165,30,250,20);
        getContentPane().add(lbltoken);
        lbltoken.setBounds(30,50,130,20);
        getContentPane().add(txtoken);
        txtoken.setBounds(165,50,250,20);
        
        
        getContentPane().add(lbltotagihan);
        lbltotagihan.setBounds(30,230,130,20);
         getContentPane().add(txtotagihan);
        txtotagihan.setBounds(165,230,250,20);
     
        
        getContentPane().add(lblTagihanbulan);
        lblTagihanbulan.setBounds(30,90,130,20);
        getContentPane().add(jn);
        jn.setBounds(165,90,150,20);
        getContentPane().add(fe);
        fe.setBounds(330,100,150,20);
        getContentPane().add(mr);
        mr.setBounds(165,110,150,20);
        getContentPane().add(ap);
        ap.setBounds(330,120,150,20);
        getContentPane().add(mi);
        mi.setBounds(165,130,150,20);
        getContentPane().add(ju);
        ju.setBounds(330,140,150,20); 
        getContentPane().add(jl);
        jl.setBounds(165,150,150,20);
        getContentPane().add(ag);
        ag.setBounds(330,160,150,20);
        getContentPane().add(sr);
        sr.setBounds(165,170,150,20);
        getContentPane().add(or);
        or.setBounds(330,180,150,20);
        getContentPane().add(nr);
        nr.setBounds(165,190,150,20);
        getContentPane().add(dr);
        dr.setBounds(330,200,150,20);
      
               
        
        
        getContentPane().add(cetak);
        cetak.setBounds(50,270,300,20);
        getContentPane().add(hasil);
        hasil.setBounds(50,270,300,150);
        setVisible(true);
    }
    
    void AksiReaksi()
    {
        cetak.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                hasil.append("Nama          : "+txnama.getText()+"\n");
                hasil.append("Alamat        : "+txalamat.getText()+"\n");
                hasil.append("Token         : "+txtoken.getText()+"\n");
             
                
                if(jn.isSelected()==true)
                {
                    hasil.append("TagihanBulan     : "+jn.getText()+"\n");
                }
                if(fe.isSelected()==true)
                {
                    hasil.append("TagihanBulan     : "+fe.getText()+"\n");
                }
                if(mr.isSelected()==true)
                {
                    hasil.append("TagihanBulan     : "+mr.getText()+"\n");
                }
                if(ap.isSelected()==true)
                {
                    hasil.append("Pesanan     : "+ap.getText()+"\n");
            
                }
                if(mi.isSelected()==true)
                {
                    hasil.append("Pesanan     : "+mi.getText()+"\n");
                }
                if(ju.isSelected()==true)
                {
                    hasil.append("Pesanan     : "+ju.getText()+"\n");
                }
                if(jl.isSelected()==true)
                {
                    hasil.append("Pesanan     : "+jl.getText()+"\n");
                }
                if(ag.isSelected()==true)
                {
                    hasil.append("Pesanan     : "+ag.getText()+"\n");
                }
                if(sr.isSelected()==true)
                {
                    hasil.append("Pesanan     : "+sr.getText()+"\n");
                }
                if(or.isSelected()==true)
                {
                    hasil.append("Pesanan     : "+or.getText()+"\n");
                }
                if(nr.isSelected()==true)
                {
                    hasil.append("Pesanan     : "+nr.getText()+"\n");
                }
                if(dr.isSelected()==true)
                {
                    hasil.append("Pesanan     : "+dr.getText()+"\n");
                }
              hasil.append("Total Tagihan       : "+txtotagihan.getText()+"\n");
            }
        });
    }              
     public static void main (String args[])
    {
            PembayaranTagihan pt = new PembayaranTagihan ();
            pt.KomponenVisual();
            pt.AksiReaksi();
       
    }
    
        }
           