package dao;

import model.Lahan;
import java.util.List;

public interface LahanDAO {
    void addLahan(Lahan lahan);
    List<Lahan> getAllLahan();
    Lahan getLahanByID(int idLahan);
    List<Lahan> getAllLahanByUsrID(int usrID);
    void updateLahan(Lahan lahan);
    String deleteLahan(int idLahan, int idPemilik);
}
