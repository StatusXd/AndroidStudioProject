package com.example.androidstudioproject.Data.DataSources;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
import com.example.androidstudioproject.Data.DataSources.AviaEntity;
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
