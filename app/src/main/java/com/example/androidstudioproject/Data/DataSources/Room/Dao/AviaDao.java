package com.example.androidstudioproject.Data.DataSources.Room.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.androidstudioproject.Data.DataSources.Room.Entity.AviaEntity;

import java.util.List;

@Dao
public interface AviaDao {
    @Query("SELECT * FROM Avia")
    LiveData<List<AviaEntity>> getAll();
    @Query("SELECT * FROM Avia WHERE uid IN (:trackIds)")
    LiveData<List<AviaEntity>> loadAllByIds(int[] trackIds);
    @Query("SELECT * FROM Avia WHERE track LIKE :track")
    LiveData<List<AviaEntity>> findByName(String track);
    @Insert
    void insert(AviaEntity... track);
    @Delete
    void deleteAll();
}
