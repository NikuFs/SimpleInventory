package com.example.simpleinventory;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "inventory_management.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_BARANG = "barang";
    private static final String TABLE_ADMIN = "admin";


    public DataHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        // TODO Auto-generated method stub
        String sql = "create table "+TABLE_BARANG+"(idBarang primary key null, namabarang text null, stock text null, harga text null)";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);

        sql = "insert into barang (idBarang, namabarang, stock, harga) values (1, 'teh pucuk', '10','3000');";
        db.execSQL(sql);

        sql = "insert into barang (idBarang, namabarang, stock, harga) values (2, 'roko sampurna', '11','10000');";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
