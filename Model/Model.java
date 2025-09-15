package Model;
import java.util.ArrayList;

public class Model {
    private String kodePenerbangan;
    private String maskapai;
    private String asal;
    private String tujuan;
    private String armada;

    public Model(String kodePenerbangan, String Maskapai, String asal, String tujuan, String Armada){
        this.kodePenerbangan = kodePenerbangan;
        this.maskapai = Maskapai;
        this.asal = asal;
        this.tujuan = tujuan;
        this.armada = Armada;
    }
    
    public String getkodePenerbangan() {
    return kodePenerbangan;
    }
    
    public String getMaskapai() {
    return maskapai;
    }
    
    public String getasal() {
    return asal;
    }
    
    public String gettujuan() {
    return tujuan;
    }
    
    public String getArmada() {
    return armada;
    }
    
    @Override
    public String toString() {
        return "Kode Penerbangan: " + kodePenerbangan +
           ", Maskapai: " + maskapai +
           ", Asal: " + asal +
           ", Tujuan: " + tujuan +
           ", Armada: " + armada;
    }
}




