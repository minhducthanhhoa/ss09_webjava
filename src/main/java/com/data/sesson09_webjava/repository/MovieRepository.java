package com.data.sesson09_webjava.repository;

import com.data.sesson09_webjava.model.Movie;
import com.data.sesson09_webjava.util.DBConnection;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {
    public List<Movie> findAll() {
        List<Movie> movies = new ArrayList<>();
        String sql = "SELECT * FROM movies";
        try (Connection conn = DBConnection.openConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Movie m = new Movie(
                        rs.getLong("id"),
                        rs.getString("title"),
                        rs.getString("director"),
                        rs.getString("genre"),
                        rs.getString("description"),
                        rs.getInt("duration"),
                        rs.getString("language")
                );
                movies.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movies;
    }

    public Movie findById(Long id) {
        String sql = "SELECT * FROM movies WHERE id = ?";
        try (Connection conn = DBConnection.openConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Movie(
                        rs.getLong("id"),
                        rs.getString("title"),
                        rs.getString("director"),
                        rs.getString("genre"),
                        rs.getString("description"),
                        rs.getInt("duration"),
                        rs.getString("language")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
