package com.example.piec_1.database

import android.content.Context
import android.util.Log
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.piec_1.model.Medicamento
import com.example.piec_1.model.Usuario

@Database(entities = [Usuario::class, Medicamento::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun usuarioDao(): UsuarioDao
    abstract fun medicamentoDao(): MedicamentoDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null
        fun getDatabase(context: Context): AppDatabase {
            Log.d("Database: ", "Início da criação")
            return INSTANCE ?: synchronized(this) {
                Log.d("Database: ", "Dentro do sychronize")
                Log.d("Database: ", "$context")
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database_db"
                ).build()
                Log.d("Database: ", "Finalização do banco de dados")
                INSTANCE = instance
                instance
            }
        }
    }
}