package br.edu.ifsp.edu.logindatastore.util

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.preferencesDataStore
import androidx.datastore.preferences.core.Preferences

// Configuração do DataStore
val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "user_preferences")