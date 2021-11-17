package com.dtbuu.pojos;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "NhanVien")
public class NhanVien implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int NhanVien_id;
    
    @OneToOne @JoinColumn(name="Login_id") // Foreign Key.
    private Logins Login;
    
    @Column(nullable=false, length=100)
    private String Ho;
    
    @Column(nullable=false, length=100)
    private String Ten;
    
    @ManyToOne @JoinColumn(name="ViTri_id") // Foreign Key.
    private ViTri ViTri;
    
    @Column(nullable=false) 
//    @Temporal(javax.persistence.TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date NgaySinh;
    
    @Column(nullable=false, length=100)
    private String QueQuan;
    
    @Column(nullable=false, length=10)
    private String Sdt;
    
    @Column(nullable=false, length=100)
    private String Email;
    
    @Column(length=100)
    private String GhiChu;


    public int getNhanVien_id() { return this.NhanVien_id; }
    public void setNhanVien_id(int NhanVien_id) { this.NhanVien_id = NhanVien_id; }

    public Logins getLogin() {return Login;}
    public void setLogin(Logins Login) {this.Login = Login;}

    public String getHo() { return this.Ho; }
    public void setHo(String Ho) { this.Ho = Ho; }

    public String getTen() { return this.Ten; }
    public void setTen(String Ten) { this.Ten = Ten; }

    public ViTri getViTri() { return this.ViTri; }
    public void setViTri(ViTri ViTri) { this.ViTri = ViTri; }

    public Date getNgaySinh() { return this.NgaySinh; }
    public void setNgaySinh(Date NgaySinh) { this.NgaySinh = NgaySinh; }

    public String getQueQuan() { return this.QueQuan; }
    public void setQueQuan(String QueQuan) { this.QueQuan = QueQuan; }

    public String getSdt() { return this.Sdt; }
    public void setSdt(String Sdt) { this.Sdt = Sdt; }

    public String getEmail() { return this.Email; }
    public void setEmail(String Email) { this.Email = Email; }

    public String getGhiChu() { return this.GhiChu; }
    public void setGhiChu(String GhiChu) { this.GhiChu = GhiChu; }
}
