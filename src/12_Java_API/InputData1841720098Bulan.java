/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAPI.percobaan4;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class InputData1841720098Bulan {
    ArrayList ListMahasiswa;

    public InputData1841720098Bulan() {
        ListMahasiswa = new ArrayList();
    }
    
    void isiDataBulan(String mNim, String mNama, String mAlamat){
        Mahasiswa1841720098Bulan mhs = new Mahasiswa1841720098Bulan(mNim, mNama, mAlamat);
        ListMahasiswa.add(mhs);
    }

    public ArrayList getDataBulan() {
        return ListMahasiswa;
    }

    Iterable<Mahasiswa1841720098Bulan> getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
