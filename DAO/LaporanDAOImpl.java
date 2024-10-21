package dao;

import model.Laporan;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LaporanDAOImpl implements LaporanDAO {
    private Connection connection;

    public LaporanDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void addLaporan(Laporan laporan) {
        String sql = "INSERT INTO Laporan (Evaluasi, Hasil, ID_Pekerja, ID_pekerjaan) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, laporan.getEvaluasi());
            statement.setString(2, laporan.getHasil());
            statement.setInt(3, laporan.getIdPekerja());
            statement.setInt(4, laporan.getIdPekerjaan());
            statement.exec
