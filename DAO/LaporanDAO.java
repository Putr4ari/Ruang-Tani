package dao;

import model.Laporan;
import java.util.List;

public interface LaporanDAO {
    void addLaporan(Laporan laporan);
    List<Laporan> getAllLaporan();
    Laporan getLaporanByID(int idLaporan);
    void updateLaporan(Laporan laporan);
    void deleteLaporan(int idLaporan);
}
